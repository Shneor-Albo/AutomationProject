package WorkFlows;

import Extentions.dbActions;
import Extentions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;

public class webFlows extends commonOps
{
    @Step("Login Nopcommerce Flow")
    public static void login(String user, String pass)
    {
        uiActions.click(nopcommerceLogin.btn_linkToLogin);

        uiActions.updateText(nopcommerceLogin.txt_password, pass);
        uiActions.updateText(nopcommerceLogin.txt_email, user);
        uiActions.click(nopcommerceLogin.Btn_Login);
        uiActions.switchToAlert();
        uiActions.click(nopcommerceLogin.Btn_Loginx);
        uiActions.visibleError(nopcommerceLogin.errorMessage);
    }

    @Step("Login Nopcommerce Flow with DB Credentials")
    public static void loginDB()
    {

        List<String> cred = dbActions.getCredentials("SELECT User_Name,Password FROM Credentials2 WHERE id='1'");
        uiActions.click(nopcommerceLogin.btn_linkToLogin);
        uiActions.updateText(nopcommerceLogin.txt_email, cred.get(0));
        uiActions.updateText(nopcommerceLogin.txt_password, cred.get(1));
        uiActions.click(nopcommerceLogin.Btn_Login);
        uiActions.switchToAlert();
        uiActions.click(nopcommerceLogin.Btn_Loginx);
        uiActions.visibleError(nopcommerceLogin.errorMessage);
    }

    @Step("Add Product To Bag")
    public static void addProduct()
    {
        uiActions.mouseHoverElemnts(nopcommerceMenu.btn_Electronics, nopcommerceMenu.link_CameraPhoto);
        uiActions.click(nopcommerceMenu.link_CameraPhoto);
        uiActions.click(nopcommerceMenu.link_openCameraItem);
        uiActions.click(nopcommerceMenu.btn_addToCart);
        uiActions.click(nopcommerceMenu.btn_shoppingCart);
    }

    @Step("Delete Last Product From Bag")
    public static void deleteLastProduct()
    {
        uiActions.click(nopcommerceCart.radioBtn_remove.get(nopcommerceCart.radioBtn_remove.size() - 1));
        uiActions.click(nopcommerceCart.btn_updateCart);
    }


}
