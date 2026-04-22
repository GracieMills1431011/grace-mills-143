package module6minibible;
/* ==========================================================
                📦 JAVA IMPORT TOOLBOX 📦
   ==========================================================
   These import statements unlock Java tools we need for this
   Mini Bible.

   Think of imports like opening different toolboxes:
   some help with collections, and some help with exceptions.
   ========================================================== */
import java.util.ArrayList; // ArrayList stores multiple objects in order and can grow/shrink as needed
import java.util.List;      // List is the interface type that gives flexibility when storing objects

import java.io.FileNotFoundException; // Narrower checked exception used in overriding examples
import java.io.IOException;           // General checked exception used in superclass method examples

/* ==========================================================
   Name: Graciela Garcia
   Date: (fill in)
   Purpose:
   Module 6 Mini-Bible — structured, comment-heavy,
   professor-friendly study guide.

   Lessons (Correct Order):
   ✅ Lesson 1: Polymorphism Overview
   ✅ Lesson 2: Compile-Time vs. Run-Time Polymorphism
   ✅ Lesson 3: Dynamic Method Dispatch
   ✅ Lesson 4: Abstract Classes and Methods
   ✅ Lesson 5: Type Casting and Type Checking
   ✅ Lesson 6: Exception Handling and Polymorphism
   ✅ Lesson 7: Testing Polymorphic Code
========================================================== */


/* ==========================================================
            ⭐ Understanding Polymorphism ⭐
  -----------------------------------------------------------
       📌 Polymorphism means "many forms."
       📌 It lets one reference type work with many object types.
       📌 The SAME method call can produce DIFFERENT behavior.

       Real-life idea:
       📱 A smartphone can be a camera, music player,
          and phone depending on how you use it.



 /* ==========================================================
                🧠 Vocabulary (Know These!) 🧠
   -----------------------------------------------------------
    ⭐ Polymorphism           → one interface, many behaviors
    ⭐ Method Overloading     → same method name, different parameters
    ⭐ Method Overriding      → subclass replaces inherited method behavior
    ⭐ Dynamic Dispatch       → runtime decides which overridden method runs
    ⭐ Superclass Reference   → parent type variable storing child object
    ⭐ Upcasting              → subclass → superclass (automatic)
    ⭐ Downcasting            → superclass → subclass (manual)
    ⭐ Abstract Class         → blueprint that cannot be instantiated
    ⭐ Abstract Method        → method with no body in abstract class

 ========================================================== */


/* ==========================================================
                💡 WHEN TO USE WHAT 💡
   ==========================================================

   Use OVERLOADING when:
   → Same action, different inputs

   Use OVERRIDING when:
   → Same action, different behavior

   Use ABSTRACT CLASS when:
   → Shared structure + partial implementation

   Use POLYMORPHISM when:
   → You want flexible, scalable systems

========================================================== */


/* ==========================================================
        🧠 THE MOST IMPORTANT RULE IN THIS MODULE 🧠
   ==========================================================

   ⭐ "Reference type determines ACCESS"
   ⭐ "Object type determines BEHAVIOR"

   Example:
       Animal animal = new Dog();

       animal.makeSound(); → Dog version runs ✅
       animal.fetch();     → ERROR ❌ (not in Animal)

========================================================== */

/* ==========================================================
                💖 Why Polymorphism Matters 💖
   -----------------------------------------------------------
   ✅ Reusable code
   ✅ Flexible design
   ✅ Easier maintenance
   ✅ Cleaner large systems
   ✅ Lets Java treat related objects in a general way
========================================================== */
public class module6minibible {



