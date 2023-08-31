package lesson_31.wrapper_classes_and_generics;

public class Practice {
    /*
     Написать метод, который принимает строку и паттерн и возвращает количество вхождений паттерна в строку.
     Пример: ("Hello World", "l") -> 3
     */
    public static void main(String[] args) {
        String string = "Hello World hello";
        String str = "l";
        int count = returnNumbersOfPatterns(string, str);
        System.out.println(count);

        System.out.println("-----Второй способ------");

        System.out.println(countOccurences("Hello world hello", "l"));

    }

    public static int returnNumbersOfPatterns (String string, String pattern) {
        int count = 0;
        int patternLength = pattern.length();
        int index  = string.indexOf(pattern);

        while (index != -1) {
            index = string.indexOf(pattern,index + patternLength);
            count++;


        }
        return count;
    }

    //второй способ
    public static int countOccurences(String str, String pattern) {
        int count = 0;
        int lastIndex = str.lastIndexOf(pattern);

        for (int i = 0; i < str.length(); i++) {
            if(lastIndex != -1){
                count++;
                lastIndex = str.lastIndexOf(pattern,lastIndex - pattern.length());
            }

        }
        return count;
    }
}
