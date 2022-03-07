package com.telefonica.ejerciciopractico.persistence.entity;


import javax.persistence.*;

@Entity
@Table(name = "tipoplan")
public class Tipoplan {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idtipoplan")
  private long idtipoplan;
  private String cdescripcion;


  public long getIdtipoplan() {
    return idtipoplan;
  }

  public void setIdtipoplan(long idtipoplan) {
    this.idtipoplan = idtipoplan;
  }


  public String getCdescripcion() {
    return cdescripcion;
  }

  public void setCdescripcion(String cdescripcion) {
    this.cdescripcion = cdescripcion;
  }

}
