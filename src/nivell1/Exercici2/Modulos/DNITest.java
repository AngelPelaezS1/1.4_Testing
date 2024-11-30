package nivell1.Exercici2.Modulos;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DNITest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "22222222, P",
            "33333333, L",
            "44444444, G",
            "55555555, R",
            "66666666, A",
            "77777777, M",
            "88888888, C"
    })
    public void testGetDNILetter(int dni, char expectedLetter) {
        assertEquals(expectedLetter, CalculationDNI.getDNILetter(dni));
    }
}
