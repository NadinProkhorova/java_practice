/*Дано: double number = 45.5;
Задание: Вывести на экран только целую часть
*/

public class Task4 {
    public static void main (String [] args){
        double number = 45.5;
        int num = (int)number;
        System.out.println ( num );

        int num2 = (int)Math.round(number);
        System.out.println(num2);


    }
}
