package stepDefination;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinations {
	WebDriver driver;
	@Given("Launch Browser")
	public void launch_browser() throws Throwable {
	FunctionLibrary.startBrowser();
	}
	@When("Launch Url")
	public void launch_url() {
	    FunctionLibrary.openUrl();
	}
	@When("Wait for username with {string} and {string}")
	public void wait_for_username_with_and(String string, String string2) {
	   FunctionLibrary.waitForElement(string, string2, "20");
	}
	@When("Enter username with {string} and {string} and {string}")
	public void enter_username_with_and_and(String LocatorType, String LocatorValue, String TestData) {
	   FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("Enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String LocatorType, String LocatorValue,String TestData) {
	    FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	   
	}
	@When("Click login button with {string} and {string}")
	public void click_login_button_with_and(String string, String string2) throws Throwable {
	 FunctionLibrary.clickAction(string, string2);
	}
	@When("Wait for supplier link with {string} and {string}")
	public void wait_for_supplier_link_with_and(String string, String string2) {
	    FunctionLibrary.waitForElement(string2, string, "20");
	}
	@When("Click supplier link with {string} and {string}")
	public void click_supplier_link_with_and(String string, String string2) throws Throwable {
	    FunctionLibrary.clickAction(string, string2);
	}
	@When("Wait for Add icon with {string} and {string}")
	public void wait_for_add_icon_with_and(String string, String string2) {
	    FunctionLibrary.waitForElement(string2, string, "20");
	}
	@When("Click add icon button with {string} and {string}")
	public void click_add_icon_button_with_and(String string, String string2) throws Throwable {
	   FunctionLibrary.clickAction(string, string2);
	}
	@When("wait for supplier number with {string} and {string}")
	public void wait_for_supplier_number_with_and(String string, String string2) {
	    FunctionLibrary.waitForElement(string2, string, "20");
	}
	@When("capture supplier number with {string} and {string}")
	public void capture_supplier_number_with_and(String string, String string2) throws Throwable {
	    FunctionLibrary.capturesupp(string, string2);
	}
	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String Locatortype, String Locatorvalue) {
	   FunctionLibrary.typeAction(Locatortype, Locatorvalue, TestData);
	}
	
	
	@When("click add button with {string} and {string}")
	public void click_add_button_with_and(String string, String string2) throws Throwable {
	   FunctionLibrary.clickAction(string, string2);
	}
	@When("Wait for confirm ok button with {string} and {string}")
	public void wait_for_confirm_ok_button_with_and(String string, String string2) {
	   FunctionLibrary.waitForElement(string2, string, "20");
	}
	@When("Click confirm ok button with {string} and {string}")
	public void click_confirm_ok_button_with_and(String string, String string2) throws Throwable {
FunctionLibrary.clickAction(string, string2);
	}
	@When("wait for alert ok with {string} and {string}")
	public void wait_for_alert_ok_with_and(String string, String string2) {
	    FunctionLibrary.waitForElement(string2, string, "20");
	}
	@When("click alert ok with {string} and {string}")
	public void click_alert_ok_with_and(String string, String string2) throws Throwable {
	    FunctionLibrary.clickAction(string, string2);
	}
	@When("validate supplier number")
	public void validate_supplier_number() throws Throwable {
	   FunctionLibrary.suppliertable();
	}

	@When("Click logout with {string} and {string}")
	public void click_logout_with_and(String string, String string2) throws Throwable {
	    FunctionLibrary.clickAction(string, string2);
	}
	@When("close app browser")
	public void close_app_browser() throws Throwable {
	   FunctionLibrary.closebrowser();
	}
	@When("Wait for Customer link {string} and {string}")
	public void wait_for_customer_link_and(String string, String string2) {
	  FunctionLibrary.waitForElement(string2, string, "20");
	}
	@When("Click customer link {string} and {string}")
	public void click_customer_link_and(String string, String string2) throws Throwable {
	    FunctionLibrary.clickAction(string, string2);
	}
	@When("wait for customer number with {string} and {string}")
	public void wait_for_customer_number_with_and(String string, String string2) {
	    FunctionLibrary.waitForElement(string2, string, "20");
	}
	@When("capture customer number with {string} and {string}")
	public void capture_customer_number_with_and(String string, String string2) throws Throwable {
	   FunctionLibrary.captureCus(string, string2);
	}
	@When("validate Customer number")
	public void validate_customer_number() throws Throwable {
	    FunctionLibrary.customerTable();
	}
	
}
