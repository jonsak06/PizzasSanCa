/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Manuel
 */
@Entity
public class Consume implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int cantidad;
    
    @ManyToOne
    private Producto producto;
    
    @ManyToOne
    private Tanda tanda;

    public Consume() {
    }

    public Consume(int cantidad, Producto producto, Tanda tanda) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.tanda = tanda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Tanda getTanda() {
        return tanda;
    }

    public void setTanda(Tanda tanda) {
        this.tanda = tanda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Long) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consume)) {
            return false;
        }
        Consume other = (Consume) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
  

    @Override
    public String toString() {
        return "Entidades.Consume[ id=" + id + " ]";
    }
    
}
