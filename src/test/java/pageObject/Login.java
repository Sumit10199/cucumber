package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
	WebDriver ldriver;

	public Login(WebDriver rDriver) {
		ldriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div/div/div[4]/button")
	WebElement loginbtn;

	public void enterCreds(String emailAdd, String pass) {
		email.sendKeys(emailAdd);
		password.sendKeys(pass);

	}

	public void clickLoginBtn() {
		loginbtn.click();
	}

}
