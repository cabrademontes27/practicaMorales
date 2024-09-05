public class Maestro {


    // Atributos
    public static int ID = 1;
    public int id = 0;
    String nombre;
    String especialidad;



    public Maestro(String nombre)
    {
        id = ID++;
        this.nombre = nombre;
        System.out.println("yo me ejecute primero");
    }

    public Maestro(String nombre, String especialidad)
    {
        id = ID++;
        this.nombre = nombre;
        this.especialidad = especialidad;
        System.out.println("sobrecarga con 2 argumentos");
    }

    public void mostrarId()
    {
        System.out.println("ID: " + id);
    }

    //comportamientos / Metodos
    //verbo o sustantivo
    public void mostrarNombre()
    {
        System.out.println("Nombre: " + nombre);
    }

}