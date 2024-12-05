package com.mycompany.ej_clase;

import javax.swing.JOptionPane;

public class EJ_clase {

    public static void main(String[] args) {
        // Inicializando variables
        double saldo = 0;
        
    }

    public static double Ingresos(double saldo) {
        int contador = 1;
        int num_ingresos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos ingresos desea hacer?"));
        for (int i = 0; i < num_ingresos; i++) {
            double ingreso = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el ingreso " + contador + ":"));
            saldo = saldo + ingreso;
            contador++;
        }
        return saldo;
    }

    public static double Gastos(double saldo) {
        int contador = 1;
        int num_gastos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos ingresos desea hacer?"));
        for (int i = 0; i < num_gastos; i++) {
            double gasto = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el gasto " + contador + ":"));
            saldo = saldo - gasto;
            contador++;
        }
        return saldo;        
    }


}
