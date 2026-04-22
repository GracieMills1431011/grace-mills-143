package module5minibible;
/* ==========================================================
   🌟 MODULE 5 MINI BIBLE - LESSON 1: INHERITANCE 🌟
    --------------------------------------------------------
   FILE NAME: Module5Lesson1MiniBible.java
   PACKAGE: module5minibible

   PURPOSE: This file teaches the BIG IDEA of inheritance in Java.
   It explains:
   ✔ what inheritance is
   ✔ how classes relate to each other
   ✔ how the extends keyword works
   ✔ how subclasses inherit fields and methods
   ✔ how method overriding works
   ✔ why inheritance helps reduce duplicate code
   ----------------------------------------------------------
                        💡 BIG IDEA 💡
   ----------------------------------------------------------
  Inheritance allows one class to reuse and extend
   another class’s fields and methods.

   Parent class  = superclass
   Child class   = subclass

   A subclass inherits common features from a superclass
   and may also add its own special features.

   WHY THIS MATTERS:
   ✔ reuse code
   ✔ reduce repetition
   ✔ organize related classes
   ✔ model real-world IS-A relationships
  ----------------------------------------------------------
  ========================================================== */




/* ==========================================================
   🧠 LESSON 1 EXPLANATION BREAKDOWN
   ==========================================================

   1. Animal is the superclass.
      - It holds common data: name, age
      - It has common behavior: makeSound()

   2. RescueDog extends Animal.
      - This means RescueDog inherits from Animal

   3. RescueDog uses super(name, age).
      - This sends name and age to the parent constructor

   4. RescueDog adds its own field: role
      - This is unique to the child class

   5. RescueDog overrides makeSound().
      - It changes the general animal sound
        into a dog-specific sound

   6. RescueDog can use inherited getters.
      - getName()
      - getAge()

   7. RescueDog can also have extra methods.
      - displayRole()

   ========================================================== */



/* ==========================================================
               🧠 Vocabulary (Know These!)  🧠
    --------------------------------------------------------
   ⭐ Inheritance -> When one class gets fields and methods from another class.
   ⭐ Superclass  -> The parent class. | It contains shared/common data and behavior.
   ⭐ Subclass    -> The child class. | It inherits from the superclass. | It can also add its own unique features.
   ⭐ Extends     -> Java keyword used to create inheritance.
   ⭐ Override / Overriding  -> When a subclass replaces an inherited method with its own version.
   ⭐ @Override   -> Annotation that tells Java: "This method should be overriding a parent method."
   ⭐ Hierarchy   -> The family tree / structure of related classes.
   ⭐ IS-A Relationship  -> The key clue for inheritance. | -> Example: A RescueDog IS AN Animal.
                            A Circle IS A Shape.| A Truck IS A Vehicle.
========================================================== */



/* ==========================================================
                💡 WHAT DOES WHAT? 💡
   ----------------------------------------------------------
   💗 BASIC SYNTAX 💗

   class Superclass {
       // shared fields and methods
   }

   class Subclass extends Superclass {
       // extra fields and methods
   }


   💞 SUPERCLASS 💞:
   📌 stores common/shared information
   📌 gives subclasses reusable code
   📌 acts like the general category

   💖 SUBCLASS💖:
   📌 inherits from the superclass
   📌 reuses parent code
   📌 can add special data or behavior
   📌 can override methods

   💞 EXTENDS KEYWORD💞:
   📌 creates the parent-child relationship

   💖 SUPER KEYWORD 💖:
   📌 used to call superclass constructor
   📌 used to access superclass methods/behavior
   📌 we will use more of this in later lessons

   💞 @OVERRIDE💞:
   📌 helps confirm that we are truly replacing a method from the parent class

   MEMORY TRICK 💡
   ----------------------------------------------------------
   extends = becomes a more specific version of

   Example:
   Circle extends Shape

   means:
   Circle is a specific kind of Shape.

   ========================================================== */



/* ==========================================================
             🩷 RELATIONSHIP STRENGTH SCALE 🩷
   ----------------------------------------------------------
   In Java design, relationships can be stronger or weaker.
   ✨ STRONGEST: INHERITANCE = IS-A relationship
      Example:
      A RescueDog IS AN Animal
      A Manager IS AN Employee
      A Circle IS A Shape

  ✨ MEDIUM: AGGREGATION = HAS-A relationship
     Example:
     A Library HAS Books
     A Team HAS Players

  ✨ STRONG HAS-A: COMPOSITION
     Example:
     A House HAS Rooms
     If House goes away, Rooms may not exist in that design

   🔥 IMPORTANT:🔥
     📌 Use inheritance only when the subclass truly IS-A type of the superclass.
     📌 Good: RescueDog extends Animal ✅ | Because a rescue dog really is an animal.
     📌 Bad: Animal extends Collar ❌ | Because an animal is NOT a collar.
   ========================================================== */




/* ==========================================================
                  🪄 MINI VISUAL MAP 🪄
   ==========================================================

             Animal
         ----------------
         - name
         - age
         + makeSound()
         + getName()
         + getAge()

                ▲
                |
                | extends
                |

            RescueDog
         ----------------
         - role
         + makeSound()   // overridden
         + getRole()
         + displayRole()

   ========================================================== */




/* ==========================================================
                🐾 WHY THIS EXAMPLE? 🐾
   ----------------------------------------------------------
                We are using:
                Animal    -> superclass
                RescueDog -> subclass

                Why?
                Because this is a clean real-world example of:
                RescueDog IS AN Animal

                This makes inheritance a perfect fit.
========================================================== */

