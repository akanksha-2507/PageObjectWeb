package com.petClinicAutomation.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.petClinicAutomation.core.TestFactory;

public class FindOwner extends TestFactory {

	@FindBy (xpath = "//a[text()='Add Owner']")
	WebElement addOwnerBtn;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement searchName;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement findOwnerBtn;

	public FindOwner() {
		PageFactory.initElements(driver, this);
	}

	public void clickAddOwner() {
		TestFactory.webElementClick(addOwnerBtn);
	}

	public void searchOwner(String ownerLastName) {
		TestFactory.webElementSendKeys(searchName, ownerLastName);	
		TestFactory.webElementClick(findOwnerBtn);
	}

}
