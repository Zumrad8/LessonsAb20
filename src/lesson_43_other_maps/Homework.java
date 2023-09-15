package lesson_43_other_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Homework {
    /*
    Task 1*
    Дан массив строк ( не пустой). Написать метод,принимающий этот
    массив и возвращающий мапу Map<String,Boolean> где каждая строка является ключом,
    а значением является true если строка в массиве встречается больше одного раза и false если только один раз.
    Примеры:
    [a,b,a,c,b]- a:true b:true c:false
    [a,b,c]- a:false b:false c:false
    [c,c,c]- c:true
     */

    public static Map<String, Boolean> findTrueFalse(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], map.containsKey(strings[i]));

        }
        return map;
    }

    // Второй вариант решения используя forEach

    public Map<String, Boolean> findTrueFalse2(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String string : strings){
            map.put(string, map.containsKey(string));

        }
        return map;

    }

    // Третий вариант решения
    public Map<String, Boolean> findTrueFalse3(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String string : strings){
           if(map.containsKey(string)){
               map.put(string,true);
           }
           else map.put(string,false);

        }
        return map;

    }



    public static void main(String[] args) {
        String[] strings = {"a", "b", "a", "c","c","d"};
        System.out.println(findTrueFalse(strings));
    }


}
