package task4;
/* Напишите программу, которая меняет местами элементы одномерного массива из
String в обратном порядке. Не используйте дополнительный массив для хранения результатов.
Дано: String[] original = { &quot;Каждый &quot;,&quot; охотник &quot;,&quot;
желает &quot;,&quot; знать &quot;,&quot; где &quot;,&quot; сидит &quot;,&quot; фазан &quot;};
Результат: фазан  сидит  где  знать  желает  охотник Каждый
*/

public class Task4_ArrayChange {

    public static void main(String[] args) {

        String[] original = new String[]{"Каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
        for (int i = 0; i < original.length; i++) {
            System.out.print(" " + original[i] + "   ");
        }
        System.out.println();
        for (int i = (original.length -1); i>= 0 ;i-- ){
            System.out.print(" " + original[i] + "   ");

        }

    }

}
