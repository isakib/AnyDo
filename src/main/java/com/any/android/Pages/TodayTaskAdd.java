package com.any.android.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class TodayTaskAdd {


    public TodayTaskAdd(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='com.anydo:id/add_task']")
    public WebElement today_beside_plus_icon;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.anydo:id/taskTitle']")
    public WebElement add_text_in_details;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.anydo:id/reminderButton']")
    public WebElement set_date_time;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Repeat']")
    public WebElement repeat_call_reminder;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Set']")
    public WebElement set_the_call_reminder;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Save']")
    public WebElement save_the_call_reminder;

    // Add subtask



    public void TodayTaskAddAction(AppiumDriver driver)throws MalformedURLException, InterruptedException {

        sleep(2000);
        today_beside_plus_icon.click();
        sleep(5000);
        add_text_in_details.sendKeys("Demo Automattic Inc");
        sleep(5000);
        set_date_time.click();
        sleep(5000);
        repeat_call_reminder.click();
        sleep(5000);
        set_the_call_reminder.click();
        sleep(5000);
        save_the_call_reminder.click();
        sleep(5000);
        driver.swipe(63,336,63, 1226, 3000);
        sleep(2000);
    }

}
