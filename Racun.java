package ba.unsa.etf.rpr.t2;

public class Racun {
    private long brojRacuna;
    private Osoba korisnikRacuna;
    private double stanjeRacuna;
    private double prekoracenje;
    private boolean odobrenjePrekoracenja;

    public Racun(long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna=korisnikRacuna;
    }
    public boolean provjeraOdobrenjaPrekoracenja(double iznos){
        return this.prekoracenje>iznos;
    }

    public boolean izvrsiUplatu(Double n){
        this.stanjeRacuna+=n;
        return true;
    }

    public boolean izvrsiIsplatu(Double n){
        if(this.stanjeRacuna+this.prekoracenje<n){
            return false;
        }
        this.stanjeRacuna-=n;
        return true;

    }
    public void odobriPrekoracenje(Double n){
        this.prekoracenje=n;
    }



}
