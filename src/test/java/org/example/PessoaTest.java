package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    void deveVerificarPesoValido() {
        pessoa.setPeso(75.5f);
        assertEquals(75.5f, pessoa.getPeso());
    }

    @Test
    void deveVerificarAlturaValida() {
        pessoa.setAltura(1.75f);
        assertEquals(1.75f, pessoa.getAltura());
    }

    @Test
    void deveVerificarSetGetSexoMasculino() {
        pessoa.setSexo("Masculino");
        assertEquals("Masculino", pessoa.isSexo());
    }

    @Test
    void deveVerificarSetGetSexoFeminino() {
        pessoa.setSexo("Feminino");
        assertEquals("Feminino", pessoa.isSexo());
    }

    @Test
    void deveVerificarPesoInvalidoZero() {
        try {
            pessoa.setPeso(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso inválido", e.getMessage());
        }
    }

    @Test
    void deveVerificarPesoInvalidoNegativo() {
        try {
            pessoa.setPeso(-5.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso inválido", e.getMessage());
        }
    }

    @Test
    void deveVerificarAlturaInvalida() {
        try {
            pessoa.setAltura(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura inválida", e.getMessage());
        }
    }

    @Test
    void deveVerificarSexoInvalido() {
        try {
            pessoa.setSexo("Outro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sexo inválido.", e.getMessage());
        }
    }
}