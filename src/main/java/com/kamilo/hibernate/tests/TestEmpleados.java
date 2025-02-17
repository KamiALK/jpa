package com.kamilo.hibernate.tests;

import java.util.GregorianCalendar;
import java.util.List;

import com.kamilo.hibernate.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
// import jakarta.persistence.PersistenceUnit;

/* vamos 
 manager.persist() para crear un nuevo registro
 manager.merge() para modificar un registro
 manager.remove() para eliminar un registro
 manager.find() para buscar un registro
 manager.createQuery() para hacer consultas
 manager.getTransaction().commit() para confirmar la transacción
 manager.getTransaction().begin() para iniciar una transacción
 manager.close() para cerrar la conexión
 */
public class TestEmpleados {

  private static EntityManager manager;
  private static EntityManagerFactory emf;

  public static void main(String[] args) {
    /*
     * Creamos el objeto de persistencia
     */
    emf = Persistence.createEntityManagerFactory("persistencia");
    manager = emf.createEntityManager();

    List<Empleado> empleados = (List<Empleado>) manager.createQuery("from  Empleado").getResultList();
    System.out.println("En esta base de datos hay " + empleados.size() + " empleados");

    // creamos un empleados
    Empleado empleado = new Empleado(1L, "Kamilo", "Garcia", new GregorianCalendar(1979, 6, 28).getTime());

  }

}
