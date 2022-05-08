/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author JonathanCoronel
 */
public class Cheque {

    private String nomCliente;
    private String nomBanco;
    private double valorCheque;
    private double comision;

    public Cheque(String cliente, String banco) {
        nomCliente = cliente;
        nomBanco = banco;
    }

    public Cheque(String cliente, String banco, double valcheque) {
        nomCliente = cliente;
        nomBanco = banco;
        valorCheque = valcheque;
    }

    public void establecerNomCliente(String n) {
        nomCliente = n;
    }

    public void establecerNomBanco(String n) {
        nomBanco = n;
    }

    public void establecerValorCheque(double n) {
        valorCheque = n;
    }

    public void calcularComision() {
        comision = (valorCheque * 0.003) / 100;
    }

    public String obtenerNomCliente() {
        return nomCliente;
    }

    public String obtenerNomBanco() {
        return nomBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cheque\n"
                + "Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión: %.2f\n",
                nomCliente,
                nomBanco,
                valorCheque,
                comision);
        return cadena;
    }

}


