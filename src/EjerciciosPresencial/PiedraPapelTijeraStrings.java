package EjerciciosPresencial;

import java.util.Scanner;

public class PiedraPapelTijeraStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a jugar a piedra, papel o tijera");

        String[] game = new String[]{"piedra", "papel", "tijera"};

        System.out.println("Jugador 1 escribe tu tirada:");
        String jugadaP1 = sc.next();

        System.out.println("Jugador 2 escribe tu tirada:");
        String jugadaP2 = sc.next();

        if (jugadaP1.equalsIgnoreCase(jugadaP2)) {
            System.out.println("Es un empate");
        } else if (jugadaP1.equalsIgnoreCase(game[0]) && jugadaP2.equalsIgnoreCase(game[2]) || jugadaP1.equalsIgnoreCase(game[1]) && jugadaP2.equalsIgnoreCase(game[0]) || jugadaP1.equalsIgnoreCase(game[2]) && jugadaP2.equalsIgnoreCase(game[1])) {
            System.out.println("Jugador 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
    }
}