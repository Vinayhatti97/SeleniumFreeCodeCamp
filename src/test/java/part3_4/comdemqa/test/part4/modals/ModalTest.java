package part3_4.comdemqa.test.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

public class ModalTest extends BaseTest {
    @Test
    public void testModalDialog(){
        var afwpage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogsPage = afwpage.clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.contains("small modal"), "\nThe Message does not contain small modal\n");
        modalDialogsPage.clickCloseButton();
    }
}
