package task6;

public class Additional {
    public static void main(String[] args) {

        String [] arr = new String[17]; // инициируем массив под 17 элементов
        int k = 16; // максимальный индекс массива строк

        int i; // строки
        int j; // столбцы

        for (i = 0; i < 9; i++) {//формирование 9 строк
            String str1 = ""; // прямая строка
            String str2 = ""; // обратная строка

            //String s = "";
            for (j = 0; j < 9; j++) {// columns

                if (j <= i) { // формируем значения для строки - прямой и обратной
                    str1 = str1 + (j + 1);
                    str2 = (j + 1) + str2;
                } else { // добавляем пробелы в строки - прямую и обратную
                    str1 = str1 + " ";
                    str2 = " " + str2;

                }
            }


            arr[i] = str1 + str2; // сохраняем в элемент массива прямую и обратную строку
            arr[k] = arr[i]; // сохраняем строку зеркально относительно 10 строки

            k--;

        }

        for (i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

    }
}


