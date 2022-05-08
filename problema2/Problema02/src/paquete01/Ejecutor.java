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
        Profesor prof1 = new Profesor("Mario", "Pinos");
        prof1.establecerSueldoBasico(1000);
        prof1.calcularSueldoTotal();
        prof1.establecerCedula("1109763548");
        Profesor prof2 = new Profesor("Oliver", "Coronel", 1500, "1100882229");
        prof2.calcularSueldoTotal();
        System.out.printf("%s\n", prof1);
        System.out.printf("%s\n", prof2);
    }

}