public class Module5MiniBible {
    public static void main(String[] args) { // 🚀 Program entry point



        /* ==================================================
                🐶 CREATING A SUBCLASS OBJECT 🐶
         ----------------------------------------------------
         💗 Here we are creating a RescueDog object.
         💗 RescueDog is the CHILD class. Animal is the PARENT class.
         💗 Notice that RescueDog gets:- name   (from Animal)
         📌 - age    (from Animal)
         📌 - role   (from RescueDog)

         This shows code reuse through inheritance.
        ================================================== */
        RescueDog dog1 = new RescueDog("Sunny", 4, "Emotional Support Dog"); // 🐶 Create RescueDog object (inherits name & age, adds role)

        System.out.println("🐾 DOG INFORMATION");  // 📋 DISPLAYING INFORMATION
        System.out.println("------------------------------");

        System.out.println("Name: " + dog1.getName()); // getName() is inherited from Animal
        System.out.println("Age: " + dog1.getAge()); // getAge() is inherited from Animal
        System.out.println("Role: " + dog1.getRole()); // getRole() belongs to RescueDog
        /* 🚨 IMPORTANT NOTE (THIS IS BIG)🚨
              Your output will change depending on:
              the dog’s name
              the dog’s age
              the dog’s role what you wrote inside displayRole() */

        System.out.println();




        /*==================================================
                🔊 METHOD CALL - OVERRIDDEN METHOD 🔊
         ----------------------------------------------------
        🎯 GOAL: Demonstrate METHOD OVERRIDING in action.

        🧠 WHAT IS HAPPENING:
         - The method makeSound() exists in BOTH:
            Animal (parent class)
            RescueDog (child class)

         - RescueDog OVERRIDES the method → meaning it provides its OWN version.
         - When we call dog1.makeSound() → Java uses the VERSION that belongs to
           RescueDog, NOT the one from Animal.

       🧩 THINK OF IT LIKE:
           Animal says: → "generic animal sound"
           RescueDog says: → "Nope, I bark 🐶"

       🔥 KEY CONCEPT:
        ✔ Method Overriding = child class REPLACES parent behavior
        ✔ Java chooses method at RUNTIME (Dynamic Binding)

       🚨 IMPORTANT:
          If RescueDog DID NOT override makeSound() → THEN Java would use the Animal version instead.
         ================================================== */
        System.out.println("🐾 SOUND TEST"); // Prints title
        System.out.println("------------------------------");

        // Calls the CHILD class version of makeSound()
        // Even though Animal had a makeSound() method | RescueDog replaced it with its own version because dog1 is a RescueDog object
        dog1.makeSound();

        /* 🖨️ EXPECTED OUTPUT 🖨️: SOUND TEST →
              RescueDog sound here - example: "Woof! I am a rescue dog!"  */
        System.out.println();




        /*==================================================
        💼 SUBCLASS-SPECIFIC METHOD (UNIQUE TO CHILD CLASS) 💼
        ----------------------------------------------------
        🎯 GOAL: Demonstrate a method that ONLY exists in the
                 subclass.
        ⭐ Concepts Demonstrated:
               📌 Inheritance (Animal → RescueDog)
               📌 Method Overriding (@Override)
               📌 Polymorphism (runtime method selection)
               📌 Dynamic Binding

        🧠 WHAT IS HAPPENING:
          - displayRole() is NOT in the Animal class
          - It ONLY exists in the RescueDog class

          - Because dog1 is a RescueDog object, → we can call methods that are specific to RescueDog.

        🧩 THINK OF IT LIKE:
           Animal → general category
           RescueDog → has a JOB (search, rescue, therapy 🐕)


       🔥 KEY CONCEPT:
         ✔ Subclass can have EXTRA methods not found in parent
         ✔ These methods are ONLY accessible through subclass objects

        🚨 IMPORTANT:
           If dog1 was declared as type Animal: → Animal dog1 = new RescueDog();
           ❌ You would NOT be able to call displayRole() → (unless casting is used)
         ================================================== */
        System.out.println("🐾 JOB / ROLE TEST"); // Prints title
        System.out.println("------------------------------");

        // Calls a method that ONLY exists in RescueDog
        dog1.displayRole();

        /* 🖨️ EXPECTED OUTPUT 🖨️: JOB / ROLE TEST:→
              "I am a rescue dog trained to help humans!" */
        System.out.println();





        /*==================================================
              🧵 TO-STRING TEST (OBJECT REPRESENTATION)🧵
       -----------------------------------------------------
        🎯 GOAL: Show how objects are converted into readable text.
        ⭐ Concepts Demonstrated:
               📌 Inheritance (Animal → RescueDog)
               📌 Method Overriding (@Override)
               📌 Polymorphism (runtime method selection)
               📌 Dynamic Binding

        🧠 WHAT IS HAPPENING:
          - Every object in Java has a toString() method
           → (inherited from the Object class)

        🧩 WITH OVERRIDING:
           We get readable, useful information about the object

         - Because dog1 is a RescueDog object,
         → we can call methods that are specific to RescueDog.

        🔥 KEY CONCEPT:
        ✔ toString() controls how an object prints
        ✔ System.out.println(object) automatically calls toString()

        🚨 IMPORTANT → WITHOUT OVERRIDING:
           Output would look like this → RescueDog@6d06d69c  ❌ (not helpful)
        ================================================== */
        System.out.println("🐾 OBJECT SUMMARY"); // Prints title
        System.out.println("------------------------------");

        // Automatically calls dog1.toString()
        System.out.println(dog1);

         /*🖨️ EXPECTED OUTPUT 🖨️: OBJECT SUMMARY:→
              RescueDog{name='Buddy', age=3, role='Rescue'}*/

        System.out.println();
    }
}




/* ==========================================================
                   🐾 SUPERCLASS: Animal 🐾
    ----------------------------------------------------------
   🧠 WHAT IT IS:
   📌 Animal is the parent class.

   🧠 WHAT IT DOES:
   📌 stores shared data
   📌 provides shared behavior
   📌 acts as the general category

   🧠 WHY IT EXISTS:
   📌 If many animal types share name and age,
   📌 we should write that code ONCE here, instead of repeating it in every subclass.

   ⭐ CONCEPTS DEMONSTRATED:
   📌 Inheritance (parent class)
   📌 Encapsulation (private variables + getters)
   📌 Method sharing (common behavior)
   📌 Method overriding (can be overridden by subclasses)

   💡 DESIGN NOTE:
   This class is meant to be extended by subclasses.
   It represents a general Animal, not a specialized one.
  ========================================================== */
class Animal { // 🐾 Parent class (superclass) that provides shared fields and methods for all animals


    // 📦 INSTANCE VARIABLES | These fields store data that all Animal objects can have.
    private String name; // animal's name
    private int age;     // animal's age

    // 🏗 CONSTRUCTOR | This constructor sets up the common Animal data.
    public Animal(String name, int age) {
        this.name = name; // save the name passed in
        this.age = age;   // save the age passed in
    }


    // 📢 SHARED METHOD | This method gives a general animal sound → A subclass may override this method later.
    //🚨 IMPORTANT: →  This method is designed to be overridden by subclasses. | If not overridden, this default version will run.
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    // 🔍 GETTER FOR NAME
    public String getName() {
        return name; // return the animal's name
    }

    // 🔍 GETTER FOR AGE
    public int getAge() {
        return age; // return the animal's age
    }


    // 🧵 TO-STRING METHOD | This returns a readable string representation of the object.
    // 🐶 Subclasses may override this to include more details.
    // Used when printing the object (System.out.println).
    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}




