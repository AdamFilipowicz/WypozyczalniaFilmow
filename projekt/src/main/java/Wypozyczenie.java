/*
 *  Klasa Wypozyczenie
 *
 *  Klasa, ktorej obiektami jest wypozyczenie danego filmu przez klienta.
 *  Maja one rozne atrybuty: nazwa, cena, ilosc, nazwaKlienta, data wypozyczenia, 
 *  data zwrotu oraz czy film zostal juz zwrocony.
 *  Klasa pozwala na dostep do nich i zmiane czy film zostal zwrocony.
 *
 *  Autor: Adam Filipowicz
 *  Data: 28 maja 2017 r.
 */

import java.io.Serializable;

public class Wypozyczenie implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Niezmienna nazwa filmu.
     */
    private String nazwa;

    /**
     * Cena wypozyczonego filmu. Nie jest mozliwa zmiana.
     */
    private double cena;

    /**
     * Ilosc wypozyczonych filmow. Nie jest mozliwa zmiana.
     */
    private int ilosc;

    /**
     * Nazwa klienta ktory wypozyczyl dany film.
     */
    private String nazwaKlienta;

    /**
     * Opis filmu.
     */
    private String opisFilmu;

    /**
     * Data wypozyczenia filmu. Nie jest mozliwa zmiana.
     */
    private String dataWypozyczenia;

    /**
     * Data zwrotu filmu. Nie jest mozliwa zmiana.
     */
    private String dataZwrotu;

    /**
     * Oznacza czy film zostal zwrocony. Domyslnie jest false. Moze byc zmieniony na true przez sprzedawce.
     */
    private boolean czyZwrocony;

    /**
     * Konstruktor parametrowy.
     * @param nazwa - nazwa wypozyczonego filmu.
     * @param cena - cena wypozyczonego filmu.
     * @param ilosc - ilosc wypozyczonych filmow.
     * @param nazwaKlienta - nazwa klienta ktory wypozyczyl.
     * @param opisFilmu - opis wypozyczonego filmu.
     * @param dataWypozyczenia - data wypozyczenia.
     * @param dataZwrotu - data oddania.
     */
    Wypozyczenie(String nazwa, double cena, int ilosc, String nazwaKlienta, String opisFilmu, String dataWypozyczenia, String dataZwrotu){
        this.nazwa=nazwa;
        this.cena=cena;
        this.ilosc=ilosc;
        this.nazwaKlienta=nazwaKlienta;
        this.opisFilmu=opisFilmu;
        this.dataWypozyczenia=dataWypozyczenia;
        this.dataZwrotu=dataZwrotu;
        czyZwrocony=false;
    }

    /**
     * Metoda zwracajaca nazwe filmu.
     * @return nazwa - nazwa filmu.
     */
    String getNazwa(){
        return nazwa;
    }

    /**
     * Metoda zwracajaca nazwe klienta.
     * @return nazwaKlienta - nazwa klienta.
     */
    String getKlient(){
        return nazwaKlienta;
    }

    /**
     * Metoda zwracajaca cene filmu.
     * @return cena - cena filmu.
     */
    double getCena(){
        return cena;
    }

    /**
     * Metoda zwracajaca ilosc filmu.
     * @return ilosc - ilosc filmu.
     */
    int getIlosc(){
        return ilosc;
    }

    /**
     * Metoda zwracajaca date wypozyczenia filmu.
     * @return dataWypozyczenia - data wypozyczenia filmu.
     */
    String getDataWypozyczenia(){
        return dataWypozyczenia;
    }

    /**
     * Metoda zwracajaca czy film zostal juz zwrocony.
     * @return czyZwrocony - czy film zostal zwrocony.
     */
    boolean getZwrocony(){return czyZwrocony;}

    /**
     * Metoda uzywana przez sprzedawce. Ustawia film jako zwrocony.
     */
    void setZwrocony(){czyZwrocony=true;}

    /**
     * Metoda zwraca reprezentacje kilku atrybutow obiektow jako string: nazwa filmu,
     * cena i ilosc.
     * @return Tekstowa postac atrybutow filmu.
     */
    public String toString(){
        String zwrocony;
        if(czyZwrocony) zwrocony="Film zwrocony";
        else            zwrocony="Film NIE zwrocony";
        return String.format("Nazwa: %s. Cena: %.2f. Ilosc: %d. Opis: %s. Klient: %s. Data wypozyczenia: %s. Data zwrotu: %s. %s", nazwa,cena,ilosc,opisFilmu,nazwaKlienta,dataWypozyczenia,dataZwrotu,zwrocony);
    }


}