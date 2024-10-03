package part3_4.comdemqa.test.part4.Alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

import java.io.StringReader;

import static Utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText, "\n Actual and Expected Messages Do Not Match \n");
        acceptAlert();
    }

    public void testConfirmationAlert(){
        String expectedConfirmationResult = "You selected Cancel";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        Assert.assertEquals(actualConfirmationResult,expectedConfirmationResult, "\nYou Did not Select Cancel\n");
    }

    public void testPromptAlert(){
        String alertText = "Selenium With Java";
        String expectedResult = "You entered " + alertText;
        var alertPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertPage.getPromptAlertResult();
        Assert.assertEquals(actualResult, expectedResult, "\n Actual and Expected Results Do Not Match \n");
    }

}
