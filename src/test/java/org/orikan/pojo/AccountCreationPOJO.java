package org.orikan.pojo;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationPOJO extends UtilityClass{
	
	public AccountCreationPOJO() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="emailAddress")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="confirmPassword")
	private WebElement confPass;
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="addressLine1")
	private WebElement addressOne;
	
	@FindBy(id="postcode")
	private WebElement postCode;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="state")
	private WebElement stateDropDown;
	
	@FindBy(id="cardHolderName")
	private WebElement holderName;
	
	@FindBy(id="cardTypeMastercard")
	private WebElement masterCard;
	
	@FindBy(id="cardNumber")
	private WebElement cardNumber;
	
	@FindBy(id="cardCVV")
	private WebElement cvv;
	
	@FindBy(id="cardExpiryMonth")
	private WebElement expMonthDropDown;
	
	@FindBy(id="cardExpiryYear")
	private WebElement expYear;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath="//textarea[contains(text(),'Lorem ')]")
	private WebElement scroll;
	
	@FindBy(id="agreedToTerms")
	private WebElement agree;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitButton;
	
	@FindBy(tagName="app-register-complete-page")
	private WebElement successfullyRegistered;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfPass() {
		return confPass;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddressOne() {
		return addressOne;
	}

	public WebElement getPostCode() {
		return postCode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getHolderName() {
		return holderName;
	}

	public WebElement getMasterCard() {
		return masterCard;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getExpMonthDropDown() {
		return expMonthDropDown;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getSuccessfullyRegistered() {
		return successfullyRegistered;
	}

	public WebElement getScroll() {
		return scroll;
	}
	
	
	

}
