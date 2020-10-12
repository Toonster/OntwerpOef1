import package3.*;

public class Demo_3 {
    public static void main(String[] args) {
        Gebruiker jos = new Gebruiker("Jos");
        jos.addRol(new ProgrammaManager(jos));
        Film indianaJones = new Film("Indiana Jones");
        Vertoning vertoningA = new Vertoning(indianaJones);
        Vertoning vertoningB = new Vertoning(indianaJones);
        ProgrammaManager rol =  (ProgrammaManager) jos.als(ProgrammaManager.class);
        rol.add(vertoningA);
        rol.add(vertoningB);
    }
}
