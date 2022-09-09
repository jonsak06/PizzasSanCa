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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Manuel
 */
@Entity
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String imagen;
    private String marca;
    private String comentarios;
    private int precio;
    private int valoracion;
    
    @ManyToOne
    private Componente componente;
    
    @ManyToOne
    private Proveedor proveedor;
    
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Consume> consumes;

    public Producto() {
    }

    
    public Producto(String imagen, String marca, String comentarios, int precio, int valoracion, Componente componente, Proveedor proveedor) {
        this.imagen = imagen;
        this.marca = marca;
        this.comentarios = comentarios;
        this.precio = precio;
        this.valoracion = valoracion;
        this.componente = componente;
        this.proveedor = proveedor;
    }

    
    public Producto(String imagen, String marca, String comentarios, int precio, int valoracion) {
        this.imagen = imagen;
        this.marca = marca;
        this.comentarios = comentarios;
        this.precio = precio;
        this.valoracion = valoracion;
    }

    
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Consume> getConsumes() {
        return consumes;
    }

    public void setConsumes(List<Consume> consumes) {
        this.consumes = consumes;
    }
    
    public void addConsume(Consume consume) {
        this.consumes.add(consume);
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
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Producto[ id=" + id + " ]";
    }
    
}
