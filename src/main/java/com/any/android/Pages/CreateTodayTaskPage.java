package com.any.android.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class CreateTodayTaskPage {

    public CreateTodayTaskPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='I want to…']")
    public WebElement click_to_i_want_to;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.anydo:id/quick_add_button']")
    public WebElement click_to_add_the_task;


    public void CreateTodayTaskAction(AppiumDriver driver)throws MalformedURLException, InterruptedException {

        sleep(2000);
        click_to_i_want_to.sendKeys("Demo Automation");
        sleep(3000);
        click_to_add_the_task.click();
        sleep(2000);
    }
}
