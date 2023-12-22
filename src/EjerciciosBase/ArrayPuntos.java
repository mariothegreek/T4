package EjerciciosBase;

public class ArrayPuntos {
    public static void main(String[] args) {

        int[]numerosGuardados= new int[3];

        for ( int i = 0; i <3; i++) {
            numerosGuardados[i]= (int) (Math.random()*30);
        }
        for(int item:numerosGuardados){
            System.out.print(item+" ");
        }
        for (int i = 0; i < numerosGuardados.length ; i++) {
            numerosGuardados[i]=numerosGuardados[i]+numerosGuardados[i];
        }
        System.out.println();
        for(int item:numerosGuardados){
            System.out.print(item+" ");
        }


    }
}
