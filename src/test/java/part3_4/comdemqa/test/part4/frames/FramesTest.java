package part3_4.comdemqa.test.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

public class FramesTest extends BaseTest {
    @Test
    public void testFramesBigBox(){
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText, "\n  Actual and Expected Text do not match \n");
        String actualHeaderText =  framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";

        Assert.assertEquals(actualBigBoxText, expectedBigBoxText, "\n Actual and Expected header text not match\n");
    }

    @Test
    public void testFramesSmallBox() throws InterruptedException {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        Thread.sleep(2000);
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBocText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBocText, "\n Actual and Expected Text Do Not Match\n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "\n Actual and Expected Header Text Do NOt Match \n");
    }


}
