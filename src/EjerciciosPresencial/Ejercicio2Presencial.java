package EjerciciosPresencial;

import java.util.Scanner;

public class Ejercicio2Presencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe qué hora es ");
        int hora = sc.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos dias");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else if (hora >= 0 && hora <= 5) {
            System.out.println("Buenas noches");
        }
    }
}