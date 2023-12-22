package EjerciciosClase;

import java.util.Scanner;

public class MayorArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int maximo=0;
        int minimo=0;

        System.out.println("Introduce la longitud que quieres que tenga el array");
        int longitud= scanner.nextInt(); //introducimos longitud por consola
        int [] lista= new int[longitud]; //asignamos la longitud introducida al array creado

        System.out.println("Introduce que datos quieres dentro del array");
        //recorremos el array con length de la lista, es decir la longitud del array

        for (int i = 0; i < lista.length; i++) {
            int datos= scanner.nextInt(); //introducimos los numeros que queremos meter dentro del array
            lista[i]=datos; // y los guardamos en el array
            minimo = lista[0];
            /* IGUALAMOS EL MINIMO A LA PRIMERA POSICION PARA PARTIR DE UNA BASE,
             COMO NO EXISTE OTRO NUMERO, CUANDO SE ENCUENTRA EN LA POSICION [0],
             DAMOS A ENTENDER QUE ESTE ES EL NUMERO MAS PEQUEÑO,
             ASÍ DESPUES LO VAMOS COMPARANDO CON LOS DEMÁS*/

            /*condicion si el numero que aparece en la lista en la poscion que le toque,
             es menor que el minimo.*/

            if (lista[i]<minimo){
                minimo=lista[i];
            }

            /*recorremos la lista para ver si hay algun item que sea mayor que maximo
            el cual hemos igualado a cero
             */
            for (int item : lista){
                if (item>maximo){
                    maximo=item; //si lo encuentra, lo sustituirá por maximo para despues imprimirlo
                }
            }
        }
        System.out.println("El numero mas grande del array es el "+maximo);
        System.out.println("El numero mas pequeño del array es el "+minimo);
    }
}
