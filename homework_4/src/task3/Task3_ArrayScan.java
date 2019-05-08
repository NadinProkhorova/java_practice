package task3;
/*1. Пользователь должен ввести с клавиатурыразмер массива - натуральное число больше 3.
 Введенное пользователем число сохраняется в переменную size.
2. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
3. Создать массив из size случайных целых чисел из отрезка [0;size] и вывести его на экран.
4. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
*/
import java.util.Random;
import java.util.Scanner;

public class Task3_ArrayScan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "Введите размер массива: ";
        System.out.println(str);

        int size = scan.nextInt();

        for (int i = 0; i < 1; i++){

            if (size > 3) {
                System.out.println("Массив будет состоять из " + size + " элементов");;

            }else{
                System.out.println(str + "натуральное число > 3");
                size = scan.nextInt();
                i--;
            }
        }

        int[] arrayNum = new int[size];

        Random rand = new Random();

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = rand.nextInt(size +1);
            System.out.print(arrayNum[i] + " ");
        }

        System.out.println();

        int k = 0;// счетчик количества элементов вo втором массиве
        for (int i = 0; i < arrayNum.length; i++ ) {
            if (arrayNum[i] % 2 == 0){
                 k = k+1;
            }
        }

        int[] arrayNum2 = new int[k];// объявляем массив для четных чисел
        int j =0;
        for (int i = 0; i < arrayNum.length; i++ ) {
            if (arrayNum[i] % 2 == 0) {
                arrayNum2[j] = arrayNum[i];
                System.out.print(arrayNum2[j] + " ");
                j++;

            }
        }
    }
}




