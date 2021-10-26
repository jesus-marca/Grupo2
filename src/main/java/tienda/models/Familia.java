package tienda.models;

import java.util.List;
import tienda.models.interfaces.IPedidoDetalle;


public class Familia {
    private String id;
    private String nombre;
    private String codigo;
    private String descripcion;
    private List<Categoria> categorias;

    public Familia() {}

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

    public List<Categoria> getCategorias() {
        return this.categorias;
    }


}