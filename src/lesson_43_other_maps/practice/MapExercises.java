package lesson_43_other_maps.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapExercises {
    /*
    1.Дана Map<String,String> map. Написать метод, который вернет мапу, такую что если в исходной мапе есть ключи
    "a" и "b", то нужно создать новый ключ "ab"  и в качестве значения для него должна быть сумм значений ключей
    "a" и "b".
    Если нет, ничего в мапе не менять

    Примеры:
    mapAB { "a": "Hi", "b" : "There"} ->  { "a":"Hi",    "ab":"HiThere",    "b" :"There"}
    mapAB { "a": "Hi"} -> { "a": "Hi"}
    mapAB { "b": "There"} -> { "b": "There"}
     */

   public static Map<String, String> ab (Map<String,String> mapAB) {
       if(mapAB.containsKey("a") && mapAB.containsKey("b")) {
           String abValue = mapAB.get("a").concat(mapAB.get("b"));
           mapAB.put("ab", abValue);
       }
       return mapAB;

   }

    public static void main(String[] args) {
        Map<String, String> abM= new HashMap<>();
        abM.put("a","Hi");
        abM.put("b", "There");
        System.out.println(abM);
        System.out.println(ab(abM));



    }
}
