package com.telefonica.ejerciciopractico.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipodocumento")
public class Tipodocumento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idtipodoc")
  private long idtipodoc;
  private String cdescripcion;


  public long getIdtipodoc() {
    return idtipodoc;
  }

  public void setIdtipodoc(long idtipodoc) {
    this.idtipodoc = idtipodoc;
  }


  public String getCdescripcion() {
    return cdescripcion;
  }

  public void setCdescripcion(String cdescripcion) {
    this.cdescripcion = cdescripcion;
  }

}
