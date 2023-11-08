package ba.unsa.etf.rpr.z1;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;
    public FiksniBroj(Grad grad, String broj){
        if(null==grad) throw new BrojException("Nije tacno");
        this.grad=grad;
        this.broj=broj;
    }
    @Override
    public String ispisi(){
        return grad.getPozivniBroj()+"/"+broj;
    }
    @Override
    public int hashCode() {
        return Objects.hash(grad, broj);
    }
    public Grad getGrad(){
        return grad;
    }
    public String getBroj(){
        return broj;
    }

}
