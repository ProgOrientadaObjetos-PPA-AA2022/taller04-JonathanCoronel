/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author JonathanCoronel
 */
public class Estudiante {

    private String nomEstudiante;
    private double calMateria1;
    private double calMateria2;
    private double calMateria3;
    private double promedio;

    public Estudiante(String nom) {
        nomEstudiante = nom;
    }

    public Estudiante(String nom, double cal1, double cal2, double cal3) {
        nomEstudiante = nom;
        calMateria1 = cal1;
        calMateria2 = cal2;
        calMateria3 = cal3;
    }

    public void establecerNomEstudiante(String n) {
        nomEstudiante = n;
    }

    public void establecerCalMateria1(double n) {
        calMateria1 = n;
    }

    public void establecerCalMateria2(double n) {
        calMateria2 = n;
    }

    public void establecerCalMateria3(double n) {
        calMateria3 = n;
    }

    public void calcularPromedio() {
        promedio = (calMateria1 + calMateria2 + calMateria3) / 3;
    }

    public String obtenerNomEstudiante() {
        return nomEstudiante;
    }

    public double obtenerCalMateria1() {
        return calMateria1;
    }

    public double obtenerCalMateria2() {
        return calMateria2;
    }

    public double obtenerCalMateria3() {
        return calMateria3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Estudiante\n"
                + "Nombre: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f\n\n",
                nomEstudiante,
                calMateria1,
                calMateria2,
                calMateria3,
                promedio);
        return cadena;
    }
}
