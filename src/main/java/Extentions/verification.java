package Extentions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import static org.testng.Assert.*;

public class verification extends commonOps
{
    @Step("Verify Text In Element")
    public static void textInElement(WebElement elem, String expectedValue)
    {
        if (!platform.equalsIgnoreCase("mobile") && !platform.equalsIgnoreCase("electron")
                && !platform.equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        if (platform.equalsIgnoreCase("desktop"))
            assertEquals(elem.getText().replaceAll("התצוגה היא", "").trim(), expectedValue);
    }

    @Step("Number Of Elements Equals To")
    public static void numberOfElements(List<WebElement> elems, int expectedValue)
    {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), expectedValue);
    }

    @Step("Verify Element visually")
    public static void visualElement(WebElement imageElement, String expectedImageName)
    {
        BufferedImage expectedImage = null;
        try {
            expectedImage = ImageIO.read(new File(getData("ImageRepo") + expectedImageName + ".png"));
        } catch (Exception e) {
            System.out.println("Error reading image file");
        }
        imageScreenShot = new AShot().takeScreenshot(driver, imageElement);
        BufferedImage actualImage = imageScreenShot.getImage();
        diff = imagedif.makeDiff(actualImage, expectedImage);
        assertFalse(diff.hasDiff());
    }

    @Step("verify Text With Text")
    public static void text(String actualText, String expectedText)
    {
        assertEquals(actualText, expectedText);
    }





}
