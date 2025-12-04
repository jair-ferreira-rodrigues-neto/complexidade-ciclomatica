package org.example;

public class IndiceIfs {

    public String calcularIMC(IDadosCorporais dados) {
        double imc = dados.getPeso() / Math.pow(dados.getAltura(), 2);

        if (dados.isSexo().equals(("Masculino"))) {
            if (imc < 20.7f) {
                return "Abaixo do peso";
            } else if (imc < 26.4f) {
                return "No peso normal";
            } else if (imc < 27.8f) {
                return "Marginalmente acima do peso";
            } else if (imc < 31.1f) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else {
            if (imc < 19.1f) {
                return "Abaixo do peso";
            } else if (imc < 25.8f) {
                return "No peso normal";
            } else if (imc < 27.3f) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3f) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        }
    }
}
