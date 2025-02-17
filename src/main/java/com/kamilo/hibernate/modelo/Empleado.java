package com.kamilo.hibernate.modelo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * 1.Reconocemos como entidad al agregar @Entity
 * 2. Indicarle como se debe guardar el la base de datos @Table
 * 3. Indicarle las columnas que tiene la tabla @Column
 * columnDefinition = "VARCHAR(100)" se puede agregar para definir el tipo de dato
 * insertable = false, updatable = false` se puede agregar para que no se pueda insertar ni actualizar
 * length = 100 se puede agregar para definir la longitud
 * nullable = false se puede agregar para que no se pueda insertar nulo
 * precision = 10, scale = 2 se puede agregar para definir la precision y la escala
 * scale = 2 se puede agregar para definir la escala
 * table = "EMPLEADO" se puede agregar para definir la tabla
 * unique = true se puede agregar para definir que el campo es unico
 * updatable = false se puede agregar para que no se pueda actualizar
 * Todas las columnas deben tener un identificador
 *
 * 
 */
@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  // para generar el id automaticamente
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CODIGO_EMPLEADO")
  private Long codigo;
  @Column(name = "NOMBRE")
  private String nombre;
  @Column(name = "APELLIDO")
  private String apellido;
  @Column(name = "FECHA_NACIMIENTO")
  private Date fechaNacimiento;

  // primero creamos un constructor vacio
  public Empleado() {
  }

  public Empleado(Long codigo, String nombre, String apellido, Date fechaNacimiento) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
  }

  public Long getCodigo() {
    return codigo;
  }

  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  // esta funcion convierte el objeto en un string en lugar de ser del tipo objeto
  @Override
  public String toString() {
    return "Empleado{" +
        "codigo=" + codigo +
        ", nombre='" + nombre + '\'' +
        ", apellido='" + apellido + '\'' +
        ", fechaNacimiento=" + fechaNacimiento +
        '}';
  }
}
