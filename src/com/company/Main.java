package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kuria uzduoti noretumete atlikti?");
        Controller kontroleris = new Controller();
        Scanner skaneris = new Scanner(System.in);
        int uzduotis = skaneris.nextInt();
        switch (uzduotis) {
            case 1:
                kontroleris.VartotojoVardas();
                break;

            case 2:
                kontroleris.Simboliai();
                break;
            case 3:
                kontroleris.SkirtumasSuma();
                break;
            case 4:
                kontroleris.KMI();
        }
    }
}
