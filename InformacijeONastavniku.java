package ba.unsa.etf.rpr.lab5;

import java.util.ArrayList;
import java.util.List;

public class InformacijeONastavniku extends  LicneInformacije implements MozeOcijeniti, Predstavi {
    public String ime;
    public String prezime;
    public String titula;
    private List<Ocjena> listaOcjena;

    public InformacijeONastavniku() {
        this.listaOcjena = new ArrayList<>();
    }

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

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }


    public String predstavi(){
        return ime+" "+prezime+" "+titula;
    }

    public List<Ocjena> getListaOcjena() {
        return listaOcjena;
    }


    @Override
    public Ocjena ocijeni(int x) {
        Ocjena novaOcjena;

        LicneInformacije informacijeONastavniku = new LicneInformacije();
        informacijeONastavniku.setIme("Admir");
        informacijeONastavniku.setPrezime("Dedic");

        novaOcjena = new Ocjena(informacijeONastavniku, x);
        novaOcjena.setOcjena(x);

        listaOcjena.add(novaOcjena);

        return novaOcjena;
    }
}