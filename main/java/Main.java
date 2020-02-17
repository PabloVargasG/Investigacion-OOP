import java.util.ArrayList;

public class Main {
    public static ArrayList<Persona> personas = new ArrayList<Persona>();
    public static void main(String[] args) {

        Persona Pablo = new Visitante(117050903,"pablo","21");
        Persona Jorge = new Policia(117050903,"pablo","21","Sargento");

        personas.add(Pablo);
        personas.add(Jorge);

        for (Persona perso : personas) {
            perso.stringtoString();
        }

    }
}