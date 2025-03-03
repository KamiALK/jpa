package com.kamilo.hibernate.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIRECTION")
public class Direction {

  @Id
  @Column(name = "id_direcion")
  private Long id;
  @Column(name = "street")
  private String street;
  @Column(name = "city")
  private String city;
  @Column(name = "pais")
  private String pais;

  public Direction() {
  }

  public Direction(Long id, String street, String city, String pais) {
    this.id = id;
    this.street = street;
    this.city = city;
    this.pais = pais;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  @Override
  public String toString() {
    return "Direction{" +
        "id=" + id +
        ", street='" + street + '\'' +
        ", city='" + city + '\'' +
        ", pais='" + pais + '\'' +
        '}';
  }
}
