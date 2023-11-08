package ba.unsa.etf.rpr.z1;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj{
    private final String drzava;
    private final String broj;
    public MedunarodniBroj(String drzava, String broj){
        this.drzava=drzava;
        this.broj=broj;
    }
    @Override
    public String ispisi(){
        return drzava+broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drzava, broj);
    }
}
