package com.company;

/**
 * Created by dovis on 2017-05-23.
 */
public class Controller {
    public void VartotojoVardas(){
        VartotojoVardas programa = new VartotojoVardas();
        programa.Paklausimas();
        programa.Nuskaitymas();
        programa.Spausdinimas();
    }

    public void Simboliai(){
        Simboliai simboliai = new Simboliai();
        simboliai.Paklausimas();
        simboliai.Nuskaitymas();
        simboliai.Spausdinimas();
    }

    public void SkirtumasSuma(){
        SkirtumasSuma programa = new SkirtumasSuma();
        programa.Paklausimas();
        programa.Nuskaitymas();
        programa.Suma();
        programa.Skirtumas();
    }

    public void KMI(){
        KMI programa = new KMI();
        programa.Pauklausimas();
        programa.Nuskaitymas();
        programa.Skaiciavimas();
    }
}
