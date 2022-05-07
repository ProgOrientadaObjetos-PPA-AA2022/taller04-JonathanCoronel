/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author JonathanCoronel
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante est1 = new Estudiante("Pablo Escobar");
        est1.establecerCalMateria1(7);
        est1.establecerCalMateria2(8);
        est1.establecerCalMateria3(10);
        est1.calcularPromedio();
        Estudiante est2 = new Estudiante("Marco Jumbo", 9, 8, 6);
        est2.calcularPromedio();
        System.out.printf("%s\n", est1);
        System.out.printf("%s\n", est2);
    }

}
