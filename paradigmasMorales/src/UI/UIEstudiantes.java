package UI;
import java.util.Scanner;
public class UIEstudiantes {
    public final static String [] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void estudianteMenu(){
        int respuesta;
        do {
            System.out.println("..:: Estudiantes ::..");
            System.out.println("1. Agendar tutoría");
            System.out.println("2. Mis tutorias");
            System.out.println("0. Cancelar");

            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();

            switch (respuesta){
                case 1:
                    agendarTutoria();
                    break;
                case 2:
                    listarTutorias();
                    break;
                case 0:
                    System.out.println("..:: Bye ::..");
                    break;
                default:
                    System.out.println("Por favor seleccione otra respuesta");
                    break;
            }
        }while (respuesta !=0);
    }

    private static void agendarTutoria()
    {
        
    }
    private static void listarTutorias()
    {

    }
}
