package com.mobframework.utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class ServerManager {
    //create server variable of type threadLocal<AppiumLocalService>

    public static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();

    //Create a getter method for server
    public AppiumDriverLocalService getDriver() {
        return server.get();

    }

    //create a method to start the appium server
    public void startServer(){
        int maxAttempts = 5; // max number of retries to start the server if it is failing
        int attemptNber = 1; //the current attempt

        while (attemptNber <= maxAttempts){//retry starting the server until we reach max retries
            try{
                AppiumDriverLocalService server = getAppiumService();
                server.start();//start the server

                if(server.isRunning()){
                    ServerManager.server.set(server);
                    break; // exit the loop of retrying starting the server
                }
            } catch(Exception e){
                //handle the exception
                System.out.println("[WARNING]FAILED TO START APPIUM SERVER. RETRYING...");

                //Increment the attemtNmber
                attemptNber++;

                try{
                    Thread.sleep(5000);//wait 5 seconds before retrying starting the server
                }catch (InterruptedException ignored){

                    //throw an error if the waititng fails
                    Thread.currentThread().interrupt();
                }
            }

        }
        //throw an error if the appium server fails to start after maximum attempts

        if (attemptNber > maxAttempts) {
            throw new AppiumServerHasNotBeenStartedLocallyException("[ERROR] APPIUM SERVER NOT STARTED. ABORTING...");
        }
    }
 
    // Create a method to build a default appium service
    public AppiumDriverLocalService getAppiumServerDefault() {
        return AppiumDriverLocalService.buildDefaultService();
    }
 
    // Create a method to built appium service at a random port
    public AppiumDriverLocalService getAppiumService() {
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE));
    }
}


