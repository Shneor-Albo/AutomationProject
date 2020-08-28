package WorkFlows;

import Extentions.apiActions;
import Extentions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class electronFlows extends commonOps
{
    @Step("get Screen info")
    public static void getScreenInfo()
    {
       uiActions.click(electronMain.btn_windows);
       uiActions.click(electronMain.btn_info);
        uiActions.click(electronMain.btn_demo_Toggle);
        uiActions.click(electronMain.btn_demo_Toggle);
       uiActions.click(electronMain.btn_screenInfo);
    }
}
