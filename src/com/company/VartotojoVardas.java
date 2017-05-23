package com.company;

import java.util.Scanner;

/**
 * Created by dovis on 2017-05-23.
 */
public class VartotojoVardas {

    private String vardas;

    public void Paklausimas(){
        System.out.println("Iveskite savo varda");
    }

    public void Nuskaitymas(){
        Scanner skaneris = new Scanner(System.in);
        vardas = skaneris.nextLine();
    }

    public void Spausdinimas(){
        for(int i = 0; i < 5; i++){
            System.out.println(vardas);
        }
    }
}
