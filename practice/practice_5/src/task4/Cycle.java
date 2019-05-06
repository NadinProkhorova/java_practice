package task4;
/*Задание: Найти первых 10 чисел Фибоначчи. Первым числом считать единицу, т.е. Первых три числа будут 1,1,2
*/

public class Cycle {
    public static void main (String [] args ) {
        int num1 = 1;
        int num2 = 1;
        int num3;

        System.out.print(num1 + "  ");

        for (int i = 3; i <= 11; i++) {
            num3 = num1 + num2;
            System.out.print(num2 + " ");
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }
}
