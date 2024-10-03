package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

import static Utilities.GetUtility.getText;
import static Utilities.WaitUtility.*;

public class DynamicPropertiesPage extends ElementsPage{
    private By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText(){
        explicitWaitUntilVisible(5, visibleAfterButton);
        String visibleText = getText(visibleAfterButton);
        System.out.println("Button Text : " + visibleText);
        return visibleText;
    }
}
