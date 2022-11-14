package org.example;

public class MatrixBubbleSort {
    protected static int[][] sort(int[][] sortMatrix){
        int swap;
        for (int i = 0; i < sortMatrix.length; i++) {
            for (int j = 0; j < sortMatrix[i].length; j++) {
                for (int k = 0; k < sortMatrix.length; k++) {
                    for (int l = 0; l < sortMatrix[k].length; l++) {
                        if (sortMatrix[i][j] <= sortMatrix[k][l]) {
                            swap = sortMatrix[i][j];
                            sortMatrix[i][j] = sortMatrix[k][l];
                            sortMatrix[k][l] = swap;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < sortMatrix.length; i++) {
            for (int j = 0; j < sortMatrix[i].length; j++) {
                System.out.print(sortMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return sortMatrix;
    }
}
