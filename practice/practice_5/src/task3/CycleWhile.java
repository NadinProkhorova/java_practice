package task3;
/* Дано: два числа (например 23 и 49)
Задание: Найти среднее
*/

public class CycleWhile {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 49;
        double aver;

        //aver = (num1 + num2) / 2;

        while (++num1 < --num2) ;

        System.out.println(num1);


    }
}

