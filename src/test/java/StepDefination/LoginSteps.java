package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
       WebDriver driver;
	    
		@Given("user launch the application")
		public void user_launch_the_application()
		{
			driver=new ChromeDriver();
			driver.get("https://www.amazon.com");
		}
		

@When("user enter userName and password")
public void user_enter_sathish_and_s_t26() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(1);
	}
    
    @And("click on login button")
    public void loginButton() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(1);
    }

    @Then("user navigate to application")
    public void user_navigate_to_application() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(1);
    }
	}

	
