import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuarios {
    // Atributos
    private  int numPersona;
    private String especialidad;




    //CONSTRUCTORES




    //GET AND SET


    public int getNumPersona() {
        return numPersona;
    }

    public void setNumPersona(int numPersona) {
        this.numPersona = numPersona;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //comportamientos / Metodos







    ArrayList<Tutorias> tutoriasDisponibles = new ArrayList<>();

    public void addCursoDisponible(Date fecha, String hora)
    {
        tutoriasDisponibles.add(new Tutorias(fecha, hora));
    }


    public ArrayList<Tutorias> getCursoDisponible()
    {
        return  tutoriasDisponibles;
    }


    public  static  class Tutorias
    {
        private int id;
        private Date fecha;
        private String hora;

        Tutorias(Date fecha, String hora )
        {
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }
    }


}