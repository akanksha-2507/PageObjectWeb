package petClinic.Steps;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.Assert;
import com.petClinicAutomation.pom.AddPetPage;
import com.petClinicAutomation.pom.FindOwner;
import com.petClinicAutomation.pom.Home;
import com.petClinicAutomation.pom.OwnerInformationPage;
import com.petClinicAutomation.utilities.RandomName;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyAddedOwner {
	Home home = new Home();
	FindOwner owner = new FindOwner();
	AddPetPage pet = new AddPetPage();
	OwnerInformationPage ownerInfo = new OwnerInformationPage();
	String petName = RandomName.generatePetName();

	@Given("^Go to Owner info with lastname \"([^\"]*)\" and click on Add new pet button$")
	public void go_to_Owner_info_with_lastname_and_click_on_Add_new_pet_button(String arg1) {

		home.clickOnOwnersTab();
		owner.searchOwner(arg1);
		ownerInfo.clickAddNewPet();
	}

	@When("^Add Pet info name, \"([^\"]*)\",\"([^\"]*)\"$")
	public void add_Pet_info(String bDate, String type) {
		pet.addNewPetDetails(petName, bDate, type);
	}

	@Then("^Pet with name, \"([^\"]*)\",\"([^\"]*)\" should be added$")
	public void pet_with_should_be_added(String bDate, String type) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		Date date = sdf.parse(bDate);
		SimpleDateFormat targetDate = new SimpleDateFormat("yyyy-MM-dd");
		String dt=targetDate.format(date);
		System.out.println(dt);
		Assert.assertTrue(ownerInfo.verifyPetAdded(petName));
		Assert.assertEquals(ownerInfo.verifyBirthDateOfPetAdded(), dt);
		Assert.assertEquals(ownerInfo.verifyTypeOfPetAdded(), type);
	}
}
