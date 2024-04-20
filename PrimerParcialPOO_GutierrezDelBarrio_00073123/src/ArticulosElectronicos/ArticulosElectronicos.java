package ArticulosElectronicos;

public abstract class ArticulosElectronicos {

    private String nombre;
    private String modelo;
    private String descripcion;
    private float precio;

    public ArticulosElectronicos(){

    }

    public ArticulosElectronicos(String nombre, String modelo, String descripcion, float precio){
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public String getModelo(){
        return modelo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public float getPrecio(){
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }



}
