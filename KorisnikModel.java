package com.example.demo2;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisnikModel {
    private ObservableList<Korisnik> korisnici = FXCollections.observableArrayList();
    private SimpleObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<>();

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void napuni() {
        korisnici.add(new Korisnik("Emina", "Trako", "etrako1@etf.unsa.ba", "trako1", "trako123"));
        korisnici.add(new Korisnik("Elma", "Nekic", "enekic1@etf.unsa.ba", "elma1", "Elma123"));
        korisnici.add(new Korisnik("Adna", "Alihodzic", "adna1@etf.unsa.ba", "adna1", "Adna123"));
        korisnici.add(new Korisnik("Dinela", "Pešković", "dinela1@etf.unsa.ba", "dinela1", "Dinela234"));
    }
}
