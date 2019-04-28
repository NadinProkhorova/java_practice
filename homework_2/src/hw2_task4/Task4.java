package hw2_task4;
/*Попытайтесь создать некоторые недопустимые имена полей и посмотрите,
     какую ошибку компилятор производит.
    Например:
    Int a = “Hello”;*/
public class Task4 {

    public static void main(String[] args) {
       // boolean bool = 'A' ;
       // byte numb1 = 128;
       // short numb2 = "Hello";
       // int numb3 = 27_456_989.567;
       // long numb4  = -389_765_999_765_987_456_898;
       // float numb5 = 56.345;
       // double numb6 = 987,987;
       // char symb = aA;
//Ошибка компиляции

        boolean bool = true ;
        byte numb1 = 127;
        short numb2 = 1_567;
        int numb3 = 27_456_989;
        long numb4  = -389_765_999;
        float numb5 = 56.345f;
        double numb6 = 987.987;
        char symb = 'Y';

        System.out.println( bool );
        System.out.println( numb1 );
        System.out.println( numb2 );
        System.out.println( numb3 );
        System.out.println( numb4 );
        System.out.println( numb5 );
        System.out.println( numb6 );
        System.out.println( symb );
    }

}



