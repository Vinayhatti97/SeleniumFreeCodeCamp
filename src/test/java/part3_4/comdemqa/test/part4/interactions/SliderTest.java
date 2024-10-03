package part3_4.comdemqa.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

public class SliderTest extends BaseTest {
    @Test
    public void testSliderResult(){
        int x = 180;
        int y = 0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x, y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "78";
        Assert.assertEquals(actualValue, expectedValue, "\n Actual And Expected Values Do Not Match \n");
    }



}
