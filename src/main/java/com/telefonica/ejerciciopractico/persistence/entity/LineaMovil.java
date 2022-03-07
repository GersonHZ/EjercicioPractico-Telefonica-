package com.telefonica.ejerciciopractico.persistence.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lineamovil")
public class LineaMovil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private Integer ntelefono;
    @ManyToOne
    @JoinColumn(name = "idcliente", insertable = false, updatable = false)
    private Cliente cliente;
    private Integer estado;
    private Integer tipoplan;
    private Integer planpostpago;
    @OneToMany(mappedBy = "id")
    private List<Oferta> ofertasList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getNtelefono() {
        return ntelefono;
    }

    public void setNtelefono(Integer ntelefono) {
        this.ntelefono = ntelefono;
    }


    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }


    public Integer getTipoplan() {
        return tipoplan;
    }

    public void setTipoplan(Integer tipoplan) {
        this.tipoplan = tipoplan;
    }


    public Integer getPlanpostpago() {
        return planpostpago;
    }

    public void setPlanpostpago(Integer planpostpago) {
        this.planpostpago = planpostpago;
    }


    public List<Oferta> getofertasList() {
        return ofertasList;
    }

    public void setofertasList(List<Oferta> ofertasList) {
        this.ofertasList = ofertasList;
    }

}
