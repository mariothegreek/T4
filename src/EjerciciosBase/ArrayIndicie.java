package EjerciciosBase;

import java.util.Scanner;

public class ArrayIndicie {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] numerosArray= new int [9];

        for (int i = 0; i <9; i++) {
            System.out.println("Introduce el numero que quieres guardar");
            int numero= scanner.nextInt();
            numerosArray[i]=numero;
        }

        for (int i = 0; i < numerosArray.length; i++) {
            System.out.printf("El numero %d está en la posición %d\n",numerosArray[i],i);

        }
    }
}
