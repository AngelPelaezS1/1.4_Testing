package nivell1.Exercici2.Main;

import nivell1.Exercici2.Modulos.CalculationDNI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dni;
        do {
            System.out.print("Enter your DNI number");
            dni = sc.nextInt();
        } while (dni < 1);

        char dniLetter = CalculationDNI.getDNILetter(dni);
        System.out.println("DNI Letter: " + dniLetter);

        sc.close();
    }
}
