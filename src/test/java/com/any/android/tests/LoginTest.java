package com.any.android.tests;

import com.any.android.Pages.LoginPage;
import com.any.android.Utilities.AppInitializer;

import io.appium.java_client.AppiumDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Naser on 4/28/2017.
 */

public class LoginTest {

    AppiumDriver   driver;

    LoginPage loginPage;


    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app = new AppInitializer();
        driver = app.getAndroidDriver();

        loginPage = new LoginPage(driver);
    }

    @Test
    public void LoginTest() throws MalformedURLException, InterruptedException{

        loginPage.LoginCheck(driver);

    }

    @After
     public void tearDown(){

        driver.quit();

     }
}
