package com.DemoCommerce.qa.Reports;

import com.DemoCommerce.qa.TestBase.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter extends Base {

	public static ExtentReports extent;
	public static ExtentSparkReporter report;

	public ExtentReporter() {
		super();
	}

	public static ExtentReports alertExtent() {
		String path = System.getProperty("user.dir") + "//Report";
		report = new ExtentSparkReporter(path);
		report.config().setReportName("DemoLogin");
		report.config().setDocumentTitle("AutomationTesting");
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Ashok");
		return extent;
	}

}
