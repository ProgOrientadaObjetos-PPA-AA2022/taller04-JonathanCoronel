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
        Cheque cheq1 = new Cheque("Jose Heredia", "Banco Pichincha");
        cheq1.establecerValorCheque(2500);
        cheq1.calcularComision();
        Cheque cheq2 = new Cheque("Pablo Hernandez", "Banco de Loja", 5000);
        cheq2.calcularComision();
        System.out.printf("%s\n", cheq1);
        System.out.printf("%s\n", cheq2);
    }

}
