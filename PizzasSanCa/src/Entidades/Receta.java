/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Usuario
 */
@Entity
public class Receta implements Serializable {

    @OneToMany(mappedBy = "receta")
    private List<Tanda> tandas;
    private String nombre;
    
    @OneToMany(mappedBy = "receta")
    private List<Cantidad> cantidades;

    private boolean activo;

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addCantidad(Cantidad cantidad) {
        this.cantidades.add(cantidad);
    }

    public Receta() {}

    public Receta(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }

    public Receta(List<Tanda> tandas, String nombre, List<Cantidad> cantidades) {
        this.tandas = tandas;
        this.nombre = nombre;
        this.cantidades = cantidades;
        this.activo = true;
    }

    public List<Cantidad> getCantidades() {
        return cantidades;
    }

    public void setCantidades(List<Cantidad> cantidades) {
        this.cantidades = cantidades;
    }
    
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Tanda> getTandas() {
        return tandas;
    }

    public void setTandas(List<Tanda> tandas) {
        this.tandas = tandas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receta)) {
            return false;
        }
        Receta other = (Receta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
}
