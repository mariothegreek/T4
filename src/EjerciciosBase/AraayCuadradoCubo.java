package EjerciciosBase;

public class AraayCuadradoCubo {
    public static void main(String[] args) {
        int[]aleatorio=new int[10];

        for (int i = 0; i < aleatorio.length; i++) {

            aleatorio[i]=(int) (Math.random()*10);
            System.out.print(aleatorio[i]+" ");
        }
        System.out.println();

        int[]aleatorioCuadrado=new int[10];

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorioCuadrado[i]= (int) Math.pow(aleatorio[i],2);
            System.out.print(aleatorioCuadrado[i]+" ");
        }
        System.out.println();

        int[]aleatorioCubo=new int[10];

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorioCubo[i]= (int) Math.pow(aleatorio[i],3);
            System.out.print(aleatorioCubo[i]+" ");
        }
    }
}
