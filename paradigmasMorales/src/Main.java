import  static  UI.Menu.*;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       Maestro maestro = new Maestro("pepe");
       Maestro maestro1 = new Maestro("mag","front");

        System.out.println(maestro.id + " " + maestro.nombre);
        System.out.println(maestro1.id + " " + maestro1.nombre);

    }





}