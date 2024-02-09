package com.mobframework.utils;

import java.io.IOException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
    
    //Create a driver variable of type ThreadLocal<AppiumDriver>
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    //Create a getter method for  the driver
    public AppiumDriver getDriver(){
        return driver.get();
    }

    //Create a setter method for the driver

    public void setDriver(AppiumDriver driverValue){
        driver.set(driverValue);
    }

    //create a method to initialize the driver
    public void initializeDriver(){
        AppiumDriver driver = null;

        if(driver == null){

            try{
            //Create a driver instance using appium server url and the desired capabilities
            driver = new AndroidDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCapabilities());

            //set the ThreadLocal drver variable to equal to the newly created driver
            DriverManager.driver.set(driver);
        }
        catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
}
