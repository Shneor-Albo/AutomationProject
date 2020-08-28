package WorkFlows;

import Extentions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class calcFlows extends commonOps
{
    @Step("Calculate Addition")
    public static void Calculate()
    {
        uiActions.click(calcMain.btn_clear);
        uiActions.click(calcMain.btn_one);
        uiActions.click(calcMain.btn_plus);
        uiActions.click(calcMain.btn_one);
        uiActions.click(calcMain.btn_Equals);
    }
}
