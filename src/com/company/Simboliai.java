package com.company;

import java.util.Scanner;

/**
 * Created by dovis on 2017-05-23.
 */
public class Simboliai {
    private int simboliuKiekis;

    public void Paklausimas(){
        System.out.println("Iveskite zodi");
    }

    public void Nuskaitymas(){
        Scanner skaneris = new Scanner(System.in);
        String zodis = skaneris.nextLine();
        simboliuKiekis = zodis.length();
    }

    public void Spausdinimas(){
        System.out.println(simboliuKiekis);
    }
}
