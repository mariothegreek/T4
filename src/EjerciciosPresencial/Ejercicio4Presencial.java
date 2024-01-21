package EjerciciosPresencial;

import java.util.Scanner;

public class Ejercicio4Presencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a jugar a piedra, papel o tijera");

        String[] game = new String[]{"piedra", "papel", "tijera"};

        System.out.println("Jugador 1 escoge tirada: 0  1  2");
        int jugadaP1 = sc.nextInt();

        System.out.println("Jugador 2 escoge tirada: 0  1  2");
        int jugadaP2 = sc.nextInt();

        if (jugadaP1 == jugadaP2) {
            System.out.println("Es un empate");
        } else if (jugadaP1 == 0 && jugadaP2 == 2 || jugadaP1 == 1 && jugadaP2 == 0 || jugadaP1 == 2 && jugadaP2 == 1) {
            System.out.println("Jugador 1 wins");
        } else {
            System.out.println("Jugador 2 wins");
        }
    }
}