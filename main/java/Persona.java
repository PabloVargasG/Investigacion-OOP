public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String edad;


    Persona(){
        id =0;
        nombre ="";
        edad = "";
    }
    Persona(int i, String n, String e){
        id = i;
        nombre = n;
        edad = e;
    }

}

