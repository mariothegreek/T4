package EjerciciosPresencial;

import java.util.Scanner;

public class Ejercicio3Presencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen");
        double nota1 = sc.nextDouble();
        if (nota1 > 10 || nota1 < 1) {
            System.out.println("La nota tiene que estar entre 1 y 10");
        }

        System.out.println("Qué nota quieres sacar en el trimestre?");
        double notaTrimestre = sc.nextDouble();
        if (notaTrimestre > 10 || notaTrimestre < 1) {
            System.out.println("La nota tiene que estar entre 1 y 10");
        }

        double notaFinal = (notaTrimestre - nota1 * 0.4) / 0.6;
        if (notaFinal > 10) {
            System.out.println("Necesitas más de un 10 para acceder a esa nota, no es posible");
        } else {
            System.out.println("La nota que necesitas sacar es un " + notaFinal);
        }
    }
}