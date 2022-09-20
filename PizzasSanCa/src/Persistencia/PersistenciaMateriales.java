/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;


import Entidades.Cantidad;
import Entidades.Componente;
import Entidades.Producto;
import Entidades.Proveedor;
import Entidades.Receta;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class PersistenciaMateriales {

    private PersistenciaMateriales() {
    }

    
   public static PersistenciaMateriales getInstance() {
        return PersistenciaMaterialesHolder.INSTANCE;
    }

    private static class PersistenciaMaterialesHolder {

        private static final PersistenciaMateriales INSTANCE = new PersistenciaMateriales();
        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("PizzasSanCaPU");
        private static final EntityManager em = emf.createEntityManager();

    }

    public EntityManager getEntity() {
        return PersistenciaMaterialesHolder.em;
    }

    public void persist(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    public void refresh(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.refresh(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    public void merge(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    public void delete(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    public List<Componente> listaComponentes() {
        EntityManager em = getEntity();
        List<Componente> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM Componente", Componente.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    
    public List<Proveedor> listaProveedores() {
        EntityManager em = getEntity();
        List<Proveedor> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM Proveedor", Proveedor.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    
    public List<Receta> listaRecetas() {
        EntityManager em = getEntity();
        List<Receta> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM Receta", Receta.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    
    public List<Producto> listaProductos() {
        EntityManager em = getEntity();
        List<Producto> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM Producto", Producto.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    
    public List<Cantidad> listaCantidades(long idReceta) {
        EntityManager em = getEntity();
        List<Cantidad> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM Cantidad where receta_id = "+ idReceta+ "", Cantidad.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    
public byte[] convertirImagen(String path) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedImage img = ImageIO.read(new File(path));
        ImageIO.write(img, "png", baos);
        baos.flush();

        String base64String = Base64.encode(baos.toByteArray());
        baos.close();

        return Base64.decode(base64String);
    }
}

