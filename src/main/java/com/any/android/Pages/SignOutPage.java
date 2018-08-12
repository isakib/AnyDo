package com.any.android.Pages;

import com.any.android.Utilities.AppInitializer;
import cucumber.annotation.After;
import cucumber.annotation.Before;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class SignOutPage {

    public SignOutPage(AppiumDriver driver) {
    }

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app =new AppInitializer();
        driver = app.getAndroidDriver();

    }

    AppiumDriver driver;

    public void Ignore_Not_Now_call() throws Throwable {
        Thread.sleep(3000);

        WebElement not_now_click_ignore = driver.findElementByXPath("//android.widget.TextView[@text='Not now']");
        not_now_click_ignore.click();

        Thread.sleep(3000);

        WebElement skip_now_click = driver.findElementByXPath("//android.widget.TextView[@text='SKIP']");
        skip_now_click.click();

        Thread.sleep(3000);
    }

    public void Select_settings_nav() throws Throwable {
        Thread.sleep(3000);

        WebElement click_to_settings_nav = driver.findElementByXPath("//android.widget.TextView[@text='Settings']");
        click_to_settings_nav.click();

        WebElement click_to_profile = driver.findElementByXPath("//android.widget.TextView[@text='Profile']");
        click_to_profile.click();

        Thread.sleep(3000);

    }

    public void Click_To_Singout() throws Throwable {
        Thread.sleep(3000);

        WebElement click_to_signout_text = driver.findElementByXPath("//android.widget.TextView[@text='Sign Out']");
        click_to_signout_text.click();

        Thread.sleep(3000);

        WebElement confirm_popup_signout = driver.findElementByXPath("//android.widget.Button[@text='YES']");
        confirm_popup_signout.click();

        Thread.sleep(3000);

    }

    public void SignOutCheck(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(10000);

    }

    @After
    public void tearDown(){driver.quit();}
}
