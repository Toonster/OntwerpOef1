import package1.ProgrammaManager;
import package1.Film;
import package1.Vertoning;

public class Demo_1 {
    public static void main(String[] args) {
        ProgrammaManager jos = new ProgrammaManager("Jos");
        Film indianaJones = new Film("Indiana Jones");
        Vertoning vertoningA = new Vertoning(indianaJones);
        Vertoning vertoningB = new Vertoning(indianaJones);
        jos.add(vertoningA);
        jos.add(vertoningB);
    }
}
