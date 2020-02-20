package oop.invest;

import oop.invest.Persona;

public class Visitante extends Persona {

    public Visitante(){
        super();
    }

    public Visitante(int id,String nombre,String edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public void identificarse() {
        System.out.println("Civil");
    }



}
