package com.colmado.controller;

import com.colmado.model.Cliente;

import java.util.Scanner;

public class ClienteController {

    public Cliente registrarCliente() {

        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("***Registro de cliente***");

        System.out.println("Nombre: ");
        cliente.setNombre(sc.nextLine());
        System.out.println("Apellido: ");
        cliente.setApellido(sc.nextLine());
        System.out.println("Documento de identidad: ");
        cliente.setDni(sc.nextLine());
        System.out.println("Telefono: ");
        cliente.setTelefono(sc.nextLine());
        System.out.println("Edad: ");
        cliente.setEdad(sc.nextInt());

        return cliente;
    }

    public void eliminarCliente(Cliente cliente) {
        //Aqui estaria el metodo que elimina clientes.
    }

    public String darBienvenida(String nombre, String apellido, int edad) {
        String saludo = "Bienvenido " + nombre + " " + apellido + ","+" tienes "+edad+" años.";

    return saludo;}

    public boolean isClienteMature(int edad) {

        if (edad >= 18) {
            return true;
        }
        return false;
    }
}
