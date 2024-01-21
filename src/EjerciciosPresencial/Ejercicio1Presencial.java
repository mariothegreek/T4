package EjerciciosPresencial;

import java.util.Scanner;

public class Ejercicio1Presencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto mide el radio del cono?");
        int radio = sc.nextInt();

        System.out.println("Cuanto mide la altura del cono");
        int altura = sc.nextInt();

        //Math.PI para poder utilizar el número PI
        // Math.pow para elevar el número que queremos a la potencia que queremos
        int volumen = (int) ((Math.PI * Math.pow(radio, 2) * altura) / 3);
        System.out.println("El volumen total del cono es " + volumen);
    }
}