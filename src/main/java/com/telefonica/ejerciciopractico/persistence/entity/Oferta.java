package com.telefonica.ejerciciopractico.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "oferta")
public class Oferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String cdescripcion;
    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private LineaMovil linea;
    private java.sql.Date dinicio;
    private java.sql.Date dfin;
    private String bestado;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getCdescripcion() {
        return cdescripcion;
    }

    public void setCdescripcion(String cdescripcion) {
        this.cdescripcion = cdescripcion;
    }


    public LineaMovil getLinea() {
        return linea;
    }

    public void setLinea(LineaMovil linea) {
        this.linea = linea;
    }

    public java.sql.Date getDinicio() {
        return dinicio;
    }

    public void setDinicio(java.sql.Date dinicio) {
        this.dinicio = dinicio;
    }


    public java.sql.Date getDfin() {
        return dfin;
    }

    public void setDfin(java.sql.Date dfin) {
        this.dfin = dfin;
    }


    public String getBestado() {
        return bestado;
    }

    public void setBestado(String bestado) {
        this.bestado = bestado;
    }

}
