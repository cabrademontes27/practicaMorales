package Modelo;

public class Estudiante extends Usuarios {

    private String matricula;
    private String semestre;

    public Estudiante(String nombre, String correo, String matricula) {
        super(nombre, correo);
        this.matricula = matricula;
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
    @Override
    public String toString() {
        return super.toString() + ", Matricula: " + matricula + ", Semestre:" + semestre;
    }
}
