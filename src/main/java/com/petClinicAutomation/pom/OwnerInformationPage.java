package com.petClinicAutomation.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.petClinicAutomation.core.TestFactory;

public class OwnerInformationPage extends TestFactory {
	@FindBy (xpath = "//h2[text()='Owner Information']/..//td/b")
	WebElement fullName;

	@FindBy (xpath="(//h2[text()='Owner Information']/..//td)[2]")
	WebElement address;

	@FindBy (xpath="(//h2[text()='Owner Information']/..//td)[3]")
	WebElement city;

	@FindBy (xpath = "(//h2[text()='Owner Information']/..//td)[4]")
	WebElement telephone;

	@FindBy(xpath = "//a[contains(@href,'/pets/new')]")
	WebElement addNewPetBtn;

	@FindBy(xpath = "//h2[text()='Pets and Visits']/..//dt[text()='Name']/following-sibling::dd[1]")
	List<WebElement> existingPetName;

	@FindBy(xpath = "(//h2[text()='Pets and Visits']/..//dt[text()='Name']/following-sibling::dd)[2]")
	WebElement petBDate;

	@FindBy(xpath = "(//h2[text()='Pets and Visits']/..//dt[text()='Name']/following-sibling::dd)[3]")
	WebElement petType;


	// Initializing the Page Objects:
	public OwnerInformationPage() {
		PageFactory.initElements(driver, this);
	}


	public void clickAddNewPet() {
		TestFactory.webElementClick(addNewPetBtn);
	}


	public String verifyOwnerName(){
		return fullName.getText();
	}

	public String verifyOwnerAddress(){
		return address.getText();
	}

	public String verifyOwnerCity(){
		return city.getText();
	}

	public String verifyTelephone(){
		return telephone.getText();
	}

	public boolean verifyPetAdded(String pet){

		List<WebElement> list = existingPetName;
		System.out.println(list);
		for(WebElement petName:list){
			System.out.println(petName);
			if((petName.getText()).equalsIgnoreCase(pet))
			{				
				return true;
			}				
		}

		return false;
	}

	public String verifyBirthDateOfPetAdded(){
		return petBDate.getText();
	}

	public String verifyTypeOfPetAdded() {
		return petType.getText();
	}

}
