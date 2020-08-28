package SanityTests;

import Extentions.verification;
import Utilities.commonOps;
import WorkFlows.apiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class studentApi extends commonOps
{

    @Test(description = "Test 01 Get Student From List")
    @Description("Get Student")
    public void test01_getStudent()
    {
        verification.text(apiFlows.getProperty("[99].firstName"),"Oscar");
        System.out.println(jp.get("[99].firstName").toString());
    }

    @Test(description = "Test 02 Add Student To List")
    @Description("Add Student")
    public void test02_addStudent()
    {
        apiFlows.postProperty("shneor","albo","shneor@gmail1.com","QA");
        verification.text(apiFlows.getProperty("[100].firstName"),"shneor");
    }

    @Test(description = "Test 03 Update Student in List and Verify it")
    @Description("Update Student in Student List and Verify")
    public void test03_updateStudent()
    {
        apiFlows.updateProperty("zalmy","albos","shneor1@gmail1.com","Programmer","101");
        verification.text(apiFlows.getProperty("[100].firstName"),"zalmy");
    }

    @Test(description = "Test 04 Delete Student From List and Verify it")
    @Description("Delete Student From Student List and Verify")
    public void test04_deleteStudent()
    {
        apiFlows.deleteProperty("101");
        //assertEquals(response.getStatusCode(), 204, " No Content");
    }

}
