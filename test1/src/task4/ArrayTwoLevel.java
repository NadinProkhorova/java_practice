package task4;
/*Напишите программу, создающую рванный двумерный массив, заполняющую его целыми числами
и выводящую их на экран так, чтобы были видны столбцы и строки.
 */
public class ArrayTwoLevel {

    public static void main (String [] args){

        int [][] arrayTwo = new int [4][];
        arrayTwo [0] = new int [1];
        arrayTwo [1] = new int [2];
        arrayTwo [2] = new int [3];
        arrayTwo [3] = new int [4];


        int i = arrayTwo.length;
        int j = arrayTwo.length;
        int k = 0;

        for (i = 0; i < arrayTwo.length; i++)
            for (j = 0; j < i + 1; j++ ){
                arrayTwo [i][j] = k;
                k++;
            }

        for (i = 0; i < arrayTwo.length; i++)
            for (j = 0; j < i+1; j++) {
                System.out.print(arrayTwo[i][j] + "    ");
            }

        System.out.println();


    }// что-то пошло не так)
}

