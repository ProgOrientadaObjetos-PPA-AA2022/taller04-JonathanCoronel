/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author JonathanCoronel
 */
public class Automovil {

    private String cedula;
    private String marca;
    private int anioFabricacion;
    private double valorVehivculo;
    private double valorMatricula;

    public Automovil(String ced, String mar) {
        cedula = ced;
        marca = mar;
    }

    public Automovil(String ced, String mar, int anio,double val) {
        cedula = ced;
        marca = mar;
        anioFabricacion = anio;
        valorVehivculo = val;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerAnioFabricacion(int n) {
        anioFabricacion = n;
    }

    public void establecerValorVehivculo(double n) {
        valorVehivculo = n;
    }

    public void calcularValorMatricula() {
        valorMatricula = (valorVehivculo * 0.002) / 100;
        valorMatricula = valorMatricula * (2022 - anioFabricacion);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValorVehivculo() {
        return valorVehivculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Auto\n"
                + "Cedula del Propietario: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de Fabricación: %d\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la Matricula: %.2f\n",
                cedula,
                marca,
                anioFabricacion,
                valorVehivculo,
                valorMatricula);
        return cadena;
    }

}