    /* ==========================================================
          💻 MAIN METHOD — Program execution starts here 💻
       ========================================================== */
    public static void main(String[] args) {

        // LESSON 1: POLYMORPHISM OVERVIEW
        lesson1_PolymorphismOverview();
        demoPolymorphism_GameCharacters();

        // LESSON 2: COMPILE-TIME vs RUN-TIME POLYMORPHISM
        lesson2_CompileTimeVsRunTime();
        demoMethodOverloading();
        demoMethodOverriding();

        // LESSON 3: DYNAMIC METHOD DISPATCH
        lesson3_DynamicMethodDispatch();
        demoDynamicDispatch_Animals();
        demoPolymorphicReferences();

        // LESSON 4: ABSTRACT CLASSES AND METHODS
        lesson4_AbstractClassesAndMethods();
        demoAbstractVehicleSystem();
        demoAbstractVsRegularClass();
        demoAbstractVsInterfaceReview();

        // LESSON 5: TYPE CASTING AND TYPE CHECKING
        lesson5_TypeCastingAndTypeChecking();
        demoUpcastingAndDowncasting();
        demoInstanceOfOperator();
        demoAvoidingClassCastException();

        // LESSON 6: EXCEPTION HANDLING AND POLYMORPHISM
        lesson6_ExceptionHandlingAndPolymorphism();
        demoExceptionsInOverriddenMethods();
        demoCovariantReturnTypesWithExceptions();

        // LESSON 7: TESTING POLYMORPHIC CODE
        lesson7_TestingPolymorphicCode();
        demoTestingPolymorphicCode_PrintOnly();
    }



    /* ==========================================================
                📘 Polymorphism Overview 📘
       ----------------------------------------------------------
                ⭐ Understanding Polymorphism ⭐:
                📌 Polymorphism means "many forms."
                📌 It lets one reference type work with many object types.
                📌 The SAME method call can produce DIFFERENT behavior.

                Real-life idea:
                📱 A smartphone can be a camera, music player,
                   and phone depending on how you use it.
       ========================================================== */
    private static void lesson1_PolymorphismOverview() {
    }


    /* ==========================================================
                  🎮 POLYMORPHISM DEMO 🎮
       ----------------------------------------------------------
            ✅ What is happening here?
            📌 We create an array of GameCharacter references.
            📌 Each array slot can hold ANY subclass of GameCharacter.
            📌 The attack() method is the same method name,
               but each subclass gives its own version.

            🧠 MEMORY RULE: Same call name → different behavior depending
                            on object type.
      ========================================================== */
    private static void demoPolymorphism_GameCharacters() {

        // Create an array that stores superclass references.
        GameCharacter[] characters = new GameCharacter[3];

        // Upcasting happens automatically here because Warrior IS-A GameCharacter.
        characters[0] = new Warrior();

        // Archer also IS-A GameCharacter.
        characters[1] = new Archer();

        // Mage also IS-A GameCharacter.
        characters[2] = new Mage();

        // Loop through each character and call attack().
        // Java chooses the correct overridden method at runtime.
        for (GameCharacter character : characters) {
            character.attack();
        }

        /* 🖨️Sample Output:🖨️
           Warrior slashes with sword!
           Archer shoots an arrow!
           Mage casts a fireball! */

    }



    /* ==========================================================
       ✅ LESSON 1 SUPPORTING CLASSES (Polymorphism Overview)
       ----------------------------------------------------------
        GameCharacter Inheritance Example
        Demonstrates method overriding and polymorphism
      ========================================================== */
    // The GameCharacter class is the superclass (parent class). | It defines a general attack behavior that can be inherited and overridden by subclasses.
    static class GameCharacter {
        // The attack method represents a generic attack action. | This method will be overridden in subclasses to provide more specific behaviors.
        public void attack() {
            System.out.println("GameCharacter attacks!");
        }
    }

    // The Warrior class is a subclass of GameCharacter. | It overrides the attack method to represent a melee-style attack.
    static class Warrior extends GameCharacter {
        //  Overrides the attack method from GameCharacter. | Demonstrates runtime polymorphism by changing behavior.
        @Override
        public void attack() {
            System.out.println("Warrior slashes with sword!");
        }
    }

    // The Archer class is a subclass of GameCharacter. | It overrides the attack method to represent a ranged attack.
    static class Archer extends GameCharacter {
       // Overrides the attack method from GameCharacter. | Provides a unique implementation for an archer.
        @Override
        public void attack() {
            System.out.println("Archer shoots an arrow!");
        }
    }

