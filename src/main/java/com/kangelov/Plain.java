package com.kangelov;

public class Plain extends Vehicles {

    public Plain() {
        this.priceKilometer = 15;
    }

    @Override
    public int travel(int kilometer) {
        System.out.print("The price Via Plain is: ");
        return super.travel(kilometer);
    }
}
