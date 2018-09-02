package com.company;

public class VerticaleLijn extends Lijn {

    private int lengte;

    public VerticaleLijn(int lengte) {

        this.lengte = lengte;
    }


    @Override
    public void teken() {
        for (int i = 0; i < lengte; i++) {
            System.out.println("*");
        }
    }

}
