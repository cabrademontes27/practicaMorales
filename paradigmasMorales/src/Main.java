import  static  UI.Menu.*;

import java.util.Date;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       Maestro maestro = new Maestro("Morales");

       //agregar tutorias
        System.out.println(maestro.getNombre());
        maestro.addCursoDisponible(new Date(), "12:00");
        maestro.addCursoDisponible(new Date(), "14:00");
        maestro.addCursoDisponible(new Date(), "16:00");
        maestro.addCursoDisponible(new Date(), "18:00");
        //Listar tutorias
        System.out.println("Tutorias disponibles");
       for(Maestro.Tutorias td : maestro.getCursoDisponible())
       {
           System.out.println(td.getFecha() + " " + td.getHora());
       }

        Maestro maestro1 = new Maestro("MAG");

        //agregar tutorias
        System.out.println(maestro1.getNombre());
        maestro1.addCursoDisponible(new Date(), "10:00");
        maestro1.addCursoDisponible(new Date(), "09:00");
        maestro1.addCursoDisponible(new Date(), "08:00");
        maestro1.addCursoDisponible(new Date(), "07:00");
        //Listar tutorias
        System.out.println("Tutorias disponibles");
        for(Maestro.Tutorias td : maestro1.getCursoDisponible())
        {
            System.out.println(td.getFecha() + " " + td.getHora());
        }


        /*ClaseExterna cs = new ClaseExterna();
        cs.metodoExternos();
        */






    }





}