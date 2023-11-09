package ba.unsa.etf.rpr.z1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FiksniBrojTest {
    @Test
    void kontruktorTest(){
        FiksniBroj broj = new FiksniBroj(Grad.SARAJEVO, "123-456");
        assertAll(
                () -> assertEquals("123-456", broj.getBroj()),
                () -> assertEquals(Grad.SARAJEVO, broj.getGrad())
        );
    }

    @Test
    void ispisiTest() {
        FiksniBroj broj = new FiksniBroj(Grad.SARAJEVO, "123-456");
        String ispis = broj.ispisi();
        assertEquals("033/123-456", ispis);
    }
}
