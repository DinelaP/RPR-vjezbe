package ba.unsa.etf.rpr.lab5.z3;

import java.util.List;

public class KolekcijaImena {

    private List<String> listaImena;

    public KolekcijaImena(List<String> listaImena) {
        this.listaImena = listaImena;
    }

    public String getNajduzeIme() {
        String najduzeIme = "";
        for (String ime : listaImena) {
            if (ime.length() > najduzeIme.length()) {
                najduzeIme = ime;
            }
        }
        return najduzeIme;
    }
}
