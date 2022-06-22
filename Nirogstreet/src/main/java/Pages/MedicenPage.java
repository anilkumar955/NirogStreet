package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MedicenPage extends BasePage {
	private By searchBrand = By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-4 col-xs-12']//input[@id='brand-search']");
	private By himalayaCheckBox=By.xpath("//div[@class='checkbox']//input[@id='brand167']");
	private By himalaya=By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/ol/li[4]/a");

	public MedicenPage(WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement searchBrandName() {
		return getElement(searchBrand);
		
	}
	public WebElement clickCheckBox() {
		return getElement(himalayaCheckBox);
	}
	public String titleOfHimalaya() {
		return getElement(himalaya).getText();
	}

}
