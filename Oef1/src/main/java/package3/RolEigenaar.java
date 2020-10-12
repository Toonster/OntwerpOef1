package package3;

import java.util.List;

public class RolEigenaar {
    List<Rol> rollen;

    public void addRol(Rol rol){
        if (rollen.stream().anyMatch(x -> x.equals(rol))){
            throw new IllegalArgumentException("Eigenaar heeft deze rol al");
        }
        this.rollen.add(rol);
    }

    public void verwijderRol(Rol rol){
        if (rollen.stream().noneMatch(x -> x.equals(rol))){
            throw new IllegalArgumentException("Eigenaar heeft deze rol niet");
        }
        this.rollen.remove(rol);
    }

    public Rol als(Class aClass){
        return rollen.stream().filter(x -> x.getClass() == aClass).findFirst().orElse(null);
    }
}
