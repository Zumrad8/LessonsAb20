package lesson_30;

public class Homework_30 {
    public static void main(String[] args) {
        String str1 = "rosa";
        String str2 = "asor";
        System.out.println(isAnagram(str1, str2));

    }
    /*
    Task2
    2. Написать метод, проверяющий являются ли две строки анаграммами
    abc - cba  rosa - asor - анаграмма
    abc - dba  - не анаграмма
    boolean isAnagram( String str1, String str2)
     */

    public static boolean isAnagram(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder(str1);
        StringBuilder stringBuilder2 = new StringBuilder(str2);
        return stringBuilder.toString().equals(stringBuilder2.reverse().toString());
    }




     /*
    Используя принципы отбрасывания констант и оставления только максимально быстро растущего элемента найти асимптотики для следующих функций:

    f(n) = 9n +73           -> f(n) = n
    f(n) = 235              -> f(n) = 1
    f(n) = n^2 + 7n +123    -> f(n) = n^2
    f(n) = n^3 +2000n +8765 -> f(n) = n^3
     f(n) = n + sqrt(n)     -> f(n) = n
     */
}
