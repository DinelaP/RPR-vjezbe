package ba.unsa.etf.rpr.lab5;

public class InformacijeOStudentu extends LicneInformacije implements Predstavi{
    public String ime;
    public String prezime;
    public String godinaStudija;
    public String brojIndexa;

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

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
    public String predstavi(){
        return ime+" "+prezime+" "+brojIndexa+" "+godinaStudija;
    }
}
