package com.colmado;

import com.colmado.controller.ClienteController;
import com.colmado.model.Cliente;

public class Main {
    public static void main(String[] args) {

        ClienteController clienteController = new ClienteController();

        Cliente cliente = clienteController.crearCliente();

        clienteController.darBienvenida(cliente.getNombre(), cliente.getApellido());


    }

}