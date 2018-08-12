package com.any.android.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Naser on 4/28/2017.
 */
public class AppInitializer {

    PropertyHandler propertyHandler;


    public enum OS {
        ANDROID,
        IOS
    }

    public static OS executionOS = OS.ANDROID;

    public AppInitializer() {

        propertyHandler = new PropertyHandler();
    }

    private DesiredCapabilities getCapability() {

        DesiredCapabilities capabilities = new DesiredCapabilities();


        switch (executionOS) {

            case ANDROID:

                File app = initializeAPKFile();
                capabilities.setCapability("deviceName", propertyHandler.getPropertyValue("deviceNameAndroid"));
                capabilities.setCapability("platformName", propertyHandler.getPropertyValue("platformNameAndroid"));
                capabilities.setCapability("platformVersion", propertyHandler.getPropertyValue("platformVersionAndroid"));
                capabilities.setCapability("app", app);

                capabilities.setCapability("fullReset","true");
                capabilities.setCapability("clearSystemFiles", true);

                capabilities.setCapability("appPackage",propertyHandler.getPropertyValue("appPackageAndroid"));
                capabilities.setCapability("appActivity",propertyHandler.getPropertyValue("appActivityAndroid"));


                break;

            case IOS:

                File app1 = initializeAPPFile();
                capabilities.setCapability("automationName", propertyHandler.getPropertyValue("automationNameIOS"));
                capabilities.setCapability("deviceName", propertyHandler.getPropertyValue("deviceNameIOS"));
                capabilities.setCapability("platformName", propertyHandler.getPropertyValue("platformNameIOS"));
                capabilities.setCapability("platformVersion", propertyHandler.getPropertyValue("platformVersionIOS"));
                capabilities.setCapability("app", app1);


                break;
        }

        return capabilities;
    }

    public AppiumDriver getAndroidDriver() {
        AppiumDriver driver = null;

        try {
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), this.getCapability());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }

    public AppiumDriver getIOSDriver() {
        AppiumDriver driver = null;

        try {
            driver = new IOSDriver(new URL("http://0.0.0.0:4725/wd/hub"), this.getCapability());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;

    }

    private File initializeAPKFile() {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, new PropertyHandler().getPropertyValue("apkFilePath"));
        File app = new File(appDir, new PropertyHandler().getPropertyValue("apkFileName"));
        return app;
    }

    private File initializeAPPFile() {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, new PropertyHandler().getPropertyValue("appFilePath"));
        File app1 = new File(appDir, new PropertyHandler().getPropertyValue("appFileName"));
        return app1;
    }
}