/* ==========================================================
                🐶 SUBCLASS: RescueDog 🐶
   ----------------------------------------------------------
   🧠 WHAT IT IS:
   📌 RescueDog is the child class.

   🧠 WHAT IT DOES:
   📌 inherits name and age from Animal
   📌 adds a new field called role
   📌 overrides makeSound()
   📌 adds its own special method

   🧠 RELATIONSHIP:
   📌 RescueDog IS AN Animal

   ========================================================== */
class RescueDog extends Animal {

    // 📦 SUBCLASS INSTANCE VARIABLE | This field is special to RescueDog.
    private String role; // example: therapy dog, service dog, etc.


    // 🏗 SUBCLASS CONSTRUCTOR
    public RescueDog(String name, int age, String role) { // This constructor must set: - inherited fields from Animal | - subclass field from RescueDog

        super(name, age);  // super(...) calls the Animal constructor first. |  This is how the inherited fields get initialized.

        this.role = role;  // Then the subclass sets its own field.
    }


    // 🔄 OVERRIDDEN METHOD This replaces the makeSound() method from Animal. | The @Override annotation helps Java verify it.
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof! The rescue dog barks happily.");
    }

    // 🔍 GETTER FOR ROLE
    public String getRole() {
        return role; // return the rescue dog's role
    }

    // ⭐ SUBCLASS-SPECIFIC METHOD
    // This method exists only in RescueDog.
    public void displayRole() {
        System.out.println(getName() + " works as a " + role + ".");
    }


    // 🧾 OVERRIDDEN TO-STRING | This version includes inherited data + subclass data.
    @Override
    public String toString() {
        return "RescueDog{name='" + getName() + "', age=" + getAge() + ", role='" + role + "'}";
    }
}

        /* ==========================================================
                🧠 FINAL SUMMARY (LESSON 1 - INHERITANCE) 🧠
          ----------------------------------------------------------
          ✔ RescueDog inherits from Animal
          ✔ It reuses common features (name, age)
          ✔ It adds its own feature (role)
          ✔ It overrides behavior (makeSound, toString)
          💡 Inheritance = reuse + specialization

          🏁 FINAL TAKEAWAY: A subclass builds on a superclass by
                             reusing and customizing behavior
     ========================================================== */

/*
   📌 SAMPLE OUTPUT 📌
   ┌──────────────────────────────────────────────┐
   │ 🐾 DOG INFORMATION                           │
   ├──────────────────────────────────────────────┤
   │ Name: Sunny                                  │
   │ Age: 4                                       │
   │ Role: Emotional Support Dog                  │
   └──────────────────────────────────────────────┘

   ┌──────────────────────────────────────────────┐
   │ 🐾 SOUND TEST                                │
   ├──────────────────────────────────────────────┤
   │ Woof! Woof! The rescue dog barks happily.    │
   └──────────────────────────────────────────────┘

   ┌──────────────────────────────────────────────┐
   │ 🐾 JOB / ROLE TEST                           │
   ├──────────────────────────────────────────────┤
   │ Sunny works as a Emotional Support Dog.      │
   └──────────────────────────────────────────────┘

   ┌──────────────────────────────────────────────┐
   │ 🐾 OBJECT SUMMARY                            │
   ├──────────────────────────────────────────────┤
   │ RescueDog{name='Sunny', age=4,               │
   │ role='Emotional Support Dog'}                │
   └──────────────────────────────────────────────┘ */




/* 💎 EXPLANATION BREAKDOWN 💎
   ----------------------------------------------------------
   💗  Animal is the superclass.
      - It holds common data: name, age
      - It has common behavior: makeSound()

   💗  RescueDog extends Animal.
      - This means RescueDog inherits from Animal

   💗  RescueDog uses super(name, age).
      - This sends name and age to the parent constructor

   💗  RescueDog adds its own field: role
      - This is unique to the child class

   💗  RescueDog overrides makeSound().
      - It changes the general animal sound
        into a dog-specific sound

   💗  RescueDog can use inherited getters.
      - getName()
      - getAge()

   💗  RescueDog can also have extra methods.
      - displayRole()


  💎  COMMON MISTAKES TO WATCH FOR💎
  ---------------------------------------------------------
   💗 Forgetting extends
       Wrong:
       class RescueDog { ... }

       Right:
       class RescueDog extends Animal { ... }

   💗 Forgetting super(...) in subclass constructor
      If the parent constructor needs values,
      you must call it correctly.

   💗 Misspelling overridden method names
      Example:
      makeSounds()  <-- wrong
      makeSound()   <-- right

      This is why @Override is helpful.

   💗 Using inheritance for the wrong relationship
      Inheritance is for IS-A relationships only.

   💗 Trying to access private parent fields directly
      Since name and age are private,
      the subclass should use getters if needed.


  💎 QUICK MEMORY TRICKS 💎
  ---------------------------------------------------------
   💗 SUPERCLASS = GENERAL
   💗 SUBCLASS   = SPECIFIC

   💗 Parent gives common features.
   💗 Child inherits + customizes.

   💗 Think: "Same foundation, more detail."

   💗 Another memory trick:

   💗 extends = "becomes a more specific version of"

   💗 RescueDog extends Anima MEANS:"RescueDog is a more specific kind of Animal."
   ========================================================== */




/* ==========================================================
                🎨 SAMPLE CODE EXAMPLE 🎨
   ---------------------------------------------------------
   We are going to use Shape and Circle instead of Car
   so your examples feel fresh and different.
   ========================================================== */

    /* 💞 SHAPE → CIRCLE FLOW 💞

    🔹 Constructor flow
    super(...) → parent sets inherited field(s) first
    this.variable → child sets its own field(s)

    🔹 Overriding flow
    super.method() → parent version runs first
    extra code     → child adds more detail

    🔹 Big picture
    Shape  = general class
    Circle = more specific class
    Circle IS-A Shape  */

// 🔷 SUPERCLASS: Shape
class Shape { // This is the PARENT class → it holds shared data and behavior

    // 📦 INSTANCE VARIABLE (FIELD)
    protected String color; // "protected" means: ✔ subclasses CAN access it directly |  ✔ other classes in same package can also access it

    // 🏗 CONSTRUCTOR
    public Shape(String color) { // This runs when a Shape object is created

        // "this.color" refers to the instance variable (field)
        // "color" (right side) is the parameter passed in
        this.color = color; // saves the passed-in color into the object
    }

    // 📢 METHOD (BEHAVIOR)
    public void displayInfo() { // This method prints basic information about the shape

        // System.out.println → prints text to the console
        System.out.println("Shape Color: " + color);  // "Shape Color: " is text | + color → attaches the value of the variable
    }
}



/* 💞 CIRCLE CLASS FLOW 💞
   🔹 Constructor flow
   super(color) → Shape sets inherited field (color)
   this.radius  → Circle sets its own field

   🔹 Method flow (displayInfo)
   super.displayInfo() → parent prints color first
   then Circle adds    → radius

   🔹 Big picture
   Circle IS-A Shape
   Child = extends + adds + overrides */

