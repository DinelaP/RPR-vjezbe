package ba.unsa.etf.rpr.lab4;

import ba.unsa.etf.rpr.lab4.dao.LaptopDaoJSONFile;
import ba.unsa.etf.rpr.lab4.dao.LaptopDaoSerializableFile;
import ba.unsa.etf.rpr.lab4.dao.LaptopDaoXMLFile;
import ba.unsa.etf.rpr.lab4.dao.NeodgovarajuciProcesorException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;

public class AppTest {

    @Test
    void Test1() throws IOException, ClassNotFoundException {
        LaptopDaoSerializableFile ldao = new LaptopDaoSerializableFile();

        ArrayList<Laptop> laptops1 = new ArrayList<>();
        laptops1.add((new Laptop("HP", "...", 0, 0, 0, 0, "AMD", "...", 0)));
        laptops1.add((new Laptop("Dell", "...", 0, 0, 0, 0, "AMD", "...", 0)));
        laptops1.add((new Laptop("ThinkPad", "...", 0, 0, 0, 0, "AMD", "...", 0)));
        ldao.napuniListu(laptops1);

        Assertions.assertThrows(NeodgovarajuciProcesorException.class, () -> {
            Laptop l = ldao.getLaptop("Intel");
        });

        ldao.dodajLaptopUFile(new Laptop("Lenovo", "...", 0, 0, 0, 0, "Intel", "...", 0));
        ldao.dodajLaptopUFile(new Laptop("ASUS", "...", 0, 0, 0, 0, "Intel", "...", 0));
        ldao.dodajLaptopUFile(new Laptop("Acer", "...", 0, 0, 0, 0, "Intel", "...", 0));

        ArrayList<Laptop> laptops2 = ldao.vratiPodatkeIzDatoteke();
        String testString = "LAPTOP {brand = 'Lenovo', model = '...', price = 0.0, RAM = 0, HDD = 0, SSD = 0, CPU = 'Intel', GPU = '...', screen_size = 0.0}";
        Assertions.assertEquals(testString, laptops2.get(3).toString());
    }

    @Test
    void Test2() throws IOException {
        LaptopDaoJSONFile ldao = new LaptopDaoJSONFile();

        ArrayList<Laptop> laptops1 = new ArrayList<>();
        laptops1.add((new Laptop("HP", "...", 0, 0, 0, 0, "AMD", "...", 0)));
        laptops1.add((new Laptop("Dell", "...", 0, 0, 0, 0, "AMD", "...", 0)));
        laptops1.add((new Laptop("ThinkPad", "...", 0, 0, 0, 0, "AMD", "...", 0)));
        ldao.napuniListu(laptops1);

        Assertions.assertThrows(NeodgovarajuciProcesorException.class, () -> {
            Laptop l = ldao.getLaptop("Intel");
        });

        ldao.dodajLaptopUFile(new Laptop("Lenovo", "...", 0, 0, 0, 0, "Intel", "...", 0));
        ldao.dodajLaptopUFile(new Laptop("ASUS", "...", 0, 0, 0, 0, "Intel", "...", 0));
        ldao.dodajLaptopUFile(new Laptop("Acer", "...", 0, 0, 0, 0, "Intel", "...", 0));

        ArrayList<Laptop> laptops2 = ldao.vratiPodatkeIzDatoteke();
        String testString = "LAPTOP {brand = 'Lenovo', model = '...', price = 0.0, RAM = 0, HDD = 0, SSD = 0, CPU = 'Intel', GPU = '...', screen_size = 0.0}";
        Assertions.assertEquals(testString, laptops2.get(3).toString());
    }

    @Test
    void Test3() throws IOException {
        LaptopDaoXMLFile ldao = new LaptopDaoXMLFile();

        ArrayList<Laptop> laptops1 = new ArrayList<>();
        laptops1.add((new Laptop("HP", "...", 0, 0, 0, 0, "AMD", "...", 0)));
        laptops1.add((new Laptop("Dell", "...", 0, 0, 0, 0, "AMD", "...", 0)));
        laptops1.add((new Laptop("ThinkPad", "...", 0, 0, 0, 0, "AMD", "...", 0)));
        ldao.napuniListu(laptops1);

        Assertions.assertThrows(NeodgovarajuciProcesorException.class, () -> {
            Laptop l = ldao.getLaptop("Intel");
        });

        ldao.dodajLaptopUFile(new Laptop("Lenovo", "...", 0, 0, 0, 0, "Intel", "...", 0));
        ldao.dodajLaptopUFile(new Laptop("ASUS", "...", 0, 0, 0, 0, "Intel", "...", 0));
        ldao.dodajLaptopUFile(new Laptop("Acer", "...", 0, 0, 0, 0, "Intel", "...", 0));

        ArrayList<Laptop> laptops2 = ldao.vratiPodatkeIzDatoteke();
        String testString = "LAPTOP {brand = 'Lenovo', model = '...', price = 0.0, RAM = 0, HDD = 0, SSD = 0, CPU = 'Intel', GPU = '...', screen_size = 0.0}";
        Assertions.assertEquals(testString, laptops2.get(3).toString());

    }

    @Test
    void Test4() throws IOException {
        Laptop l1 = new Laptop("Lenovo", "...", 0, 0, 0, 0, "...", "...", 0);
        Laptop l2 = new Laptop("HP", "...", 0, 0, 0, 0, "...", "...", 0);
        Laptop l3 = new Laptop("Dell", "...", 0, 0, 0, 0, "...", "...", 0);

        LaptopDaoJSONFile ldao = Mockito.mock(LaptopDaoJSONFile.class);

        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(l1);
        laptops.add(l2);
        laptops.add(l3);
        Mockito.when(ldao.vratiPodatkeIzDatoteke()).thenReturn(laptops);

        Assertions.assertEquals("Lenovo", ldao.vratiPodatkeIzDatoteke().get(0).getBrend());
        Assertions.assertEquals("HP", ldao.vratiPodatkeIzDatoteke().get(1).getBrend());
        Assertions.assertEquals("Dell", ldao.vratiPodatkeIzDatoteke().get(2).getBrend());
    }
}
