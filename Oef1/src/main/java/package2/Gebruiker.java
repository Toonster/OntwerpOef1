package package2;

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

    public void addVertoning(Vertoning vertoning){
        this.beheerdeVertoningen.add(vertoning);
    }

    public void addFilm(Film film){
        this.beheerdeFilms.add(film);
    }
}
