package com.company;

import java.util.Scanner;

/**
 * Created by dovis on 2017-05-23.
 */
public class SkaiciausKelimasLaipsniu {
    private int skaicius;
    private int laipsnis;

    public void Paklausimas(){
        System.out.println("Iveskite skaiciu ir laipsni");
    }

    public void Nuskaitymas(){
        Scanner skaneris = new Scanner(System.in);
        skaicius = skaneris.nextInt();
        laipsnis = skaneris.nextInt();
    }

    public void Kelimas(){
        double rezultatas = Math.pow(skaicius, laipsnis);
        System.out.println(rezultatas);
    }
}
