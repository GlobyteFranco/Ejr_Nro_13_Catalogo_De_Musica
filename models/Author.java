package models;

public class Author {
    private String name;
    private String lastName;
    private int age;
    private String monthlyListeners;

    public Author(String name, String lastName, int age, String monthlyListeners) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.monthlyListeners = monthlyListeners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMonthlyListeners() {
        return monthlyListeners;
    }

    public void setMonthlyListeners(String monthlyListeners) {
        this.monthlyListeners = monthlyListeners;
    }

    @Override
    public String toString() {
        return "Author [name=" + name + ", lastName=" + lastName + ", age=" + age + ", monthlyListeners="
                + monthlyListeners + "]";
    }

}
