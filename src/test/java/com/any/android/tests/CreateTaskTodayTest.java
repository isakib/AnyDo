package com.any.android.tests;

import com.any.android.Pages.CreateTodayTaskPage;
import com.any.android.Pages.LoginPage;
import com.any.android.Pages.SignOutPage;
import com.any.android.Utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class CreateTaskTodayTest {

    AppiumDriver driver;

    LoginPage loginPage;
    CreateTodayTaskPage  createTodayTaskPage;
    SignOutPage signOutPage;

    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app = new AppInitializer();
        driver = app.getAndroidDriver();

        loginPage = new LoginPage(driver);
        signOutPage = new SignOutPage(driver);
        createTodayTaskPage = new CreateTodayTaskPage(driver);

    }

    @Test
    public void CreateTodayTaskTest()throws MalformedURLException, InterruptedException{

        loginPage.LoginToSystem(driver);
        signOutPage.SkipDefaultNow(driver);
        createTodayTaskPage.CreateTodayTaskAction(driver);

    }

    @After
    public void tearDown(){

        driver.quit();

    }
}
