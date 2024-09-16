package PageFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class LoginPageFile {
 
	WebDriver driver;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="card")
	WebElement creditCard;
	
	@FindBy(id="login2")
	WebElement clicklogin;
	
	@FindBy(id="loginusername")
	WebElement userName;
	
	@FindBy(id="loginpassword")
	WebElement password;
	
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement lognButton;
	
	@FindBy(xpath=("//a[contains(text(),\"Welcome SathishDamarapelly\")]"))
	WebElement verify;
	
	WebElement product;
	
	@FindBy(xpath="//a[contains(text(),\"Add to cart\")]")
	WebElement cart;
	
	@FindBy(id="logout2")
	WebElement lagout;
	
	Boolean verifyProduct;
	
	@FindBy(xpath="//button[contains(text(),\"Place Order\")]")
	WebElement placeOrder;
	
	@FindBy(xpath="//button[contains(text(),\"Purchase\")]")
	WebElement purchase;
	
	@FindBy(xpath="//button[contains(text(),\"OK\")]")
	WebElement conform;
	
	public LoginPageFile(WebDriver driver) {
		this.driver=driver;
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
	
	public boolean nagivatePage() throws InterruptedException {
		Thread.sleep(9000);
	    return verify.isDisplayed();
	}
	
	public void selectCategories(String category) {
		driver.findElement(By.xpath("//a[contains(text(),"+category+")]")).click();
	}
	
	public void selectProduct(String product) throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),"+product+")]")).click();
	}
	
	public void addToCart() throws InterruptedException {
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(cart);
		cart.click();
		driver.navigate().refresh();
	}
	
	public Boolean verifyProductInCart(String cart,String product) throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),"+cart+")]")).click();
		Thread.sleep(2000);
		verifyProduct=driver.findElement(By.xpath("//td[contains(text(),"+product+")]")).isDisplayed();
		return verifyProduct;
	}
	
	public void placeOrder() {
		placeOrder.click();
	}
	
	public void addDetailsForPayment(String pname,String pcreditCard) throws InterruptedException {
		Thread.sleep(2000);
		name.sendKeys(pname);
		creditCard.sendKeys(pcreditCard);
		
	}
	
	public void purchaseOrder() {
		Actions action=new Actions(driver);
		action.moveToElement(purchase);
		purchase.click();
	}
	
	public boolean verifyPurchase(String validation) {
		verifyProduct=driver.findElement(By.xpath("//h2[contains(text(),"+validation+")]")).isDisplayed();
		conform.click();
		return verifyProduct;
	}
	public void lagout() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		lagout.click();
	}
}
