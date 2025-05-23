package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonpath) {

		// step-1
		File location = new File(System.getProperty("user.dir")+"\\target\\JVMReports");

		// Step-2
		Configuration con = new Configuration(location, "Facebook");

		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Platform", "Windows-11");
		con.addClassifications("Environment", "QA");
		con.addClassifications("Current Sprint", "6");

		// step-3
		List<String> l = new ArrayList<>();
		l.add(jsonpath);

		// step-4
		ReportBuilder r = new ReportBuilder(l, con);
		r.generateReports();

	}

}
