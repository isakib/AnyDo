package com.any.android.tests;

import com.any.android.Pages.LoginPage;
import com.any.android.Pages.SignOutPage;
import com.any.android.Pages.TodayTaskAdd;
import com.any.android.Utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class TodayTaskAddTest {

    AppiumDriver driver;

    LoginPage loginPage;
    TodayTaskAdd todayTaskAdd;
    SignOutPage signOutPage;


    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app = new AppInitializer();
        driver = app.getAndroidDriver();

        loginPage = new LoginPage(driver);
        todayTaskAdd = new TodayTaskAdd(driver);
        signOutPage = new SignOutPage(driver);
    }

    @Test
    public void TodayTaskAddAction() throws MalformedURLException, InterruptedException{

        loginPage.LoginToSystem(driver);
        signOutPage.SkipDefaultNow(driver);
        todayTaskAdd.TodayTaskAddAction(driver);
    }

    @After
    public void tearDown(){

        driver.quit();

    }
}
