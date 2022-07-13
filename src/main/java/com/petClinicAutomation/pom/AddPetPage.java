package com.petClinicAutomation.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.petClinicAutomation.core.TestFactory;

public class AddPetPage extends TestFactory{

	@FindBy(how=How.XPATH,using="//input[@id='name']")
	private WebElement petName;

	@FindBy(how=How.XPATH,using="//input[@id='birthDate']")
	private WebElement birthDate;

	@FindBy(how=How.XPATH,using="//select[@id='type']")
	private WebElement petType;

	@FindBy(how=How.XPATH,using="//button[text()='Add Pet']")
	private WebElement addPetButton;

	public AddPetPage ()
	{
		PageFactory.initElements(driver, this);
	}

	public void addNewPetDetails(String pName, String bDate, String type){

		TestFactory.webElementSendKeys(petName, pName);
		TestFactory.webElementSendKeys(birthDate, bDate);
		TestFactory.select(petType, type);
		TestFactory.webElementClick(addPetButton);

	}

}
