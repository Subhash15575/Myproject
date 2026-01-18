package scripts;

import org.testng.annotations.Test;

import genericlib.StepGroup;
import pompages.Facebook;

public class TestCase2 extends StepGroup{
	
	@Test
	public void tc2() throws InterruptedException
	{
		Facebook fb=new Facebook(driver);
		Thread.sleep(3000);
		fb.newaccount();
		Thread.sleep(3000);
		fb.monthdropdown();
	}

}
