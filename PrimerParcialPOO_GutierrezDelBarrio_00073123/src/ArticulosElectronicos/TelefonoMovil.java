package ArticulosElectronicos;

public class TelefonoMovil extends ArticulosElectronicos implements Metodos {

    private String marca;
    private String almacenamiento;
    private String color;

    public TelefonoMovil() {

    }

    public TelefonoMovil(String marca, String almacenamiento, String color, String nombre, String modelo, String descripcion, float precio) {
        super(nombre, modelo, descripcion, precio);
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String ObtenerPrecio(float precio) {
        return "El precio es $" + ObtenerPrecio(precio);
    }

    @Override
    public String ObtenerDescripcion(String descripcion) {
        return "La descripcion del articulo es: " + ObtenerDescripcion(descripcion);
    }

    public String infoTelefono(){
        return "Nombre: " + getNombre() + "Modelo: " + getModelo() + "Descripcion: " + getDescripcion() + "Marca: " + getMarca() + "Almacenamiento: " + getAlmacenamiento();
    }

}
