package task3;
/*Напишите программу, меняющую местами предыдущий и последующий элементы одномерного массива
*/

public class ArrayChange {
    public static void main (String [] args) {
        int[] array = {1, 2, 3, 4, 5};
        int i = array.length;

        int a = array[array.length - 1];
        int b = array[array.length - 2];

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        array[array.length - 1] = a;
        array[array.length - 2] = b;

        for (i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
        }
    }
}
