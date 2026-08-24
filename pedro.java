

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double radio;
        double area;

        System.out.print("Ingrese el radio del círculo: ");
        radio = teclado.nextDouble();

        area = Math.PI * Math.pow(radio, 2);

        System.out.printf("El área del círculo es: %.2f%n", area);

        teclado.close();
    }
}