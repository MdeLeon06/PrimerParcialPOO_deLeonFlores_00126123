//Librería

public class ArticulosElectronicos extends Informacion {

    //Declaración de variables
    private String Marca;
    private String Anio;

    //Constructores
    //Constructor vacío
    public ArticulosElectronicos(String marca, String anio) {
        Marca = marca;
        Anio = anio;
    }

    public ArticulosElectronicos(String nombre, String modelo, String descripcion, String precio, String marca, String anio) {
        super(nombre, modelo, descripcion, precio);
        Marca = marca;
        Anio = anio;
    }

    //Setters and Getters
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String anio) {
        Anio = anio;
    }

    public void Datos() {
        System.out.println("------------------------------------------");
        System.out.println("             Ingreso de datos             ");
        System.out.println("Ingrese el nombre del producto a agregar: ");
        getNombre();
        System.out.println("Ingrese el nombre del modelo: ");
        getModelo();
        System.out.println("Ingrese descripción del producto: ");
        getDescripcion();
        System.out.println("Ingrese el precio del producto: ");
        getPrecio();
        System.out.println("Ingrese el nombre de la marca del producto: ");
        getMarca();
        System.out.println("Ingrese el año: ");
        getAnio();
        System.out.println("------------------------------------------");
    }

    public void Show()
    {
        System.out.println("---------------------------------------");
        System.out.println("         Información producto          ");
        System.out.println("Nombre: " + setNombre());
        System.out.println("Modelo: " + setModelo());
        System.out.println("Descripción: " + setDescripcion());
        System.out.println("Precio: " + setPrecio());
        System.out.println("Marca: " + setMarca());
        System.out.println("Año: " + setAnio());
        System.out.println("---------------------------------------");
    }

}