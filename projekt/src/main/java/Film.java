/*
 *  Klasa Film
 *
 *  Klasa, ktorej obiektami sa filmy wypozyczalni.
 *  Maja one rozne atrybuty: nazwa, cena, ilosc, nazwaKlienta.
 *  Klasa pozwala na dostep do nich i zmiane czesci z nich.
 *
 *  Autor: Adam Filipowicz
 *  Data: 28 maja 2017 r.
 */

import java.io.Serializable;

public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Niezmienna nazwa filmu.
     */
    private final String nazwa;

    /**
     * Cena filmu. Jest mozliwa zmiana ceny.
     */
    private double cena;

    /**
     * Ilosc dostepnych filmow. Jest mozliwa zmiana ilosci przez konto sprzedawcy,
     * wypozyczenie podanej ilosci filmow przez konto klienta (odjecie od aktualnej) i
     * zwrot podanej ilosci filmow przez konto sprzedawcy (dodanie do aktualniej).
     */
    private int ilosc;

    /**
     * Opis filmu.
     */
    private String opisFilmu;

    /**
     * Konstruktor parametrowy.
     * @param nazwa - nazwa z jaka chcemy utworzyc nowy film.
     * @param cena - cena nowego filmu.
     * @param ilosc - ilosc filmow.
     */
    Film(String nazwa, double cena, int ilosc){
        this.nazwa=nazwa;
        this.cena=cena;
        this.ilosc=ilosc;
    }

    /**
     * Metoda zwracajaca nazwe filmu.
     * @return nazwa - nazwa filmu.
     */
    String getNazwa(){
        return nazwa;
    }

    /**
     * Metoda zwracajaca cene filmu.
     * @return cena - cena filmu.
     */
    double getCena(){
        return cena;
    }

    /**
     * Metoda ustawiajaca dana cene jako cene filmu.
     * @param nowaCena - cena jaka chcemy przypisac cenie filmu.
     */
    void setCena(double nowaCena){
        this.cena=nowaCena;
    }

    /**
     * Metoda zwracajaca ilosc filmu.
     * @return ilosc - ilosc filmu.
     */
    int getIlosc(){
        return ilosc;
    }

    /**
     * Metoda zmniejszajaca ilosc filmu o podana ilosc. ( wypozyczenie danej ilosci filmu przez klienta )
     * @param iloscWypozyczona - ilosc jaka chcemy odjac od ilosci naszego filmu.
     */
    void minusIlosc(int iloscWypozyczona){
        this.ilosc-=iloscWypozyczona;
    }

    /**
     * Metoda zwiekszajaca ilosc filmu o podana ilosc. ( zwrocenie danej ilosci filmu )
     * @param iloscZwrocona - ilosc jaka chcemy dodac do ilosci naszego filmu.
     */
    void dodajIlosc(int iloscZwrocona){
        this.ilosc+=iloscZwrocona;
    }
    
    /**
     * Metoda zmieniajaca ilosc filmu.
     * @param nowaIlosc - nowa ilosc filmu.
     */
    void zmienIlosc(int nowaIlosc){
        this.ilosc+=nowaIlosc;
    }

    /**
     * Metoda zwracajaca opis filmu.
     * @return opisFilmu - opis filmu.
     */
    String getOpis(){
        return opisFilmu;
    }

    /**
     * Metoda ustawiajaca dana opis jako opis filmu.
     * @param opis - podany opis filmu
     */
    void setOpis(String opis){
        opisFilmu=opis;
    }

    /**
     * Metoda zwraca reprezentacje kilku atrybutow obiektow jako string: nazwa filmu,
     * cena i ilosc.
     * @return Tekstowa postac atrybutow filmu.
     */
    public String toString(){
        return String.format("Nazwa: %s. Cena: %.2f. Ilosc: %d. Opis: %s.", nazwa,cena,ilosc,opisFilmu);
    }


}