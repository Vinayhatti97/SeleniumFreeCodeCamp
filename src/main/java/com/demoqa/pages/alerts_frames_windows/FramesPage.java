package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static Utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[.='Frames']");

    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");
    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }
    private void switchToBigBox(){
        //driver.switchTo().frame(iFrameBigBox);
        switchToFrameString(iFrameBigBox);
    }
    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        //driver.switchTo().defaultContent();
        switchToDefaultContent();
        return bigFrameText;
    }

    private void switchToSmallBox(){
        //switchToFrameIndex(3);
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
