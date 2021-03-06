

/*
 *  Klasa OpcjeS - Opcje sprzedawcy
 *
 *  Klasa pozwala na zmiane hasla, adresu i nazwiska dla zalogowanego konta.
 *  Pozwala dodac i usunac film a takze zmienic jego ilosc, cene oraz opis.
 *  Pozwala wyswietlic wszystkie filmy, wszystkie konta, historie wszystkich wypozyczen,
 *  oraz historie wypozyczen dla podanego klienta.
 *  Pozwala zwrocic wypozyczenie dla danego klienta (zabieg celowy jako potwierdzenie zwrotu od sprzedawcy).
 *  Wyswietla nazwe, nazwisko i adres konta.
 *  Pozwala takze na wylogowanie sie z konta czyli powrot do menu sprzedawcy.
 *
 *  Autor: Adam Filipowicz
 *  Data: 31 maja 2017 r.
 */
public class OpcjeS extends MenuSprzedawca {
    private Konto konto;
    
    public OpcjeS(){
        super(5);
        initComponents();
    }
    
    public OpcjeS(Konto konto) {
        super(5);
        initComponents();
        this.konto=konto;
        nazwaText.setText("Nazwa konta: "+konto.getNazwa());
        nazwiskoText.setText("Nazwisko: "+konto.getNazwisko());
        adresText.setText("Adres: "+konto.getAdres());
    }
    
