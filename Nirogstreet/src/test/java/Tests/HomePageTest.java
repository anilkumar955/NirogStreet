package Tests;

import org.testng.Assert;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.HomePage;





public class HomePageTest extends BaseTest {
	 
	HomePage home;
	
	@Test(priority=1)
	public void validate_HomePageLOGOTest() {
		
		home=page.getInstance(HomePage.class);
		boolean homelogo=home.getHomepageLogo();
		Assert.assertTrue(homelogo);
	}
	
	@Test(priority=2)
	public void clickonDoctorsTest() {
		home=page.getInstance(HomePage.class);
		home.nirogForDoctorBtn();
		String url=	home.getURl();
		Assert.assertEquals(url,"https://www.nirogstreet.com/site/doctors");
		
	}

	
	
	
	
	
	
	
}
	


	
	
	