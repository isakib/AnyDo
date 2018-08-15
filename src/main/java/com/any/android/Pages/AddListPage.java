package com.any.android.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;
import io.appium.java_client.generic.searchcontext.GenericFindsByXPath;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import io.appium.java_client.AppiumExecutionMethod;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;


public class AddListPage {

    public AddListPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
    public WebElement click_to_cube;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
    public WebElement add_new_list;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='ADD NEW LIST']")
    public WebElement send_list_name;


    public void NavigateToAddListAndInput(AppiumDriver driver) throws MalformedURLException, InterruptedException {

        sleep(2000);
        click_to_cube.click();
        sleep(2000);
        add_new_list.click();
        sleep(2000);
        send_list_name.sendKeys("Try Auto"+"\n");
        sleep(3000);


    }

}