package com.demoqa.pages.widgets;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static Utilities.ActionsUtility.dragAndDropBy;
import static Utilities.GetUtility.*;


public class SliderPage extends WidgetsPage{
    private By slider  = By.xpath("//div[@id='sliderContainer']//input[@type='range']");

    private By sliderValue = By.id("sliderValue");

    public String getSliderValue(){
        return getAttribute(sliderValue, "value");
    }
    public void moveSlider(int x, int y){
        dragAndDropBy(find(slider), x, y);
    }
}
