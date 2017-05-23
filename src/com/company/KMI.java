package com.company;

import java.util.Scanner;

/**
 * Created by dovis on 2017-05-23.
 */
public class KMI {
    public float mase;
    public float ugis;

    public void Pauklausimas(){
        System.out.println("Iveskite savo mase ir ugi");
    }

    public void Nuskaitymas(){
        Scanner skaneris = new Scanner(System.in);
        mase = skaneris.nextFloat();
        ugis = skaneris.nextFloat();
    }

    public void Skaiciavimas(){
        double kmi = mase / (Math.pow(ugis, 2));
        System.out.println("Jusu KMI: " + kmi);
    }
}
