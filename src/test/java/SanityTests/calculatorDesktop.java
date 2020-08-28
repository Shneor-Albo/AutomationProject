package SanityTests;

import Extentions.verification;
import Utilities.commonOps;
import WorkFlows.calcFlows;
import WorkFlows.electronFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class calculatorDesktop extends commonOps
{
    @Test(description = "Test 01 Verify Addition Command")
    @Description("Test description : Verify Addition Command in Calculator")
    public void test01_VerifyMortgage()
    {
        calcFlows.Calculate();
        verification.textInElement(calcMain.field_displayIs,"2");
    }
}
