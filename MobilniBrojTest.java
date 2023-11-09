package ba.unsa.etf.rpr.z1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobilniBrojTest {
    @Test
    void kontruktorTest(){
        MobilniBroj broj = new MobilniBroj(61, "123-456");
        assertAll(
                () -> assertEquals(61, broj.getMobilnaMreza()),
                () -> assertEquals("123-456", broj.getBroj())
        );
    }

    @Test
    void ispisTest(){
        MobilniBroj broj = new MobilniBroj(61, "123-456");
        String ispis = broj.ispisi();
        assertEquals("061/123-456", ispis);
    }
}
