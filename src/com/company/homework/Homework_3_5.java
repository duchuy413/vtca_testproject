package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_3_5 {
    public static void main(String[] args) {
        float pathLength = ConsoleUtil.inputFloat("so km");
        float price;
        if (pathLength <= 1){
            price = pathLength * 15000;
        } else if(1<pathLength && pathLength<=5){
            price = (pathLength - 1)*13500 + 15000;
        } else {
            price = (pathLength - 5)*11000 + 4*13500 + 15000;
        }

        if (pathLength > 120){
            price = price*0.9f;
        }

        System.out.println("Gia tien phai tra la: " + (int)price);
    }
}
