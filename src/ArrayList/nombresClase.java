package ArrayList;

import java.util.Random;

public class nombresClase {
    public static void main(String[] args) {

        String[]listaClase=new String[]{"Jose","Maria","Alejandra","Javier","Paco","Cristina","Juan","Mario"};
        Random random=new Random(); //importamos la clase de Random para poder utilizarlo

        int numeroPosicion = random.nextInt(listaClase.length);
        /*declaramos un int para generar un numero aleatorio
        entre 0 y la longitud del array, que vienen a ser en este caso el número de palabras*/

        System.out.println("El nombre aleatorio es %d "+listaClase[numeroPosicion]);
        /* por último imprimimos nuestro array
        y dentro del mismo llamamos a esa posicion que se ha generado aleatoriamente*/
    }
}
