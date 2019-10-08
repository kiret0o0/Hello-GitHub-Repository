package com.kangelov;

public class Car extends Vehicles {

    public Car() {
        this.priceKilometer = 3;
    }

    @Override
    public int travel(int kilometer) {

        System.out.print("The price Via Car is: ");
        return super.travel(kilometer);
    }
}
