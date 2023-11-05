package org.example;

public class ProjektProgramistycznyZHelpdeskiem extends ProjektProgramistyczny
{
    private double liczbaGodzinHelpdesku;

    public ProjektProgramistycznyZHelpdeskiem(String tytul, String opis, double kosztyDodatkowe, double liczbaOsoboMiesiecyMlodszychProgramistow, double liczbaOsoboMiesiecyProgramistow,
                                              double liczbaOsoboMiesiecyStarszychProgramistow,double liczbaOsoboMiesiecyProjektantow,double liczbaOsoboMiesiecyTesterow,double liczbaGodzinHelpdesku)
    {
        super(tytul,opis,kosztyDodatkowe,liczbaOsoboMiesiecyMlodszychProgramistow,liczbaOsoboMiesiecyProgramistow,
        liczbaOsoboMiesiecyStarszychProgramistow, liczbaOsoboMiesiecyProjektantow,liczbaOsoboMiesiecyTesterow);
        this.liczbaGodzinHelpdesku = liczbaGodzinHelpdesku;
    }
    public void Dane()
    {
        super.Dane();
        System.out.println("Liczba godizn helpdesku: " + this.liczbaGodzinHelpdesku);

    }
    public double Wycena()
    {
        return super.Wycena() + this.liczbaGodzinHelpdesku * new WynagrodzeniaB().ObliczSredniaPlaceHelpdesku();
    }
}
