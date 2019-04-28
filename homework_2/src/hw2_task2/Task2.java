package hw2_task2;

/*Создайте переменные каждого типа не инициализируя их, выведите значения на экран.
Например:
int a;
sout(a)
*/
public class Task2 {

    public static void main(String[] args) {
        //boolean bool;
        //short numb2;
        //int numb3;
        //long numb4;
        //float numb5;
        //double numb6;
        //char symb;

        //System.out.println("Переменная типа boolean = " + bool );
        //System.out.println("Переменная типа byte = " + numb1 );
        //System.out.println("Переменная типа short = " + numb2 );
        //System.out.println("Переменная типа int = " + numb3);
        //System.out.println("Переменная типа long = " + numb4);
        //System.out.println("Переменная типа float = " + numb5);
        //System.out.println("Переменная типа double = " + numb6);
        //System.out.println("Переменная типа char = " + symb);

        // Такой код не компилируется. Проблемы компиляции из-за того, что переменные неинициализированы
        // Правильным решением будет создание переменных с их инициализацией

        boolean bool = true;
        byte numb1 = 127;
        short numb2 = 30567;
        int numb3 = 127_238;
        long numb4 = 123_456_6789;
        float numb5 = 4.5f;
        double numb6 = 46.987;
        char symb = 'A';

        System.out.println("Переменная типа boolean = " + bool );
        System.out.println("Переменная типа byte = " + numb1 );
        System.out.println("Переменная типа short = " + numb2 );
        System.out.println("Переменная типа int = " + numb3);
        System.out.println("Переменная типа long = " + numb4);
        System.out.println("Переменная типа float = " + numb5);
        System.out.println("Переменная типа double = " + numb6);
        System.out.println("Переменная типа char = " + symb);
    }

}


