/* Дано: boolean b = true; boolean d = false;
Задание: Используя &, | вывести на экран выражение, НО сначала подумайте сами что будет выведено
a & b
a | b
*/
public class Task9 {
    public static void main (String [] args){
        boolean a = true;
        boolean b = false;

        boolean c = a & b;
        System.out.println(c);//false

        boolean d = a | b;
        System.out.println (d);//true

    }
}
