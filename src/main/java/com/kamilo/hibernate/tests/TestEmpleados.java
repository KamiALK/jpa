
package com.kamilo.hibernate.tests;

import java.util.GregorianCalendar;
import java.util.List;

import com.kamilo.hibernate.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestEmpleados {

  private static EntityManager manager;
  private static EntityManagerFactory emf;

  public static void insertInitial() {

    // Creamos un empleado
    Empleado empleado = new Empleado(1L, "Kamilo", "Garcia", new GregorianCalendar(1979, 6, 28).getTime());

    // Iniciar transacción
    try {
      manager.getTransaction().begin();
      manager.persist(empleado);
      manager.getTransaction().commit();

      // Imprimir el empleado ingresado
      System.out.println("Empleado agregado: " + empleado.toString());

    } catch (Exception e) {
      manager.getTransaction().rollback();
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    /*
     * Creamos el objeto de persistencia
     */
    emf = Persistence.createEntityManagerFactory("persistencia");
    manager = emf.createEntityManager();

    List<Empleado> empleados = (List<Empleado>) manager.createQuery("from Empleado").getResultList();
    System.out.println("En esta base de datos hay " + empleados.size() + " empleados");

    insertInitial();

    // Imprimir todos los empleados en la base de datos después de la inserción
    imprimirEmpleados();
    manager.close();
  }

  private static void imprimirEmpleados() {
    List<Empleado> empleados = (List<Empleado>) manager.createQuery("from Empleado").getResultList();
    System.out.println("En esta base de datos hay " + empleados.size() + " empleados");
    for (Empleado empleado : empleados) {
      System.out.println(empleado.toString());
    }
  }
}
