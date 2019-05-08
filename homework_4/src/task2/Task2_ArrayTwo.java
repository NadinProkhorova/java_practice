package task2;
/*
1. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
2. Выведите массивы на экран в двух отдельных строках
3. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для
какого из массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны)
*/

import java.util.Random;

public class Task2_ArrayTwo {

    public static void main(String[] args) {

        Random rand = new Random();
        int i, j, array_1[] = new int[5], array_2[] = new int[5];
        double sumAr1 = 0, sumAr2 = 0;
        double average1 = 0, average2 = 0;

        for (i = 0; i < array_1.length; i++) {
            array_1[i] =  rand.nextInt(5 );
            System.out.print(array_1[i] + "  ");
        }

        System.out.println();

        for (j = 0; j < array_2.length; j++) {
            array_2[j] = rand.nextInt(5 );
            System.out.print(array_2[j] + "  ");
        }

        System.out.println();

        if (array_1.length > 0) {
            for (i = 0; i < array_1.length; i++) {
                sumAr1 = sumAr1 + array_1[i];
            }
            average1 = sumAr1 / array_1.length;
        }

        //System.out.println(average1);// можно вывести на экран среднее арифметическое массива

        if (array_2.length > 0) {
            for (j = 0; j < array_2.length; j++) {
                sumAr2 += array_2[j];
            }
            average2 = sumAr2 / array_2.length;
        }
        //System.out.println(average2);// можно вывести на экран среднее арифметическое массива

        if (average1 > average2) {
            System.out.println("Среднее арифметическиое первого массива больше");

        } else if (average1 < average2) {
            System.out.println("Среднее арифметическиое второго массива больше");

        } else {
            System.out.println("Средние арифметические двух массивов равны");
        }

    }
}
