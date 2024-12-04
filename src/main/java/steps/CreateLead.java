package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	
	
	
	@When("Click the {string} Link")
	public void clickLinkText(String linkname) {
		driver.findElement(By.linkText(linkname)).click();

	}
	
	@Then("MainPage should be displayed")
	public void verifyMainPage() {
		System.out.println("MainPage is dispalyed");

	}
	
	@Then("CreateLead Page Should be displayed")
	public void verifyCreatePage() {
		System.out.println("CreatePage is dispalyed");

	}
	
		
	
	
}
