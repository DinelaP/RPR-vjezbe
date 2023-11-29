package ba.unsa.etf.rpr.lab5;

import java.util.ArrayList;
import java.util.List;

public class Predmet implements MozeOcijeniti, Predstavi {
    public String  naziv;
    public String opisPredmeta;
    private List<Ocjena> listaOcjena;

    public Predmet() {
        this.listaOcjena = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpisPredmeta() {
        return opisPredmeta;
    }

    public void setOpisPredmeta(String opisPredmeta) {
        this.opisPredmeta = opisPredmeta;
    }
    public String predstavi(){
        return naziv+" "+opisPredmeta;
    }
    public List<Ocjena> getListaOcjena() {
        return listaOcjena;
    }

    @Override
    public Ocjena ocijeni(int x) {
        LicneInformacije osoba = new LicneInformacije();
        osoba.setIme("Ada");
        osoba.setPrezime("Smajic");
        Ocjena novaOcjena = new Ocjena(osoba, x);
        novaOcjena.setOcjena(x);
        listaOcjena.add(novaOcjena);
        return novaOcjena;
    }
}