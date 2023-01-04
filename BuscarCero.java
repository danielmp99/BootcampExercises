package code.bootcamp.example;
import java.util.*;
import java.util.ArrayList;

public class BuscarCero {
    public static void main(String[] args) {
        int[][] numberMatriz = new int[][] {{0, 2}, {3, 4}, {5, 1}};
        transform(numberMatriz);
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
        int[][] arrayCreated = matrizInicial.clone();
        for (int i = 0; i < matrizInicial.length; i++) {
            for (int j = 0; j < matrizInicial[i].length; j++) {
                if (matrizInicial[i][j] == 0) {
                    addZerosHorizontally(arrayCreated, i);
                    addZerosVertically(arrayCreated, j);
                }
                print(matrizInicial);
            }
        }
    }
    public static void addZerosVertically(int[][] matriz, int y){
        for (int k = 0; k < matriz.length; k++) {
            matriz[k][y] = 0;
        }
    }

    public static void addZerosHorizontally(int[][] matriz, int x){
        for (int l = 0; l < matriz[0].length; l++) {
            matriz[x][l] = 0;
        }
    }

}
