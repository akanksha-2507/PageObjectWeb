package com.petClinicAutomation.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.petClinicAutomation.core.TestFactory;

public class AddOwner extends TestFactory{
	@FindBy (id="firstName")
	WebElement firstName;

	@FindBy (id="lastName")
	WebElement lastName;

	@FindBy (id="address")
	WebElement address;

	@FindBy (id="city")
	WebElement city;

	@FindBy (id="telephone")
	WebElement telephone;

	@FindBy (xpath="//button[text()='Add Owner']")
	WebElement addOwnerBtn;

	public AddOwner ()
	{
		PageFactory.initElements(driver, this);
	}


	public void createNewOwner(String ftName, String ltName, String addr, String cty, String telephoneNumber){

		TestFactory.webElementSendKeys(firstName, ftName);
		TestFactory.webElementSendKeys(lastName, ltName);
		TestFactory.webElementSendKeys(address, addr);
		TestFactory.webElementSendKeys(city, cty);
		TestFactory.webElementSendKeys(telephone, telephoneNumber);
		TestFactory.webElementClick(addOwnerBtn);

	}


}
