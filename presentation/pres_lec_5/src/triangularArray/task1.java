package triangularArray;

public class task1 {
    public static void main (String [] args){
        int [][] arr;
        arr = new int [3][];
        arr [0] = new int [1];
        arr [1] = new int [2];
        arr [2] = new int [3];

        for (int i =0; i < 3; i++)
            for (int j = 0; j <= i; j++) arr [i][j] = j;
            String s = "";

        int i, j;

        for (i = 0; i < 3; i++) {
                s = "";
                for (j = 0; j <= i; j++ ) s += ( arr[i][j] + "  ");

                System.out.println(s);
            }

    }
}
