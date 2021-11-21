package utils;

import org.openqa.selenium.By;

public class Helper {
    public static void clickWithLinkText(String text){
        Driver.get().findElement(By.linkText(text)).click();
    }
}
