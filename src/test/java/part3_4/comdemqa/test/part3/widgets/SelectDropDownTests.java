package part3_4.comdemqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

import java.util.List;

public class SelectDropDownTests extends BaseTest {
    @Test
    public void testMultiSelectDropDown(){
        var selectMenuPage =  homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);
        selectMenuPage.deselectStandardMulti("saab");
        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOprions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"), "\n Saab Is Selected As An Option \n");
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }
}
