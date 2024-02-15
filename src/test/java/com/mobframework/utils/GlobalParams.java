package com.mobframework.utils;

public class GlobalParams {
    // Create threadlocal variable of capabilities which won't change throughout the
    // execution
    private static ThreadLocal<String> platformName = new ThreadLocal<>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<>();
    private static ThreadLocal<String> systemport = new ThreadLocal<>();

    // create setter and getter methods for the created variables

    public void setPlatformName(String platform) {
        platformName.set(platform);
    }

    public String getPlatformName() {
        return platformName.get();
    }

    public void setDeviceName(String device) {
        deviceName.set(device);
    }

    public String getDeviceName() {
        return deviceName.get();
    }

    public void setSystemPort(String systemPortValue) {
        systemport.set(systemPortValue);

    }

    public String getSystemPort() {
        return systemport.get();
    }

    // Initialize the parameters

    public void initializeGlobalParams() {
        GlobalParams parameters = new GlobalParams();
        parameters.setPlatformName(System.getProperty("platform", "Android"));
        parameters.setDeviceName(System.getProperty("deviceName", "Pixel7"));
        parameters.setSystemPort("0");

    }

}
