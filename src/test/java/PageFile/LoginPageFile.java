package PageFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class LoginPageFile {
 
	WebDriver driver;
	
	@FindBy(id="login2")
	WebElement clicklogin;
	
	@FindBy(id="loginusername")
	WebElement userName;
	
	@FindBy(id="loginpassword")
	WebElement password;
	
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement lognButton;
	
	@FindBy(id="nameofuser")
	WebElement verify;
	
	public LoginPageFile(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void EnterDetails(String userData,String passEnter) throws InterruptedException {
		clicklogin.click();
		Thread.sleep(2000);
		userName.sendKeys(userData);
		password.sendKeys(passEnter);
	}
	
	public void clickLoginButton() {
		lognButton.click();
	}
	
	public boolean nagivatePage() {
	    return verify.isDisplayed();
	}
}
