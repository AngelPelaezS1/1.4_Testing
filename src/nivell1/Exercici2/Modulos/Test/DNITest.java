package nivell1.Exercici2.Modulos.Test;

import nivell1.Exercici2.Modulos.CalculationDNI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DNITest {

    @Test
    public void testGetDNILetterSingle() {
        int dni = 12345678;
        char expectedLetter = 'Z';

        char actualLetter = CalculationDNI.getDNILetter(dni);


        assertEquals(expectedLetter, actualLetter, "La letra calculada no coincide con la esperada.");
    }
}

