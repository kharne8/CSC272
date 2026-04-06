// This program demonstrates the difference between a CLASS and OBJECTS

// CLASS = blueprint
class Smurf {

    // Properties (variables) that describe a Smurf
    String name;
    String role;

    // Constructor to initialize each Smurf object
    public Smurf(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Method (behavior) that each object can use
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and my role is " + role + ".");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {

        // OBJECTS = instances of the Smurf class

        // Creating different Smurf objects from the same class
        Smurf smurf1 = new Smurf("Papa Smurf", "Leader");
        Smurf smurf2 = new Smurf("Brainy Smurf", "Smart One");
        Smurf smurf3 = new Smurf("Hefty Smurf", "Strong One");

        // Each object uses the same method but has different data
        smurf1.introduce();
        smurf2.introduce();
        smurf3.introduce();

        // Showing that these are separate objects
        System.out.println("\nEach Smurf is an object created from the same class, but with unique values.");
    }
}
