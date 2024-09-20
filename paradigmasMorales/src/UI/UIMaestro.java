package UI;
import java.util.Scanner;

import static UI.UIMenu.maestroLogeado;
import static UI.UIMenu.mostrarMenu;


public class UIMaestro {
    public static void maestroMenu() {
        System.out.println("..:: Maestro ::..");
        System.out.println("Seleccione una opción");
        System.out.println("1. Agregar tutorias");
        System.out.println("2. Listar mis tutorias");
        System.out.println("3. Salir");

        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            respuesta = Integer.parseInt(sc.nextLine());
            switch (respuesta) {
                case 1:
                    agregarTutoria(); // aqui esta mallll es addTUtoria(); no asi pero es funcion
                    break;
                case 2:
                    listarCursos();
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
    public static void agregarTutoria(){
        boolean banderaExterna = true;
        do
        {
            System.out.println("ingresa la fecha del curos");
            Scanner sc = new Scanner(System.in);
            String fecha = sc.nextLine();
            System.out.println("ingresa la hora del curso");
            String hora = sc.nextLine();

            boolean banderaInterna = true;
            do
            {
                System.out.println("La fecha es: " + fecha + " " + "Y la hora es: " + hora);
                System.out.print("1)Para agregar Tutoria \n2)Para cambiar");
                int respuesta = sc.nextInt();
                if(respuesta == 2)
                {
                    banderaInterna = false;
                } else if (respuesta == 1) {
                    banderaExterna = false;
                    banderaInterna = false;
                    maestroLogeado.addTutoriaDisponible(fecha, hora);
                    System.out.println("Tutoria agregada");
                }else
                {
                    System.out.println("Opcion no valida");
                }
            }while(banderaInterna);
        }
        while(banderaExterna);

        System.out.println("agregado :D");
    }
    public static void listarCursos(){
        System.out.println("..:: Lista de tutorias ::..");
        if(maestroLogeado.getTutoriasDisponibles().size() == 0)
        {
            System.out.println("No hay tutorias\n");
        }else
        {
            int j = 1;
            for(int i = 0; i < maestroLogeado.getTutoriasDisponibles().size(); i++)
            {
                System.out.println(j + " " + maestroLogeado.getTutoriasDisponibles().get(i).getFecha() + " " + maestroLogeado.getTutoriasDisponibles().get(i).getHora());
                j++;
            }
        }
    }
}