import org.junit.Test;
import oop.invest.Persona;
import oop.invest.Policia;
import oop.invest.Visitante;

import java.util.ArrayList;


public class MarcadorJunitTest {

    /**
     * Test
     */
    @Test
    public void testAdd() {
        ArrayList<Persona> personas = new ArrayList<Persona>();


        Persona Pablo = new Visitante(117050903, "pablo", "21");
        Persona Jorge = new Policia(117050903, "Jorge", "35", "Sargento");

        personas.add(Pablo);
        personas.add(Jorge);

        for (Persona perso : personas) {
            perso.identificarse();
            perso.stringtoString();
        }

    }
}
