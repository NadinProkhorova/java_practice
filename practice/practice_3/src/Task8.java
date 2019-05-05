/*Дано: Int x = 5; Int y = 7;
Задание: Поменять значение переменных местами, не используя 3ю переменную, т.е. на выходе x = 7; y = 5;
*/
public class Task8 {
    public static void main (String [] args){
        int x = 5;
        int y = 7;

        x = x + y;
        y = y - x;
        y = -y;
        x = x - y;

        System.out.println( x +" "+ y);

    }
}
