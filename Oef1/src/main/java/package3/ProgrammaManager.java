package package3;

import java.util.ArrayList;
import java.util.List;

public class ProgrammaManager extends Rol {
    List<Vertoning> beheerdeVertoningen;


    public ProgrammaManager(RolEigenaar rolEigenaar) {
        super(rolEigenaar);
        beheerdeVertoningen = new ArrayList<>();
    }

    public void add(Vertoning vertoning){
        this.beheerdeVertoningen.add(vertoning);
    }
}
