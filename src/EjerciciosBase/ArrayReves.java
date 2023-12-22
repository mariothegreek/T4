package EjerciciosBase;

import java.util.Scanner;

public class ArrayReves {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int[]todosNumeros= new int[10];
        int numero;
        System.out.println("Introduce 10 números");

        for (int i = 0; i < 10; i++) {
            numero=scanner.nextInt();
            todosNumeros[i]=numero;
        }
        for (int i = todosNumeros.length - 1; i >= 0 ; i--) {
            System.out.print(todosNumeros[i]+" ");
        }
        System.out.println();

        for(int item:todosNumeros){
            System.out.print(item+" ");
        }
    }
}
