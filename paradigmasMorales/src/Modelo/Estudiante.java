package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Usuarios {

    private String matricula;
    private String semestre;
    ArrayList<CitaMaestro> tutoriasAgendadas = new ArrayList<>();

    public Estudiante(String nombre, String correo, String matricula) {
        super(nombre, correo);
        this.matricula = matricula;
    }

    public ArrayList<CitaMaestro> getTutoriasAgendadas() {
        return tutoriasAgendadas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void addTutoriaMaestro(Maestro maestro, Date fecha, String hora){
        CitaMaestro citaMaestro = new CitaMaestro(maestro, this);
        citaMaestro.agendar(fecha, hora);
        tutoriasAgendadas.add(citaMaestro);
    }
    @Override
    public String toString() {
        return super.toString() + ", Matricula: " + matricula + ", Semestre:" + semestre;
    }
}
