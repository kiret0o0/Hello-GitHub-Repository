package com.kangelov;

public class Train extends Vehicles {
    @Override
    public int travel(int kilometer) {
        System.out.print("The price Via Train is: ");
        return super.travel(kilometer);
    }
}
