package com.colmado.controller;

import com.colmado.model.Producto;

import java.util.List;
import java.util.Scanner;

public class productoController {

    public void mostrarProductos(List<Producto> productoList){
        System.out.println("Lista de productos:" );
    }

    public Producto registrarProducto(){

        Scanner sc = new Scanner(System.in);
        Producto producto = new Producto();

        System.out.println("*** Registrar Producto ***");

        System.out.print("Nombre del producto: ");
        producto.setNombre(sc.nextLine());
        System.out.print("Descripcion del producto: ");
        producto.setDescripcion(sc.nextLine());
        System.out.print("Precio del producto: ");
        producto.setPrecio(sc.nextInt());
        System.out.print("Cantidad del producto: ");
        producto.setStock(sc.nextInt());

        return producto;
    }
}
