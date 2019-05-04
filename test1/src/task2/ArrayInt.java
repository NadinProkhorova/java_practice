package task2;
/*Напишите программу, заполняющую массив целыми числами и выводящую его на экран.
*/
import java.util.Random;

public class ArrayInt {
    public static void main (String [] args) {
        Random rand = new Random();
        int [] array = new int [10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);//}

            System.out.println(array[i]);
        }



    }
}
