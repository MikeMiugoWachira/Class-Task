/*This program is designed to display a person's details which include the name, age and address */

//Class representing a person
class Person {
    // The fields to store the name age and address of the person
    private String name;
    private int age;
    private String address;

    // Constructor to initialize the fields
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display the details of the person
    public void displayDetails() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
    }

    // Method that accepts a person object and calls the printCurrentInstance method
    public void myDetails(Person person) {
        person.displayDetails();
    }

    //Method to print the current instance details
    public void printCurrentInstance() {
        myDetails(this);
    }

    // Main method to create an object and call a method
    public static void main(String[] args) {
        // Creating an object
        Person Michael = new Person("Michael Miugo Wachira", 20, "500 Nakuru");

        // Calling the printCurrentInstance method
        Michael.printCurrentInstance();
    }

}
