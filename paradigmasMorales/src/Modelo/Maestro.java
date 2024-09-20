package Modelo;

import java.util.ArrayList;
import java.util.Date;


public class Maestro extends Usuarios{
    //Atributos
    private  int numPersonal;
    private String especialidad;

    //Contructor
    public Maestro(String nombre, String correo, int numPersonal) {
        super(nombre, correo);
        this.numPersonal = numPersonal;
    }

    // set and get
    public int getNumPersonal() {
        return numPersonal;
    }

    public void setNumPersonal(int numPersonal) {
        this.numPersonal = numPersonal;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    //comportamientos / metodos
    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public void addTutoriaDisponible(String fecha, String hora){
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }


    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    //CLASE ANIDADA
    public static class TutoriasDisponibles extends CitaTutoria{

        public TutoriasDisponibles(String fecha, String hora){
            super(fecha, hora);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de personal: " + this.getNumPersonal() + ", Especialidad: " + this.getEspecialidad() + "\nTutorias disponibles: " + tutoriasDisponibles.toString();
    }
}