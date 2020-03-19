package hw_m02_09;
import java.util.Random;

public class Employee {
    private int id;
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.id = new Random().nextInt();
        this.name = name;
        this.surname = surname;
    }

    public Employee() {
        this.id = new Random().nextInt();
    }

    public void print() {
        System.out.println(id + " " + name + " " + surname);
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}