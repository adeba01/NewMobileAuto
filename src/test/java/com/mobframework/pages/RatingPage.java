package com.mobframework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class RatingPage extends BasePage {

    By rtngsBy = AppiumBy.id("io.appium.android.apis:id/ratingbar1");
    
    public void rtstr(Double rating){
       int  cordinateX = 0;
       int  cordinateY = 0;

         if(rating == 0.5 ){
            cordinateX = 86;
            cordinateY = 307;
         }
         else if(rating == 1){
            cordinateX = 120;
            cordinateY = 307;
         }
         else if(rating == 1.5){
            cordinateX = 216;
            cordinateY = 307;
         }
         else if(rating == 2){
            cordinateX = 254;
            cordinateY = 307;
         }
         else if(rating == 2.5){
            cordinateX = 350;
            cordinateY = 307;
         }
         else if(rating == 3){
            cordinateX= 389;
            cordinateY = 307;
         }
         ratingStar(cordinateX, cordinateY);

    }
    
}
