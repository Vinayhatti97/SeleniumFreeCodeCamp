package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static Utilities.GetUtility.getText;
import static Utilities.WaitUtility.fluentWaitUntilVisible;

public class ProgressBarPage extends WidgetsPage{
    private By startButton = By.id("startStopButton");

    private By progressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

    public String getProgressValue(){
        fluentWaitUntilVisible(30, progressValue);
        return getText(progressValue);
    }
    public void clickStartButton(){
        click(startButton);
    }
}
