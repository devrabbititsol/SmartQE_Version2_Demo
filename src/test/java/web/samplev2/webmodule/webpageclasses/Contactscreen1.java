package web.samplev2.webmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Contactscreen1 extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://devrabbit.com\",\"report_upload_url\":\"http://192.168.1.142:80/UploadReportFile\",\"project_name\":\"SampleV2\",\"project_description\":\"desc\",\"project_id\":255,\"module_name\":\"WEBModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":400,\"testcase_name\":\"TC1\",\"testcase_id\":446,\"testset_id\":0,\"executed_timestamp\":1498603805,\"browser_type\":\"chrome\"}";

	public static String projectName = "samplev2";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Contactscreen1(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-380']/A[1]")	
	private WebElement	Blog_302516A;
	public String clkABlog_302516() {
		waitForExpectedElement(driver, Blog_302516A);		
		String text = Blog_302516A.getText();
		Blog_302516A.click();
		return text;
	}

}