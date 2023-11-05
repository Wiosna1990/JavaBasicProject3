package org.example;
// 1.Ten interface jest po to,zeby mogl drukwoac umowy nie tylko na projekty, ale rowniez na sprzedaz
// lub na wykonanie uslugi
//2. Ten interface jest po to, zeby w klasie Umowa dzialala dunkcja DrukujUmowe nie tylko na Projekcie
//3.Poniewaz funkcja DrukujUmowe w klasie Umowa, uzywa funkcji Dane() i Wycena(), to interface musi miec te funkcje
//4.Wszystkie obiekty klas, ktore beda dziedziczyły, po IObiektDoUmowy (implementowaly IObiektDoUmowy)
// i beda mialy funkcje Dane() i Wycena() beda mogly miec wydrukowana Umowe
interface IObiektDoUmowy
{
    void Dane();
    double Wycena();
}
