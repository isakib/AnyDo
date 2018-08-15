package com.any.android.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;


public class LoginPage {

    public LoginPage(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue with Email']")
    public WebElement  click_to_continue;

    @AndroidFindBy(id = "com.anydo:id/verify_email_btn")
    public WebElement move_next_click;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='E-mail address']")
    public WebElement  user_name;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    public WebElement  user_password;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
    public WebElement  signInn;


    public void LoginToSystem(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(2000);
        click_to_continue.click();
        sleep(2000);
        user_name.sendKeys("isakib+anydo@gmail.com");
        driver.hideKeyboard();
        sleep(2000);
        move_next_click.click();
        sleep(2000);
        user_password.sendKeys("759759@#");
        driver.hideKeyboard();
        sleep(2000);
        signInn.click();
        sleep(10000);

    }


}
