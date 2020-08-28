package SanityTests;

import Extentions.verification;
import Utilities.commonOps;
import WorkFlows.electronFlows;
import WorkFlows.mobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class electronDemo extends commonOps
{

       @Test(description = "Test 01 Verify Screen Resolution")
        @Description("Test description : Getting the Resolution from App and Verify it")
        public void test01_VerifyScreenResolution()
        {
            electronFlows.getScreenInfo();
            verification.textInElement(electronMain.field_screen_info,"Your screen is: 1024px x 768px");
        }
}
