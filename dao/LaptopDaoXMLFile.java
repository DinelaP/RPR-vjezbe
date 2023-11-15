package ba.unsa.etf.rpr.lab4.dao;

import ba.unsa.etf.rpr.lab4.Laptop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoXMLFile implements LaptopDao {

    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoXMLFile() {
        laptopi = new ArrayList<>();
        file = new File("src/main/resources/laptopi.xml");
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }


    @Override
    public Laptop getLaptop(String procesor) {
        Laptop temp = new Laptop();
        for (Laptop el : laptopi)
            if (el.getProcesor().equals(procesor))
                return el;
        throw new NeodgovarajuciProcesorException("Neodgovarajuci procesor!");
    }

    @Override
    public void napuniListu(ArrayList<Laptop> l) {
        laptopi.addAll(l);
    }

    @Override
    public Laptop dodajLaptopUFile(Laptop laptop) throws IOException {
        laptopi.add(laptop);
        XmlMapper mapper = new XmlMapper();
        String temp = mapper.writeValueAsString(laptopi);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(temp.getBytes());
        fos.close();
        return laptop;
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException {
        ArrayList<Laptop> rez;
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(file, new TypeReference<ArrayList<Laptop>>() {
        });
    }
}
