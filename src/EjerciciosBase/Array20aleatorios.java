package EjerciciosBase;

public class Array20aleatorios {
    public static void main(String[] args) {
        int[]coleccion= new int[20];
        int aleatorio=0;
        int contador=0;

        for (int i = 0; i < coleccion.length; i++) {
            aleatorio= (int) (Math.random()*30)+1;
            if (aleatorio==6){
                aleatorio=8;
                contador++;
            }
            if (aleatorio==7){
                aleatorio=15;
                contador++;
            }
            if (aleatorio==20){
                aleatorio=10;
                contador++;
            }
            coleccion[i]=aleatorio;

            System.out.println(coleccion[i]);
        }
        System.out.printf("El programa ha hecho %d modificacion/es\n",contador);

    }
}
