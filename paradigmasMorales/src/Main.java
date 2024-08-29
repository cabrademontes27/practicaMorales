public class Main {
    public static void main(String[] args) {

        Maestro maestro = new Maestro("German");
        maestro.nombre = "German";
        maestro.mostrarNombre();

        Calculador.Suma(14,16);
        System.out.println(Calculador.Pi);
        maestro.mostrarId();

        Maestro maestro2 = new Maestro("Dc nava");

        maestro2.mostrarNombre();

        Maestro.id++;

        maestro.mostrarId();




    }
}