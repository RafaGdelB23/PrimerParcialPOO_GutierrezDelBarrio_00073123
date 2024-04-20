package ArticulosElectronicos;

public class Laptop extends ArticulosElectronicos implements Metodos{

    private String marca;

    private String color;
    private String tamaño;

    public Laptop(){

    }

    public Laptop(String nombre, String modelo, String descripcion, float precio, String marca, String color, String tamaño) {
        super(nombre, modelo, descripcion, precio);
        this.marca = marca;
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }



    @Override
    public String ObtenerPrecio(float precio) {
        return "El precio es $" + ObtenerPrecio(precio);
    }

    @Override
    public String ObtenerDescripcion(String descripcion) {
        return "La descripcion del articulo es: " + ObtenerDescripcion(descripcion);
    }
}
