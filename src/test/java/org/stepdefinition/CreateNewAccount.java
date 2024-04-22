package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.UtilityClass;
import org.openqa.selenium.interactions.Actions;
import org.orikan.pojo.AccountCreationPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewAccount extends UtilityClass {
	
	AccountCreationPOJO a;
	
	@Given("To launch the browser and launch orikan url")
	public void to_launch_the_browser_and_launch_orikan_url() {
	    
		launchBrowser();
		launchUrl("https://orikan-ui-automation-test.azurewebsites.net/");
		implWaits();
	}

	@When("To pass datas into email, password, confirm password into required text box and click next button")
	public void to_pass_datas_into_email_password_confirm_password_into_required_text_box_and_click_next_button() {
	    
		a = new AccountCreationPOJO();
		passText(a.getEmail(), "kousik@gmail.com");
		passText(a.getPassword(), "kousik");
		passText(a.getConfPass(), "kousik");
		clickWebElement(a.getNextButton());
		
	}

	@When("To pass datas into firstname, lastname, address, postcode, city in required field")
	public void to_pass_datas_into_firstname_lastname_address_postcode_city_in_required_field() {
	   
		passText(a.getFirstName(), "Kousik");
		passText(a.getLastName(), "Raam");
		passText(a.getAddressOne(), "New Place");
		passText(a.getPostCode(), "6000");
		passText(a.getCity(), "Perth");
	}

	@When("To select state in state drop down and click next")
	public void to_select_state_in_state_drop_down_and_click_next() {
	    
		selectOption(a.getStateDropDown(), 4);
		clickWebElement(a.getNextButton());
	}

	@When("To pass datas into holdername, cardnumber, cvvnumber, expiry year in required field")
	public void to_pass_datas_into_holdername_cardnumber_cvvnumber_expiry_year_in_required_field() {
	    
		passText(a.getHolderName(), "Kousik");
		passText(a.getCardNumber(), "0000000000000000");
		passText(a.getCvv(), "000");
		passText(a.getExpYear(), "2024");
	}

	@When("To select master card and choose state and click next")
	public void to_select_master_card_and_choose_state_and_click_next() {
	    
		clickWebElement(a.getMasterCard());
		selectOption(a.getExpMonthDropDown(), 10);
		clickWebElement(a.getNextButton());
	}

	@When("To enable agreement checkbox and click submit")
	public void to_enable_agreement_checkbox_and_click_submit() throws InterruptedException {
	    implWaits();
		Thread.sleep(10000);
		clickWebElement(a.getAgree());
		clickWebElement(a.getSubmitButton());
	}

	@When("To verify the text account is successfully registered")
	public void to_verify_the_text_account_is_successfully_registered() {
	    
		System.out.println(retrieveText(a.getSuccessfullyRegistered()));
	}

	@Then("To close browser")
	public void to_close_browser() {
	    
		//close browser code --> driver.close();
	}
	

}
