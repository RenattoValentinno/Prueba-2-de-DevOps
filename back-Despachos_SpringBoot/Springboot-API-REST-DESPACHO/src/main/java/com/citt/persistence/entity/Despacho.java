package com.citt.persistence.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Table(name = "despachos")
@Entity
public class Despacho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_despacho")
    private Long idDespacho;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_despacho")
    private LocalDate fechaDespacho;

    @Column(name = "patente_camion")
    private String patenteCamion;

    @Column(name = "intento")
    private int intento;

    @Column(name = "id_compra")
    private Long idCompra;

    @Column(name = "direccion_compra")
    private String direccionCompra;

    @Column(name = "valor_compra")
    private Long valorCompra;

    @Column(name = "despachado")
    private boolean despachado = false;




    // Constructor vacío
    public Despacho() {
    }

    // Constructor completo
    public Despacho(Long idDespacho, LocalDate fechaDespacho, String patenteCamion,
                    int intento, Long idCompra, String direccionCompra,
                    Long valorCompra, boolean despachado) {
        this.idDespacho = idDespacho;
        this.fechaDespacho = fechaDespacho;
        this.patenteCamion = patenteCamion;
        this.intento = intento;
        this.idCompra = idCompra;
        this.direccionCompra = direccionCompra;
        this.valorCompra = valorCompra;
        this.despachado = despachado;
    }

    public Long getIdDespacho() {
        return idDespacho;
    }

    public void setIdDespacho(Long idDespacho) {
        this.idDespacho = idDespacho;
    }

    public LocalDate getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(LocalDate fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public String getPatenteCamion() {
        return patenteCamion;
    }

    public void setPatenteCamion(String patenteCamion) {
        this.patenteCamion = patenteCamion;
    }

    public int getIntento() {
        return intento;
    }

    public void setIntento(int intento) {
        this.intento = intento;
    }

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public String getDireccionCompra() {
        return direccionCompra;
    }

    public void setDireccionCompra(String direccionCompra) {
        this.direccionCompra = direccionCompra;
    }

    public Long getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Long valorCompra) {
        this.valorCompra = valorCompra;
    }

    public boolean isDespachado() {
        return despachado;
    }

    public void setDespachado(boolean despachado) {
        this.despachado = despachado;
    }
}