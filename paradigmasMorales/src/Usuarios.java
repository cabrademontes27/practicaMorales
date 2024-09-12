public class Usuarios {
    private String telefono;
    private String correo;
    private String nombre;

    public Usuarios(String nombre, String correo, String telefono)
    {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString()
    {
        return "Nombre: " + nombre + "Correo:  " + correo + "Telefono: " + telefono;
    }

}
