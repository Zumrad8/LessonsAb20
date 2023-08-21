package lesson_25;


public class Homework_25 {
    public static void main(String[] args) {

        /*
        Задача 1
        Написать метод, проверяющий заканчивается ли строка
        содержимым другой строки.
        public boolean strEndsWithAnotherStr ( String str1, str2)
         */
        String str1 = "Java is perfect";
        String str2 = "perfect";
        System.out.println("str1 ends with PERFECT? " + str1.endsWith(str2));


    /*
    Задача2
    Написать метод, создающий массив символов из содержимого строки
    public char[] createsCharArray( String str)
     */

        String str3 = new String("Perfect Java");
        char[] createCharArray = str3.toCharArray();
        for( char c : createCharArray)
            System.out.println(c + " ");
        /*


        System.out.println("Char array: ");
        for (int i = 0; i < createCharArray.length; i++) {
            System.out.println("Value [" + i +"]: " + createCharArray[i]);
        }

         */



    /*
    Задача 3*
    Написать метод, удаляющий из строки повторяющиеся символы
    String removeDuplicateChars( String string)
    пример: "abbccccaadb" -> "abcd"
    */


    }


}
