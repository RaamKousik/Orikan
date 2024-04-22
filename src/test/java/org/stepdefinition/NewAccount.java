package org.stepdefinition;

import org.base.UtilityClass;
import org.orikan.pojo.AccountCreationPOJO;

import cucumber.api.java.en.When;

public class NewAccount extends UtilityClass {

	AccountCreationPOJO a;
	
	@When("To pass datas into email, password, confirm password field")
	public void to_pass_datas_into_email_password_confirm_password_field() {
	   
		a = new AccountCreationPOJO();
		passText(a.getEmail(), "kousik2808@gmail.com");
		passText(a.getPassword(), "kousik");
		passText(a.getConfPass(), "kousik");
	}

	@When("To click login button")
	public void to_click_login_button() {
	    
		clickWebElement(a.getNextButton());
	}
}
