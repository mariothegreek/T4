package EjerciciosBase;

import java.util.Scanner;

public class ArrayParImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[]numerosGuardados= new int[8];
        int numero=0;

        System.out.println("Introduce 8 numeros enteros");
        for (int i = 0; i < 8; i++) {
            numero= scanner.nextInt();
            numerosGuardados[i]=numero;
        }
        for( int item : numerosGuardados){
            if (item%2==0){
                System.out.println(item+" par");
            }else{
                System.out.println(item+" impar");
            }
        }
    }
}
