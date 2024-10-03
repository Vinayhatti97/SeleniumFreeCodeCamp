package part3_4.comdemqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

public class LinksTest extends BaseTest {
    @Test
    public void testLinks(){
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"), "\n Actual Response("+ actualResponse +") \n  Doest not Contain '400' and 'Bad Request' \n");
    }
}
