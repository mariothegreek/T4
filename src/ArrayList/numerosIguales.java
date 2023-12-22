package ArrayList;

public class numerosIguales {
    public static void main(String[] args) {

        int[]primeros=new int[20];
        int aleatorios1=0;
        int contador=0;
        int aleatorios2=0;

        for ( int i = 0; i < primeros.length ; i++) {
            aleatorios1= (int) (Math.random()*20);
            primeros[i]=aleatorios1;
        }

            for ( int item: primeros){
                System.out.println(item);
        }

        int[]segundos=new int[20];

        for ( int i = 0; i < segundos.length ; i++) {
            aleatorios2= (int) (Math.random()*20);
            segundos[i]=aleatorios2;

            if (aleatorios2==aleatorios1){
                contador++;
            }
        }

        System.out.println();
        for ( int item: segundos){
            System.out.println(item);
        }

        System.out.printf("Hay %d numero/s repetido/s",contador);

    }
}
