package ExtentManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NewExtentHtmlManager {

	private static ExtentHtmlReporter html;
	private static ExtentReports extent;

	public static ExtentReports ExtentRep() {

		if (extent == null) {
			// Create an object of ExtentHtmlReporter
			html = new ExtentHtmlReporter("Extent.html");

			// Create an object of ExtentReports
			extent = new ExtentReports();

//			html.loadConfig("html-config.xml");
			
			html.config().setAutoCreateRelativePathMedia(true);
			html.config().setReportName("Jigar Mehta");
			html.config().setDocumentTitle("Jigar Document title");
			
//			html.config().setTheme(Theme.DARK);

			// Not working - check later
			extent.attachReporter(html);

		}
		return extent;

	}
}
