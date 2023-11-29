package ba.unsa.etf.rpr.lab5;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Predmet matematika = new Predmet();
        InformacijeONastavniku nastavnik = new InformacijeONastavniku();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite status korisnika (student/profesor):");
        String statusKorisnika = scanner.nextLine();

        if (statusKorisnika.equalsIgnoreCase("student")) {
            System.out.println("Unesite ocjenu za predmet:");
            int ocjenaPredmeta = scanner.nextInt();

            Ocjena ocjenaPredmetaObj = matematika.ocijeni(ocjenaPredmeta);
            if (ocjenaPredmetaObj != null) {
                matematika.getListaOcjena().add(ocjenaPredmetaObj);
            }

            System.out.println("Unesite ocjenu za nastavnika:");
            int ocjenaNastavnika = scanner.nextInt();

            Ocjena ocjenaNastavnikaObj = nastavnik.ocijeni(ocjenaNastavnika);
            if (ocjenaNastavnikaObj != null) {
                nastavnik.getListaOcjena().add(ocjenaNastavnikaObj);
            }
        } else {
            System.out.println("Unesite ocjenu za predmet:");
            int ocjenaPredmeta = scanner.nextInt();

            Ocjena ocjenaPredmetaObj = matematika.ocijeni(ocjenaPredmeta);
            if (ocjenaPredmetaObj != null) {
                matematika.getListaOcjena().add(ocjenaPredmetaObj);
            }
        }


        System.out.println("Ocjene predmeta:");
        for (Ocjena ocjena : matematika.getListaOcjena()) {
            System.out.println("Osoba: " + ocjena.getOsoba().getIme() + " " + ocjena.getOsoba().getPrezime() +
                    ", Ocjena: " + ocjena.getOcjena());
        }

        System.out.println("Ocjene nastavnika:");
        for (Ocjena ocjena : nastavnik.getListaOcjena()) {
            System.out.println("Osoba: " + ocjena.getOsoba().getIme() + " " + ocjena.getOsoba().getPrezime() +
                    ", Ocjena: " + ocjena.getOcjena());
        }
    }
}

