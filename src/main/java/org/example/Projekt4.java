package org.example;

public class Projekt4
{
    public static void main(String[] args) {
        Umowa umowa = new Umowa();

        ProjektAudytorski pa = new ProjektAudytorski("Projekt 1", "Opis 1" , 100 , 1,1);
        umowa.DrukujUmowe(pa);

        ProjektProgramistyczny pp = new ProjektProgramistyczny("Projekt 2", " Opis 2", 200,2,2,2,2,2);
        umowa.DrukujUmowe(pp);

        ProjektProgramistycznyZHelpdeskiem ppzh = new ProjektProgramistycznyZHelpdeskiem("Projekt 3", " Opis 3", 300,3,3,3,3,3,3);
        umowa.DrukujUmowe(ppzh);
    }
}