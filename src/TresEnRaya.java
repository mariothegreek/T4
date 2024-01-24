import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[3][3];
        boolean repetir = false;
        boolean gameover = false;
        boolean rango = false;
        boolean posicionCubierta = false;


        do {
            System.out.println("Comienza el tres en raya");
            System.out.println();

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = "-";
                }
            }
            do {
                posicionCubierta = false;
                do {
                    System.out.println("Jugador numero 1");
                    System.out.println("En que fila quieres colocar?");
                    int j1pos1 = sc.nextInt();
                    System.out.println("En que columna quieres colocar?");
                    int j1pos2 = sc.nextInt();
                    if (j1pos1 > 2 || j1pos1 < 0 || j1pos2 > 2 || j1pos2 < 0) {
                        System.out.println("Coordenadas fuera de rango");
                    } else {
                        if (!matriz[j1pos1][j1pos2].equals("-")) {
                            System.out.println("Posicion cubierta, elige otras coordenadas");
                        } else {
                            rango = true;
                            posicionCubierta = true;
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz[i].length; j++) {
                                    matriz[j1pos1][j1pos2] = "X";
                                    System.out.print(matriz[i][j] + " ");
                                }
                                System.out.println();
                            }
                        }
                        gameover = ComprobarGanador(matriz, "X") || ComprobarEmpate(matriz);
                    }
                } while (!rango && !gameover || !posicionCubierta);

                //Rompemos con break si se cumple la condicion de gameover para que no se siga repitiendo el while superior
                if (gameover) {
                    break;
                }

                posicionCubierta = false;
                rango = false;
                do {
                    System.out.println("Jugador numero 2");
                    System.out.println("En que fila quieres colocar?");
                    int j2pos1 = sc.nextInt();
                    System.out.println("En que columna quieres colocar?");
                    int j2pos2 = sc.nextInt();
                    if (j2pos1 > 2 || j2pos1 < 0 || j2pos2 > 2 || j2pos2 < 0) {
                        System.out.println("Coordenadas fuera de rango");
                    } else {
                        if (!matriz[j2pos1][j2pos2].equals("-")) {
                            System.out.println("Posicion cubierta, elige otras coordenadas");
                        } else {
                            rango = true;
                            for (int i = 0; i < matriz.length; i++) {
                                for (int j = 0; j < matriz[i].length; j++) {
                                    posicionCubierta = true;
                                    matriz[j2pos1][j2pos2] = "O";
                                    System.out.print(matriz[i][j] + " ");
                                }
                                System.out.println();
                            }
                            gameover = ComprobarGanador(matriz, "O") || ComprobarEmpate(matriz);
                        /*Como los métodos ComprobarGanador y ComprobarEmpate devuelven booleanos
                        y gameover es un booleano, reasignamos su valor con un condicional
                        si ComprobarGanador o ComprobarEmpate son false, sigue ejecutando por el While que tenemos
                        más abajo de "while (!gameover)"
                         */
                        }
                    }
                } while (!rango || !posicionCubierta);

            } while (!gameover);

            //insertamos opción para poder volver a jugar con capacidad de repetición en caso de error.
            boolean opcionRango = false;
            do {
                System.out.println("Quieres volver a jugar?\n 1-SI  2-NO");

                int opcion = sc.nextInt();
                if (opcion == 1) {
                    repetir = true;
                } else if (opcion < 1 || opcion > 2) {
                    System.out.println("Seleciona un numero válido");
                    opcionRango = true;
                }
            } while (opcionRango);

        } while (repetir);
    }
    //Comprobar las filas y columnas
    public static boolean ComprobarGanador(String[][] array, String jugador) {
    /*Declaramos el String [][] para poder meter la matriz después, y String jugador, para poder comparar
    si lo que hay dentro de cada posición que le toque es igual que el String que introduzcamos
     */


        //Comprobar filas y columnas
        for (int i = 0; i < array.length; i++) {
            //filas
            if (array[i][0].equals(jugador) && array[i][1].equals(jugador) && array[i][2].equals(jugador)
                    //columnas
                    || array[0][i].equals(jugador) && array[1][i].equals(jugador) && array[2][i].equals(jugador)) {
                System.out.println("El ganador es el " + jugador);
                return true; //Si se han cumplido todas las condiciones, retornamos true
            }
        }

        //Comprobar diagonales
        for (int i = 0; i < array.length; i++) {
            //desde izq superior a drcha inferior \
            if (array[0][0].equals(jugador) && array[1][1].equals(jugador) && array[2][2].equals(jugador)
                    //desde drcha superior a izq inferior /
                    || array[0][2].equals(jugador) && array[1][1].equals(jugador) && array[2][0].equals(jugador)) {
                System.out.println("El ganador es el " + jugador);
                return true; //Si se han cumplido todas las condiciones, retornamos true
            }
        }
        return false; //Por último retornamos false por si no se hayan cumplido las condiciones, el código continúe.
    }

    //Comprobar empate
    public static boolean ComprobarEmpate(String[][] array) {
        for (String[] filas : array) { //recorremos el array y encontramos "filas".
            for (String item : filas) { //recorremos las filas y encontramos item que igualamos a "-"
                if (item.equals("-")) { //si el item es igual, sigue habiendo espacios en el tablero, retornamos false
                    return false;
                }
            }
        }
        System.out.println("Es un empate!");
        return true; //retornamos true cuando no cumple la condición, es decir, ya no quedan "-" en el tablero.
    }
}
