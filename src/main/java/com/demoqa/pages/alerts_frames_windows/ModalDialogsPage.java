package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class ModalDialogsPage extends Alerts_Frames_WindowsPage{
    private By smallModalButton = By.id("showSmallModal");
    private By getSmallModalText = By.xpath("//div[contains(.,'small modal')]/div/div/div/following-sibling::div[@class='modal-body']");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModalButton(){
        click(smallModalButton);
    }

    public String getSmallModalText(){
        return find(getSmallModalText).getText();
    }

    public void clickCloseButton(){
        click(closeButton);
    }
}
