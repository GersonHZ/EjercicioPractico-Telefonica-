package com.telefonica.ejerciciopractico.persistence.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestado")
    private int idestado;
    private String cdescripcion;


    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }


    public String getCdescripcion() {
        return cdescripcion;
    }

    public void setCdescripcion(String cdescripcion) {
        this.cdescripcion = cdescripcion;
    }

}
