package oop.invest;

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

    public String getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(String ed) {
        this.edad = ed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public abstract void identificarse();

    public void stringtoString(){
        String name = this.getNombre();
        String age = this.getEdad();
        int ide = this.getId();

        System.out.println(name);
        System.out.println(age);
        System.out.println(ide);
    }
}

