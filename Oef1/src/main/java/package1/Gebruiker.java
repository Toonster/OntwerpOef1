package package1;

import java.util.ArrayList;
import java.util.List;

public class Gebruiker {
    String naam;
    List<Vertoning> beheerdeVertoningen;
    List<Film> beheerdeFilms;

    public Gebruiker(String naam) {
        this.naam = naam;
        beheerdeFilms = new ArrayList<>();
        beheerdeVertoningen = new ArrayList<>();
    }
}
