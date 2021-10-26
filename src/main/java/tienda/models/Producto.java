package tienda.models;

import java.util.List;
import tienda.models.interfaces.IPedidoDetalle;


public class Producto {
    private Integer id;
    private String nombre;
    private String codigo;
    private Double precio;
    private String marca;
    private String descripcion;
    private Integer categoria_id; 

    public Pedido() {}

    public Integer getId() {
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

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setMarca(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCategoriaId() {
        return this.categoria_id;
    }

    public void setCategoria(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }

    public Categoria getCategoria(Integer id) {
        Categoria myCat = new Categoria;
        myCat.setId(id);
        return myCat.imprimirDatos();
    }

    // Método de impresión de datos
    public String imprimirDatosProducto() {
        StringBuffer salida = new StringBuffer();
        salida.append("ID: " + this.id);
        salida.append("\nNombre: " + this.nombre);
        salida.append("\nCodigo: " + this.codigo);
        salida.append("\nPrecio: S/." + this.precio);
        salida.append("\nMarca: " + this.marca);
        salida.append("\nDescripcion: " + this.marca);
        salida.append("\nCategoria: " this.getCategoria);

        return salida.toString();
    }


}