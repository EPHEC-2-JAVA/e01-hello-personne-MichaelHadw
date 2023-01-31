package be.ephec.java.exercice.e05;

public class Person {

    public Person(String lastName, String firstName, int yearOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
    }

    private final String lastName;
    private final String firstName;
    public int yearOfBirth;

    public int age;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void computeAge(int year) {
        age = year - yearOfBirth;
    }

    public void display() {
        System.out.println(firstName + " " +
                lastName + " (" + age + " ans)");
    }
}

