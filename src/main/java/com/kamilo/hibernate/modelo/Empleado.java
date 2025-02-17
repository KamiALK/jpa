package com.kamilo.hibernate.modelo;

import java.util.Date;

public class Empleado {

  private Long codigo;
  private String nombre;
  private String apellido;
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
}
