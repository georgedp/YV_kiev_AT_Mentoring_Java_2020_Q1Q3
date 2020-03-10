package hw_m02_10;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee(String first, String last, int id) {
        firstName = first;
        lastName = last;
        this.id = id;
    }

    public static double print(String first, String last, int id) {
        System.out.println("Name: " + Employee.setFirstName(first));
        System.out.println("surname : " + Employee.setLastName(last));
        System.out.println("id : " + Employee.setId(id));
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSocialSecurityNumber() {
        return this.id;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    // abstract method overridden by concrete subclasses
    public abstract double earnings(); // no implementation here
} // end abstract class Employee
