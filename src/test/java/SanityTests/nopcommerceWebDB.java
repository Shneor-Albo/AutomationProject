package SanityTests;

import Extentions.verification;
import Utilities.commonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static Utilities.base.nopcommerceMain;

@Listeners(Utilities.listeners.class)
public class nopcommerceWebDB extends commonOps
{
    @Test(description = "Test 01 Login To Nopcommerce with DB")
    @Description("Test description Login To Nopcommerce Web Application with DB")
    public void test01_loginDB() throws InterruptedException
    {
        webFlows.loginDB();
        verification.textInElement(nopcommerceMain.txt_errorLogin, "Login was unsuccessful. Please correct the errors and try again.");

    }


}
