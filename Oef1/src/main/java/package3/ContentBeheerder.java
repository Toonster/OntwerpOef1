package package3;

import java.util.ArrayList;
import java.util.List;

public class ContentBeheerder extends Rol {
    List<Film> beheerdeFilms;

    public ContentBeheerder(RolEigenaar rolEigenaar) {
        super(rolEigenaar);
        beheerdeFilms = new ArrayList<>();
    }

    public void add(Film film){
        this.beheerdeFilms.add(film);
    }
}
