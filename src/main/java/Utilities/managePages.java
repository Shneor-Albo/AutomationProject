package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{

    public static void init()
    {
        nopcommerceLogin = PageFactory.initElements(driver,PageObjects.nopcommerce.loginPage.class);
        nopcommerceMain = PageFactory.initElements(driver,PageObjects.nopcommerce.mainPage.class);
        nopcommerceMenu = PageFactory.initElements(driver,PageObjects.nopcommerce.menuPage.class);
        nopcommerceCart = PageFactory.initElements(driver,PageObjects.nopcommerce.shopCartPage.class);

        mortgageMain = PageFactory.initElements(driver,PageObjects.Mortgage.mainPage.class);

        electronMain = PageFactory.initElements(driver,PageObjects.ElectronDemo.mainPage.class);

        calcMain = PageFactory.initElements(driver,PageObjects.Calculator.mainPage.class);
    }

}
