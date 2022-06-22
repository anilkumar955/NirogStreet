package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	private By logo = By.xpath("//img[@alt='logo']");
	private By click_NirogForDoctor = By.xpath("//a[normalize-space()='Doctors']");
	private By getMedicenForclicnic = By.xpath("//a[normalize-space()='Buy Now']");
	

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public boolean getHomepageLogo() {
		return getlogo(logo);
	}
	public String getURl() {
		return getCurrentURL();
	}
	
	public void nirogForDoctorBtn() {
		 getElement(click_NirogForDoctor).click();
		
	}


	public MedicenPage Click_getMedicenForclicnic() {
		scrollByVisibilityOfElement(getMedicenForclicnic);
		windowHandel();
		
		
		return getInstance(MedicenPage.class);
	}
	
	
	
	

	

}
