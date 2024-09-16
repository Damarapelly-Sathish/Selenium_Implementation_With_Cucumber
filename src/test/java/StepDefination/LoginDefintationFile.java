package StepDefination;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFile.LoginPageFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginDefintationFile {
       WebDriver driver;
       LoginPageFile loginPage;
	   
       @Before
       public void launch_browser()
       {
    	   System.setProperty("webdriver.chrome.driver","E:\\SelemiumProject\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver(); 
       }
       
		@Given("user launch the application")
		public void user_launch_the_application()
		{
			driver.get("https://www.demoblaze.com/");
		}
		

@When("^user enter (.*) and (.*)$")
public void enterUserDetails(String userName,String password) throws InterruptedException {
	 loginPage=new LoginPageFile(driver);
      loginPage.EnterDetails(userName,password);
	
	}
    
    @And("click on login button")
    public void loginButton() {
        // Write code here that turns the phrase above into concrete actions
      loginPage.clickLoginButton();
    }

    @Then("user navigate to application")
    public void user_navigate_to_application() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	assertTrue(loginPage.nagivatePage());
    }
    
    @And("^select the (.*) categories$")
    public void selectCategories(String categories) {
    	loginPage.selectCategories(categories);
    }
    
    @Then("user select the (.*) product$")
    public void selectProduct(String product) throws InterruptedException {
    	loginPage.selectProduct(product);
    }
    
    @And("user add product to add to cart")
    public void addToCart() throws InterruptedException {
    	loginPage.addToCart();
    }
    
    @Then("^user click on (.*) to verify product (.*)$")
    public void verifyProductInCart(String cart,String product ) throws InterruptedException {
    	assertTrue(loginPage.verifyProductInCart(cart,product));
    }
    
    @And("user proceed to place order")
    public void placeOrder() {
    	loginPage.placeOrder();
    }
    
    @And("^user fill the required details (.*) and (.*) for order$")
    public void addDetailsForPayment(String name,String creditCard) throws InterruptedException {
    	loginPage.addDetailsForPayment(name,creditCard);
    }
    
    @And("user purchase the order")
    public void purchaseOrder() {
    	loginPage.purchaseOrder();
    }
    
    @Then("^user verify the message (.*)$")
    public void verifyPurchase(String validation) {
    	assertTrue(loginPage.verifyPurchase(validation));
    }
    
    
    
    @After
    public void lagout_application() throws InterruptedException {
    	loginPage.lagout();
    }
	}

	
