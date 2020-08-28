package PageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainPage
{
    @FindBy(className = "ico-register")
    public WebElement btn_regitser;

    @FindBy(xpath = "//a[@href='/']")
    public WebElement img_nopcomerceLogo;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    public WebElement txt_errorLogin;
}
