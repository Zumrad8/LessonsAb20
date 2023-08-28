package lesson_30;

public class Practice {
    /* Task 1
     Написать свою реализация метода substring, который работает так же, как метод substring класса String,
     принимающий три аргумента - строку, индекс начала и индекс конца. Метод substring класса String не использовать.

    Task2
    2. Написать метод, проверяющий являются ли две строки анаграммами
    abc - cba  rosa - asor - анаграмма
    abc - dba  - не анаграмма
    boolean isAnagram( String str1, String str2)
     */



    public static void main(String[] args) {
        System.out.println("Hello".substring(1,3));
        System.out.println(mySubstring("Hello", 1,3));




    }

    public static String mySubstring (String string, int begin, int end) {
        // доп. проверки
        if(string == null || begin < 0 || end > string.length())
            return string;

       StringBuilder sb = new StringBuilder();
        for (int i = begin; i < string.length()&& i < end; i++) {
            sb.append(string.charAt(i));

        }
        return new String(sb);




    }

}
