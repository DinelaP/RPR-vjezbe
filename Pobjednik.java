package ba.unsa.etf.rpr.lab5.z3;

public class Pobjednik{
    private String ime;
    private String prezime;
    private int brojZnakova;

    public Pobjednik(KolekcijaImena kolekcijaImena) {
        String najduzeIme = kolekcijaImena.getNajduzeIme();
        String[] dijelovi = najduzeIme.split("\\s+");
        this.ime = dijelovi[0];
        this.prezime = dijelovi[1];
        this.brojZnakova = najduzeIme.length();
    }

        public Pobjednik(KolekcijaImenaIPrezimena kolekcijaImenaIPrezimena) {
        int indexNajduzegPara = kolekcijaImenaIPrezimena.getIndexNajduzegPara();
        String imeIPrezime = kolekcijaImenaIPrezimena.getImeiPrezime(indexNajduzegPara);

        String[] dijelovi = imeIPrezime.split("\\s+");
        this.ime = dijelovi[0];
        this.prezime = dijelovi[1];
        this.brojZnakova = imeIPrezime.length();
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

    public int getBrojZnakova() {
        return brojZnakova;
    }

    public void setBrojZnakova(int brojZnakova) {
        this.brojZnakova = brojZnakova;
    }

    @Override
    public String toString() {
        return "Ime: " + ime + " Prezime: " + prezime + " Broj Znakova: " + brojZnakova;
    }
}
