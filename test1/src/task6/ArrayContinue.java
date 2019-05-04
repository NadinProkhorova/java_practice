package task6;
/*Дан массив из 10 целых чисел. Необходимо вывести все числа кроме 5 (оператор continue).
*/

public class ArrayContinue {

    public static void main (String [] args){

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = array.length;

        for(i = 0; i < array.length; i++) {

            if (array[i] == 5) {
                System.out.print("");
                continue;
            }
            System.out.print (array[i] + "  ");
        }
    }
}
