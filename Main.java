package ba.unsa.etf.rpr.lab5.z3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaImena = Arrays.asList("Ana Smajic", "Marko Popovic", "Petar Latic", "Jellena Dragic");
        KolekcijaImena staraKolekcija = new KolekcijaImena(listaImena);

        Pobjednik pobjednikStareKolekcije = new Pobjednik(staraKolekcija);
        System.out.println("Pobjednik stare kolekcije: " + pobjednikStareKolekcije);


        List<String> novaListaImena = Arrays.asList("John", "Selena", "Alisa");
        List<String> novaListaPrezimena = Arrays.asList("Deep", "Smith", "Johnatan");
        KolekcijaImenaIPrezimena novaKolekcija = new KolekcijaImenaIPrezimena(novaListaImena, novaListaPrezimena);

        Pobjednik pobjednikNoveKolekcije = new Pobjednik(novaKolekcija);
        System.out.println("Pobjednik nove kolekcije: " + pobjednikNoveKolekcije);
    }
}
