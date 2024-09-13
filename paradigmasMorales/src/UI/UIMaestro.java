package UI;
import java.util.Scanner;
import static UI.UIMenu.mostrarMenu;

public class UIMaestro {
    public static void maestroMenu() {
        System.out.println("..:: Maestro ::..");
        System.out.println("Seleccione una opción");
        System.out.println("1. Agregar curso");
        System.out.println("2. Listar mis cursos");
        System.out.println("3. Salir");

        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            respuesta = Integer.parseInt(sc.nextLine());
            switch (respuesta) {
                case 1:
                    System.out.println("Ingrese un nombre del curso");
                    break;
                case 2:
                    System.out.println("Listar mis cursos");
                    break;
                case 3:
                    mostrarMenu();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (respuesta != 3);

    }
    public void agregarTutoria(){
        System.out.println("Agregar Tutoria");
        System.out.println("ingresa la fecha del curos");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        System.out.println("ingresa la hora del curso");
        String hora = sc.nextLine();
    }
    public void listarCursos(){

    }
}