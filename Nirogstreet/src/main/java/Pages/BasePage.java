package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends Page {
	
//	public static String TestData_sheet="D:\\Anil\\JAVA_Selenium\\Selenium_Workspace\\BTT\\src\\main\\java\\com\\TestData\\TestData.xlsx";
//	static Workbook book;
//	static Sheet sheet;
	public BasePage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public void scrollByVisibilityOfElement(By locator) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", getElement(locator));
		js.executeScript("arguments[0].click();",getElement(locator));	
		
	}
	
	
	@Override
	public boolean getlogo(By locator) {
		return getElement(locator).isDisplayed();
	
	}
	
	

	@Override
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			waitForElementPresent(locator);
			element = driver.findElement(locator);
		}catch(Exception e){
			e.getStackTrace();
			
		}
		return element;
		
	}


	@Override
	public void waitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}



	@Override
	public String getCurrentURL() {
		return driver.getCurrentUrl();
		
	}


	@Override
	public void windowHandel() {
		String parent =driver.getWindowHandle();
		Set<String> childs=driver.getWindowHandles();
		Iterator<String> it=childs.iterator();
		while(it.hasNext()) {
			String child=it.next();
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				
			}
		}
		
	}
	
	
}