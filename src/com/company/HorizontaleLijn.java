package com.company;

public class HorizontaleLijn extends Lijn {

    private int lengte;

    public HorizontaleLijn(int lengte) {

        this.lengte = lengte;
    }

    @Override
    public void teken() {
        for (int i = 0; i < lengte; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
