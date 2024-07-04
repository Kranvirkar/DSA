package com.scaler.dsa1.contest;

public class BoundaryInClockWiseDirection {

    /*Given a rectangular matrix A of N*M dimension. Return its boundary inclockwise direction.
    input A=[[1,2,3],[4,5,6],[7,8,9]]
    output [1,2,3,6,9,8,7,4]*/

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result = boundaryTraversal(A);
        for (int num : result) {
            System.out.print(num + " ");  // Output: 1 2 3 6 9 8 7 4
        }
    }

    public static int[] boundaryTraversal(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[] boundary = new int[2 * N + 2 * M - 4];
        int index = 0;

        // Top row (left to right)
        for (int i = 0; i < M; i++) {
            boundary[index++] = A[0][i];
        }

        // Right column (top to bottom)
        for (int i = 1; i < N; i++) {
            boundary[index++] = A[i][M - 1];
        }

        // Bottom row (right to left), if there is more than one row
        if (N > 1) {
            for (int i = M - 2; i >= 0; i--) {
                boundary[index++] = A[N - 1][i];
            }
        }

        // Left column (bottom to top), if there is more than one column
        if (M > 1) {
            for (int i = N - 2; i > 0; i--) {
                boundary[index++] = A[i][0];
            }
        }

        return boundary;
    }

}
