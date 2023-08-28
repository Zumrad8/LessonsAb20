package lesson_25;

public class Lesson_25 {
    public static void main(String[] args) {
        String str = "Hello";
        String str3 = "Hello";
        String str4 = "Hell";
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str == str3);
        System.out.println(str == str4);
        System.out.println(str == str1);

        // создается пустая строка
        String str5 = new String();

        // массив символов
        char[] array = {'h','e','l','l','o'};

        // строка из массива символов
        String strArr = new String(array);
        System.out.println(strArr);

        String strStr = new String("Hello");
        System.out.println(strStr);

        // метод строк
        // charAt( int index) - возвращает символ на позиции index в строке

        String string = "Hello Java";
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(2));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(4));
        System.out.println(string.charAt(5));
        System.out.println(string.charAt(6));
        System.out.println(string.charAt(7));
        System.out.println(string.charAt(8));
        System.out.println(string.charAt(9));

        String strHello = "Hello";
        System.out.println(strHello.charAt(0));
        System.out.println(strHello.charAt(4));

        System.out.println(strStr.length());
        System.out.println(strStr.charAt(str.length()-1));
       // System.out.println(strStr.charAt(8));

       // boolean eq

    }
}
