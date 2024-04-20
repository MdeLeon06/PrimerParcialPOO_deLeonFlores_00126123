public class Informacion
{
    //Declaracion de variables
    private String Nombre;
    private String Modelo;
    private String Descripcion;
    private String Precio;

    //Constructores
    public Informacion (){} //Consatructor vacío
    public Informacion(String nombre, String modelo, String descripcion, String precio) {
        Nombre = nombre;
        Modelo = modelo;
        Descripcion = descripcion;
        Precio = precio;
    }

    //Getters and Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }
}
