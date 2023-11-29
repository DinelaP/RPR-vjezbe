package ba.unsa.etf.rpr.lab5;

public class Ocjena extends LicneInformacije{
    private LicneInformacije osoba;
    private int ocjena;

    public void setOcjena(int ocjena) {
        if(ocjena>0 && ocjena<10) {
            this.ocjena = ocjena;
        }else {
            System.out.println("Ocjena mora biti veća od 0 i manja od 10.");
        }
    }
    public Ocjena(LicneInformacije osoba, int ocjena) {
        this.osoba = osoba;
        setOcjena(ocjena);
    }

    public LicneInformacije getOsoba() {
        return osoba;
    }

    public int getOcjena() {
        return ocjena;
    }
}