// 🔵 SUBCLASS: Circle
class Circle extends Shape { // Circle IS-A Shape (inheritance relationship)

    // 📦 INSTANCE VARIABLE (FIELD) |  This field ONLY exists in Circle (not in Shape)
    private double radius; // stores the radius of the circle

    // 🏗 CONSTRUCTOR
    public Circle(String color, double radius) { // This runs when a Circle object is created
        super(color); // calls Shape constructor to initialize inherited field (color)
        this.radius = radius; // Now we initialize the Circle-specific field | saves radius into the object
    }

    // 🔍 GETTER METHOD
    public double getRadius() { // This method returns the value of radius
        return radius; // gives back the radius value to whoever called the method
    }

    // 🔄 OVERRIDDEN METHOD | → @Override tells Java: → "This method MUST match a method from the parent class"
    @Override // overrides parent method to add more detail
    public void displayInfo() { // super.displayInfo() → calls the PARENT version of this method
        super.displayInfo(); // runs parent version first (prints color)
        System.out.println("Circle Radius: " + radius);
    }
}




/* ==========================================================
                💜 DRIVER CLASS: ExtendsDemo  💜
   ---------------------------------------------------------
   🌟 This demo shows: 🌟
   🩷 a regular Shape object
   🩷 a Circle object that extends Shape
   🩷 how overridden methods work
   🩷 how a getter returns child-specific data
   ========================================================== */
class ExtendsDemo {
    public static void main(String[] args) { // Main Starts

        // 🌟 START OF DEMO
        System.out.println("==================================================");
        System.out.println("🌟 extends KEYWORD DEMO");
        System.out.println("==================================================");
        System.out.println(); // blank line for spacing

        // 🔷 CREATE A SHAPE OBJECT
        Shape basicShape = new Shape("Blue"); // This creates a basic Shape object with color = Blue
        basicShape.displayInfo(); // Calls Shape's displayInfo() method

        System.out.println();  // blank line between sections

        // 🔵 CREATE A CIRCLE OBJECT
        Circle circle = new Circle("Red", 5.5);   // This creates a Circle object with: color = Red  (inherited from Shape) radius = 5.5 (belongs only to Circle)
        circle.displayInfo(); // Calls Circle's overridden displayInfo() method This prints parent info first, then child info

        System.out.println();

        // 💞 GETTER TEST
        System.out.println("Radius only: " + circle.getRadius()); // This calls the Circle getter and returns radius

        System.out.println(); // ✅ DEMO END
        System.out.println("==================================================");
        System.out.println("✅ Demo Complete");
        System.out.println("==================================================");
    }
}


/* 📌 SAMPLE OUTPUT 📌
   ┌──────────────────────────────────────────────┐
   │ 🌟 extends KEYWORD DEMO                      │
   ├──────────────────────────────────────────────┤
   │ Shape Color: Blue                            │
   │                                              │
   │ Shape Color: Red                             │
   │ Circle Radius: 5.5                           │
   │                                              │
   │ Radius only: 5.5                             │
   └──────────────────────────────────────────────┘  */


/* ==========================================================
                  💡 QUICK REMEMBER THIS 💡
   ----------------------------------------------------------
   ✨ Shape = parent class
   ✨ Circle = child class
   ✨ extends creates inheritance
   ✨ super(...) calls parent constructor
   ✨ super.displayInfo() runs parent method first
   ✨ Circle adds its own field: radius
   ========================================================== */





/* ==========================================================
                🌟  THE super KEYWORD 🌟
   ==========================================================
   TOPIC: The super Keyword

   PURPOSE:
   This section teaches how the super keyword works in Java
   inheritance.

   The super keyword helps a subclass reach back to its
   superclass.

   It can be used to:
   ✔ call superclass constructors
   ✔ call superclass methods
   ✔ access inherited behavior cleanly

   WHY THIS MATTERS:
   The child class can build on top of the parent class
   without rewriting everything from scratch.

   ========================================================== */



 /* ==========================================================
               🧠 Vocabulary (Know These!)  🧠
    --------------------------------------------------------
   ⭐ super                    -> A Java keyword that refers to the superclass (parent class).
   ⭐ superclass constructor   -> The constructor in the parent class.
   ⭐ constructor chaining     -> When one constructor calls another constructor.
                               -> In inheritance, a child constructor can call the parent constructor
                                  using super(...).
   ⭐ super(...)               -> Calls a superclass constructor.
   ⭐ super.methodName()       -> Calls a superclass method.
   ⭐ inherited attributes     -> Fields that come from the superclass.
   ⭐ overridden method        -> A method in the subclass that replaces the version from the superclass

========================================================== */



/* ==========================================================
                    💡 WHAT IS super? 💡
  ----------------------------------------------------------
   💖 The super keyword means: 💖

   ⭐ "Go to my parent class."
   📌 subclass uses super when it wants to:
   📌 initialize inherited data using a parent constructor
   📌 reuse the parent version of a method
   📌 keep code organized and avoid duplication

  ========================================================== */



/* ==========================================================
   🔑 WHAT DOES WHAT? - super EDITION
   ----------------------------------------------------------
 💗 BASIC SYNTAX -  super 💗

    // Calling the parent constructor
    class Subclass extends Superclass {

    public Subclass(...) {
    super(...); // must be the first statement
    }
     }

    // Calling a parent method
    class Subclass extends Superclass {

    public void methodName() {
    super.methodName(); // calls the parent version
    }
     }

 💞SUPER(...)💞:
 📌 calls the superclass constructor
 📌 used inside a subclass constructor
 📌 MUST be the first statement in the constructor

 💖 SUPER.DISPLAYINFO()💖:
 📌 calls the superclass version of displayInfo()
 📌 useful when the child wants to ADD to the parent method instead of fully replacing it

 💞 SUPERCLASS CONSTRUCTOR💞:
 📌 - sets up the inherited fields first

 💖 SUBCLASS CONSTRUCTOR 💖:
 📌 - sets up the child-specific fields after the parent part is initialized

   ----------------------------------------------------------
   💡 MEMORY TRICK 💡

   📌 this  = me / my current object
   📌 super = my parent class

   So think:
   📌 this  -> current class
   📌 super -> parent class

 ========================================================== */



/* ==========================================================
             🩷 RELATIONSHIP STRENGTH SCALE 🩷
   ==========================================================

   Person
      ▲
      |
      |  Employee IS-A Person
      |
   Employee

   This is a true inheritance relationship because:
   ✔ an Employee is a Person
   ✔ Employee is a more specific version of Person

   That means inheritance + super make sense here.

   ========================================================== */



