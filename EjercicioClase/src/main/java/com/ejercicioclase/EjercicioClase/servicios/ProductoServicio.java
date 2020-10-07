package com.ejercicioclase.EjercicioClase.servicios;

import com.ejercicioclase.EjercicioClase.model.Producto;
import com.ejercicioclase.EjercicioClase.repo.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServicio extends
        ServicioBaseImpl<Producto, Long, ProductoRepository>{

    public List<Producto> todosLosProductosConElNombreEnMayusculas() {
        return this.findAll().stream()
                .map(p -> {
                    p.setNombre(p.getNombre().toUpperCase());
                    return p;
                }).collect(Collectors.toUnmodifiableList());
    }

   /* public List<Producto> tacharProducto() {
        return this.findAll().stream()
                .map(p -> {
                    if (p.isEnCarrito()) {
                        long id = 0;
                        id = p.getId();
                    }
                    return p;
                }).collect(Collectors.toUnmodifiableList());
    }
*/
}
