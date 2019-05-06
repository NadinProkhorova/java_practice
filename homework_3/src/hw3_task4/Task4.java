package hw3_task4;
/*Дано: ( cos(180) + 256 / 8 - 2^3 ) * Pi
Задание: Узнать чему оно равно
*/
import java.lang.Math;
public class Task4 {
    public static void main (String [] args){
        double num1;
        double num2;
        double num3;
        double result;

        num1 = Math.cos(Math.toRadians(180));
        num2 = 256/8;
        num3 = Math.pow(2, 3);


        result = (num1 + num2 - num3)* Math.PI;

        System.out.println (num1);
        System.out.println (num2);
        System.out.println (num3);

        System.out.println (result);

    }
}
