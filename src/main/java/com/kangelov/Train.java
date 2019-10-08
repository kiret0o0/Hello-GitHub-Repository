package com.kangelov;

public class Train extends Vehicles {

    public Train() {
    }


    protected int travel(int kilometers){
        int sum = kilometers * getDefaultPriceKilometer();
        System.out.println("Train is traveling for: " + sum);
        return sum;
    }
}
