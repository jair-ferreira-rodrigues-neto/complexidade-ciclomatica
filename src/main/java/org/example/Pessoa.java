package org.example;

public class Pessoa implements IDadosCorporais {

    private String sexo;
    private float peso;
    private float altura;

    public String isSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!sexo.equals("Feminino") && !sexo.equals("Masculino")) {
            throw new IllegalArgumentException("Sexo inválido.");
        }
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida");
        }
        this.altura = altura;
    }

//    public String calcularIMC() {
//        double imc = peso / Math.pow(altura, 2);
//
//        if (sexo.equals(("Masculino"))) {
//            if (imc < 20.7f) {
//                return "Abaixo do peso";
//            } else if (imc < 26.4f) {
//                return "No peso normal";
//            } else if (imc < 27.8f) {
//                return "Marginalmente acima do peso";
//            } else if (imc < 31.1f) {
//                return "Acima do peso ideal";
//            } else {
//                return "Obeso";
//            }
//        } else {
//            if (imc < 19.1f) {
//                return "Abaixo do peso";
//            } else if (imc < 25.8f) {
//                return "No peso normal";
//            } else if (imc < 27.3f) {
//                return "Marginalmente acima do peso";
//            } else if (imc < 32.3f) {
//                return "Acima do peso ideal";
//            } else {
//                return "Obeso";
//            }
//        }
//    }
}