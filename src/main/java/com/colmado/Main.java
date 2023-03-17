package com.colmado;

import com.colmado.controller.ClienteController;
import com.colmado.controller.productoController;
import com.colmado.model.Cliente;

public class Main {
    public static void main(String[] args) {

        ClienteController clienteController = new ClienteController();
        productoController productoCtr = new productoController();

    //Elegir si es un cliente o proveedor
        Cliente cliente = clienteController.registrarCliente();
        //Registrar proveedor

        if (clienteController.isClienteMature(cliente.getEdad())) {
            System.out.println(clienteController.darBienvenida(cliente.getNombre(), cliente.getApellido(), cliente.getEdad()) + " Eres mayor de edad");
        } else
            System.out.println(clienteController.darBienvenida(cliente.getNombre(), cliente.getApellido(), cliente.getEdad()) + " Eres menor de edad");

        //Comprar productos, mostrar lista de productos
    }
}