/* ==========================================================
                👤 SUPERCLASS: Person 👤
   ----------------------------------------------------------
  🎯 WHAT IT IS:
      A general class that stores common person information.

  🧠 WHAT IT DOES:
     ✔ stores name
     ✔ stores age
     ✔ provides constructors
     ✔ provides displayInfo()

  🚨 WHY IT EXISTS:
     If many kinds of people exist in the program, they can all
     reuse this shared base class.

   ========================================================== */
class Person {  // 👤 Parent class → other classes (like Employee) can extend this

    // 📦 INSTANCE VARIABLES
    private String name; // stores the person's name → private = only this class can access directly
    private int age;    // stores the person's age → also private


    // 🏗 PARAMETERIZED CONSTRUCTOR | This constructor runs when we create a Person with values
    public Person(String name, int age) { // custom values for name and age.
        this.name = name;  // "this.name" → refers to the instance variable (field) name | "name" (right side) → the parameter passed in
        this.age = age;   // "this.name" → refers to the instance variable (field) age |  // save the passed-in age into the object
    }

    // 🏗 DEFAULT CONSTRUCTOR This runs when NO values are provided
    // This constructor provides default values.
    public Person() {
        this.name = "Unknown"; // default name
        this.age = 0;          // default age
    }

    // 📢 DISPLAY METHOD This method prints the basic person information.
    public void displayInfo() {
        // System.out.println → prints text to the console
        System.out.println("Name: " + name + ", Age: " + age);  // "Name: " + name → combines text with the variable value ", Age: " + age → continues building the output string
    }

    // 🔍 GETTERS allow OTHER classes to safely access private data
    public String getName() { // method that returns the name
        return name; // gives back the value stored in name
    }

    public int getAge() { // method that returns the age
        return age; // gives back the value stored in age
    }
}


/* ==========================================================
                 💼 SUBCLASS: Employee 💼
    ----------------------------------------------------------
  🎯 WHAT IT IS:
     A more specific type of Person.

  🚨 RELATIONSHIP:
      Employee IS-A Person

  🧠 WHAT IT DOES:
     ✔ inherits name and age
     ✔ adds department
     ✔ uses super(...) to call Person constructors
     ✔ uses super.displayInfo() to reuse parent method

   ========================================================== */
//  💼 SUBCLASS: Employee | Employee IS-A Person → inheritance relationship
class Employee extends Person { // extends = Employee inherits from Person

    // 📦 SUBCLASS FIELD
    private String department; // stores employee's department → ONLY exists in Employee (not in Person)

    // 🏗 PARAMETERIZED CONSTRUCTOR This constructor creates an Employee with custom values.
    public Employee(String name, int age, String department) {

        // super(name, age) calls the Person constructor first.
        // 🚨 This MUST be the first statement in the constructor.
        super(name, age); // This initializes inherited fields: name + age

        // After the parent fields are initialized,
        // the subclass initializes its own field.
        this.department = department; // save department into the object
    }

    // 🏗 DEFAULT CONSTRUCTOR This runs when NO values are passed
    public Employee() {  // This constructor creates an Employee with default values.

        // super() calls the no-argument constructor in Person.
        // That sets name = "Unknown" and age = 0.
        super();

        // Then Employee sets its own default value.
        this.department = "Unassigned"; // default department value
    }

    // 🔍 GETTER
    public String getDepartment() { // method to access private department field
        return department; // return the department value
    }

    // 🔄 OVERRIDDEN METHOD
    // This version adds employee information.
    @Override // tells Java: "this must match a parent method"
    public void displayInfo() {

        // super.displayInfo() → calls the PARENT version first
        // This prints: Name + Age
        super.displayInfo();

        // Then we ADD extra behavior (child-specific)
        System.out.println("Department: " + department); // prints department
    }
}


/* ==========================================================
                    🎨 DRIVER CLASS  🎨
   ==========================================================
   This class demonstrates how super works with:
   ✔ parameterized constructors
   ✔ default constructors
   ✔ superclass methods

   IMPORTANT:
   If this is inside one giant file, keep this class NON-public
   unless the file is named SuperKeywordDemo.java

   ========================================================== */
class SuperKeywordDemo {

    public static void main(String[] args) { // Main entry

        // 🌟 START OF DEMO
        System.out.println("==================================================");
        System.out.println("🌟 THE super KEYWORD DEMO");  // print title
        System.out.println("==================================================");
        System.out.println();

        // 🔵 CREATE EMPLOYEE USING PARAMETERIZED CONSTRUCTOR
        Employee emp1 = new Employee("Kevin", 30, "Computer Science"); // This creates an Employee object with custom values

        System.out.println("Employee 1 Details:"); // label for output
        emp1.displayInfo(); // Calls overridden method → prints name + age (parent) → then prints department (child)

        System.out.println(); // spacing

        // 🔵 CREATE EMPLOYEE USING DEFAULT CONSTRUCTOR
        Employee emp2 = new Employee(); // This creates an Employee with default values

        System.out.println("Employee 2 Details:"); // label for output
        emp2.displayInfo();  // Calls displayInfo again  → uses default values from Person + Employee

        System.out.println(); // spacing

        // 💞 EXTRA GETTER TEST
        System.out.println("Getter Check:");  // label

        // These call inherited + subclass getters
        System.out.println("emp1 name: " + emp1.getName()); // inherited from Person
        System.out.println("emp1 age: " + emp1.getAge()); // inherited from Person
        System.out.println("emp1 department: " + emp1.getDepartment());  // from Employee

        System.out.println(); // spacing

       /* ==========================================================
                🧠 FINAL SUMMARY (super KEYWORD) 🧠
         ----------------------------------------------------------
        ✔ super(...) calls the parent constructor first
        ✔ super.methodName() calls the parent version of a method
        ✔ subclass uses super to reuse and build on parent behavior
        ✔ parent fields are initialized before child fields

        💡 super = access + reuse parent behavior

        🏁 FINAL TAKEAWAY: A subclass uses super to connect to its
                           superclass and extend its functionality
       ========================================================== */
    }
}


/* 📌 SAMPLE OUTPUT 📌
   ┌──────────────────────────────────────────────┐
   │ 🌟 THE super KEYWORD DEMO                    │
   ├──────────────────────────────────────────────┤
   │ Employee 1 Details:                          │
   │ Name: Kevin, Age: 30                         │
   │ Department: Computer Science                 │
   │                                              │
   │ Employee 2 Details:                          │
   │ Name: Unknown, Age: 0                        │
   │ Department: Unassigned                       │
   │                                              │
   │ Getter Check:                                │
   │ emp1 name: Kevin                             │
   │ emp1 age: 30                                 │
   │ emp1 department: Computer Science            │
   └──────────────────────────────────────────────┘
*/


