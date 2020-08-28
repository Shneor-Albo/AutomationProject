package Utilities;

import io.restassured.RestAssured;

import java.sql.DriverManager;

public class manageDB extends commonOps
{
    public static void initConnection(String dbUrl,String userName,String password)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl,userName,password);
            stmt = con.createStatement();
        }
        catch (Exception e)
        {
            System.out.println("Error Occured while Connecting to DB, see details"+ e);
        }
    }

    public static void closeConnection()
    {
        try {
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Error Occured while Closing the DB, see details"+ e);
        }

    }


}
