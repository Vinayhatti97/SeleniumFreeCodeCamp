package part3_4.comdemqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.comdemqa.base.BaseTest;

public class DateTest extends BaseTest{

    @Test
    public void testSelectingDate(){
        String month = "December";
        String monthNumber = "12";
        String day = "31";
        String year = "2034";
        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate, "\nActual and Expected Dates Do Not Match \n" + actualDate + "\n Expected Date: " + expectedDate);
    }
}
