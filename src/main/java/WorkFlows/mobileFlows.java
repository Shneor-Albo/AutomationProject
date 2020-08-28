package WorkFlows;

import Extentions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class mobileFlows extends commonOps
{
    @Step("Fill in Form Calaulate Mortgage")
    public static void Calculate (String amount, String term,String rate)
    {
        uiActions.updateText(mortgageMain.txt_amount,amount);
        uiActions.updateText(mortgageMain.txt_term,term);
        uiActions.updateText(mortgageMain.txt_rate,rate);
        uiActions.click(mortgageMain.Btn_Calculate);
    }
}
