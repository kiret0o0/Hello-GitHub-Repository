package com.kangelov;

public interface Travels {
    int travel(int priceForKilometer, int kilometers);

    int getDefaultPriceKilometer();

    void setDefaultPriceKilometer(int defaultPriceKilometer);
}
