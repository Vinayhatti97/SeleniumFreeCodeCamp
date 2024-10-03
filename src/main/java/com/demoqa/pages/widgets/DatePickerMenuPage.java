package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import java.util.SplittableRandom;

import static Utilities.DropDownUtility.selectByVisibleText;

public class DatePickerMenuPage extends WidgetsPage{

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.className("react-datepicker__year-select");

    private By dayValue(String day) {
        return By.xpath("//div[contains(@class, 'react-datepicker__day--')][.='"+day+"']");
    }

    public void clickDay(String day){
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day){
        return find(dayValue(day)).isDisplayed();
    }
    public void clickSelectDate(){
        click(selectDateField);
    }

    public String getDate(){
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month){
        selectByVisibleText(monthDropDown, month);
    }
    public void selectYear(String year){
        selectByVisibleText(yearDropDown, year);
    }


}
