package tienda.models;

import java.util.List;
import tienda.models.interfaces.IPedidoDetalle;


public class Categoria {
    private String id;
    private String nombre;
    private String codigo;
    private String descripcion;
    private List<Producto> productos; 

    public Categoria() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void getCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    // Método de impresión de datos
    public String imprimirDatos() {
        StringBuffer salida = new StringBuffer();
        salida.append("ID: " + this.id);
        salida.append("\nNombre: " + this.nombre);
        salida.append("\nCodigo: " + this.codigo);
        salida.append("\nDescripcion: " + this.marca);

        return salida.toString();
    }

}