package Task1;
/*
Дано: Шар предсказаний.

Задание: Написать свой метод, который получает на вход какой-нибудь вопрос, в конце строки обязательно
должен стоять знак вопроса, иначе шар переспрашивает. И затем рандомно возвращает сбудется или не сбудется.
Ответ полученный из метода нужно распечатать вместе с вопросом
*/

import java.util.Random;
import java.util.Scanner;

class MagicBall {


    public static void main(String[] args) {

        String str = new String("Magic ball: Задай свой вопрос");
        System.out.println(str);
        boolean finishProgram = true;
        while (finishProgram) {
            //for (int i = 0; i < 1; i++) {
            Scanner scan = new Scanner(System.in);
            String question = new String();
            question = scan.nextLine();

            Random rand = new Random();
            int num = rand.nextInt(10);

            String yes = new String("ДА");
            String no = new String("НЕТ");

            String symb = "?";

            if (question.contains(symb) != true) {
                System.out.println("Задай свой вопрос еще раз, поставь в конце знак  \" ? \"");
                //i--;// для цикла for
            } else {

                if (num < 5) {
                    System.out.println(question + " ");
                    System.out.println("Мой ответ " + yes);
                } else {
                    System.out.println(question + " ");
                    System.out.println("Мой ответ " + no);
                }
                finishProgram = false;
                //i++;// для цикла for

            }
        }


    }


}





