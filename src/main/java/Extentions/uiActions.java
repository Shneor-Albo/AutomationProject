package Extentions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.regex.Pattern;

public class uiActions extends commonOps
{
    @Step("Click On Element")
    public static void click(WebElement elem)
    {
        if (!platform.equalsIgnoreCase("mobile") && !platform.equalsIgnoreCase("electron")
                && !platform.equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();

    }

    @Step("Send Text To Text-Field")
    public static void updateText(WebElement elem, String value)
    {
        if (!platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    @Step("DropDown")
    public static void updateDropDown(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }

    @Step("Swich To Alert")
    public static void switchToAlert()
    {
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    @Step("Visible Error")
    public static void visibleError(WebElement elem)
    {
        wait.until(ExpectedConditions.
                textMatches(By.cssSelector("div.message-error.validation-summary-errors"),
                        Pattern.compile("Login was unsuccessful")));
    }

    @Step("Mouse Hover To Element")
    public static void mouseHoverElemnts(WebElement elem1, WebElement elem2)
    {
        action.moveToElement(elem1).moveToElement(elem2).build().perform();

    }


}
