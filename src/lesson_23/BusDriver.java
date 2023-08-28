package lesson_23;

import java.util.Arrays;

public class BusDriver {
    private final int id;
    private String name;
    private String[] categories;
    private int age;
    static private int counter;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addCategories(String categories) {
       //TODO
    }
    public void removeCategories(String categories) {
        //TODO
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "{id: " + id + "; name: " + name + "; categories: " + Arrays.toString(categories) + "}";
    }
    public void driveBus() {
        System.out.println("Водитель " + name + " управляет автобусом");
    }
    public boolean removeCategory(String category) {
        //1. Такая строка в массиве есть?
        //2. Нам нужен ее индекс
        //3. Непосредственно удаление из массива
      //  int idx = searchCategoryValue(category);
       // if (idx == -1) return false;

        String[] temp = new String[categories.length -1];
        for (int i = 0; i < temp.length; i++) {
           // if(i< idx) {
                temp[i] = categories[i];
           // } else {
                temp[i] = categories[i+1];

            }

       // }
        categories = temp;
        return true;
    }
   //private int searchCategoryValue (String category) {
       //  if (category == null || category.length() == 0 ||category)
       // }

       // public void testArrayCopy(int idx) {
       //  String[] strings = new String[categories.length -1];
       // System.out.println(categories, 0);
       //}


   }
