package org.example;

public class App {
    public static void main(String[] args) {
        //Сортування бульбашкою
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(sortArr);

        //Сортування бульбашкою 2D-масиву
        int[][] sortMatrix = new int[][]{
                {8, 3, 5},
                {1, 4, 6},
                {9, 7, 2}
        };
        MatrixBubbleSort matrixBubbleSort = new MatrixBubbleSort();
        matrixBubbleSort.sort(sortMatrix);
    }
}


