package com.any.android.tests;

import com.any.android.Pages.AddListPage;
import com.any.android.Pages.LoginPage;
import com.any.android.Pages.SignOutPage;
import com.any.android.Utilities.AppInitializer;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class AddListPageTest {

    AppiumDriver driver;

    LoginPage loginPage;
    AddListPage addListPage;
    SignOutPage signOutPage;


    @Before
    public void setup ()throws MalformedURLException, InterruptedException{
        AppInitializer app = new AppInitializer();
        driver = app.getAndroidDriver();

        loginPage = new LoginPage(driver);
        signOutPage = new SignOutPage(driver);
        addListPage = new AddListPage(driver);
    }

    @Test
    public void AddListPageTest() throws MalformedURLException, InterruptedException{

        loginPage.LoginToSystem(driver);
        signOutPage.SkipDefaultNow(driver);
        addListPage.NavigateToAddListAndInput(driver);
        signOutPage.SelectToNavigateAndSignout(driver);
    }

    @After
    public void tearDown(){

        driver.quit();

    }
}
