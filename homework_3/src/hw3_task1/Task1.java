package hw3_task1;

import java.math.BigInteger;

/*Дано:
Некоторое целое число (передать через аргумент для программы)
Задание: Умножить это число на 256 не используя оператор “ * ”

*/
public class Task1 {

    public static void main (String [] args) {

        //System.out.println( args [0]);// узнать значение аргумента
        String num1 = args[0];
        int num1new = Integer.parseInt(num1);
        //System.out.println(num1new);// проверить правильность присвоенного значения
        int num2 = 256;
        int sum = 0;

       // num2 = num2 * num1new;// узнать результат с помощью умножения
        //System.out.println(num2);

        for (int i = 0; i < num1new; i++ ) {

            sum += num2;
        }

        System.out.println(sum);

    }
}

