package com.kangelov;

public class Car extends Vehicles {

    public Car() {
        super.setDefaultPriceKilometer(3);
    }


    @Override
    protected int travel(int kilometers){
        int sum = kilometers * getDefaultPriceKilometer();
        System.out.println("Car is traveling for: " + sum);
        return sum;
    }
}
