import package2.Film;
import package2.Gebruiker;
import package2.Vertoning;

public class Demo_2 {
    public static void main(String[] args) {
        Gebruiker jos = new Gebruiker("Jos");
        Film indianaJones = new Film("Indiana Jones");
        Vertoning vertoningA = new Vertoning(indianaJones);
        Vertoning vertoningB = new Vertoning(indianaJones);
        jos.addFilm(indianaJones);
        jos.addVertoning(vertoningA);
        jos.addVertoning(vertoningB);
    }
}
