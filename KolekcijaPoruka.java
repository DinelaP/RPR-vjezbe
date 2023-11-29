package ba.unsa.etf.rpr.lab5;

import java.util.ArrayList;
import java.util.List;

interface Predstavi{
    String predstavi();
}

public class KolekcijaPoruka {
    private List<String> poruke;

    public KolekcijaPoruka(List<Predstavi> predstavljiviObjekti) {
        this.poruke = new ArrayList<>();
        for (Predstavi objekt : predstavljiviObjekti) {
            poruke.add(objekt.predstavi());
        }
    }
    public List<String> getPoruke() {
        return poruke;
    }

}
