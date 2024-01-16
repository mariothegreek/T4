package Methods;

import java.util.Scanner;

public class CalcularDNI {
    public static char buscarletra(int numeroDNI) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = numeroDNI % 23;
        return letras[resto];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de tu DNI");
        int dni = scanner.nextInt();
        if (String.valueOf(dni).length() == 8) {
            char letraSeleccionada = buscarletra(dni);
            System.out.printf("La letra de tu DNI es la %c", letraSeleccionada);
        } else {
            System.out.println("El DNI debe tener exactamente 8 digitos.");
        }
    }
}
