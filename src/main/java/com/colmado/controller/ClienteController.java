package com.colmado.controller;

import com.colmado.model.Cliente;

import java.util.Scanner;

public class ClienteController {

    public Cliente crearCliente(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.println("Apellido del cliente: ");
        String apellido = sc.nextLine();

        System.out.println("DNI del cliente: ");
        String dni = sc.nextLine();


        System.out.println("Edad del cliente: ");
        int edad = sc.nextInt();

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setEdad(edad);
        cliente.setDni(dni);

        return cliente;
    }
    public void darBienvenida(String nombre, String apellido){
        System.out.println("Bienvenido "+nombre+" "+apellido+".");
    }
}
