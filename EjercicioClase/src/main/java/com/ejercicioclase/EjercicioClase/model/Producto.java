package com.ejercicioclase.EjercicioClase.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Producto {


    @Id
    @GeneratedValue
    private long id;

    private String nombre;
    private int cantidad;
    private String observaciones;
  //  private boolean enCarrito;
}