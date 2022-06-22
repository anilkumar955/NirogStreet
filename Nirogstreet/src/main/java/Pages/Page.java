package Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	static WebDriver driver;
	WebDriverWait wait;
	
	public Page(WebDriver driver) {
		this.driver=driver;
		this.wait= new WebDriverWait(this.driver , 30);
	}
	
	public abstract void scrollByVisibilityOfElement(By locator);
	public abstract boolean getlogo(By locator);
	public abstract void windowHandel();
	public abstract WebElement getElement(By locator);
	public abstract void waitForElementPresent(By locator);
	
	public abstract String getCurrentURL();
	

//	public abstract void failedScreenshot();
	
	
	
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}catch(Exception e) {
			e.getStackTrace();
			return null;
		}
	}

	

}
