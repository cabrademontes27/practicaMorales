public class Usuarios {
    private String nombre;
    private String correo;
    private String telefono;

    public Usuarios(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Usuarios(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", correo: " + correo ;
    }
}