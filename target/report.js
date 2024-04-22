$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/AccountCreationFeature/CreateAccount.feature");
formatter.feature({
  "name": "To verify the account creation feature in orikan website",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the browser and launch orikan url",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateNewAccount.to_launch_the_browser_and_launch_orikan_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To create an new account in orikan site",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To pass datas into email, password, confirm password into required text box and click next button",
  "keyword": "When "
});
formatter.match({
  "location": "CreateNewAccount.to_pass_datas_into_email_password_confirm_password_into_required_text_box_and_click_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass datas into firstname, lastname, address, postcode, city in required field",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccount.to_pass_datas_into_firstname_lastname_address_postcode_city_in_required_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select state in state drop down and click next",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccount.to_select_state_in_state_drop_down_and_click_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass datas into holdername, cardnumber, cvvnumber, expiry year in required field",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccount.to_pass_datas_into_holdername_cardnumber_cvvnumber_expiry_year_in_required_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select master card and choose state and click next",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccount.to_select_master_card_and_choose_state_and_click_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enable agreement checkbox and click submit",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccount.to_enable_agreement_checkbox_and_click_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify the text account is successfully registered",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccount.to_verify_the_text_account_is_successfully_registered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewAccount.to_close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the browser and launch orikan url",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateNewAccount.to_launch_the_browser_and_launch_orikan_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To create and account with another email",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To pass datas into email, password, confirm password field",
  "keyword": "When "
});
formatter.match({
  "location": "NewAccount.to_pass_datas_into_email_password_confirm_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click login button",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
});