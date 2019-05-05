/*Дано: public class MyClass {
            public static void main(String[] args) {
            int x=0;
        System.out.println(x+1);
        System.out.println(x++);
        System.out.println(++x);
    }
}
Задание: Что будет выведено на экран? Прежде чем запустить программу подумайте сами
*/

public class Task7 {
    public static void main(String[] args) {
        int x=0;
        System.out.println(x+1);//1
        System.out.println(x++);//0
        System.out.println(++x);//2
    }
}
