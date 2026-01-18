package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeCRM {
	
	@FindBy(name ="username")
	private WebElement uname;
	
	@FindBy(name ="password")
	private WebElement pwd;
	
	@FindBy(xpath ="//button[@type=\"submit\"]")
	private WebElement loginbtn;
	
	@FindBy(xpath ="(//img[@alt=\"profile picture\"])[1]")
	private WebElement drp;
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement lo;
	
	@FindBy(xpath ="//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")
	private WebElement fpwd;
	
	public OrangeCRM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userName()
	{
		uname.sendKeys("Admin");
	}
	public void password()
	{
		pwd.sendKeys("admin123");
	}
	public  void login()
	{
		loginbtn.click();
	}
	public void dropdown()
	{
		drp.click();
	}
	public void logout()
	{
		lo.click();
	}
	public void forgetpasswork()
	{
		fpwd.click();
	}


}
