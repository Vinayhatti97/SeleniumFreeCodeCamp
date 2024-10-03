package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.clickJS;
import static Utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage{

    private By selectMenuItem = By.xpath("//li[@id='item-8']/span[.='Select Menu']");

    private By datePickerMenuItem = By.xpath("//li[@id='item-2']/span[.='Date Picker']");
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']/span[.='Progress Bar']");
    private By sliderMenuItem = By.xpath("//li[@id='item-3']/span[.='Slider']");

    public SliderPage clickSlider(){
        scrollToElementJS(sliderMenuItem);
        click(sliderMenuItem);
        return new SliderPage();
    }
    public ProgressBarPage clickProgressBar(){
        scrollToElementJS(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarPage();
    }
    public SelectMenuPage clickSelectMenu(){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerMenuPage clickDatePicker(){
        scrollToElementJS(datePickerMenuItem);
        clickJS(datePickerMenuItem);
        return new DatePickerMenuPage();
    }
}
