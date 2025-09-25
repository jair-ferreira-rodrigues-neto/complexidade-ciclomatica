package org.example;

public class CalculadoraIMC {
    public static String calcularIMC(double peso, double altura, boolean sexo) {
        double imc = peso / Math.pow(altura, 2);

        if (sexo) {
            if (imc < 20.7) {
                return "Abaixo do peso";
            } else if (imc < 26.4) {
                return "No peso normal";
            } else if (imc < 27.8) {
                return "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else {
            if (imc < 19.1) {
                return "Abaixo do peso";
            } else if (imc < 25.8) {
                return "No peso normal";
            } else if (imc < 27.3) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        }
    }
}