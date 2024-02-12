package com.mobframework.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
    // initialize a variable of type properties holding properties from config.properties
    private static Properties props = new Properties();

    //Create a method to fetch the properties from the config.properties file
    public Properties getProperties() throws IOException{
        InputStream inputStream = null;
        String propFileName = "config.properties";

        if(props.isEmpty()){
            try{
                //Fetch properties from config.properties and assign them to inputstream variable
                inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

                // Assign the fetched properties to props variable
                props.load(inputStream);
            }
            // Catch the error if fetching doesn't work
            catch(IOException e){

                //Print the error and its origin
                throw e;
            }

            finally{
                // Close inputStream is it has been successfully retreived
                if(inputStream != null)
                    inputStream.close();
            }

            
        }

        return props;
    }
}
