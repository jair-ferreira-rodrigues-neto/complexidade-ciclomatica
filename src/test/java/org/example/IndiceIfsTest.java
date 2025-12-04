package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class IndiceIfsTest {

    IndiceIfs indiceIfs;
    final float ALTURA_TESTE = 1.0f;

    @BeforeEach
    void setUp() {
        indiceIfs = new IndiceIfs();
    }

    private IDadosCorporais configurarMock(String sexo, float peso) {
        IDadosCorporais dadosMock = createMock(IDadosCorporais.class);

        expect(dadosMock.getAltura()).andReturn(ALTURA_TESTE).times(1);
        expect(dadosMock.getPeso()).andReturn(peso).times(1);
        expect(dadosMock.isSexo()).andReturn(sexo).times(1);

        replay(dadosMock);
        return dadosMock;
    }

    @Test
    void deveRetornarMasculinoAbaixoPeso() {
        IDadosCorporais dadosMock = configurarMock("Masculino", 20.6f);
        assertEquals("Abaixo do peso", indiceIfs.calcularIMC(dadosMock));
        verify(dadosMock);
    }

    @Test
    void deveRetornarMasculinoPesoNormal() {
        IDadosCorporais dadosMock = configurarMock("Masculino", 26.3f);
        assertEquals("No peso normal", indiceIfs.calcularIMC(dadosMock));
        verify(dadosMock);
    }

    @Test
    void deveRetornarMasculinoMarginalmenteAcimaPeso() {
        IDadosCorporais dadosMock = configurarMock("Masculino", 27.7f);
        assertEquals("Marginalmente acima do peso", indiceIfs.calcularIMC(dadosMock));
        verify(dadosMock);
    }

    @Test
    void deveRetornarMasculinoAcimaPesoIdeal() {
        IDadosCorporais dadosMock = configurarMock("Masculino", 31.0f);
        assertEquals("Acima do peso ideal", indiceIfs.calcularIMC(dadosMock));
        verify(dadosMock);
    }

    @Test
    void deveRetornarMasculinoObeso() {
        IDadosCorporais dadosMock = configurarMock("Masculino", 31.1f);
        assertEquals("Obeso", indiceIfs.calcularIMC(dadosMock));
        verify(dadosMock);
    }

    @Test
    void deveRetornarFemininoAbaixoPeso() {
        IDadosCorporais dadosMock = configurarMock("Feminino", 19.0f);
        assertEquals("Abaixo do peso", indiceIfs.calcularIMC(dadosMock));
        verify(dadosMock);
    }

    @Test
    void deveRetornarFemininoPesoNormal() {
        IDadosCorporais dadosMock = configurarMock("Feminino", 25.7f);
        assertEquals("No peso normal", indiceIfs.calcularIMC(dadosMock));
        verify(dadosMock);
    }

    @Test
    void deveRetornarFemininoMarginalmenteAcimaPeso() {
        IDadosCorporais dadosMock = configurarMock("Feminino", 27.2f);
        assertEquals("Marginalmente acima do peso", indiceIfs.calcularIMC(dadosMock));
        verify(dadosMock);
    }

    @Test
    void deveRetornarFemininoAcimaPesoIdeal() {
        IDadosCorporais dadosMock = configurarMock("Feminino", 32.2f);
        assertEquals("Acima do peso ideal", indiceIfs.calcularIMC(dadosMock));
        verify(dadosMock);
    }

    @Test
    void deveRetornarFemininoObeso() {
        IDadosCorporais dadosMock = configurarMock("Feminino", 32.3f);
        assertEquals("Obeso", indiceIfs.calcularIMC(dadosMock));
        verify(dadosMock);
    }
}