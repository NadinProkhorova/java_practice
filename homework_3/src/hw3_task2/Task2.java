package hw3_task2;
/*Дано: Два числа типа double, например 1.2 и 1.4.

  Задание: Найти их сумму и вывести на экран. Внимательно проверьте результат.
 */
import java.math.BigDecimal;

public class Task2 {

    public static void main ( String [] args ) {

        /* double firstNum = 1.2d;
        double secondNum = 1.4d;
        double sum;

        sumNum = firstNum + secondNum;

        System.out.println("Сумма = " + sum);
        Сумма = 2.5999999999999996
        */

            BigDecimal firstNum = new BigDecimal ("1.2");
            BigDecimal secondNum = new BigDecimal ("1.4");
            BigDecimal sumN;

            sumN = firstNum.add(secondNum);

            System.out.println("Сумма = " + sumN);
            // если значение передается как число, то Сумма = 2.5999999999999998667732370449812151491641998291015625
            // если значение передается как строка, то Сумма = 2.6



    }

}

