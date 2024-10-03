package com.demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.interactions.Actions;

import static Utilities.ActionsUtility.sendKeys;
import static Utilities.GetUtility.getText;
import static Utilities.JavaScriptUtility.clickJS;
import static Utilities.JavaScriptUtility.scrollToElementJS;
import static Utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{
    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public String getCurrentAddress(){
        explicitWaitUntilVisible(5, currentAddressResult);
        return getText(currentAddressResult);
    }
    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }
    public void setCurrentAddress(String address){
        find(currentAddressField).sendKeys(address + Keys.ENTER);
    }
    public void setFullName(String name){
        scrollToElementJS(fullNameField);
        sendKeys(find(fullNameField), Keys.chord(name));
    }
    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB, email));
    }
}
