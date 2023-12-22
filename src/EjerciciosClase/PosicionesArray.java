package EjerciciosClase;

import java.util.Scanner;
import java.util.spi.TimeZoneNameProvider;

public class PosicionesArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduce la longitud que quieres que tenga el array");
        int longitud= scanner.nextInt();
        int [] lista= new int[longitud];

        System.out.println("Introduce que datos quieres dentro del array");

        for (int i = 0; i < lista.length; i++) {
            int numero= scanner.nextInt();
            lista[i]=numero;
        }

        for ( int item : lista){
            System.out.println(item);
        }

    }
}
