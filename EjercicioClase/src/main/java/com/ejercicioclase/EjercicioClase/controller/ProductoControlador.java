package com.ejercicioclase.EjercicioClase.controller;

import com.ejercicioclase.EjercicioClase.model.Producto;
import com.ejercicioclase.EjercicioClase.servicios.ProductoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("lista",
                productoServicio.todosLosProductosConElNombreEnMayusculas());
        return "/index";
    }

    @GetMapping("/new")
    public String showFormNewProduct(Model model) {
        model.addAttribute("producto", new Producto());
        return "/formulario";
    }

    @PostMapping("/submit")
    public String submitNewProduct(
            @ModelAttribute("producto") Producto producto) {
        productoServicio.save(producto);
        return "redirect:/";
    }

   /* @PostMapping("/tachar")
    public String tacharProducto(Model model){
            model.addAttribute("lista", productoServicio.tacharProducto());

        return "redirect:/";
    }*/
}
