package com.kangelov;

public class Train extends Vehicles {

    public Train() {
    }

    @Override
    protected int travel(int kilometers){
        int sum = kilometers * getDefaultPriceKilometer();
        System.out.println("Train is traveling for: " + sum);
        return sum;
    }
}
