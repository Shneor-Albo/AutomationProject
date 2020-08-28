package SanityTests;

import Extentions.verification;

import Utilities.commonOps;
import WorkFlows.mobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static Utilities.base.*;


@Listeners(Utilities.listeners.class)
public class mortgageMobile extends commonOps
{
    @Test(description = "Test 01 Verify Mortgage")
    @Description("Test description Fill in Mortgage fields and Calculate Repayment")
    public void test01_VerifyMortgage()
    {
        mobileFlows.Calculate("1000","3","4");
        verification.textInElement(mortgageMain.txt_Repayment,"£30.03");
    }

}
