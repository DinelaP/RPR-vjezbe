package ba.unsa.etf.rpr.z1;
import java.util.*;

class Imenik {
    private Map<String, TelefonskiBroj> brojevi;

    public Imenik() {
        this.brojevi = new HashMap<String, TelefonskiBroj>();
    }


    public Map<String, TelefonskiBroj> getBrojevi() {
        return brojevi;
    }

    public void setBrojevi(Map<String, TelefonskiBroj> brojevi) {
        this.brojevi = brojevi;
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        this.brojevi.put(ime, broj);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj broj = this.brojevi.get(ime);
        if (broj != null) {
            return broj.ispisi();
        } else {
            return null;
        }
    }

    public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> entry : this.brojevi.entrySet()) {
            if (entry.getValue().ispisi().equals(broj.ispisi())) {
                return entry.getKey();
            }
        }
        return null;

    }

    public String naSlovo(char s) {
        StringBuilder builder = new StringBuilder();

        int brojac = 1;
        for (Map.Entry<String, TelefonskiBroj> entry : this.brojevi.entrySet()) {
            if (entry.getKey().startsWith(String.valueOf(s))) {
                builder.append(brojac)
                        .append(". ")
                        .append(entry.getKey())
                        .append(" - ")
                        .append(entry.getValue().ispisi())
                        .append(System.lineSeparator());
            }
            brojac++;
        }
        return builder.toString();

    }
    public Set<String> izGrada(Grad g){
        Set<String> rez=new TreeSet<String>();
        for(Map.Entry<String, TelefonskiBroj> entry : this.brojevi.entrySet()){
            if(jeLiIzGrada(entry.getValue(),g)){
                rez.add(entry.getKey());
            }
        }
        return rez;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> rez=new TreeSet<TelefonskiBroj>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj o1, TelefonskiBroj o2) {
                return 0;
            }
        });
        for(Map.Entry<String, TelefonskiBroj> entry : this.brojevi.entrySet()){
            if(jeLiIzGrada(entry.getValue(),g)){
                rez.add(entry.getValue());
            }
        }
        return rez;
    }
    private boolean jeLiIzGrada(TelefonskiBroj broj, Grad g){
        if(broj instanceof FiksniBroj){
            return g.equals(((FiksniBroj) broj).getGrad());
        }else{
            return false;
        }
    }
    public String to_String() {
        StringBuilder builder = new StringBuilder();

        int brojac = 1;
        for (Map.Entry<String, TelefonskiBroj> entry : this.brojevi.entrySet()) {
                builder.append(brojac)
                        .append(". ")
                        .append(entry.getKey())
                        .append(" - ")
                        .append(entry.getValue().ispisi())
                        .append(System.lineSeparator());

            brojac++;
        }
        return builder.toString();

    }



}


