/*
 *  Klasa Wypozyczalnia
 *
 *  Klasa zawiera wiele metod uzywanych w klasach okienkowych.
 *  Klasa bazuje na obiektach klasy Konto, Film i Wypozyczenie.
 *  Klasa posiada takze listy w ktorych sa one przechowywane.
 *
 *  Autor: Adam Filipowicz
 *  Data: 28 maja 2017 r.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;



class Wypozyczalnia implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Lista typu Konto w ktorej przechowywane sa wszystkie konta (wczytywana i zapisywana do pliku).
     */
    private ArrayList<Konto> listaKont = new ArrayList<>();

    /**
     * Lista typu Film w ktorej przechowywane sa wszystkie filmy (wczytywana i zapisywana do pliku).
     */
    private ArrayList<Film> listaFilmow = new ArrayList<>();

    /**
     * Lista typu String w ktorej przechowywana jest historia wypozyczen (wczytywana i zapisywana do pliku).
     */
    private ArrayList<Wypozyczenie> listaWypozyczen = new ArrayList<>();

    /**
     * Metoda sprawdza czy istnieje juz sprzedawca (czy jakies konto jest juz utworzone).
     * @return true - gdy istnieje konto sprzedawcy
     * 		   false - gdy nie istnieje konto sprzedawcy
     */
    boolean sprawdzCzyIstniejeSprzedawca(){
        return !listaKont.isEmpty();
    }

    /**
     * Metoda sprawdza czy podane konto nalezy do sprzedawcy.
     * @param daneKonto - podane konto, do sprawdzenia
     * @return true - gdy podane konto faktycznie jest kontem sprzedawcy
     * 		   false - gdy podane konto nie jest kontem sprzedawcy
     */
    boolean sprawdzCzyKontoSprzedawcy(Konto daneKonto){
        return daneKonto==listaKont.get(0);
    }

    /**
     * Metoda dodaje film o podanej nazwie do tablicy filmow.
     * @param nazwa - nazwa filmu do dodania
     * @param cena - cena filmu.
     * @param ilosc - ilosc filmu.
     * @throws Exception - wyjatek zglaszany, gdy nazwa filmu jest pusta lub gdy film juz istnieje
     */
    void dodajFilm(String nazwa,double cena,int ilosc) throws Exception{
        if(nazwa==null || nazwa.equals("")) throw(new Exception("Nazwa filmu nie moze byc pusta"));
        if(cena<=0) throw(new Exception("Bledna cena"));
        if(ilosc<=0) throw(new Exception("Bledna ilosc"));
        if (znajdzFilm(nazwa)!=null) throw(new Exception("Film juz istnieje"));
        Film nowyFilm = new Film(nazwa,cena,ilosc);
        listaFilmow.add(nowyFilm);
    }

    /**
     * Metoda wycofuje film o podanej nazwie z wypozyczalni (usuwa z tablicy)
     * @param nazwa - nazwa filmu do usuniecia
     * @throws Exception - wyjatek zglaszany, gdy nazwa filmu jest pusta lub bledna
     */
    void wycofajFilm(String nazwa) throws Exception{
        if(nazwa==null) throw(new Exception("Brak filmu"));
        Film film = znajdzFilm(nazwa);
        if (film==null) throw(new Exception("Nie znaleziono danego filmu"));
        listaFilmow.remove(film);
    }

    /**
     * Metoda znajduje film o podanej nazwie na liscie filmow i zwraca go.
     * @param nazwa - nazwa wyszukiwanego filmu
     * @return Film - gdy film zostanie znaleziony na liscie
     * 		   null - gdy film nie zostanie znaleziony na liscie
     */
    Film znajdzFilm(String nazwa){
        for(Film film: listaFilmow)
            if(film.getNazwa().equals(nazwa)) return film;
        return null;
    }
        /**
     * Metoda znajduje film o podanym indeksie na liscie filmow i zwraca jego nazwe.
     * @param index - nazwa wyszukiwanego filmu
     * @return String - gdy film zostanie znaleziony na liscie
     * 		   null - gdy film nie zostanie znaleziony na liscie
     */
    String znajdzNazweFilmu(int index){
        int i=0;
        for(Film film: listaFilmow){
            if(i==index) return film.getNazwa();
            i++;
        }
        return null;
    }
    
        /**
     * Metoda znajduje ilosc filmu o podanej nazwie na liscie filmow i zwraca ja.
     * @param nazwa - nazwa wyszukiwanego filmu
     * @return int - ilosc filmu gdy film zostanie znaleziony na liscie
     *         -1 - gdy film nie zostanie znaleziony na liscie
     */
    int znajdzIloscFilmu(String nazwa){
        for(Film film: listaFilmow)
            if(film.getNazwa().equals(nazwa)) return film.getIlosc();
        return -1;
    }

    /**
     * Metoda zwracajaca liste filmow jako String.
     * @return lista filmow jako String
     */
    String wypiszListeFilmow(){
        if(listaFilmow.isEmpty()){
            return "Brak filmow do wypozyczenia";
        }
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (Film film : listaFilmow){
            if (n++ != 0) sb.append("\n");
            sb.append(film.toString());
        }
        return sb.toString();
    }

    /**
     * Metoda dodaje konto sprzedawcy o podanej nazwie do tablicy kont.
     * @param nazwa - nazwa konta do dodania
     * @return obiekt Konto ktore zostalo dodane do tablicy kont
     * @throws Exception - wyjatek zglaszany, gdy nazwa konta jest pusta
     */
    Konto zalozKontoSprzedawcy(String nazwa) throws Exception {
        if (nazwa==null || nazwa.equals("")) throw(new Exception("Nazwa konta nie moze byc pusta"));
        Konto noweKonto = new Konto(nazwa);
        listaKont.add(noweKonto);
        return noweKonto;
    }

    /**
     * Metoda dodaje konto o podanej nazwie do tablicy kont.
     * @param nazwa - nazwa konta do dodania
     * @return obiekt Konto ktore zostalo dodane do tablicy kont
     * @throws Exception - wyjatek zglaszany, gdy nazwa konta jest pusta lub gdy konto o podanej nazwie juz istnieje
     */
    Konto zalozKonto(String nazwa) throws Exception {
        if (nazwa==null || nazwa.equals("")) throw(new Exception("Nazwa konta nie moze byc pusta"));
        if (znajdzKonto(nazwa)!=null) throw(new Exception("Konto juz istnieje"));
        Konto noweKonto = new Konto(nazwa);
        listaKont.add(noweKonto);
        return noweKonto;
    }

    /**
     * Metoda usuwa podane konto (usuwa z tablicy)
     * @param konto - konto do usuniecia
     * @throws Exception - wyjatek zglaszany, gdy nazwa konta jest pusta
     */
    void usunKonto(Konto konto) throws Exception {
        if (konto==null) throw(new Exception("Nie podano nazwy konta"));
        listaKont.remove(konto);
    }

    /**
     * Metoda znajduje konto o podanej nazwie na liscie kont i zwraca go.
     * @param nazwa - nazwa wyszukiwanego konta
     * @return konto - gdy konto zostanie znalezione na liscie
     * 		   null - gdy konto nie zostanie znalezione na liscie
     */
    Konto znajdzKonto(String nazwa) {
        for (Konto konto : listaKont)
            if (konto.getNazwa().equals(nazwa)) return konto;
        return null;
    }

    /**
     * Metoda znajduje konto o podanej nazwie na liscie kont i zwraca go jesli podano poprawne haslo.
     * @param nazwa - nazwa wyszukiwanego konta
     * @param haslo - haslo wyszukiwanego konta
     * @return konto - gdy konto zostanie znalezione na liscie i haslo jest poprawne
     * 		   null - gdy konto nie zostanie znalezione na liscie lub/i gdy haslo jest niepoprawne
     */
    Konto znajdzKonto(String nazwa, String haslo) {
        Konto konto = znajdzKonto(nazwa);
        if (konto!=null){
            if (!konto.sprawdzHaslo(haslo)) konto = null;
        }
        return konto;
    }

    /**
     * Metoda zwracajaca liste kont jako String.
     * @return lista kont jako String
     */
    String listaKont(){
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (Konto konto : listaKont){
            if (n++ != 0) sb.append("\n");
            sb.append(konto.toString());
        }
        return sb.toString();
    }

    /**
     * Metoda dodaje wypozyczenie o podanych parametrach do historii wypozyczen.
     * @param nazwa - nazwa filmu
     * @param cena - cena filmu
     * @param ilosc - ilosc zakupionego filmu
     * @param nazwaKlienta - nazwa klienta ktory zakupil film
     */
    void dodajDoHistoriiWypozyczen(String nazwa, double cena, int ilosc, String nazwaKlienta, String opis, String dataWypozyczenia, String dataZwrotu){
        Wypozyczenie noweWypozyczenie = new Wypozyczenie(nazwa, cena, ilosc, nazwaKlienta, opis, dataWypozyczenia, dataZwrotu);
        listaWypozyczen.add(noweWypozyczenie);
    }

    /**
     * Metoda zwracajaca historie wypozyczen dla danego konta jako String.
     * @return historia wypozyczen dla danego konta jako String
     */
    String wyswietlHistorieWypozyczenKlienta(Konto konto){
        if(listaWypozyczen==null)
            return "Lista wypozyczen jest pusta";
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (Wypozyczenie wyp : listaWypozyczen){
            if(wyp.getKlient().equals(konto.getNazwa())){
                if (n++ != 0) sb.append("\n");
                sb.append(wyp.toString());
            }
        }
        return sb.toString();
    }

    /**
     * Metoda zwracajaca historie wypozyczen dla danego konta jako String.
     * @return historia wypozyczen dla danego konta jako String
     */
    String wyswietlHistorieWypozyczen(){
        if(listaWypozyczen==null)
            return "Lista wypozyczen jest pusta";
        StringBuilder sb = new StringBuilder();
        int n=0;
        for (Wypozyczenie wyp : listaWypozyczen){
            if(n++ != 0) sb.append("\n");
            sb.append(wyp.toString());
        }
        return sb.toString();
    }

    /**
     * Metoda znajduje wypozyczenie o podanej nazwie, cenie, ilosci, kliencie i dacie wypozyczenia na liscie wypozyczen i zwraca go.
     * @param nazwa - nazwa wyszukiwanego filmu
     * @param cena - cena wyszukiwanego filmu
     * @param ilosc - ilosc wyszukiwanego filmu
     * @param klient - klient ktory wypozyczyl wyszukiwany film
     * @param dataWypozyczenia - data wypozyczenia wyszukiwanego filmu
     * @return Wypozyczenie - gdy wypozyczenie zostanie znalezione na liscie
     * 		   null - gdy wypozyczenie nie zostanie znalezione na liscie
     */
    Wypozyczenie znajdzWypozyczenie(String nazwa, double cena, int ilosc, String klient, String dataWypozyczenia){
        for(Wypozyczenie wypozyczenie: listaWypozyczen)
            if(wypozyczenie.getNazwa().equals(nazwa) && wypozyczenie.getCena()==cena && wypozyczenie.getIlosc()==ilosc && wypozyczenie.getKlient().equals(klient) && wypozyczenie.getDataWypozyczenia().equals(dataWypozyczenia) && !wypozyczenie.getZwrocony()) return wypozyczenie;
        return null;
    }

    /**
     * Metoda zapisujaca do pliku liste kont, liste filmow oraz historie zakupow.
     * @param fileName - nazwa pliku do zapisania
     * @throws Exception - wyjatek
     */
    void zapiszDoPliku(String fileName) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(listaKont);
        out.writeObject(listaFilmow);
        out.writeObject(listaWypozyczen);
        out.close();
    }

    /**
     * Metoda wczytujaca z pliku liste kont, liste filmow oraz historie zakupow.
     * @param fileName - nazwa pliku do wczytania informacji
     * @throws Exception - wyjatek
     */
    void wczytajZPliku(String fileName) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        listaKont = (ArrayList<Konto>) in.readObject();
        listaFilmow = (ArrayList<Film>)in.readObject();
        listaWypozyczen=(ArrayList<Wypozyczenie>)in.readObject();
        in.close();
    }

}