package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class LOginOR{
	WebDriver driver;

	public LOginOR(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email") WebElement userN;
	@FindBy(name = "Password") WebElement passW;
	@FindBy(how = How.XPATH, using = "//input[@value = 'Log in']") WebElement login;

}
