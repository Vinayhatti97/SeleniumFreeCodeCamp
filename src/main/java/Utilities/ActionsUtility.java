package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.net.http.WebSocket;

public class ActionsUtility extends Utility{
    private static Actions act(){
        return new Actions(driver);
    }

    public static void dragAndDropBy(WebElement source, int x, int y){
        act().dragAndDropBy(source, x, y).perform();
    }

    public static void sendKeys(WebElement element, CharSequence keys){
        act().sendKeys(element, keys).perform();
    }

}
