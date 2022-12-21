package FuramaResort.Models;

public abstract class Person {
    private int cccd;
    private String name;
    private int age;
    private String gender;

    public Person(int cccd, String name, int age, String gender) {
        this.cccd = cccd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public abstract void howToMove(String move);
}