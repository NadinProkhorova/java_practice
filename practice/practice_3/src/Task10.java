/* Дано: Число 16.
Используя операторы <<, >> умножить и разделить это число на 8  и вывести на экран
*/
public class Task10 {
    public static void main (String [] args) {
        int num = 16;

        int num2 = num << 8;
        int num3 = num >> 2;//если делить на 8, то ответ равен 0

        System.out.println ( num2 );
        System.out.println ( num3 );
    }
}
