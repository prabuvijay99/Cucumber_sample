package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{
	
	
	
	@Given("Enter the userName as {string}")
	public void enterUserNAme(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);

	}
	
	@Given("enter the Password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

	}
	
	@When("Click the Login button")
	public void clickLogin() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		System.out.println("HomePage Displayed");

	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error Message");
	}
	
	
	
}

