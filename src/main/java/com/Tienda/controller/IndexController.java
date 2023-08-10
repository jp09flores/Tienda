/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Tienda.controller;

import com.Tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jp09f
 */
@Controller
public class IndexController {
    
    @Autowired
    ProductoService productoService;
    
    @RequestMapping("/")
    public String page(Model model) {
       var listaProductos = productoService.getProductos(true);
       model.addAttribute("productos",listaProductos );
       return "index";
    }
    
}
