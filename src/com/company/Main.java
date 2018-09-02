package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Lijn> lijnen = new ArrayList<>();

        lijnen.add(new VerticaleLijn(2));
        lijnen.add(new HorizontaleLijn(5));
        lijnen.add(new HorizontaleLijn(3));


        for (Lijn lijn : lijnen){
            System.out.println("De lijn: ");
            lijn.teken();
        }
    }
}
