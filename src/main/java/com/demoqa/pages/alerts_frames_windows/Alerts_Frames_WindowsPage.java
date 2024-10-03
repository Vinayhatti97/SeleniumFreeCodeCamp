package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static Utilities.JavaScriptUtility.clickJS;
import static Utilities.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[.='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[.='Alerts']");

    private By framesMenuItem = By.xpath("//li[@id='item-2']/span[.='Frames']");

    private By browserWindowsMenuItem = By.xpath("//li[@id='item-0']/span[.='Browser Windows']");

    public BrowserWindowsPage clickBrowserWindows(){
        scrollToElementJS(browserWindowsMenuItem);
        click(browserWindowsMenuItem);
        return  new BrowserWindowsPage();
    }
    public FramesPage clickFrames(){
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }
    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlerts(){
        scrollToElementJS(alertsMenuItem);
        clickJS(alertsMenuItem);
        return new AlertsPage();
    }
}
