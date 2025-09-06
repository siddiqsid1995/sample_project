package org.base;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static Actions a;

	public static Robot r;

	public static JavascriptExecutor js;

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();

		driver=new ChromDriver();

	}

	public static void toMax() {

		driver.manage().window().maximize();
	}

	public static void toPassUrl(String url) {

		driver.get(url);

	}

	public static void toFillInput(WebElement element, String input) {

		element.sendKeys(input);
	}

	public static void toClick(WebElement element) {

		element.click();

	}

	public static void toPerformRightClick(WebElement element) {

		a = new Actions(driver);

		a.contextClick(element).perform();

	}

	public static void toPerformDoubleClick(WebElement element) {

		a.doubleClick(element).perform();
	}

	public static void toPressEnter() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static String toGetAttribute(WebElement element) {

		String attribute = element.getAttribute("value");

		return attribute;
	}

	public boolean VerifyAssert(String url) {

		Assert.assertTrue(currentUrl().contains(url));

		return true;

	}

	public static void getScreenshot(String fileName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(System.getProperty("user.dir") + "\\Screenshots\\" + fileName + ".png");

		FileUtils.copyFile(screenshot, destination);

	}

	public static String currentUrl() {

		String url = driver.getCurrentUrl();

		return url;
	}

	public static void toApplyImplicitwait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void sendkeysUsingJs(WebElement element, String value) {

		js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='" + value + "';", element);

	}
	public static void selectDropDown(WebElement element,String value) {

		Select s=new Select(element);
		
		s.selectByVisibleText(value);
	}

	public static String ExcelRead(int row, int cell) throws IOException {

		File file = new File("C:\\Users\\TEST\\Desktop\\Book123.xlsx");

		FileInputStream f = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(f);

		Sheet s = w.getSheet("TestData");

		Row r = s.getRow(row);

		Cell c = r.getCell(cell);

		int cellType = c.getCellType();

		String value;
		// celltype==1----it will return incase if celltype other then 1
		if (cellType == 1) {

			value = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {

			Date d = c.getDateCellValue();

			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yy");

			value = sim.format(d);

		} else {

			double d = c.getNumericCellValue();

			long l = (long) d;

			value = String.valueOf(l);

		}

		return value;
	}

}
