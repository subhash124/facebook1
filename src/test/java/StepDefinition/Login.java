package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.facebook1;

public class Login 
{
	@When ("^browser is open$")
	public void browser_is_open() throws InterruptedException 
	{
		facebook1.bLaunch();
		
	}
	
	@Given ("^user navigate to url as \"(.*)\"$")
	public void user_navigate_to_url(String url1) 
	{
		facebook1.openApplication(url1);
	}

	@Then ("^user enter \"(.*)\" email id (.+)$")
	public void user_enter_id_email_id_shailaja(String str, String str1) 
	{
		facebook1.sendkeys(str, str1);
	}

	@And ("^user enter \"(.*)\" password  (.+)$")
	public void user_enter_id_password_shailaja(String locater, String str) 
	{
		facebook1.sendkeys(locater, str);
	}

	@Then ("^user click on submit tap \"(.*)\"$")
	public void user_click_on_submit_tap(String xpath ) 
	{
		facebook1.click(xpath);
	}

	@But ("^user not login successfully$")
	public void user_not_login_successfully( ) 
	{
		System.out.println(" FAILED");
	}


}
