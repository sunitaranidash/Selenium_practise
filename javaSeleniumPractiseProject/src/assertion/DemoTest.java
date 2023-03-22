package assertion;



import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	void demotest()
	{
		Assert.assertTrue(true);
		Assert.assertEquals("welcome", "welcome");
		Assert.assertEquals("selenium", "selenium");
		System.out.println("Successfully passed");
	}
}
