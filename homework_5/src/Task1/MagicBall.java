// имена пакетов с маленькой буквы
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
    private static final String QUESTION_SYMBOL = "?";

    public static void main(String[] args) {

        String str = new String("Magic ball: Задай свой вопрос");
        System.out.println(str);
        boolean finishProgram = true;
        while (finishProgram) {
            // не оставляй закоменченный код в уже готовом варианте
            //for (int i = 0; i < 1; i++) {
            Scanner scan = new Scanner(System.in);
            String question = new String();
            question = scan.nextLine();

            Random rand = new Random();
            int num = rand.nextInt(10);

            String yes = new String("ДА");
            String no = new String("НЕТ");

            String symb = "?";

            // этот if проверяет наличие знака вопроса в любом месте, т.е. даже если будет "? твой вопрос", то твой if вернет тру
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
//здесь абзац (пробел строки) не нужен)
            }
        }
//здесь абзац (пробел строки) не нужен)
//здесь абзац (пробел строки) не нужен)
    }
//здесь абзац (пробел строки) не нужен)
//здесь абзац (пробел строки) не нужен)
    pubpic static boolean getRandomAnswer() {
        return new Random().nextBoolean();
    }
   
   private static boolean isQuestion(String questionToCheck) {
        if (questionToCheck == null) {
            return false;
        } else {
            return questionToCheck.endsWith(QUESTION_SYMBOL);
        }
    }
}