    // The Mage class is a subclass of GameCharacter. | It overrides the attack method to represent a magic-based attack.
    static class Mage extends GameCharacter {
        // Overrides the attack method from GameCharacter. | Demonstrates a spell-based attack behavior.
        @Override
        public void attack() {
            System.out.println("Mage casts a fireball!");
        }
    }



    /* ==========================================================
       📗 LESSON 2: Compile-Time vs. Run-Time Polymorphism 📗
       ----------------------------------------------------------
        ⚡ Two Main Forms of Polymorphism ⚡
         1) Compile-Time Polymorphism
              → Method Overloading
              → Decided by compiler

         2) Run-Time Polymorphism
              → Method Overriding
              → Decided by JVM during execution

         🧠 Quick Memory Trick 🧠
              ⭐ Overloading = SAME CLASS
              ⭐ Overriding = SUBCLASS

              ⭐ Compile-Time = static choice
              ⭐ Run-Time     = dynamic choice
       ========================================================== */
    private static void lesson2_CompileTimeVsRunTime() {


    }



    /* ==========================================================
                        ➕ METHOD OVERLOADING ➕
       ----------------------------------------------------------
        ✅ What is overloading?
            📌 Same method name
            📌 Different parameter lists
            📌 Compiler decides which version to use BEFORE the program runs
        ========================================================== */
    private static void demoMethodOverloading() {

        Calculator calc = new Calculator(); // Create Calculator object

        System.out.println("Sum of two integers: " + calc.add(5, 10));      // Calls add(int, int)
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));    // Calls add(double, double)

        Printer printer = new Printer(); // Create Printer object

        printer.print(42);          // Calls print(int)
        printer.print(42.42);       // Calls print(double)
        printer.print("Hello Java"); // Calls print(String)

        /*🖨️Sample Output:🖨️
           Sum of two integers: 15
           Sum of three integers: 30
           Sum of two doubles: 16.0
           Integer: 42
           Double: 42.42
           String: Hello Java
        */
    }



    /* ==========================================================
                       🔁 METHOD OVERRIDING 🔁
      ----------------------------------------------------------
      ✅ What is overriding?
           📌 A subclass redefines an inherited method.
           📌 Same method name
           📌 Same parameters
           📌 Same return type (or compatible covariant return type)
           📌 Runtime decides which version runs
       ========================================================== */
    private static void demoMethodOverriding() {

        Person person1 = new Student(); // Upcasting Student → Person
        Person person2 = new Faculty(); // Upcasting Faculty → Person

        person1.displayPerson(); // Calls Student version at runtime
        person2.displayPerson(); // Calls Faculty version at runtime

        /*🖨️Sample Output:🖨️
           This is a student.
           This is a faculty member.
        */
    }



    /* ==========================================================
       ✅ LESSON 2 SUPPORTING CLASSES (Overloading / Overriding)
       ========================================================== */
    static class Calculator {
        // Overloaded method #1
        // Same method name: add
        // Parameters: two ints
        // Purpose: adds two whole numbers
        public int add(int a, int b) {
            return a + b;
        }

        // Overloaded method #2
        // Same method name: add
        // Parameters: three ints
        // Purpose: adds three whole numbers
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // Overloaded method #3
        // Same method name: add
        // Parameters: two doubles
        // Purpose: adds two decimal numbers
        public double add(double a, double b) {
            return a + b;
        }
    }

    static class Printer {
        // Prints an integer value.
        public void print(int number) {
            System.out.println("Integer: " + number);
        }

        // Prints a decimal value.
        public void print(double number) {
            System.out.println("Double: " + number);
        }

        // Prints text.
        public void print(String text) {
            System.out.println("String: " + text);
        }
    }

    static class Person {
        // Base version of displayPerson().
        // Subclasses will override this method.
        public void displayPerson() {
            System.out.println("This is a person.");
        }
    }

    static class Student extends Person {
        // Override displayPerson() to provide Student-specific behavior.
        @Override
        public void displayPerson() {
            System.out.println("This is a student.");
        }
    }

    static class Faculty extends Person {
        // Override displayPerson() to provide Faculty-specific behavior.
        @Override
        public void displayPerson() {
            System.out.println("This is a faculty member.");
        }
    }



    /* ==========================================================
               📙 LESSON 3: Dynamic Method Dispatch 📙
        ----------------------------------------------------------
           📌 Java checks at runtime which overridden method to run.
           📌 Reference type controls what is accessible.
           📌 Object type controls what actually happens.

           💡 Easy memory trick:
           Compiler checks, JVM decides.
   ========================================================== */
    private static void lesson3_DynamicMethodDispatch() {

    }



    /* ==========================================================
                    🐾 DYNAMIC DISPATCH 🐾
      ========================================================== */
    private static void demoDynamicDispatch_Animals() {

        // Declare one superclass reference.
        Animal animal;

        // Store a Dog object in the Animal reference.
        animal = new Dog();
        animal.makeSound(); // Runtime chooses Dog.makeSound()

        // Reuse the SAME reference with a Cat object.
        animal = new Cat();
        animal.makeSound(); // Runtime chooses Cat.makeSound()

        /*🖨️Sample Output:🖨️
           Dog barks
           Cat meows
        */
    }



    /* ==========================================================
                    🧩 POLYMORPHIC REFERENCE 🧩
       ----------------------------------------------------------
        ✅ What is a polymorphic reference?
           📌 A superclass reference that can point to different
              subclass objects.
           📌 This lets us write general code.
        ========================================================== */
    private static void demoPolymorphicReferences() {

        List<Animal> animals = new ArrayList<>(); // Store Animal references in a list
        animals.add(new Dog());   // Add Dog object
        animals.add(new Cat());   // Add Cat object
        animals.add(new Bird());  // Add Bird object

        for (Animal animal : animals) {
            animal.makeSound(); // Same call, different result for each object
        }

        /*🖨️Sample Output:🖨️
           Dog barks
           Cat meows
           Bird chirps
        */
    }



    /* ==========================================================
        ✅ LESSON 3 SUPPORTING CLASSES (Dynamic Dispatch) ✅
       ========================================================== */
    static class Animal {
        // General version of makeSound().
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }

        // General version of getName().
        public String getName() {
            return "Animal";
        }
    }

    static class Dog extends Animal {
        // Override makeSound() with Dog behavior.
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }

        // Override getName() with Dog-specific return value.
        @Override
        public String getName() {
            return "Dog";
        }

        // Dog-specific method used after downcasting.
        public void fetch() {
            System.out.println("Dog is fetching the ball");
        }
    }

    static class Cat extends Animal {
        // Override makeSound() with Cat behavior.
        @Override
        public void makeSound() {
            System.out.println("Cat meows");
        }

        // Cat-specific method.
        public void purr() {
            System.out.println("Cat purrs");
        }
    }

    static class Bird extends Animal {
        // Override makeSound() with Bird behavior.
        @Override
        public void makeSound() {
            System.out.println("Bird chirps");
        }
    }



    /* ==========================================================
            📕 LESSON 4: Abstract Classes and Methods 📕
       ----------------------------------------------------------
           📌 Abstract class = blueprint
           📌 Cannot instantiate directly
           📌 Can have:
              ✔ fields
              ✔ constructors
              ✔ concrete methods
              ✔ abstract methods

           📌 Abstract methods have NO body.
           📌 Subclasses must implement them unless they are abstract too.
       ========================================================== */
    private static void lesson4_AbstractClassesAndMethods() {

    }


    /* ==========================================================
                        🚗 ABSTRACT VEHICLES 🚗
      ----------------------------------------------------------
       ✅ Why use an abstract class here?
           📌 All vehicles share make/model.
           📌 All vehicles can display info.
           📌 But different vehicles start differently.

           So Vehicle is the perfect blueprint.
      ========================================================== */
    private static void demoAbstractVehicleSystem() {

        Vehicle car = new CarVehicle("Toyota", "Corolla");
        Vehicle motorcycle = new MotorcycleVehicle("Harley-Davidson", "Iron 883");

        car.displayInfo();
        car.startEngine();

        System.out.println();

        motorcycle.displayInfo();
        motorcycle.startEngine();

        /*🖨️Sample Output:🖨️
           Vehicle Make: Toyota, Model: Corolla
           Car engine starts with a key turn.

           Vehicle Make: Harley-Davidson, Model: Iron 883
           Motorcycle engine starts with a button press.
        */
    }

    /* ==========================================================
                    ✨ ABSTRACT vs REGULAR ✨
      ----------------------------------------------------------
      ✅ Key Differences Between Abstract and Regular Classes
      -------------------------------------------------------------------------------
     | Feature              Regular Class              Abstract Class                |
     | Instantiation        Can be instantiated        Cannot be instantiated        |
     | Abstract Methods     Not allowed                Can have abstract methods     |
     | Concrete Methods     Allowed                    Allowed                       |
     | Purpose              Fully implemented          Partial blueprint / template  |
      -------------------------------------------------------------------------------
        💡 Helpful way to think about it:
           Regular Class  = finished object you can build right now
           Abstract Class = starter blueprint that child classes must
                            finish
       ========================================================== */
    private static void demoAbstractVsRegularClass() {

        // RegularBook is a normal class, so we CAN instantiate it.
        RegularBook book = new RegularBook("Java Notes");
        book.showType();

        // We cannot do this with an abstract class:
        // Vehicle v = new Vehicle("Ford", "F-150");
        // That would be illegal because Vehicle is abstract.

        /*🖨️Sample Output:🖨️
           Regular class object created: Java Notes
        */

    }

    /* ==========================================================
                    🧠 ABSTRACT vs INTERFACE 🧠
                ✅ Abstract Class vs Interface
         ----------------------------------------------------------
           Purpose            → Abstract class = partial blueprint
                                Interface = contract

           Fields             → Abstract class can have instance variables
                                Interface usually stores constants

           Methods            → Abstract class can have abstract + concrete methods
                                Interface can have default/static methods

           Constructor        → Abstract class can have constructor
                                Interface cannot

           Inheritance        → One abstract class can be extended
                                Multiple interfaces can be implemented
       ========================================================== */
    private static void demoAbstractVsInterfaceReview() {

        PackageTracker tracker = new PackageTracker();
        tracker.track();

        /*🖨️Sample Output:🖨️
           Tracking package location...
        */
    }



    /* ==========================================================
       ✅ LESSON 4 SUPPORTING CLASSES (Abstract Classes)
       ========================================================== */
    static abstract class Vehicle {
        protected final String make;  // Shared vehicle brand
        protected final String model; // Shared vehicle model

        // Constructor for shared setup in subclasses.
        public Vehicle(String make, String model) {
            this.make = make;
            this.model = model;
        }

        // Concrete method shared by all vehicles.
        public void displayInfo() {
            System.out.println("Vehicle Make: " + make + ", Model: " + model);
        }

        // Abstract method with no body.
        // Each subclass must define HOW it starts.
        public abstract void startEngine();
    }

    static class CarVehicle extends Vehicle {
        public CarVehicle(String make, String model) {
            super(make, model);
        }

        // Car-specific engine start behavior.
        @Override
        public void startEngine() {
            System.out.println("Car engine starts with a key turn.");
        }
    }

    static class MotorcycleVehicle extends Vehicle {
        public MotorcycleVehicle(String make, String model) {
            super(make, model);
        }

        // Motorcycle-specific engine start behavior.
        @Override
        public void startEngine() {
            System.out.println("Motorcycle engine starts with a button press.");
        }
    }

    interface Trackable {
        // Interface method acts like a contract.
        // Any implementing class must define track().
        void track();
    }

    static class PackageTracker implements Trackable {
        // This class fulfills the Trackable contract.
        @Override
        public void track() {
            System.out.println("Tracking package location...");
        }
    }

    static class RegularBook {
        private final String title; // Stores the book title

        public RegularBook(String title) {
            this.title = title;
        }

        public void showType() {
            System.out.println("Regular class object created: " + title);
        }
    }




    /* ==========================================================
            📒 LESSON 5: Type Casting and Type Checking 📒
        ----------------------------------------------------------
                    🔄 Type Casting Basics 🔄
                    ⭐ Upcasting   → subclass to superclass
                    ✔ automatic
                    ✔ safe
                    ⭐ Downcasting → superclass to subclass
                    ✔ explicit
                    ⚠ risky if wrong object type
                    ⭐ instanceof  → checks type before downcasting
       ========================================================== */
    private static void lesson5_TypeCastingAndTypeChecking() {

    }

    /* ==========================================================
                        🎯 UPCAST / DOWNCAST 🎯
    ========================================================== */
    private static void demoUpcastingAndDowncasting() {

        Animal animal = new Dog(); // Upcasting is automatic
        animal.makeSound();        // Calls Dog version because of dynamic dispatch

        if (animal instanceof Dog) { // Always check first
            Dog dog = (Dog) animal;  // Downcasting back to Dog
            dog.fetch();             // Access Dog-specific method
        }

        /*🖨️Sample Output:🖨️
           Dog barks
           Dog is fetching the ball
        */
    }

    /* ==========================================================
                            🧪 INSTANCEOF 🧪
        ========================================================== */
    private static void demoInstanceOfOperator() {

        Animal animal = new Dog(); // Animal reference storing Dog object

        if (animal instanceof Dog) {
            System.out.println("animal IS a Dog");
        } else {
            System.out.println("animal is NOT a Dog");
        }

        Animal nullAnimal = null; // Create null reference

        if (nullAnimal instanceof Dog) {
            System.out.println("This line will not print.");
        } else {
            System.out.println("nullAnimal is not an instance of Dog.");
        }
    }

    /* ==========================================================
                        🛡️ AVOIDING BAD CASTS 🛡️
        ========================================================== */
    private static void demoAvoidingClassCastException() {

        Animal genericAnimal = new Animal(); // Plain Animal object, NOT a Dog

        if (genericAnimal instanceof Dog) {
            Dog invalidDog = (Dog) genericAnimal; // This line would only be safe if object were really Dog
            invalidDog.fetch();
        } else {
            System.out.println("genericAnimal is not an instance of Dog");
        }

        ArrayList<Animal> animals = new ArrayList<>(); // Type-safe collection with generics
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            animal.makeSound(); // No manual cast needed here
        }
    }

    /* ==========================================================
       📓 LESSON 6: Exception Handling and Polymorphism 📓
       -----------------------------------------------------------
        ⚠ Exceptions in Overriding ⚠
              📌 Subclass can throw:
              ✔ same checked exception
              ✔ narrower checked exception

             📌 Subclass cannot throw:
             ❌ broader checked exception

             💡 Memory Rule:
                Same or smaller, never bigger.
       ========================================================== */
    private static void lesson6_ExceptionHandlingAndPolymorphism() {

    }



    /* ==========================================================
                    📂 OVERRIDDEN EXCEPTIONS 📂
        ========================================================== */
    private static void demoExceptionsInOverriddenMethods() {

        TaskBase task = new FileTask(); // Superclass reference storing subclass object

        try {
            task.performTask(); // Calls subclass version at runtime
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        /*🖨️Sample Output:🖨️
           Subclass: Performing a task with file handling
        */
    }



    /* ==========================================================
                     🐶 COVARIANT RETURNS 🐶
       ========================================================== */
    private static void demoCovariantReturnTypesWithExceptions() {

        AnimalProvider provider = new DogProvider(); // Upcast DogProvider → AnimalProvider

        try {
            Animal animal = provider.getAnimal(); // Subclass returns Dog, stored in Animal reference
            System.out.println("Animal Name: " + animal.getName());
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        /*🖨️Sample Output:🖨️
           Subclass: Returning a Dog
           Animal Name: Dog
        */
    }

    /* ==========================================================
       ✅ LESSON 6 SUPPORTING CLASSES (Exceptions + Polymorphism)
       ========================================================== */
    static class TaskBase {
        // Superclass method declares IOException.
        public void performTask() throws IOException {
            System.out.println("Superclass: Performing a task");
        }
    }

    static class FileTask extends TaskBase {
        // Subclass is allowed to throw a narrower checked exception.
        @Override
        public void performTask() throws FileNotFoundException {
            System.out.println("Subclass: Performing a task with file handling");
        }
    }

    static class AnimalProvider {
        // Superclass method returns Animal and throws IOException.
        public Animal getAnimal() throws IOException {
            System.out.println("Superclass: Returning an Animal");
            return new Animal();
        }
    }

    static class DogProvider extends AnimalProvider {
        // Covariant return type: Dog is more specific than Animal.
        // Narrower exception is also allowed here.
        @Override
        public Dog getAnimal() throws FileNotFoundException {
            System.out.println("Subclass: Returning a Dog");
            return new Dog();
        }
    }



    /* ==========================================================
                🧪 LESSON 7: Testing Polymorphic Code 🧪
       -----------------------------------------------------------
                  ✅ What should be tested? ✅
                 ✔ Overridden methods
                 ✔ Dynamic method dispatch
                 ✔ Safe downcasting
                 ✔ Subclass-specific behavior
                 ✔ Exception behavior in hierarchies
       ========================================================== */
    private static void lesson7_TestingPolymorphicCode() {

    }

    /* ==========================================================
                        🧪 TESTING DEMO 🧪
      ========================================================== */
    private static void demoTestingPolymorphicCode_PrintOnly() {

        Employee worker1 = new Manager();   // Upcasting Manager → Employee
        Employee worker2 = new Developer(); // Upcasting Developer → Employee

        worker1.performTask(); // Calls Manager version
        worker2.performTask(); // Calls Developer version

        if (worker1 instanceof Manager) {
            Manager manager = (Manager) worker1; // Safe downcast
            manager.reviewReports();
        }

        if (worker2 instanceof Developer) {
            Developer developer = (Developer) worker2; // Safe downcast
            developer.writeCode();
        }

        /*🖨️Sample Output:🖨️
           Manager is managing a team.
           Developer is writing code.
           Manager is reviewing reports.
           Developer is writing Java code.
        */

        /* ======================================================
           ✅ Sample JUnit 5 Test Template (comment only) ✅
           ======================================================

           import org.junit.jupiter.api.Test;
           import static org.junit.jupiter.api.Assertions.*;

           public class PolymorphismTest {

               @Test
               public void testDynamicMethodDispatch() {
                   Employee worker1 = new Manager();
                   Employee worker2 = new Developer();

                   assertDoesNotThrow(worker1::performTask);
                   assertDoesNotThrow(worker2::performTask);
               }

               @Test
               public void testSafeDowncasting() {
                   Employee worker = new Manager();

                   if (worker instanceof Manager) {
                       Manager manager = (Manager) worker;
                       assertDoesNotThrow(manager::reviewReports);
                   } else {
                       fail("worker is not a Manager");
                   }
               }
           }
        */
    }

    /* ==========================================================
         ✅ LESSON 7 SUPPORTING CLASSES (Testing Examples) ✅
       ========================================================== */
    static class Employee {
        // Base task behavior.
        public void performTask() {
            System.out.println("Employee is performing a task.");
        }
    }

    static class Manager extends Employee {
        // Override performTask() with Manager behavior.
        @Override
        public void performTask() {
            System.out.println("Manager is managing a team.");
        }

        // Manager-specific method.
        public void reviewReports() {
            System.out.println("Manager is reviewing reports.");
        }
    }

    static class Developer extends Employee {
        // Override performTask() with Developer behavior.
        @Override
        public void performTask() {
            System.out.println("Developer is writing code.");
        }

        // Developer-specific method.
        public void writeCode() {
            System.out.println("Developer is writing Java code.");
        }
    }

    /* ==========================================================
                🎀 END NOTES / REVIEW BOX 🎀
       ==========================================================
       Helpful memory tricks:

       1) Overloading = same name, different parameters
          → compile-time

       2) Overriding = subclass replaces parent method
          → run-time

       3) Upcasting is automatic because child IS-A parent.

       4) Downcasting is risky, so use instanceof first.

       5) Abstract class = blueprint with shared logic.

       6) Exception rule in overriding:
          same checked exception or narrower only.

       7) Reference type controls ACCESS.
          Object type controls BEHAVIOR.
    ========================================================== */
}
