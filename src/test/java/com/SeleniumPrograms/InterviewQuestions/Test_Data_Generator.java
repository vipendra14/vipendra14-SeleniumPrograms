package com.SeleniumPrograms.InterviewQuestions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Test_Data_Generator {

    public static String generateUniqueEmail(){
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        int random = new Random().nextInt(1000);

        return "testuser_" + timeStamp + "_" + random + "@gmail.com";
    }

    public static String generateUniqueusername(){
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        int random = new Random().nextInt(1000);
        return  "user_" + timeStamp + "_" + random ;
    }
    public static void main(String []args){
        System.out.println("Email is : " + generateUniqueEmail());
        System.out.println("User name is : " +  generateUniqueusername());
    }

}
