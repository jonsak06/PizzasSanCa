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
    private Long id;
    private byte[] imagen;
    private String imagen2;
    private String marca;
    private String comentarios;
    private int precio;
    private int valoracion;
    private float cantidad;
    
    @ManyToOne
    private Componente componente;
    
    @ManyToOne
    private Proveedor proveedor;
    private boolean activo;

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Consume> consumes;

    public Producto() {}

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getCantidad() {
        return cantidad;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public Producto(byte[] imagen, String marca, String comentarios, int precio, int valoracion, float cantidad) {
      
        this.imagen = imagen;
        this.marca = marca;
        this.comentarios = comentarios;
        this.precio = precio;
        this.valoracion = valoracion;
        this.cantidad = cantidad;
        this.activo = true;
    }

    
    

    
    public Producto(byte[] imagen, String marca, String comentarios, int precio, int valoracion) {
        this.imagen = imagen;
        this.marca = marca;
        this.comentarios = comentarios;
        this.precio = precio;
        this.valoracion = valoracion;
        this.activo = true;
    }

    
    
    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
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
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Producto[ id=" + id + " ]";
    }
    
}
