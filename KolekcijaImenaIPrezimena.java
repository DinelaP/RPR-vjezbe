package ba.unsa.etf.rpr.lab5.z3;

import java.util.List;

public class KolekcijaImenaIPrezimena {
    private List<String> listaImena;
    private List<String> listaPrezimena;

    public KolekcijaImenaIPrezimena(List<String> listaImena, List<String> listaPrezimena) {
        this.listaImena = listaImena;
        this.listaPrezimena = listaPrezimena;
    }

    public int getIndexNajduzegPara() {
        int index = 0;
        int maxLength = 0;

        for (int i = 0; i < listaImena.size(); i++) {
            String imeIPrezime = listaImena.get(i) + listaPrezimena.get(i);
            if (imeIPrezime.length() > maxLength) {
                maxLength = imeIPrezime.length();
                index = i;
            }
        }
        return index;
    }

    public String getImeiPrezime(int i) {
        return listaImena.get(i) + " " + listaPrezimena.get(i);
    }
}

