import Modelo.Estudiante;
import Modelo.Maestro;

import static UI.UIMenu.*;


public class Main {
    public static void main(String[] args) {
        maestros.add(new Maestro("Luis morales", "luismorales04@uv.mx", 57522));
        maestros.add(new Maestro("Javier Pino", "jpino@uv.mx", 123));
        maestros.add(new Maestro("Magdiel Mercado", "mmamercado@uv.mx", 231));
        maestros.add(new Maestro("Patricia Martinez", "pmartinez@uv.mx", 321));

        estudiantes.add(new Estudiante("Ricardo Landa", "landa@uv.mx", "z120"));
        estudiantes.add(new Estudiante("Nava Alexis", "nava@uv.mx", "z121"));
        estudiantes.add(new Estudiante("Emilio Jasso", "jasso@uv.mx", "z122"));
        mostrarMenu();

    }
}

















/*
*  mostrarMenu();

        Modelo.Maestro maestro = new Modelo.Maestro("pepe", "duflin@gmail.com", "92410215456", 123456, "Ingeniero" );

        // Agregar tutorias
        maestro.addTutoriaDisponible(new Date(), "12:00");
        maestro.addTutoriaDisponible(new Date(), "14:00");
        maestro.addTutoriaDisponible(new Date(), "16:00");

        System.out.println(maestro);*/








//        IBoton boton = new IBoton() {
//            @Override
//            public void pulsar() {
//                System.out.println("Encendiendo...");
//            }
//        };
//
//        boton.pulsar();






//Listar tutorias
//        System.out.println(maestro.getNombre());
//        System.out.println("Cursos disponibles: ");
//        for(Modelo.Maestro.TutoriasDisponibles td : maestro.getTutoriasDisponibles()){
//            System.out.println(td.getFecha() + " " + td.getHora());
//        }

//        ClaseExterna ce = new ClaseExterna();
//        ce.metodoExtero();