package part3_4.comdemqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioButton(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female Radio Button Is Not Selected \n");
    }
}
