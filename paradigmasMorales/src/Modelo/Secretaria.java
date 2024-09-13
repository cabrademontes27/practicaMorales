package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Secretaria extends Usuarios{
    private String area;
    private String turno;

    Secretaria(String nombre, String correo, String turno){
        super(nombre, correo);
        this.turno = turno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    ArrayList<Secretaria.TutoriaDisponible> tutoriasDisponibles = new ArrayList<>();

    public void addCussoDisponible(Date fecha, String hora) {
        tutoriasDisponibles.add(new Secretaria.TutoriaDisponible(fecha, hora));
    }

    public ArrayList<Secretaria.TutoriaDisponible> getCursosDisponibles() {
        return tutoriasDisponibles;
    }


    public static class TutoriaDisponible extends CitaTutoria {
        TutoriaDisponible(Date fecha, String hora) {
            super(fecha, hora);
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", Turno: " + turno ;
    }
}