package stepDefination;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDef {
	
	public WebDriver driver;
	public Login loginpg;

	@Given("Launch chrome browser")
	public void launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		loginpg = new Login(driver);
	}

	@When("opens Url {string}")
	public void opens_url(String url) {
		driver.get(url);
	}

	@When("Email as {string} and password as {string}")
	public void email_as_and_password_as(String emailaddress, String password) throws InterruptedException {
		Thread.sleep(2000);
		loginpg.enterCreds(emailaddress, password);
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		loginpg.clickLoginBtn();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}

















