package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AnoBissextoTeste {
    
    @Test
    public void shouldReturnAnoBissexto() {
        AnoBissexto ano = new AnoBissexto();
        boolean resposta = ano.isAnoBissexto(2012);
        assertTrue(resposta);
    }
}
