package task1;
/*
1. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
2. Выведите массив на экран в строку
3. Замените каждый элемент с нечётным индексом на ноль
4. Снова выведете массив на экран на отдельной строке
*/
import java.util.Random;

public class Task1_ArrayRandom {

        public static void main(String[] args) {

            Random rand = new Random();
            int i,  masNum[] = new int[8];
            String tmpString = new String();

            for (i = 0; i < masNum.length; i++) {
                masNum[i] = 1 + rand.nextInt(10);

                //System.out.print(i + "  ");// эта строка выводит номер идентификатора массива
                tmpString = tmpString + masNum[i] + "  ";
            }

            System.out.println();
            System.out.print(tmpString);
            System.out.println();

            for (i = 0; i < masNum.length; i++) {
                if (i % 2 != 0) {
                    masNum[i] = 0;
                }

                System.out.print(masNum[i] + "  ");

            }

        }

}
