package EjerciciosClase;

import java.util.Scanner;

public class Multiplicararray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int [] lista=new int[5];
        int suma=0;
        int media=0;

        System.out.println("Introduce 5 valores");
        for (int i = 0; i < lista.length; i++) {
            int numero= scanner.nextInt();
            lista[i]=numero*2;
            suma+=lista[i];
            media=suma/ lista.length;
        }

        for (int item : lista){
            System.out.println(item);
        }

        System.out.println();
        System.out.println("La suma es "+suma);
        System.out.println("La media es "+media);
    }
}
