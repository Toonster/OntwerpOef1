package package1;

import java.util.ArrayList;
import java.util.List;

public class ContentBeheerder extends Gebruiker {
    List<Film> beheerdeFilms;

    public ContentBeheerder(String naam) {
        super(naam);
        beheerdeFilms = new ArrayList<>();
    }

    public void add(Film film){
        this.beheerdeFilms.add(film);
    }
}
