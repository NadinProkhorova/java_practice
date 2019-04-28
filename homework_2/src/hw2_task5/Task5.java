package hw2_task5;
/*Дана последовательность чисел (3, 5, 6, 9, 10, 11)
    Найти среди них числа, делящиеся на 3 и вывести на экран.*/
public class Task5 {

    public static void main(String[] args) {

        int [] numbers = {3, 5, 6, 9, 10, 11};
        for (int i=0; i < numbers.length; i++){
            if (numbers[i] % 3 ==0) {
                System.out.println( numbers[i] + " ");
            }
        }
    }
}