/* 💎 COMMON MISTAKES TO WATCH FOR 💎
---------------------------------------------------------
   💗 Putting super(...) anywhere except first
      Wrong:
      this.department = department;
      super(name, age);   // ❌ not allowed
      Right:
      super(name, age);   // ✅ must be first
      this.department = department;

   💗 Forgetting that Java inserts super()
      If the parent class has NO default constructor, your subclass constructor must explicitly call
      the correct parent constructor.

   💗 Confusing super with this
      this  -> current object/class
      super -> parent class

  💗 Overriding a method but forgetting to reuse parent logic
     Sometimes you want to fully replace behavior.
     Other times you want:
     super.displayInfo();
     plus extra subclass behavior.

  💗 Trying to access private parent fields directly
     Since name and age are private in Person,
     Employee cannot directly do:
     System.out.println(name); // ❌
     It must use parent methods if needed.


💎 QUICK MEMORY TRICKS 💎
  ---------------------------------------------------------
   💗 SUPER(…) = PARENT CONSTRUCTOR
   💗 SUPER.METHOD() = PARENT METHOD

   💗 "Before the child can finish building itself, it lets the parent build the parent part first."
       Parent first.
       Child second.

       That is the big constructor rule in inheritance.

   ========================================================== */



/* ==========================================================
   ==========================================================
   🌟 LESSON 5: EXCEPTION HANDLING + INHERITANCE 🌟
   ==========================================================
   ==========================================================

   BIG IDEA:
   Exception handling and inheritance work together to build
   organized, reusable, and safer programs.

   In Java:
   ✔ exceptions are part of a class hierarchy
   ✔ custom exceptions can be created using inheritance
   ✔ overridden methods must follow exception rules
   ✔ subclasses can refine how errors are handled

   WHY THIS MATTERS:
   This helps us build code that is:
   ✔ cleaner
   ✔ safer
   ✔ easier to debug
   ✔ easier to maintain

   ========================================================== */


/* ==========================================================
   📝 VOCABULARY BOX
   ==========================================================

   Throwable
   -> The top class in Java's error/exception hierarchy.

   Error
   -> Serious system-level problem.
   -> Usually NOT handled by normal application code.

   Exception
   -> A problem the program may be able to recover from.

   Checked Exception
   -> Must be declared or handled.
   -> Example: IOException

   Unchecked Exception
   -> Extends RuntimeException
   -> Does NOT have to be declared.
   -> Example: NullPointerException

   throws
   -> Used in a method header to declare possible exceptions.

   throw
   -> Used inside a method to actually create/send an exception.

   Custom Exception
   -> A user-defined exception class.

   Cause Chaining
   -> Linking one exception to another using a constructor.

   ========================================================== */


/* ==========================================================
   💡 WHAT DOES WHAT?
   ==========================================================

   Throwable
   - top of the hierarchy

   Error
   - serious problems
   - usually not recoverable

   Exception
   - recoverable or expected issues

   Exception subclass
   - more specific problem type

   Custom exception
   - lets YOU name and organize application-specific errors

   throw new SomeException(...)
   - actually sends the exception

   throws SomeException
   - warns that the method may send that exception

   try
   - code that might fail

   catch
   - code that handles the exception

   finally
   - code that runs whether or not an exception happens

   ========================================================== */


/* ==========================================================
   🌈 EXCEPTION HIERARCHY OVERVIEW
   ==========================================================

   Java exception handling follows a hierarchy:

   Throwable
   ├── Error
   └── Exception
       ├── Checked Exceptions
       └── RuntimeException
           └── Unchecked Exceptions

   ----------------------------------------------------------
   QUICK MEMORY TRICK
   ----------------------------------------------------------
   Checked Exception
   = Java CHECKS that you handle or declare it

   Unchecked Exception
   = usually programming mistakes / runtime logic issues

   ========================================================== */


/* ==========================================================
   💎 EXCEPTION HIERARCHIES
   ==========================================================

   Since exceptions are classes, they can use inheritance too.

   That means:
   ✔ custom exceptions can extend Exception
   ✔ custom exceptions can extend RuntimeException
   ✔ exception types can be organized in families

   This gives us:
   ✔ clear names
   ✔ better debugging
   ✔ better structure
   ✔ reusable error handling

   ========================================================== */


/* ==========================================================
   🔥 BEST PRACTICES FOR CUSTOM EXCEPTIONS
   ==========================================================

   ✔ Use descriptive names
      Example:
      InvalidOperationException
      is much clearer than just Exception

   ✔ Extend the correct base class
      Exception         -> checked
      RuntimeException  -> unchecked

   ✔ Provide meaningful messages
      Help future-you understand the problem

   ✔ Add constructors
      - message only
      - message + cause

   ✔ Only create custom exceptions when needed
      Do not make extra exception classes for no reason

   ========================================================== */


/* ==========================================================
   ⚠ RULES FOR OVERRIDING METHODS WITH EXCEPTIONS
   ==========================================================

   1. If parent method throws checked exceptions:
      child method cannot throw broader checked exceptions

   2. Child method CAN throw:
      ✔ fewer checked exceptions
      ✔ more specific checked exceptions

   3. Child method CAN throw unchecked exceptions freely

   4. If parent method declares NO checked exceptions:
      child method cannot add new checked exceptions

   ----------------------------------------------------------
   EXAMPLE IDEA
   ----------------------------------------------------------
   Parent:
   processData() throws Exception

   Child:
   processData() throws IOException      ✅ more specific
   processData() throws Exception        ✅ same
   processData() throws Throwable        ❌ broader

   ========================================================== */


/* ==========================================================
   🧠 LESSON 5 PART A:
   CUSTOM CHECKED + UNCHECKED EXCEPTIONS
   ========================================================== */


/* ==========================================================
   🚫 CUSTOM CHECKED EXCEPTION
   ==========================================================
   This must be declared or handled.
   ========================================================== */
class InvalidUserInputException extends Exception {

    // Constructor with message
    public InvalidUserInputException(String message) {
        super(message);
    }

    // Constructor with message + cause
    public InvalidUserInputException(String message, Throwable cause) {
        super(message, cause);
    }
}


/* ==========================================================
   ⚡ CUSTOM UNCHECKED EXCEPTION
   ==========================================================
   This does not have to be declared in the method header.
   ========================================================== */
class DataProcessingException extends RuntimeException {

    // Constructor with message
    public DataProcessingException(String message) {
        super(message);
    }

    // Constructor with message + cause
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}


