package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.WebDriverutilities;

public class Facebook {
	
	@FindBy(xpath ="(//a[@role=\"button\"])[2]")
	private WebElement naccount;
	
	@FindBy(id ="month")
	private WebElement md;
	
	public Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void newaccount()
	{
		naccount.click();
	}
	public void monthdropdown()
	{
		WebDriverutilities wu=new WebDriverutilities();
		String s="Jul";
		wu.dropdown(md, s);
	}

}
