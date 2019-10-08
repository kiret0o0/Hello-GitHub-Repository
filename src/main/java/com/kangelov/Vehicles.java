package com.kangelov;

public abstract class Vehicles {

    protected int priceKilometer = 5;

    public Vehicles() {
    }

    public int travel(int kilometer){
        int sum = kilometer * priceKilometer;
        System.out.println(sum);
        return sum;
    }

    public void getPriceKilometer() {
        System.out.println("The price of the " + this.getClass().getSimpleName() + " is " + priceKilometer + " for kilometer");
    }
}
