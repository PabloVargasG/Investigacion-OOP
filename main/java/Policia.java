public class Policia extends Persona{
    protected String Rango;
    public Policia(){
        super();
        this.Rango = "";

    }
    public Policia(int id,String nombre,String edad,String Rango){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.Rango = Rango;
    }

    @Override
    public void identificarse() {
        System.out.println("Oficial de Policia");
    }

}
