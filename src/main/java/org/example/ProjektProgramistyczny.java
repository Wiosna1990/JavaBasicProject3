package org.example;

public class ProjektProgramistyczny extends Projekt
{
    private double liczbaOsoboMiesiecyMlodszychProgramistow;
    private double liczbaOsoboMiesiecyProgramistow;
    private double liczbaOsoboMiesiecyStarszychProgramistow;
    private double liczbaOsoboMiesiecyProjektantow;
    private double liczbaOsoboMiesiecyTesterow;
    public ProjektProgramistyczny(String tytul, String opis, double kosztyDodatkowe, double liczbaOsoboMiesiecyMlodszychProgramistow, double liczbaOsoboMiesiecyProgramistow,
                                  double liczbaOsoboMiesiecyStarszychProgramistow,double liczbaOsoboMiesiecyProjektantow,double liczbaOsoboMiesiecyTesterow)
    {
        super(tytul, opis,kosztyDodatkowe);
        this.liczbaOsoboMiesiecyMlodszychProgramistow = liczbaOsoboMiesiecyMlodszychProgramistow;
        this.liczbaOsoboMiesiecyProgramistow = liczbaOsoboMiesiecyProgramistow;
        this.liczbaOsoboMiesiecyStarszychProgramistow = liczbaOsoboMiesiecyStarszychProgramistow;
        this.liczbaOsoboMiesiecyProjektantow = liczbaOsoboMiesiecyProjektantow;
        this.liczbaOsoboMiesiecyTesterow = liczbaOsoboMiesiecyTesterow;
    }

    public void Dane()
    {
        super.Dane();
        System.out.println("Liczba Osobo Miesiecy Mlodego programisty: " + this.liczbaOsoboMiesiecyMlodszychProgramistow);
        System.out.println("Liczba Osobo Miesiecy Programistow:" + this.liczbaOsoboMiesiecyProgramistow);
        System.out.println("Liczba Osobo Miesiecy Starszych Programistow:" + this.liczbaOsoboMiesiecyStarszychProgramistow);
        System.out.println("Liczba Osobo Miesiecy  Projektantow:" + this.liczbaOsoboMiesiecyProjektantow);
        System.out.println("Liczba Osobo Miesiecy Testerow:" + this.liczbaOsoboMiesiecyTesterow);
    }
    public double Wycena()
    {
        WynagrodzeniaB wynagrodzeniaB = new WynagrodzeniaB();
        return this.liczbaOsoboMiesiecyMlodszychProgramistow * wynagrodzeniaB.ObliczSredniaPlaceMlodszychProgramistow()+
                this.liczbaOsoboMiesiecyProgramistow * wynagrodzeniaB.ObliczSredniaPlaceProgramistow() +
                this.liczbaOsoboMiesiecyStarszychProgramistow * wynagrodzeniaB.ObliczSredniaPlaceStarszychProgramistow()
                + this.liczbaOsoboMiesiecyProjektantow * wynagrodzeniaB.ObliczSredniaProjektantow()
                + this.liczbaOsoboMiesiecyTesterow * wynagrodzeniaB.ObliczSredniaPlaceTesterow()
                + this.kosztyDodatkowe;
    }
}
