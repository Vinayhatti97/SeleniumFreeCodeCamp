package part3_4.comdemqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.unClickReadingCheckbox();
        boolean isReadingCheckBoxSelected = formsPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckBoxSelected, "\n Reading CheckBox Is Selected \n");
    }
}
