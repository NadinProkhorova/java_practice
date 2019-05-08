package task5;

public class Task5_Transpose {
    public static void main (String [] args) {

        int matrix[][] = {  {1, 3, -7},
                            {0, 2, 8},
                            {-5, 1, 0} };

        int n = matrix.length;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
