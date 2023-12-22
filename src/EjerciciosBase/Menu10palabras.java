package EjerciciosBase;

import java.util.Arrays;
import java.util.Scanner;

public class Menu10palabras {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] todasPalabras=new String[3];
        String palabra;
        int opcion;


        System.out.println("introduce 3 palabras");
        for (int i = 0; i <3; i++) {
            palabra= scanner.next();
            todasPalabras[i]=palabra;
        }


        System.out.println("Menu de opciones:");
        System.out.println();
        System.out.println("1 Ver todas las palabras");
        System.out.println("2 Palabra al azar");
        System.out.println("3 Numero de letras");
        System.out.println("4 Media de letras");
        System.out.println("5 Palabra con mas letras");
        System.out.println("6 Palabra con menos letras");

        opcion=scanner.nextInt();

        System.out.println("La opcion es "+ opcion);

        switch (opcion) {
            case 1:
                for (String item : todasPalabras) {
                    System.out.println(item);
                }
                break;
            case 2:

                System.out.println("El numero de letras es");
                break;

            case 3:


                break;
        }
    }
}
