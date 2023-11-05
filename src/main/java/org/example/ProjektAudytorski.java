package org.example;

public class ProjektAudytorski extends Projekt
{
    private double liczbaOsoboMiesiecySpecjalisty;
    private double liczbaOsoboMiesiecyStarszegoSpecjalisty;
    public ProjektAudytorski(String tytul, String opis, double kosztyDodatkowe, double liczbaOsoboMiesiecySpecjalisty, double liczbaOsoboMiesiecyStarszegoSpecjalisty )
    {
        super(tytul, opis,kosztyDodatkowe);
        this.liczbaOsoboMiesiecySpecjalisty = liczbaOsoboMiesiecySpecjalisty;
        this.liczbaOsoboMiesiecyStarszegoSpecjalisty = liczbaOsoboMiesiecyStarszegoSpecjalisty;
    }

    public void Dane()
    {
        super.Dane();
        System.out.println("Liczba Osobo Miesiecy Specjalisty: " + liczbaOsoboMiesiecySpecjalisty);
        System.out.println("Liczba Osobo Miesiecy Starszego Specjalisty:" + liczbaOsoboMiesiecyStarszegoSpecjalisty);
    }
    public double Wycena()
    {
        return this.liczbaOsoboMiesiecySpecjalisty * new WynagrodzeniaB().ObliczSredniaPlaceSpecjalistow() +
                this.liczbaOsoboMiesiecyStarszegoSpecjalisty * new WynagrodzeniaB().ObliczSredniaPlaceStarszychSpecjalistow()
                + this.kosztyDodatkowe;
    }
}
