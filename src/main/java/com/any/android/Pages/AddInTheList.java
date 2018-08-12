package com.any.android.Pages;

import com.thoughtworks.selenium.DefaultSelenium;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;


public class AddInTheList {

    public AddInTheList(AppiumDriver<WebElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.anydo:id/backButton")
    public WebElement  click_to_cube;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@class='android.widget.ImageView']")
    public WebElement  add_new_list;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='ADD NEW LIST']")
    public WebElement send_list_name;


    public void Click_Control(AppiumDriver driver)throws MalformedURLException, InterruptedException{

        sleep(2000);
        click_to_cube.click();
        sleep(2000);
        add_new_list.click();
        sleep(2000);
        send_list_name.sendKeys("Try Auto");

    }

}
