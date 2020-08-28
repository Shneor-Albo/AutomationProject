package Helpers;

import Utilities.commonOps;
import Utilities.helperMethods;
import WorkFlows.webFlows;
import org.testng.annotations.Test;

public class visualTesting extends commonOps
{
  @Test
  public void createScreenShot()
  {
    webFlows.login("shneor2007@gmail.com","770770");
    helperMethods.takeElementScreenShot(nopcommerceMain.img_nopcomerceLogo, "nopLogo_ver01");
  }
}
