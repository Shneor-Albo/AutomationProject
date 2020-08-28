package PageObjects.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class shopCartPage
{
    @FindBy(name = "removefromcart")
    public List<WebElement> radioBtn_remove;

    @FindBy(name = "updatecart")
    public WebElement btn_updateCart;
}
