package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.GmiBankHomePage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RegistrationStepDefinition {

    GmiBankHomePage gmiBankHomePage = new GmiBankHomePage();
    RegisterPage registerPage = new RegisterPage();



    @Given("user goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_bank_url"));
        Driver.wait(5);

    }

    @When("click the sign in symbol and register button")
    public void click_the_sign_in_symbol_and_register_button() {
        gmiBankHomePage.signInSymbol.click();
        gmiBankHomePage.registerButton.click();

    }

    @Then("verify the registration page")
    public void verify_the_registration_page() {

        String expectedData = "https://www.gmibank.com/account/register";
        String actualData = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualData, expectedData, "Registration page does not verify. ");

    }

    @Then("type the ssn, firstname, lastname, address, phone number, username and email information")
    public void type_the_ssn_firstname_lastname_address_phone_number_username_and_email_information() {

        registerPage.ssn.sendKeys(Faker.instance().idNumber().ssnValid());
        registerPage.firstname.sendKeys(Faker.instance().name().firstName());
        registerPage.lastname.sendKeys(Faker.instance().name().lastName());
        registerPage.address.sendKeys(Faker.instance().address().fullAddress());
        registerPage.mobilePhone.sendKeys(Faker.instance().phoneNumber().phoneNumber());
        registerPage.userName.sendKeys(Faker.instance().name().username());
        registerPage.email.sendKeys(Faker.instance().internet().emailAddress());

    }

    @When("type the new password")
    public void type_the_new_password() {
        registerPage.firstPassword.sendKeys("Damla12345?");

    }

    @When("type the new password confirmation")
    public void type_the_new_password_confirmation() {
        registerPage.secondPassword.sendKeys("Damla12345?");

    }

    @Then("click the register button")
    public void click_the_register_button() {

        registerPage.registerButton.click();

    }

}
