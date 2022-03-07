package com.telefonica.ejerciciopractico.persistence.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "planespostpago")
public class PlanesPostpago {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idplan")
  private int idplan;
  private String cdescripcion;
  private String bestado;


  public int getIdplan() {
    return idplan;
  }

  public void setIdplan(int idplan) {
    this.idplan = idplan;
  }


  public String getCdescripcion() {
    return cdescripcion;
  }

  public void setCdescripcion(String cdescripcion) {
    this.cdescripcion = cdescripcion;
  }


  public String getBestado() {
    return bestado;
  }

  public void setBestado(String bestado) {
    this.bestado = bestado;
  }

}
