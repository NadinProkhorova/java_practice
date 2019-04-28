package hw2_task6;
/*Вывести на экран следующий текст - две строки:
      It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"*/
public class Task6 {

    public static void main(String[] args) {
        String str1 = "It's Windows path:" ;
        String str2 = "C:";
        String str3 = "Program Files";
        String str4 = "Java";
        String str5 = "jdk1.7.0";
        String str6 = "bin";

        System.out.println(str1);
        System.out.print("\"" +  str2 + "\\" + str3 + "\\" + str4 + "\\" + str5 + "\\"+ str6 + "\"" + "*" + "/" );

    }

}