    public OpcjeS(int i){
        super(5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        wylogujButton = new javax.swing.JButton();
        adresText = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        nazwaText = new javax.swing.JTextField();
        nazwiskoText = new javax.swing.JTextField();
        zmienHasloButton = new javax.swing.JButton();
        zmienNazwiskoButton = new javax.swing.JButton();
        zmienAdresButton = new javax.swing.JButton();
        dodajButton = new javax.swing.JButton();
        usunButton = new javax.swing.JButton();
        wyswietlFilmyButton = new javax.swing.JButton();
        zwrocButton = new javax.swing.JButton();
        zmienIloscButton = new javax.swing.JButton();
        zmienCeneButton = new javax.swing.JButton();
        zmienOpisButton = new javax.swing.JButton();
        wyswietlKontaButton = new javax.swing.JButton();
        historiaKlientaButton = new javax.swing.JButton();
        historiaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Opcje konta");

        wylogujButton.setText("Wyloguj");
        wylogujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wylogujButtonActionPerformed(evt);
            }
        });

        adresText.setEditable(false);
        adresText.setText("Adres:");

        jTextField2.setEditable(false);
        jTextField2.setText("Zalogowano na konto:");

        nazwaText.setEditable(false);
        nazwaText.setText("Nazwa konta:");

        nazwiskoText.setEditable(false);
        nazwiskoText.setText("Nazwisko: ");

        zmienHasloButton.setText("Zmien haslo");
        zmienHasloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmienHasloButtonActionPerformed(evt);
            }
        });

        zmienNazwiskoButton.setText("Zmien nazwisko");
        zmienNazwiskoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmienNazwiskoButtonActionPerformed(evt);
            }
        });

        zmienAdresButton.setText("Zmien adres");
        zmienAdresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmienAdresButtonActionPerformed(evt);
            }
        });

        dodajButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dodajButton.setText("Dodaj film");
        dodajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajButtonActionPerformed(evt);
            }
        });

        usunButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usunButton.setText("Usun film");
        usunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunButtonActionPerformed(evt);
            }
        });

        wyswietlFilmyButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        wyswietlFilmyButton.setText("Wyswietl filmy");
        wyswietlFilmyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyswietlFilmyButtonActionPerformed(evt);
            }
        });

        zwrocButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        zwrocButton.setText("Zwroc wypozyczenie klienta");
        zwrocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zwrocButtonActionPerformed(evt);
            }
        });

        zmienIloscButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        zmienIloscButton.setText("Zmien ilosc filmu");
        zmienIloscButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmienIloscButtonActionPerformed(evt);
            }
        });

        zmienCeneButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        zmienCeneButton.setText("Zmien cene filmu");
        zmienCeneButton.setToolTipText("");
        zmienCeneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmienCeneButtonActionPerformed(evt);
            }
        });

        zmienOpisButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        zmienOpisButton.setText("Zmien opis filmu");
        zmienOpisButton.setToolTipText("");
        zmienOpisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmienOpisButtonActionPerformed(evt);
            }
        });

        wyswietlKontaButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        wyswietlKontaButton.setText("Wyswietl konta");
        wyswietlKontaButton.setToolTipText("");
        wyswietlKontaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyswietlKontaButtonActionPerformed(evt);
            }
        });

        historiaKlientaButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        historiaKlientaButton.setText("Sprawdz historie klienta");
        historiaKlientaButton.setToolTipText("");
        historiaKlientaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiaKlientaButtonActionPerformed(evt);
            }
        });

        historiaButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        historiaButton.setText("Sprawdz cala historie");
        historiaButton.setToolTipText("");
        historiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nazwiskoText)
                                    .addComponent(nazwaText, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(adresText))
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(wyswietlKontaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dodajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zmienIloscButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zmienCeneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usunButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(historiaKlientaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zmienOpisButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(historiaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(wyswietlFilmyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wylogujButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(zwrocButton, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(zmienHasloButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(zmienNazwiskoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(zmienAdresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nazwaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nazwiskoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adresText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wylogujButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zwrocButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wyswietlFilmyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zmienIloscButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zmienOpisButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(wyswietlKontaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(zmienCeneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(historiaKlientaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(historiaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zmienHasloButton)
                    .addComponent(zmienNazwiskoButton)
                    .addComponent(zmienAdresButton))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda po nacisnieciu guzika wylogowuje sie i wraca do menu sprzedawcy.
     * @param evt - nacisniecie guzika powoduje wylogowanie sie i powrot do menu sprzedawcy
     */
    private void wylogujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wylogujButtonActionPerformed
        sprzedawcaMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_wylogujButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika pozwala zwrocic dane wypozyczenie klienta po podaniu odpowiednich danych.
     * Uwaga! przykladowe daty: 20.5.2017, 30.12.2017.
     * @param evt - nacisniecie guzika powoduje zwrot podanego wypozyczenia
     */
    private void zwrocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zwrocButtonActionPerformed
        String nazwaFilmu, klient, dataWypozyczenia;
        int ilosc;
        double cena;
        Film film;
        UI.printMessage("\nZWRACANIE WYPOZYCZENIA");
        Wypozyczenie wyp;

        nazwaFilmu=UI.enterString("Podaj nazwe zwracanego filmu: ");
        klient=UI.enterString("Podaj klienta ktory zwraca film: ");
        dataWypozyczenia=UI.enterString("Podaj date wypozyczenia filmu: ");
        ilosc=UI.enterInt("Podaj ilosc wypozyczonych filmow: ");
        cena=UI.enterDouble("Podaj cene wypozyczonego filmu (jednej sztuki): ");

        wyp=wypozyczalnia.znajdzWypozyczenie(nazwaFilmu,cena,ilosc,klient,dataWypozyczenia);
        if(wyp==null){
            UI.printErrorMessage("\nBledne dane wypozyczenia");
            return;
        }
        UI.printInfoMessage("\nOddanie filmu zakonczone sukcesem");
        wyp.setZwrocony();
        film=wypozyczalnia.znajdzFilm(nazwaFilmu);
        film.dodajIlosc(ilosc);
    }//GEN-LAST:event_zwrocButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika pozwala na dodanie filmu.
     * @param evt - nacisniecie guzika powoduje dodanie podanego filmu
     */
    private void dodajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajButtonActionPerformed
        String nazwaFilmu;
        double cenaFilmu;
        int iloscFilmu;
        UI.printMessage("\nDODAWANIE FILMU");
        nazwaFilmu=UI.enterString("Podaj nazwe nowego filmu: ");
        cenaFilmu=UI.enterDouble("Podaj nowa cene filmu: ");
        iloscFilmu=UI.enterInt("Podaj nowa ilosc filmu: ");
        try {
            wypozyczalnia.dodajFilm(nazwaFilmu,cenaFilmu,iloscFilmu);
        } catch (Exception ex) {
            UI.printErrorMessage(ex.getMessage());
            return;
        }
        UI.printInfoMessage("\nFilm zostal dodany");
    }//GEN-LAST:event_dodajButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika pozwala na usuniecie filmu.
     * @param evt - nacisniecie guzika powoduje usuniecie podanego filmu
     */
    private void usunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunButtonActionPerformed
        String nazwaFilmu;
        UI.printMessage("\nWYCOFANIE FILMU");
        nazwaFilmu=UI.enterString("Podaj nazwe filmu do wycofania: ");
        try {
            wypozyczalnia.wycofajFilm(nazwaFilmu);
        } catch (Exception ex) {
            UI.printErrorMessage(ex.getMessage());
            return;
        }
        UI.printInfoMessage("\nFilm zostal wycofany");
    }//GEN-LAST:event_usunButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika pozwala na wyswietlenie filmow.
     * @param evt - nacisniecie guzika powoduje wyswietlenie filmow
     */
    private void wyswietlFilmyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyswietlFilmyButtonActionPerformed
        UI.printMessage("\nWYSWIETL STAN FILMOW");
        UI.printInfoMessage(wypozyczalnia.wypiszListeFilmow());
    }//GEN-LAST:event_wyswietlFilmyButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika pozwala na zmiane ilosci filmu.
     * @param evt - nacisniecie guzika powoduje zmiane ilosci podanego filmu
     */
    private void zmienIloscButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmienIloscButtonActionPerformed
        String nazwaFilmu;
        int iloscFilmu;
        Film film;

        UI.printMessage("\nZMIANA ILOSCI FILMU");
        while(true){
            UI.printMessage(wypozyczalnia.wypiszListeFilmow());
            nazwaFilmu=UI.enterString("Podaj nazwe filmu lub KONIEC zeby anulowac: ");
            if(nazwaFilmu.equals("KONIEC"))
                break;
            film=wypozyczalnia.znajdzFilm(nazwaFilmu);
            if(film==null){
                UI.printErrorMessage("Podany film nie istnieje");
                continue;
            }
            try{
                iloscFilmu=UI.enterInt("Podaj nowa ilosc filmu: ");
                if(iloscFilmu<=0){
                    UI.printErrorMessage("\nBledna ilosc filmu");
                    break;
                }
                film.zmienIlosc(iloscFilmu);
            }
            catch(Exception e){
                UI.printErrorMessage(e.getMessage());
                return;
            }
            UI.printInfoMessage("\nIlosc zostala zmieniona");
            break;
        }
    }//GEN-LAST:event_zmienIloscButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika pozwala na zmiane ceny filmu.
     * @param evt - nacisniecie guzika powoduje zmiane ceny podanego filmu
     */
    private void zmienCeneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmienCeneButtonActionPerformed
        String nazwaFilmu;
        double nowaCena;
        Film film;

        UI.printMessage("\nZMIANA CENY FILMU");
        while(true){
            UI.printMessage(wypozyczalnia.wypiszListeFilmow());
            nazwaFilmu=UI.enterString("Podaj nazwe filmu lub KONIEC zeby anulowac: ");
            if(nazwaFilmu.equals("KONIEC"))
                break;
            film=wypozyczalnia.znajdzFilm(nazwaFilmu);
            if(film==null){
                UI.printErrorMessage("Podany film nie istnieje");
                continue;
            }
            nowaCena=UI.enterDouble("Podaj nowa cene filmu: ");
            if(nowaCena<=0){
                UI.printErrorMessage("\nBledna cena filmow");
                break;
            }
            film.setCena(nowaCena);
            UI.printInfoMessage("\nCena filmu zostala zmieniona");
            break;
        }
    }//GEN-LAST:event_zmienCeneButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika pozwala na zmiane opisu filmu.
     * @param evt - nacisniecie guzika powoduje zmiane opisu podanego filmu
     */
    private void zmienOpisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmienOpisButtonActionPerformed
        String nazwaFilmu;
        String nowyOpis;
        Film film;

        UI.printMessage("\nZMIANA OPISU FILMU");
        while(true){
            UI.printMessage(wypozyczalnia.wypiszListeFilmow());
            nazwaFilmu=UI.enterString("Podaj nazwe filmu lub KONIEC zeby anulowac: ");
            if(nazwaFilmu.equals("KONIEC"))
                break;
            film=wypozyczalnia.znajdzFilm(nazwaFilmu);
            if(film==null){
                UI.printErrorMessage("Podany film nie istnieje");
                continue;
            }
            nowyOpis=UI.enterString("Podaj nowy opis filmu: ");
            film.setOpis(nowyOpis);
            UI.printInfoMessage("\nOpis filmu zostal zmieniony");
            break;
        }
    }//GEN-LAST:event_zmienOpisButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika wyswietla wszystkie konta.
     * @param evt - nacisniecie guzika powoduje wyswietlenie kont
     */
    private void wyswietlKontaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyswietlKontaButtonActionPerformed
        UI.printMessage("\nWYSWIETLANIE KONT");
        String lista ="\nLISTA KONT:\n";
        lista+=wypozyczalnia.listaKont();
        UI.printInfoMessage(lista);
    }//GEN-LAST:event_wyswietlKontaButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika wyswietla historie wypozyczen podanego klienta.
     * @param evt - nacisniecie guzika powoduje wyswietlenie historii wypozyczen klienta
     */
    private void historiaKlientaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaKlientaButtonActionPerformed
        String nazwaKonta;
        Konto kontoKlienta;
        nazwaKonta = UI.enterString("Podaj nazwe konta klienta: ");
        kontoKlienta=wypozyczalnia.znajdzKonto(nazwaKonta);
        if(kontoKlienta==null){
            UI.printErrorMessage("\nBledna nazwa konta");
            return;
        }
        UI.printMessage("\nHISTORIA ZAKUPOW KLIENTA " + nazwaKonta);
        UI.printInfoMessage(wypozyczalnia.wyswietlHistorieWypozyczenKlienta(kontoKlienta));
    }//GEN-LAST:event_historiaKlientaButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika wyswietla historie wypozyczen.
     * @param evt - nacisniecie guzika powoduje wyswietlenie historii wypozyczen
     */
    private void historiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaButtonActionPerformed
        UI.printMessage("\nHISTORIA ZAKUPOW");
        UI.printInfoMessage(wypozyczalnia.wyswietlHistorieWypozyczen());
    }//GEN-LAST:event_historiaButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika pozwala na zmiane hasla.
     * @param evt - nacisniecie guzika powoduje zmiane hasla
     */
    private void zmienHasloButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmienHasloButtonActionPerformed
        String noweHaslo;
        String stareHaslo;

        UI.printMessage("\nZMIANA HASLA DO KONTA");
        stareHaslo = UI.enterString("Podaj stare haslo: ");
        noweHaslo = UI.enterString("Podaj nowe haslo: ");
        if(konto.sprawdzHaslo(stareHaslo)){
            try {
                konto.setHaslo(stareHaslo, noweHaslo);
            } 
            catch (Exception ex) {
                UI.printErrorMessage(ex.getMessage());
                return;
            }
            UI.printInfoMessage("\nHaslo zostalo zmienione");
            return;
        }
        UI.printErrorMessage("Podano bledne stare haslo!");
    }//GEN-LAST:event_zmienHasloButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika pozwala na zmiane nazwiska.
     * @param evt - nacisniecie guzika powoduje zmiane nazwiska
     */
    private void zmienNazwiskoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmienNazwiskoButtonActionPerformed
        String noweNazwisko;

        UI.printMessage("\nZMIANA NAZWISKA WLASCICIELA KONTA");
        while(true){
            noweNazwisko = UI.enterString("Podaj nazwisko: ");
            if (noweNazwisko.hashCode()!=0) {
                break;
            }
        }
        UI.printInfoMessage("\nNazwisko zostalo zmienione");
        konto.setNazwisko(noweNazwisko);
        nazwiskoText.setText("Nazwisko: "+konto.getNazwisko());
    }//GEN-LAST:event_zmienNazwiskoButtonActionPerformed

    /**
     * Metoda po nacisnieciu guzika pozwala na zmiane adresu.
     * @param evt - nacisniecie guzika powoduje zmiane adresu
     */
    private void zmienAdresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmienAdresButtonActionPerformed
        String nowyAdres;

        UI.printMessage("\nZMIANA ADRESU WLASCICIELA KONTA");
        while(true){
            nowyAdres = UI.enterString("Podaj adres: ");
            if (nowyAdres.hashCode()!=0) {
                break;
            }
        }
        UI.printInfoMessage("\nAdres zostal zmieniony");
        konto.setAdres(nowyAdres);
        adresText.setText("Adres: "+konto.getAdres());
    }//GEN-LAST:event_zmienAdresButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcjeS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OpcjeS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresText;
    private javax.swing.JButton dodajButton;
    private javax.swing.JButton historiaButton;
    private javax.swing.JButton historiaKlientaButton;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField nazwaText;
    private javax.swing.JTextField nazwiskoText;
    private javax.swing.JButton usunButton;
    private javax.swing.JButton wylogujButton;
    private javax.swing.JButton wyswietlFilmyButton;
    private javax.swing.JButton wyswietlKontaButton;
    private javax.swing.JButton zmienAdresButton;
    private javax.swing.JButton zmienCeneButton;
    private javax.swing.JButton zmienHasloButton;
    private javax.swing.JButton zmienIloscButton;
    private javax.swing.JButton zmienNazwiskoButton;
    private javax.swing.JButton zmienOpisButton;
    private javax.swing.JButton zwrocButton;
    // End of variables declaration//GEN-END:variables
}
