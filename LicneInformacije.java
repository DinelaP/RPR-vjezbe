package ba.unsa.etf.rpr.lab5;

public class LicneInformacije implements Predstavi {
    public String ime;
    public String prezime;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public String predstavi(){
        return ime+" "+prezime;
    }
}
