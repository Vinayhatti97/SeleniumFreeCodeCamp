package part3_4.comdemqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

public class WebTableTest extends BaseTest {
    @Test
    public void testWebTable(){
        String email = "kierra@example.com";
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("34");
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);
        String expectedAge = "34";
        Assert.assertEquals(actualAge, expectedAge, "\n Actual and Expected Ages do not Match \n");
    }
}
