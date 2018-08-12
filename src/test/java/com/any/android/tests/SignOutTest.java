package com.any.android.tests;

import com.any.android.Pages.LoginPage;
import com.any.android.Pages.SignOutPage;
import com.any.android.Utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class SignOutTest {

    AppiumDriver driver;

    SignOutPage SignOutPage;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app = new AppInitializer();
        driver = app.getAndroidDriver();

        SignOutPage = new SignOutPage(driver);

    }

    @Test
    public void SignOutTest() throws MalformedURLException, InterruptedException{

        SignOutPage.SignOutCheck(driver);

    }

    @After
    public void tearDown(){

        driver.quit();

    }
}
