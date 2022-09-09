/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Manuel
 */
@Entity
public class Componente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String unidadDeMedida;
    private String cantidadDeAlerta;
    
    @OneToMany(mappedBy = "componente", cascade = CascadeType.ALL)
    private List<Producto> productos;
    
    @OneToMany(mappedBy = "componente", cascade = CascadeType.ALL)
    private List<Cantidad> cantidades;

    public Componente(String nombre, String unidadDeMedida, String cantidadDeAlerta) {
        this.nombre = nombre;
        this.unidadDeMedida = unidadDeMedida;
        this.cantidadDeAlerta = cantidadDeAlerta;
    }

    public Componente() {
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public String getCantidadDeAlerta() {
        return cantidadDeAlerta;
    }

    public void setCantidadDeAlerta(String cantidadDeAlerta) {
        this.cantidadDeAlerta = cantidadDeAlerta;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }

    public List<Cantidad> getCantidades() {
        return cantidades;
    }

    public void setCantidades(List<Cantidad> cantidades) {
        this.cantidades = cantidades;
    }
    
    public void addCantidad(Cantidad cantidad) {
        this.cantidades.add(cantidad);
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Componente)) {
            return false;
        }
        Componente other = (Componente) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Componente[ id=" + id + " ]";
    }
    
}
