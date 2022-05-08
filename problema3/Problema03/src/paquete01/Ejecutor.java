/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author JonathanCoronel
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil aut1 = new Automovil("1101906202", "Toyota");
        aut1.establecerAnioFabricacion(2018);
        aut1.establecerValorVehivculo(25000);
        aut1.calcularValorMatricula();
        Automovil aut2 = new Automovil("1400882229", "Ferrari", 2017,140000);
        aut2.calcularValorMatricula();
        System.out.printf("%s\n", aut1);
        System.out.printf("%s\n", aut2);
    }

}
