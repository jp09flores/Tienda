/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Tienda.controller;

import com.Tienda.domain.Categoria;
import com.Tienda.service.CategoriaService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jp09f
 */
@Controller
@RequestMapping("/categoria")
@Slf4j
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriasService;
    
    @RequestMapping("/listado")
    public String page(Model model) {
       log.info("Consumo del recurso /categoria/listado");
       List<Categoria> categorias = categoriasService.getCategorias(false);
       model.addAttribute("categorias", categorias);
       model.addAttribute("totalCategorias", categorias.size());
       
       return "/categoria/listado";
    }
    
}
