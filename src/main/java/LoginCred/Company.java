package LoginCred;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonConstructor.commonConstructor;

public class Company extends commonConstructor {
	WebDriver driver;
	
	
	public Company(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	
	@FindBy(xpath="/html/body/app-dashboard/div/main/div[3]/app-company-select/div/div/div/div[1]/div[2]/button/span") 
	public WebElement company;
	
	public void companySelect() {
		company.click();
	}

}
