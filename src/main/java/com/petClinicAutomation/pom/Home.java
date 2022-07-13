package com.petClinicAutomation.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.petClinicAutomation.core.TestFactory;


public class Home extends TestFactory
{

	public Home () {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "HOME")
	WebElement homeTab;

	@FindBy(how=How.XPATH,using="//*[@title='find owners']")
	WebElement ownersTab;

	@FindBy(how=How.XPATH,using="/html/body/div/div/h2")	
	WebElement welcomeText;

	@FindBy(how=How.XPATH,using="//img[@class='img-responsive']")
	WebElement petImage;


	public String verifyHomePageTitle(){
		return driver.getTitle();

	}

	public boolean validatePetClinicImage()  {

		if(TestFactory.isElementDisplayed(petImage) && TestFactory.isElementDisplayed(welcomeText)){
			return true;
		}
		return false;
	}

	public void clickOnOwnersTab(){		
		TestFactory.webElementClick(ownersTab);		
	}

}
