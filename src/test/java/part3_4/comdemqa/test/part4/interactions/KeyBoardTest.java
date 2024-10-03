package part3_4.comdemqa.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

public class KeyBoardTest extends BaseTest {
    @Test
    public void testApplicationUsingKeyBoard(){
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Vinay Hatti");
        textBoxPage.setEmail("vinayhatti5@gmail.com");
        textBoxPage.setCurrentAddress("1234 Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 3400");
        textBoxPage.setCurrentAddress("Dallas, Texas");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 3400"), "\n Actual Address Does Not Contain Suite 3400 \n");
    }
}
