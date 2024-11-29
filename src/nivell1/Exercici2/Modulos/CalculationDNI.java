package nivell1.Exercici2.Modulos;

public class CalculationDNI {

    public static char getDNILetter(int dni) {
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letters.charAt(dni % 23); // Calculates the letter based on the remainder
    }
}
