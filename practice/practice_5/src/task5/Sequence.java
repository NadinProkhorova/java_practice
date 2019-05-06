package task5;
/*Задание
Необходимо вывести на консоль такую последовательность чисел:
1 2 4 8 16 32 64 128 256 512
*/

public class Sequence {
    public static void main (String [] args){
        int num1 = 1;
        int num2;
        System.out.print( num1 + "  ");

        for (int i = 1; i < 10; i++) {
            num2 = num1 * 2;
            System.out.print(num2 + "  ");
            num1 = num2;

        }
    }
}
