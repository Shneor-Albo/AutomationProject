package WorkFlows;

import Extentions.apiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class apiFlows extends commonOps
{
    @Step("Get Student From Student List")
    public static String getProperty(String jpath)
    {
        // in Get Methods his count from 0
        Response response = apiActions.get("/student/list");
        return apiActions.extractFromJason(response, jpath);
    }

    @Step("Create Student In Student List")
    public static void postProperty(String firstName, String lastName, String email,String programme)
    {
        requestParams.put("firstName", firstName);
        requestParams.put("lastName", lastName);
        requestParams.put("email", email);
        requestParams.put("programme", programme);
        apiActions.post(requestParams,("/student/"));
    }

    @Step("Update Student In Student List")
    public static void updateProperty(String firstName, String lastName, String email,String programme,String id)
    {
        requestParams.put("firstName", firstName);
        requestParams.put("lastName", lastName);
        requestParams.put("email", email);
        requestParams.put("programme", programme);
        apiActions.put(requestParams,("/student/" + id));
    }

    @Step("Delete Student From Student List")
    public static void deleteProperty(String id)
    {
        apiActions.delete(id);
    }

    @Step("Get Status Code From Student List")
    public static void getStatusCooode()
    {

        int response1 = response.getStatusCode();

    }

}
