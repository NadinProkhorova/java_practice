package hw3_task2;
/*Дано: Два числа типа double, например 1.2 и 1.4.

  Задание: Найти их сумму и вывести на экран. Внимательно проверьте результат.
 */
import java.math.BigDecimal;

public class Task2 {

    public static void main ( String [] args ) {

            BigDecimal firstNum = new BigDecimal ("1.2");
            BigDecimal secondNum = new BigDecimal ("1.4");
            BigDecimal sumN;

            sumN = firstNum.add(secondNum);

            System.out.println("Сумма = " + sumN);

    }
}

