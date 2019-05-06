package task1;
/* Дано: Числа от 0 до 100
Задание:
Посчитать сумму четных и вывести на экран
Посчитать сумму нечетных и вывести на экран
Найти общую сумму всех чисел
*/


public class CycleFor1 {
    public static void main (String [] args) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                sumEven += i;
            } else{
            sumOdd += i;
        }
    }
        System.out.println( sumEven );
        System.out.println ( sumOdd );
        System.out.println (sumEven + sumOdd);


    }

}
