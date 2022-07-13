package petClinic.Steps;

import org.testng.Assert;
import com.petClinicAutomation.core.TestFactory;
import com.petClinicAutomation.pom.Home;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class VerifyImageOnHomePage extends TestFactory {

	Home home =new Home();

	@Given("^Petclicnic application should be launched$")
	public void petclicnic_application_should_be_launched() {
		Assert.assertEquals(home.verifyHomePageTitle(), "PetClinic :: a Spring Framework demonstration");									 
	}

	@When("^Verify image on Home Page$")
	public void verify_image_on_Home_Page() throws InterruptedException {
		Assert.assertTrue(home.validatePetClinicImage());
	}

	@Then("^Image should be verified$")
	public void image_should_be_verified() {
		System.out.println("Image is present");
	}




}