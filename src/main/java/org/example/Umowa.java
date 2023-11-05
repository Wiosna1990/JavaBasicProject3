package org.example;

public class Umowa
{
    public void DrukujUmowe(IObiektDoUmowy p)
    {
        System.out.println();
        System.out.println("==Umowa==");
        p.Dane();
        System.out.println("Kwota za realizacje:" + p.Wycena());

    }

}