/* ==========================================================
   🧠 LESSON 5 PART B:
   OVERRIDING METHODS THAT THROW EXCEPTIONS
   ========================================================== */


/* ==========================================================
   📦 BASE CLASS: DataProcessor
   ==========================================================
   This parent method declares a checked exception.
   ========================================================== */
class DataProcessor {

    public void processData() throws Exception {
        System.out.println("Processing data in DataProcessor...");
        throw new Exception("Generic data processing error.");
    }
}


/* ==========================================================
   📦 SUBCLASS: SpecializedDataProcessor
   ==========================================================
   This child class overrides the method.

   IMPORTANT:
   IllegalArgumentException is unchecked, so this is allowed.
   ========================================================== */
class SpecializedDataProcessor extends DataProcessor {

    @Override
    public void processData() throws IllegalArgumentException {
        System.out.println("Processing data in SpecializedDataProcessor...");
        throw new IllegalArgumentException("Invalid data provided.");
    }
}


/* ==========================================================
   🧠 LESSON 5 PART C:
   CUSTOM EXCEPTIONS IN AN INHERITANCE HIERARCHY
   ========================================================== */


/* ==========================================================
   💸 CUSTOM EXCEPTION: InvalidOperationException
   ==========================================================
   Used for account-related errors.
   ========================================================== */
class InvalidOperationException extends Exception {

    public InvalidOperationException(String message) {
        super(message);
    }

    public InvalidOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}


/* ==========================================================
   🏦 BASE CLASS: Account
   ==========================================================
   A general account with a balance.
   ========================================================== */
class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InvalidOperationException {

        // If amount is bigger than available balance,
        // throw a custom checked exception.
        if (amount > balance) {
            throw new InvalidOperationException("Insufficient funds for withdrawal.");
        }

        // Otherwise subtract from balance.
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}


/* ==========================================================
   💰 SUBCLASS: SavingsAccount
   ==========================================================
   SavingsAccount is a more specific kind of Account.

   It adds:
   ✔ withdrawalLimit

   It overrides withdraw() to check the limit first.
   ========================================================== */
class SavingsAccount extends Account {

    private double withdrawalLimit;

    public SavingsAccount(double balance, double withdrawalLimit) {
        super(balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) throws InvalidOperationException {

        // First check child-specific rule
        if (amount > withdrawalLimit) {
            throw new InvalidOperationException("Amount exceeds the withdrawal limit.");
        }

        // Then reuse parent withdrawal logic
        super.withdraw(amount);
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }
}


/* ==========================================================
   ▶ LESSON 5 DRIVER DEMO
   ========================================================== */
class Lesson5ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("🌟 LESSON 5: EXCEPTION HANDLING + INHERITANCE");
        System.out.println("==================================================");
        System.out.println();

        // ==================================================
        // PART 1: CHECKED VS UNCHECKED EXCEPTION DEMO
        // ==================================================
        System.out.println("📌 PART 1: Custom Exception Types");
        System.out.println("----------------------------------");

        try {
            throw new InvalidUserInputException("User entered invalid input.");
        } catch (InvalidUserInputException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            throw new DataProcessingException("Data processing failed.");
        } catch (DataProcessingException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        System.out.println();

        // ==================================================
        // PART 2: OVERRIDDEN METHOD WITH EXCEPTION
        // ==================================================
        System.out.println("📌 PART 2: Overriding Methods That Throw Exceptions");
        System.out.println("---------------------------------------------------");

        DataProcessor processor = new SpecializedDataProcessor();

        try {
            processor.processData();
        } catch (Exception e) {
            System.out.println("Caught exception from processor: " + e.getMessage());
        }

        System.out.println();

        // ==================================================
        // PART 3: CUSTOM EXCEPTION + INHERITANCE HIERARCHY
        // ==================================================
        System.out.println("📌 PART 3: Account + SavingsAccount Demo");
        System.out.println("----------------------------------------");

        Account savings = new SavingsAccount(500.0, 200.0);

        try {
            savings.withdraw(300.0); // too large for withdrawal limit
        } catch (InvalidOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            savings.withdraw(100.0); // valid
            System.out.println("Withdrawal successful. Remaining balance: $" + savings.getBalance());
        } catch (InvalidOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // ==================================================
        // FINAL SUMMARY
        // ==================================================
        System.out.println("==================================================");
        System.out.println("✅ LESSON 5 TAKEAWAY");
        System.out.println("Exceptions use inheritance too.");
        System.out.println("Child classes must follow exception rules when overriding.");
        System.out.println("Custom exceptions make programs clearer and easier to debug. 💖");
        System.out.println("==================================================");
    }
}


/* ==========================================================
   🧭 STRUCTURE FLOW BREAKDOWN
   ==========================================================

   PART 1:
   1. A checked exception is thrown
   2. try-catch handles it
   3. An unchecked exception is thrown
   4. try-catch handles it

   PART 2:
   1. DataProcessor reference points to SpecializedDataProcessor
   2. processData() is called
   3. Java uses the CHILD version at runtime
   4. IllegalArgumentException is thrown
   5. catch block handles it through Exception reference

   PART 3:
   1. Account reference points to SavingsAccount
   2. withdraw(300) is called
   3. SavingsAccount checks withdrawal limit first
   4. Custom exception is thrown
   5. catch block prints message

   6. withdraw(100) is called
   7. SavingsAccount limit check passes
   8. super.withdraw(100) runs
   9. Account checks balance
  10. balance is reduced
  11. success message prints

   ========================================================== */


/* ==========================================================
   📌 SAMPLE OUTPUT
   ==========================================================

   ==================================================
   🌟 LESSON 5: EXCEPTION HANDLING + INHERITANCE
   ==================================================

   📌 PART 1: Custom Exception Types
   ----------------------------------
   Caught checked exception: User entered invalid input.
   Caught unchecked exception: Data processing failed.

   📌 PART 2: Overriding Methods That Throw Exceptions
   ---------------------------------------------------
   Processing data in SpecializedDataProcessor...
   Caught exception from processor: Invalid data provided.

   📌 PART 3: Account + SavingsAccount Demo
   ----------------------------------------
   Error: Amount exceeds the withdrawal limit.
   Withdrawal successful. Remaining balance: $400.0

   ==================================================
   ✅ LESSON 5 TAKEAWAY
   Exceptions use inheritance too.
   Child classes must follow exception rules when overriding.
   Custom exceptions make programs clearer and easier to debug. 💖
   ==================================================

   ========================================================== */


/* ==========================================================
   💎 MEMORY CHEAT SHEET
   ==========================================================

   throw
   = send an exception

   throws
   = declare an exception

   Exception
   = checked

   RuntimeException
   = unchecked

   Child override rule:
   ✔ same exception
   ✔ fewer checked exceptions
   ✔ more specific checked exceptions
   ❌ broader checked exceptions

   super.withdraw(...)
   = use parent logic after child checks

   ========================================================== */


/* ==========================================================
   ⚠ COMMON MISTAKES
   ==========================================================

   1. Mixing up throw and throws
      throw  -> inside method body
      throws -> method header

   2. Forgetting to handle checked exceptions
      Checked exceptions must be caught or declared.

   3. Adding broader checked exceptions in child class
      That breaks overriding rules.

   4. Using generic Exception too much
      Custom exception names are clearer.

   5. Forgetting to reuse parent logic
      Sometimes child class should call super.method()

   ========================================================== */

/* ==========================================================
   ==========================================================
   🌟 LESSON 7: ENSURING CORRECT METHOD OVERRIDING 🌟
   ==========================================================
   ==========================================================

   BIG IDEA:
   Method overriding MUST be done correctly to keep your
   inheritance system stable, predictable, and bug-free.

   If done incorrectly:
   ❌ You may accidentally overload instead of override
   ❌ Parent behavior may break
   ❌ Polymorphism may behave incorrectly
   ❌ Debugging becomes VERY difficult

   GOAL:
   ✔ Ensure correct overriding
   ✔ Maintain superclass contract
   ✔ Avoid hidden bugs
   ✔ Support polymorphism safely

   ========================================================== */


/* ==========================================================
   📝 VOCABULARY BOX
   ==========================================================

   Overriding
   -> Child replaces parent method

   Overloading
   -> Same method name, different parameters (NOT overriding)

   Method Signature
   -> name + parameters + return type

   Contract
   -> expected behavior defined by superclass

   Covariant Return Type
   -> child can return a subtype of parent return type

   @Override
   -> compile-time check for correct overriding

   ========================================================== */


/* ==========================================================
   💡 WHAT DOES WHAT? (OVERRIDING SAFETY)
   ==========================================================

   @Override
   - ensures correct method signature
   - prevents accidental overloading

   super.method()
   - allows extending parent logic

   Matching signature
   - ensures method is truly overridden

   Parent contract
   - defines expected behavior
   - child must NOT break it

   ========================================================== */


/* ==========================================================
   🔑 KEY TECHNIQUES FOR CORRECT OVERRIDING
   ==========================================================

   ✔ ALWAYS use @Override
   ✔ EXACT method signature match
   ✔ Keep behavior consistent
   ✔ Use super when extending behavior
   ✔ Test overridden methods carefully
   ✔ Verify polymorphic behavior

   ========================================================== */


/* ==========================================================
   🚗 EXAMPLE: CORRECT METHOD OVERRIDING
   ========================================================== */
class VehicleOverrideExample {

