public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (age<0) {
            throw new IllegalArgumentException("Указанный возраст меньше 0");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void editAge(int age) {
        if (age<0) {
            throw new IllegalArgumentException("Указаный возраст меньше 0");
        }
        this.age = age;
    }

    public String toString() {
        return "Имя: " + this.name + " Возраст: " + this.age;
    }

    public boolean isAdult() {
        return age < 18;
    }

    public int increaseAge(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Указаный возраст меньше 0");
        }
        return age += increment;
    }
}
