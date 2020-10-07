package com.ejercicioclase.EjercicioClase.repo;

import com.ejercicioclase.EjercicioClase.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
