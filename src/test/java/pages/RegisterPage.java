package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='register-title']/span")
    public WebElement verifyRegisterPage;

    @FindBy(css = "input#ssn")
    public WebElement ssn;

    @FindBy(css = "input#firstname")
    public WebElement firstname;

    @FindBy(css = "input#lastname")
    public WebElement lastname;

    @FindBy(css = "input#address")
    public WebElement address;

    @FindBy(css = "input#mobilephone")
    public WebElement mobilePhone;


    @FindBy(css = "input#username")
    public WebElement userName;


    @FindBy(css = "input#email")
    public WebElement email;


    @FindBy(css = "input#firstPassword")
    public WebElement firstPassword;

    @FindBy(css = "input#secondPassword")
    public WebElement secondPassword;


    @FindBy(id = "register-submit")
    public WebElement registerButton;



}
