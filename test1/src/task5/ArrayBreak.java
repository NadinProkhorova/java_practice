package task5;
/*Дан массив из 10 целых чисел. Необходимо вывести первые 5 (использование break)
*/
public class ArrayBreak {
    public static void main (String [] args){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i  = array.length;

        for (i = 0; i < array.length; i++) {
            if (i == 5) break;

            System.out.print(array[i] + " ");
        }
    }
}
