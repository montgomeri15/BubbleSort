package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testBubbleSort(){
        int[] testSortArr = {12, 6, 4, 1, 15, 10};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArr = bubbleSort.sort(testSortArr);

        assertThat(sortedArr).isEqualTo(new int[]{1, 4, 6, 10, 12, 15});
        assertThat(sortedArr).isNotEqualTo(new int[]{12, 6, 4, 1, 15, 10});
    }

    @Test
    void testMatrixBubbleSort(){
        int[][] sortMatrix = new int[][]{
                {8, 3, 5},
                {1, 4, 6},
                {9, 7, 2}
        };
        MatrixBubbleSort matrixBubbleSort = new MatrixBubbleSort();
        int[][] sortedMatrix = matrixBubbleSort.sort(sortMatrix);

        assertThat(sortedMatrix).isEqualTo(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        assertThat(sortedMatrix).isNotEqualTo(new int[][]{
                {8, 3, 5},
                {1, 4, 6},
                {9, 7, 2}
        });
    }
}
