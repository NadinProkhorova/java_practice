package task2;
/*Дано: Некоторый набор чисел (передать аргументами через командную строку)
Задание:
Найти наибольшее число и вывести его на экран
Найти наименьшее число и вывести его на экран
*/
public class CycleFor2 {
    public static void main (String [] args){
        //System.out.println(args[0]);
        //System.out.println(args[1]);

        if (args.length > 0){
            int num1 = Integer.parseInt(args [0]);
            int num2 = num1;

            for (int i = 1; i < args.length; i++){
                int currentNumber = Integer.parseInt(args [i]);

                if (num1 > currentNumber){
                    num1 = currentNumber;
                }

                if (num2 < currentNumber){
                    num2 = currentNumber;
                }
            }
            System.out.println("min = " + num1);
            System.out.println ("max = " + num2);

        } else {
            System.out.println("Please pass args");
        }

    }
}
