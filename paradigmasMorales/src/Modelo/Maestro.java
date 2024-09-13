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
    ArrayList<TutoriaDisponible> tutoriasDisponibles = new ArrayList<>();

    public void addCussoDisponible(Date fecha, String hora) {
        tutoriasDisponibles.add(new TutoriaDisponible(fecha, hora));
    }

    public ArrayList<TutoriaDisponible> getCursosDisponibles() {
        return tutoriasDisponibles;
    }


    public static class TutoriaDisponible extends CitaTutoria {
        TutoriaDisponible(Date fecha, String hora) {
            super(fecha, hora);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de personal: " + numPersonal +
                "\n" + "Los cursos disponibles son: \n"
                + tutoriasDisponibles.toString();
    }
}