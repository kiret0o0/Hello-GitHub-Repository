package com.kangelov;

public class Plain extends Vehicles {


    public Plain() {
        super.setDefaultPriceKilometer(15);
    }

    protected int travel(int kilometers){
        int sum = kilometers * getDefaultPriceKilometer();
        System.out.println("Train is traveling for: " + sum);
        return sum;
    }
}
