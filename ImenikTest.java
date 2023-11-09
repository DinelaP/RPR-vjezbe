package ba.unsa.etf.rpr.z1;
import java.util.Set;
import ba.unsa.etf.rpr.z1.*;
import org.junit.jupiter.api.beforeall;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

public class ImenikTest {
    @Test
    void dodaj() {
        Imenik imenik = new Imenik();
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        imenik.dodaj("Hana Hanic", new FiksniBroj(Grad.SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(Grad.SARAJEVO, "123-456"));
        assertEquals("033/123-456", imenik.dajBroj("Meho Mehic"));
    }

    @Test
    void imeTest(){
        Imenik imenik = new Imenik();
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        imenik.dodaj("Hana Hanic", new FiksniBroj(Grad.SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(Grad.SARAJEVO, "123-456"));
        assertEquals("Hana Hanic", imenik.dajIme(new FiksniBroj(Grad.SARAJEVO, "123-156")));
    }

    @Test
    void naSlovo() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Sara Sarac", new FiksniBroj(Grad.SARAJEVO, "123-156"));
        imenik.dodaj("Pero Peric", new FiksniBroj(Grad.SARAJEVO, "123-656"));
        imenik.dodaj("Ivo Ivic", new MobilniBroj(61, "321-645"));
        imenik.dodaj("Jozo Jozic", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        assertEquals("1. Ivo Ivic - 061/321-645", imenik.naSlovo('I').trim());
    }

    @Test
    void izGrada() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Ivo Ivic", new FiksniBroj(Grad.SARAJEVO, "123-456"));
        imenik.dodaj("Sara Sarac", new FiksniBroj(Grad.SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(Grad.SARAJEVO, "123-656"));
        imenik.dodaj("Pero Peric", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        Set<String> set = imenik.izGrada(Grad.SARAJEVO);
        String result = "";
        for (String ime : set) {
            result += ime + ",";
        }
        assertEquals("Ivo Ivic,Meho Mehic,Sara Sarac,", result);
    }

    @Test
    void izGradaBrojevi() {
        Imenik imenik = new Imenik();
        imenik.dodaj("Ivo Ivic", new FiksniBroj(Grad.SARAJEVO, "123-456"));
        imenik.dodaj("Sara Sarac", new FiksniBroj(Grad.SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(Grad.SARAJEVO, "123-656"));
        imenik.dodaj("Pero Peric", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        Set<TelefonskiBroj> set = imenik.izGradaBrojevi(Grad.SARAJEVO);
        String result = "";
        for (TelefonskiBroj broj : set) {
            result += broj.ispisi() + ",";
        }
        assertEquals("033/123-156,033/123-456,033/123-656,", result);
    }
}