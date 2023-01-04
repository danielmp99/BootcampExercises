package code.bootcamp.example;
import java.util.*;
import java.util.ArrayList;

public class BuscarCero {
    public static void main(String[] args) {
        int[][] matriz = new int[][] {{0, 2}, {3, 4}, {5, 1}};
        transform(matriz);
    }

    private static void print(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static void transform(int[][] matrizInicial) {
        //ArrayList<Integer> posicionesx = new ArrayList<Integer>();
        //ArrayList<Integer> posicionesy = new ArrayList<Integer>();
        int[][] arrayCreated = matrizInicial;
        System.out.println(arrayCreated);
        System.out.println(matrizInicial);
        print(matrizInicial);

        for (int i = 0; i < matrizInicial.length; i++) {
            for (int j = 0; j < matrizInicial[i].length; j++) {
                if (matrizInicial[i][j] == 0) {

                    addZerosHorizontally(arrayCreated, i);
                    addZerosVertically(arrayCreated, j);
                }
                print(matrizInicial);
            }
        }


        //System.out.println(posicionesx.toArray().length);


        //addZerosHorizontally(matriz, posicionesy.get(j));
        //addZerosVertically(matriz, posicionesx.get(j));

    }

    public static void addZerosVertically(int[][] matriz1, int y){
        for (int k = 0; k < matriz1.length; k++) {
            matriz1[k][y] = 0;//posicionesx.get()
        }
    }

    public static void addZerosHorizontally(int[][] matriz2, int x){
        for (int l = 0; l < matriz2[0].length; l++) {
            matriz2[x][l] = 0;//posicionesx.get()
        }
    }

    public static String square(int size) {
        var character = "*";
        var square = new StringBuilder();
        for (int row = 1; row <= size; ++row) {
            square.append(character.repeat(size)).append(System.lineSeparator());//String.format("%n")
        }
        System.out.println(square);
        return square.toString();
    }

}
