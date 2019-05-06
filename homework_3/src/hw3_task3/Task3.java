package hw3_task3;
/*Дано: Строка “Whara is my dog+”
Задание: Заменить все буквы “a” на “e”. Заменить “ + “ на знак вопроса
Вывести полученную фразу на экран
*/
    public class Task3 {

    public static void main(String[] args) {

        String dog = new String("Whara is my dog+");
        dog = dog.replace("a", "e");
        dog = dog.replace("+", "?");

        System.out.println(dog); //Where is my dog?

    }
}


