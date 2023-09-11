package lesson_37;

import java.util.List;

public class Homework {
    /*
    Написать метод, принимающий не пустой лист строк и возвращающий строку,
    которая встречается раньше в листе - самую короткую или самую длинную.
    Все строки в листе разной длины
     */
    public String findShortestOrLongest (List<String> list) {
        String minSizeElement = list.get(0);
        int indexMinElement = 0;
        String maxSizeElement = list.get(0);
        int indexMaxElement = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < maxSizeElement.length()) {
                minSizeElement = list.get(i);
                indexMinElement = i;
            } else if (list.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = list.get(i);
                indexMaxElement = i;
            }

        }
            if(indexMinElement < indexMaxElement){
                return minSizeElement;
            }
            return maxSizeElement;

        }
    }


