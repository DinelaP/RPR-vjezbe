package ba.unsa.etf.rpr.lab5;

public class Predmet implements Predstavi {
    public String  naziv;
    public String opisPredmeta;

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
}