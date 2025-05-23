package org.step;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass {

	@When("user click the create new account button")
	public void userClickTheCreateNewAccountButton() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
	}

	@When("user navigate into new window and fill the firstname and surname")
	public void userNavigateIntoNewWindowAndFillTheFirstnameAndSurname() {

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("java");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("python");

	}

	@When("user select the date of birth")
	public void userSelectTheDateOfBirth() {

		WebElement day = driver.findElement(By.xpath("//option[text()='5']"));
		js.executeScript("arguments[0].setAttribute('value','5')", day);
		WebElement month = driver.findElement(By.xpath("//option[text()='Aug']"));
		js.executeScript("arguments[0].setAttribute('value','Aug')", month);
		WebElement year = driver.findElement(By.xpath("//option[text()='2020']"));
		js.executeScript("arguments[0].setAttribute('value','2020')", year);
	}

	@When("user select any one gender option")
	public void userSelectAnyOneGenderOption() {

		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

	@When("user enter the mobile number")
	public void userEnterTheMobileNumber() {

		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).click();
	}

	@When("user set the password of the account")
	public void userSetThePasswordOfTheAccount() {

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("fhgvdyt67e3");
	}

	@Then("user account was created")
	public void userAccountWasCreated() {

		System.out.println("Account was created Successfully");
	}

}
