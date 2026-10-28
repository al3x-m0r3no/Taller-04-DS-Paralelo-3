/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller04grupo5dspar3.modelo;


// Clase base Usuario
public abstract class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;

    protected boolean login() {
        return true;
    }

    protected boolean logout() {
        return true;
    }
}