    public void startEngine() {
        System.out.println("Starting the vehicle engine...");
    }
}

class CarOverrideExample extends VehicleOverrideExample {

    @Override
    public void startEngine() {

        // Optional: reuse parent logic
        super.startEngine();

        // Add subclass behavior
        System.out.println("Starting the car engine with safety checks...");
    }
}


/* ==========================================================
   ❌ INCORRECT EXAMPLE (OVERLOADING, NOT OVERRIDING)
   ========================================================== */
class BadOverrideExample extends VehicleOverrideExample {

    // ❌ WRONG: this changes parameters → NOT overriding
    public void startEngine(String keyType) {
        System.out.println("Starting with key: " + keyType);
    }
}


/* ==========================================================
   🧠 PRESERVING SUPERCLASS CONTRACT
   ==========================================================

   RULE:
   The subclass should NOT break the expected behavior
   of the superclass method.

   BAD:
   Parent expects method to print something
   Child removes functionality entirely

   GOOD:
   Child keeps expected behavior + adds enhancements

   ========================================================== */


/* ==========================================================
   ▶ DEMO: CONTRACT + super USAGE
   ========================================================== */
class ContractDemo {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("🌟 LESSON 7 DEMO: CORRECT OVERRIDING");
        System.out.println("==================================================");

        // Polymorphism test
        VehicleOverrideExample vehicle = new CarOverrideExample();

        // Should call CHILD version
        vehicle.startEngine();

        System.out.println();

        // Direct call
        CarOverrideExample car = new CarOverrideExample();
        car.startEngine();

        System.out.println();

        System.out.println("==================================================");
        System.out.println("✅ OVERRIDING VERIFIED");
        System.out.println("Polymorphism is working correctly.");
        System.out.println("==================================================");
    }
}


/* ==========================================================
   🧭 STRUCTURE FLOW BREAKDOWN
   ==========================================================

   VehicleOverrideExample vehicle = new CarOverrideExample();

   1. Reference type = VehicleOverrideExample
   2. Object type = CarOverrideExample

   vehicle.startEngine():

   3. Java checks OBJECT TYPE
   4. Finds overridden method in CarOverrideExample
   5. Executes child method

   Inside child method:
   6. super.startEngine() runs first
   7. Parent logic executes
   8. Child logic executes

   RESULT:
   Parent + child behavior combined

   ========================================================== */


/* ==========================================================
   📌 SAMPLE OUTPUT
   ==========================================================

   ==================================================
   🌟 LESSON 7 DEMO: CORRECT OVERRIDING
   ==================================================

   Starting the vehicle engine...
   Starting the car engine with safety checks...

   Starting the vehicle engine...
   Starting the car engine with safety checks...

   ==================================================
   ✅ OVERRIDING VERIFIED
   ==================================================

   ========================================================== */


/* ==========================================================
   ⚠ COMMON PITFALLS
   ==========================================================

   1. Overloading instead of overriding
      (different parameters)

   2. Forgetting @Override
      → harder to catch mistakes

   3. Breaking superclass logic
      → unexpected behavior

   4. Not testing polymorphism
      → bugs appear later

   5. Not using super when needed
      → losing important parent logic

   ========================================================== */


/* ==========================================================
   🧠 DEBUGGING TIPS (CONNECTED TO LESSON 6)
   ==========================================================

   If overriding is NOT working:

   ✔ Check method signature EXACTLY
   ✔ Add @Override (compiler will help)
   ✔ Verify object type vs reference type
   ✔ Use print statements to trace calls
   ✔ Step through with debugger

   Common issue:
   You THINK you're overriding…
   but you're actually overloading 😭

   ========================================================== */


/* ==========================================================
   💎 MEMORY CHEAT SHEET
   ==========================================================

   Override = SAME method → new behavior

   @Override = safety check

   super.method() = keep parent logic

   GOLDEN RULE:
   SAME SIGNATURE OR IT’S NOT OVERRIDING

   ========================================================== */