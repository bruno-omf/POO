package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromoTeste {
    @Test
    // criar teste para verificar se eh palindromo
    public void shoudReturnPalindromo() {
        Palindromo palin = new Palindromo();
        boolean resposta = palin.ehPalindromo("ana");
        assertTrue(resposta);
    }
    // criar um teste para verificar se nao eh palindromo
    public void shouldNotReturnPalindromo() {
        Palindromo palin = new Palindromo();
        boolean resposta = palin.ehPalindromo("chuck");
        assertFalse(resposta);
    }
}
