package petClinic.Steps;

import com.petClinicAutomation.pom.AddOwner;
import com.petClinicAutomation.pom.FindOwner;
import com.petClinicAutomation.pom.Home;
import com.petClinicAutomation.pom.OwnerInformationPage;
import com.petClinicAutomation.utilities.RandomName;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class VerifyAddedPet {
	Home home = new Home();
	FindOwner findOwner= new FindOwner();
	AddOwner add = new AddOwner();
	OwnerInformationPage owner = new OwnerInformationPage();
	String fullName = RandomName.generateOwnerName();
	String fName = fullName.split(" ")[0];
	String lName = fullName.split(" ")[1];

	@Given("^Go to PetClinic home page and click on Find Owners tab$")
	public void go_to_PetClinic_home_page_and_click_on_FInd_Owners_tab() {
		home.clickOnOwnersTab();		
	}

	@When("^Add Owners name, \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void add_Owners(String addr, String cty, String tel) {
		findOwner.clickAddOwner();
		add.createNewOwner(fName, lName, addr, cty, tel);
	}

	@Then("^Owners with name,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" should be added$")
	public void owners_should_be_added(String addr, String cty, String tel) {

		Assert.assertEquals(owner.verifyOwnerName(), fullName);
		Assert.assertEquals(owner.verifyOwnerAddress(), addr);
		Assert.assertEquals(owner.verifyOwnerCity(), cty);
		Assert.assertEquals(owner.verifyTelephone(), tel);
	}
}
