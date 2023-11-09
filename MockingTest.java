package ba.unsa.etf.rpr.z1;
import ba.unsa.etf.rpr.z1.*;
import org.junit.jupiter.api.beforall;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class MockingTest {
    private static Imenik imenik=new Imenik;

    public static void setup(){
        imenik.dodaj("John", new MedunarodniBroj("+1", "23 45-67-89"));
        imenik.dodaj("Hana", new FiksniBroj(Grad.SARAJEVO, "123-156"));
        imenik.dodaj("Meho", new FiksniBroj(Grad.SARAJEVO, "123-456"));

    }

    public void testMockExternal(){
        Imenik i=Mockito.mock(Imenik.class);
        Mockito.when(i.dajBroj("Hana")).thenReturn("Nema nista");
        String test=i.dajBroj("Hana");

    }

    public void testMockInternal(){
        Map<String, TelefonskiBroj> mapa=Mockito.mock(Map.class);
        Mockito.when(mapa.get("Hana")).thenReturn(new FiksniBroj(Grad.MOSTAR, "333-444"));
        imenik.setBrojevi(mapa);

        String br=imenik.dajBroj("Hana");


    }

}
