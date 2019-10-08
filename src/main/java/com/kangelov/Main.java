package com.kangelov;

public class Main {

    public static void main(String[] args) {


/*        Vehicles audi = new Car();
        audi.travel(10);

        Vehicles wizz = new Plain();
        wizz.travel(9);

        Vehicles sofiaVarna = new Train();
        sofiaVarna.travel(9);*/


        Vehicles audi = new Car();
        Vehicles wizz = new Plain();
        Vehicles sofiaVarna = new Train();


        audi.getPriceKilometer();
        wizz.getPriceKilometer();
        sofiaVarna.getPriceKilometer();

        audi.travel(5);
        wizz.travel(10);
        sofiaVarna.travel(5);

    }
}
