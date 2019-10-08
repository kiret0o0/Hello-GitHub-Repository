package com.kangelov;

public abstract class Vehicles {

    private int defaultPriceKilometer = 5;

    public Vehicles() {
    }

    public int travel(int priceForKilometer, int kilometers){
        int sum = kilometers * priceForKilometer;
        System.out.println("Travel is: " + sum);
        return sum;
    }


    public int getDefaultPriceKilometer() {
        return defaultPriceKilometer;
    }

    public void setDefaultPriceKilometer(int defaultPriceKilometer) {
        this.defaultPriceKilometer = defaultPriceKilometer;
    }

    protected abstract int travel(int kilometers);
}
