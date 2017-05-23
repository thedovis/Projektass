package com.company;

import java.util.Scanner;

/**
 * Created by dovis on 2017-05-23.
 */
public class SkirtumasSuma {
    private int sk1;
    private int sk2;

    public void Paklausimas() {
        System.out.println("Iveskite du skaicius");
    }

    public void Nuskaitymas() {
        Scanner skaneris = new Scanner(System.in);
        sk1 = skaneris.nextInt();
        sk2 = skaneris.nextInt();
    }

    public void Suma() {
        int suma = sk1 + sk2;
        System.out.println("Suma(Sveikas skaicius): " + suma);
    }

    public void Skirtumas() {
        int skirtumas = sk1 - sk2;
        System.out.println("Skirtumas(Sveikas skaicius): " + skirtumas);
    }

}
