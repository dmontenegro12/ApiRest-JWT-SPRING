package com.apiRestJava.ApiRestJava.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Entity
@Table(name = "productos")
@ToString @EqualsAndHashCode
public class Productos {
    @Getter@Setter @Column(name = "id")
    @Id
    private Long id;
    @Getter@Setter @Column(name = "nProductos")
    private String nombreProducto;
    @Getter@Setter @Column(name = "tProductos")
    private String TipoProducto;
    @Getter@Setter @Column(name = "cProductos")
    private Date CaducidadProducto;
    @Getter@Setter @Column(name = "pProductos")
    private String precioProducto;
    @Getter@Setter @Column(name = "ppProductos")
    private String precioProduccionProducto;

}
