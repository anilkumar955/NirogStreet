package Tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.MedicenPage;

public class MedicineTest extends BaseTest {
	
	HomePage home;
	MedicenPage medicn;
	
	@Test(priority=1)
	public void clickOn_bynowTest() throws InterruptedException {
		home=page.getInstance(HomePage.class);
		home.nirogForDoctorBtn();
		
		medicn=home.Click_getMedicenForclicnic();
		
		medicn.searchBrandName().sendKeys("Himalay");
		medicn.searchBrandName().sendKeys(Keys.RETURN);
		medicn.clickCheckBox().click();
		String himalaya =medicn.titleOfHimalaya();
		Assert.assertEquals(himalaya, "Himalaya");
		
		
	}
	
	 
	
}