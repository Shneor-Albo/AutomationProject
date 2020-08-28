package PageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage
{
    @FindBy(className = "ico-login")
    public WebElement btn_linkToLogin;

    @FindBy(id = "Email")
    public WebElement txt_email;

    @FindBy(id = "Password")
    public WebElement txt_password;

    @FindBy(css = "input[type='submit']")
    public WebElement  Btn_Login;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    public WebElement  Btn_Loginx;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    public WebElement  errorMessage;
//
    @FindBy(xpath = "//div/input[@class='button-1 register-button']")
    public WebElement  btn_Register;




}
