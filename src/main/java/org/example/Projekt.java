package org.example;
// jezeli klasa zawiera conajmniej 1 metode abstrakcyjna, to musi byc abstrakcyjna
public abstract  class Projekt implements IObiektDoUmowy
{
    private String tytul;
    private String opis;
    protected double kosztyDodatkowe;
    public Projekt(String tytul,String opis, double kosztyDodatkowe)
    {
        this.tytul = tytul;
        this.opis = opis;
        this.kosztyDodatkowe = kosztyDodatkowe;
    }
    public void Dane()
    {
        System.out.println("Dane projektu");
        System.out.println("Tytul: " + this.tytul);
        System.out.println("Opis: " + this.opis);
        System.out.println("Koszty dodatkowe: " + this.kosztyDodatkowe);
    }
    //funkcja abstrakcyjna to taka, ze ma abstract z przodu i nie ma bloku
    // jak nie wiemy jak napisać dana funkcje w klasie w ktorej jestesmy, a wiemy jak w klasie dziedziczacej
    // to, warto w tej pierwszej klasie zrobic ja abstrakcyjna
    public abstract double Wycena();

}
