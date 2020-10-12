package package1;

import java.util.ArrayList;
import java.util.List;

public class ProgrammaManager extends Gebruiker {
    List<Vertoning> beheerdeVertoningen;


    public ProgrammaManager(String naam) {
        super(naam);
        beheerdeVertoningen = new ArrayList<>();
    }

    public void add(Vertoning vertoning){
        this.beheerdeVertoningen.add(vertoning);
    }
}
