package ba.unsa.etf.rpr.z1;

public enum Grad {
    SARAJEVO("033"),
    TUZLA("035"),
    LIVNO("034"),
    ZENICA("032"),
    BRCKO("049"),
    MOSTAR("036"),
    SIROKI_BRIJEG("039"),
    GORAZDE("038"),
    BIHAC("037"),
    TRAVNIK("030");

    private  String pozivniBroj;

    Grad(String pozivniBroj){
        this.pozivniBroj=pozivniBroj;
    }

    public static Grad izPozivnog(String pozivni){
        for(Grad g:Grad.values()){
            if(g.getPozivniBroj().equals(pozivni)){
                return g;
            }
        }
        return null;
    }

    public String getPozivniBroj(){
        return this.pozivniBroj;
    }
}



