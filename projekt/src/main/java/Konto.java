/*
 *  Klasa Konto
 *
 *  Klasa, ktorej obiektami sa konta w wypozyczalni.
 *  Maja one rozne atrybuty: nazwa, nazwisko, adres oraz haslo.
 *  Klasa pozwala na dostep do nich i zmiane czesci z nich.
 *
 *  Autor: Adam Filipowicz
 *  Data: 28 maja 2017 r.
 *
 */

import java.io.Serializable;

public class Konto implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Niezmienna nazwa konta.
     */
    private String nazwa;

    /**
     * Nazwisko wlasciciela konta. Jest mozliwa zmiana nazwiska.
     */
    private String nazwisko;

    /**
     * Adres wlasciciela konta. Jest mozliwa zmiana adresu.
     */
    private String adres;

    /**
     * Haslo do konta. Mozna je zmienic przez podanie starego hasla.
     * Haslo przechowywane i sprawdzane jako long przy uzyciu hashCode().
     */
    private long haslo;

    /**
     * Konstruktor parametrowy.
     * @param nazwa - nazwa z jaka chcemy utworzyc nasze nowe konto
     */
    Konto(String nazwa){
        this.nazwa = nazwa;
        nazwisko="";
        adres="";
    }

    /**
     * Metoda zwracajaca nazwe.
     * @return nazwa konta
     */
    String getNazwa(){
        return nazwa;
    }

    /**
     * Metoda przypisujaca atrybutowi nazwisko podanego String'a.
     * @param nazwisko - nazwisko jakie chcemy ustawic dla naszego konta
     */
    void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    /**
     * Metoda zwracajaca nazwisko.
     * @return nazwisko - nazwisko konta
     */
    String getNazwisko(){
        return nazwisko;
    }

    /**
     * Metoda przypisujaca atrybutowi adres podanego String'a.
     * @param adres - adres jaki chcemy ustawic dla naszego konta
     */
    void setAdres(String adres){
        this.adres = adres;
    }

    /**
     * Metoda zwracajaca adres.
     * @return adres - adres konta
     */
    String getAdres(){
        return adres;
    }

    /**
     * Metoda sprawdzajaca czy podane haslo jest prawidlowe.
     * @param podaneHaslo - podane haslo do sprawdzenia
     * @return - true, jesli haslo jest poprawna
     * 		   - false, jesli haslo jest niepoprawne.
     */
    boolean sprawdzHaslo(String podaneHaslo) {
        return podaneHaslo!=null && podaneHaslo.hashCode()==haslo;
    }

    /**
     * Metoda ustawiajaca nowe haslo pod warunkiem podania poprawnego starego hasla.
     * @param stareHaslo - stare haslo
     * @param noweHaslo - nowe haslo
     * @throws Exception - wyjatek zglaszany gdy stare haslo jest niepoprawne
     */
    void setHaslo(String stareHaslo, String noweHaslo) throws Exception {
        if (!sprawdzHaslo(stareHaslo)) throw new Exception("Bledne haslo");
        haslo = noweHaslo.hashCode();
    }

    /**
     * Metoda zwraca reprezentacje kilku atrybutow obiektow jako string: nazwa konta,
     * nazwisko i adres.
     * @return Tekstowa postac atrybutow konta.
     */
    public String toString(){
        return String.format("Nazwa: %s. Nazwisko: %s. Adres: %s.", nazwa, nazwisko, adres);
    }

}