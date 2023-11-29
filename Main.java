package ba.unsa.etf.rpr.lab5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        InformacijeOStudentu student=new InformacijeOStudentu();
        student.setIme("Ada");
        student.setPrezime("Smajic");
        student.setBrojIndexa("19923");
        student.setGodinaStudija("2021/2022");
        InformacijeONastavniku nastavnik=new InformacijeONastavniku();
        nastavnik.setIme("Armin");
        nastavnik.setPrezime("Dedic");
        nastavnik.setTitula("Prof");
        System.out.println("Podaci studenta: "+student.getIme()+" "+ student.getPrezime()+" "+ student.getBrojIndexa()+" "+ student.getGodinaStudija());
        System.out.println("Podaci profesora: "+nastavnik.getIme()+" "+ nastavnik.getPrezime()+" "+nastavnik.getTitula());
        Predmet predmet = new Predmet();
        predmet.setNaziv("Matematika");
        predmet.setOpisPredmeta("Opis predmeta Matematika");
        List<Predstavi> objekti = new ArrayList<>();
        objekti.add(student);
        objekti.add(nastavnik);
        objekti.add(predmet);

        KolekcijaPoruka kolekcija = new KolekcijaPoruka(objekti);
        for (String poruka : kolekcija.getPoruke()) {
            System.out.println(poruka);
        }
    }
}
