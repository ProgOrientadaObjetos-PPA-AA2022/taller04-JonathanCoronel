/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author JonathanCoronel
 */
public class Profesor {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Profesor(String nom, String ape) {
        nombre = nom;
        apellido = ape;
    }

    public Profesor(String nom, String ape, double suel, String ced) {
        nombre = nom;
        apellido = ape;
        sueldoBasico = suel;
        cedula = ced;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public void establecerSueldoBasico(double n) {
        sueldoBasico = n;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = (sueldoBasico * 20) / 100;
        sueldoTotal = sueldoBasico + sueldoTotal;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Profesor\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico 1: %.2f\n"
                + "Sueldo Total 2: %.2f\n"
                + "Cedula: %s\n",
                nombre,
                apellido,
                sueldoBasico,
                sueldoTotal,
                cedula);
        return cadena;
    }

}
