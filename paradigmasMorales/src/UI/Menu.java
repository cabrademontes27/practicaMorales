package UI;

import java.util.Scanner;

public class Menu {

    public final  static String [] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};


    public static void mostrarMenu()
    {
        int respuesta;
        do
        {
            System.out.println("..:: Bienvenido ::..");
            System.out.println("Seleccione una opcion: ");
            System.out.println("1) Maestros");
            System.out.println("2) Estudiates");
            System.out.println("3) Salir");

            Scanner input = new Scanner(System.in);
            respuesta = input.nextInt();

            switch(respuesta)
            {
                case 1:
                    System.out.println("estas en el menu de maestros");;break;
                case 2:
                    System.out.println("estas en el menu de estudiates");
                    estudiantesMenu();break;
                case 3:
                    System.out.println("salir");
                    ;break;
                default:
                    System.out.println("seleccione una de las opciones"); break;
            }
        }
        while(respuesta != 3);

    }

    public  static  void estudiantesMenu()
    {
        int respuesta;

        do
        {
            System.out.println("..:: Estudiantes::..");
            System.out.println("1) Agendar tutoria");
            System.out.println("2) Mis tutorias");
            System.out.println("3) salir");
            Scanner input = new Scanner(System.in);
            respuesta = input.nextInt();

            switch(respuesta)
            {
                case 1:
                    System.out.println("..::Agendar tutorias::..");
                    for (int i = 0; i < 12; i++)
                    {
                        System.out.println(i + ": " + MESES[i]);
                    }
                    ;break;

                case 2:
                    System.out.println("..::Mis tutorias::..");break;
                case 3:
                    System.out.println("bye");break;
                default:
                    System.out.println("..::seleccione una de las opciones::.."); break;
            }
        }while(respuesta != 3);
    }
}
