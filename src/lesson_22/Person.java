package lesson_22;

public class Person {
    public boolean getAge;
    private String name;
    private boolean isKind;
    private boolean isHaveSpecialRequirements;

    public Person(String name) {
        this.name = name;
    }




    public boolean isHaveSpecialRequirements() {
        return isHaveSpecialRequirements;
    }

    public void setHaveSpecialRequirements(boolean haveSpecialRequirements) {
        isHaveSpecialRequirements = haveSpecialRequirements;
    }

    public boolean isKind() {
        return isKind;
    }

    public void setKind(boolean kind) {
        isKind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void move() {
        System.out.println("Я передвигаюсь");
    }

}
