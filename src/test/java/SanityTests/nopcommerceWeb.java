package SanityTests;

import Extentions.uiActions;
import Extentions.verification;
import Utilities.commonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static Utilities.base.*;


@Listeners(Utilities.listeners.class)
public class nopcommerceWeb extends commonOps
{
    @Test(description = "Test 01 Login To Nopcommerce")
    @Description("Test description Login To Nopcommerce Web Application")
    public void test01_login()
    {
        webFlows.login("shneor2007@gmail.com", "770770");
        verification.textInElement(nopcommerceMain.txt_errorLogin, "Login was unsuccessful. Please correct the errors and try again.");
    }

    @Test(description = "Test 02 Add Product")
    @Description("Test description Add Product To Bag")
    public void test02_AddProduct() throws InterruptedException
    {
       webFlows.addProduct();
    }

    @Test(description = "Test 03 Verify Shopping Bag")
    @Description("Test description Verify Shopping Bag QTY Equals To 1")
    public void test03_VerifyShoppingBag()
    {

        verification.textInElement(nopcommerceMenu.txt_qtyCart, "(1)");
    }

    @Test(description = "Test 04 Remove Product From Bag")
    @Description("Test description Remove Product And Verify Bag QTY Equals     0")
    public void test04_RemoveProductAndVerify() throws InterruptedException
    {
        uiActions.click(nopcommerceMenu.btn_shoppingCart);
        webFlows.deleteLastProduct();
        verification.textInElement(nopcommerceMenu.txt_qtyCart, "(0)");
    }

    @Test(description = "Test 05 Verify logo")
    @Description("Test description Verify nopcommerce Logo")
    public void test05_VerifyLogo()
    {
        verification.visualElement(nopcommerceMain.img_nopcomerceLogo,"nopComerceLogo");
    }

}
