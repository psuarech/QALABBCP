package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class YoutubeScreen extends PageObject {

    @AndroidFindBy(id = "com.google.android.youtube:id/search_edit_text")
    private WebElement searchInput;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Search\"]")
    private WebElement btnSearch;
    @AndroidFindBy(id = "2131431007")
    private WebElement resultText;

    private WebDriver driver;

    public void clickSearchInput(String bus){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnSearch. click();
        searchInput.click();
        searchInput.sendKeys(bus);

        String cmd = "adb shell input keyevent 66";
        try {
            Runtime.getRuntime().exec(cmd);
        }catch(Exception e) {

        }
    }

    public String getResutltText(){
        return resultText.getText();
    }
}
