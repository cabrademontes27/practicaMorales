public class Estudiante extends Usuarios {

    private String matricula;
    private String semestra;

    public  Estudiante(String nombre, String corre)
    {

    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getSemestra() {
        return semestra;
    }

    public void setSemestra(String semestra) {
        this.semestra = semestra;
    }
}
