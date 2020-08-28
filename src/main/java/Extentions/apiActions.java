package Extentions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class apiActions extends commonOps
{
    @Step("Get Data From Server")
    public static Response get(String paramValues)
    {
        response = httpRequest.get(paramValues);
        jp = response.jsonPath();
        return response;

    }

    @Step("Extract Value From Json Format")
    public static String extractFromJason(Response response,String path)
    {
        jp = response.jsonPath();
        return jp.get(path).toString();
    }
    @Step("Post Data To Server")
    public static void post(JSONObject params,String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(resource);
        System.out.println(response.body().prettyPrint());
    }

    @Step("Update Data In Server")
    public static void put(JSONObject params,String resource)
    {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(resource);
        System.out.println(response.body().prettyPrint());
    }
    @Step("Delete Data From Server")
    public static void delete(String id)
    {
        response = httpRequest.delete("/student/"+ id);
        System.out.println(response.body().prettyPrint());
    }



}
