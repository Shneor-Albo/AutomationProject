package Extentions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class dbActions extends commonOps
{
    @Step("Get the Credentials From DB")
    public static List<String> getCredentials(String query)
    {
        List<String> credentials = new ArrayList<String>();
        try {
            rs = stmt.executeQuery(query);
            rs.next();
            credentials.add(rs.getString(1));
            credentials.add(rs.getString(2));
//            System.out.println("User is "+rs.getString(1));
//            System.out.println("Password is "+rs.getString(2));
        }
        catch (Exception e)
        {
            System.out.println("Error Occured while Printing Table Data, see details"+ e);
        }
        return credentials;
    }
}
