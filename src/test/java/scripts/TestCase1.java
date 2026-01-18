package scripts;

import org.testng.annotations.Test;

import genericlib.StepGroup;
import pompages.OrangeCRM;


public class TestCase1 extends StepGroup{
	@Test
	public void tc1() throws InterruptedException
	{
		OrangeCRM l=new OrangeCRM(driver);
		l.userName();
		Thread.sleep(3000);
		l.password();
		Thread.sleep(3000);
		l.login();
		Thread.sleep(3000);
		l.dropdown();
		Thread.sleep(3000);
		l.logout();
		Thread.sleep(3000);
		l.forgetpasswork();
		Thread.sleep(3000);
	}

}
