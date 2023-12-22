package EjerciciosClase;

import java.util.Scanner;

public class SumaArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma;

        System.out.println("Introduce la longitud que quieres que tengan los arrays");
        int longitud = scanner.nextInt();
        int[] lista = new int[longitud];

        for (int i = 0; i < lista.length; i++) {
            int numero = (int) (Math.random() * 20);
            lista[i] = numero;
        }
        for ( int item : lista){
            System.out.print(item+" ");
        }
        System.out.println();

        int[] lista1 = new int[longitud];

        for (int i = 0; i < lista1.length; i++) {
            int numero1 = (int) (Math.random() * 20);
            lista1[i] = numero1;
        }
        for ( int item : lista1){
            System.out.print(item+" ");
        }
        System.out.println();
        int[] array3 = new int[longitud];
        for (int i = 0; i < array3.length; i++) {
            array3[i]=lista[i]+lista1[i];
        }
        for ( int item : array3){
            System.out.print(item+" ");
        }
    }
}
