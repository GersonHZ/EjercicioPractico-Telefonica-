package com.telefonica.ejerciciopractico.persistence.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private Integer idcliente;
    private String cnombres;
    private String capellidos;
    private Integer idtipodoc;
    private String cdocumento;
    private Date dfecnac;
    @OneToMany(mappedBy = "id")
    private List<LineaMovil> lineas;
    private Integer idestado;


    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }


    public String getCnombres() {
        return cnombres;
    }

    public void setCnombres(String cnombres) {
        this.cnombres = cnombres;
    }


    public String getCapellidos() {
        return capellidos;
    }

    public void setCapellidos(String capellidos) {
        this.capellidos = capellidos;
    }


    public Integer getIdtipodoc() {
        return idtipodoc;
    }

    public void setIdtipodoc(Integer idtipodoc) {
        this.idtipodoc = idtipodoc;
    }


    public String getCdocumento() {
        return cdocumento;
    }

    public void setCdocumento(String cdocumento) {
        this.cdocumento = cdocumento;
    }


    public Date getDfecnac() {
        return dfecnac;
    }

    public void setDfecnac(java.sql.Date dfecnac) {
        this.dfecnac = dfecnac;
    }


    public List<LineaMovil> getIdlineas() {
        return lineas;
    }

    public void setIdlineas(List<LineaMovil> lineas) {
        this.lineas = lineas;
    }


    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }

}
