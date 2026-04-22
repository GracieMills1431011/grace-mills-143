package module2minibible;
/* ==========================================================
                📦 JAVA IMPORT TOOLBOX 📦
   ==========================================================
   These import statements allow us to use built-in classes
   from the Java Standard Library.

   Without importing them, Java would not recognize the
   class names when we use them in our program.

   Think of imports like unlocking toolboxes that contain
   useful data structures and utilities.
   ========================================================== */
import java.util.ArrayList; // Utility class for working with arrays | Includes sorting, searching, and printing arrays
import java.util.Objects;  // Utility class that helps safely compare and validate objects. | Commonly used when overriding equals() and hashCode().  | Very common in classes that override: equals(), hashCode()
                          // Helpful methods: Objects.equals(a, b) → safely compares two objects (prevents NullPointerException),  Objects.hash(...) → generates a hash code from multiple fields, Objects.requireNonNull(obj) → ensures an object is not null
                         // Very common in classes that override: equals(), hashCode()

public class Module2MiniBible {

    /* ==========================================================
       Name: Gracie Mills
       Date: February 7, 2626
       Purpose:
       This Mini-Bible for Module 2 breaks down Object-Oriented
       Programming concepts into clear sections with helpful
       explanations, example code, and outputs.

       It is designed as a quick-reference study guide for:
       ✅ Classes and Objects
       ✅ Encapsulation and Data Hiding
       ✅ Static Members
       ✅ Wrapper Class
       ✅ Object Class
       ✅ Exception Handling
       ✅ Testing and Debugging
       ✅ Documentation and JavaDoc
       ✅ Static Members, Variables and Methods
       ========================================================== */


    /* ==========================================================
       💻 MAIN METHOD — Program execution starts here 💻
       ========================================================== */
    public static void main(String[] args) {

        // Lesson 1 (static method)
        lesson1_OOPOverview();

        // Lesson 2 (instance method needs an object)
        Module2MiniBible bible = new Module2MiniBible();
        bible.lesson2_ClassesAndObjects();

        // Lesson 3 (static demo methods)
        lesson3_EncapsulationAndDataHiding();

        // Lesson 4 Static members
        lesson4_StaticMembers();

        // Static Variable Example (Book Counter)
        demoStaticBookCounter();

        // Lesson 5 Wrapper Class
        lesson5_WrapperClasses();

        // Lesson 6 Object Class
        lesson6_ObjectClass();

        // Lesson 7 Exception Handling
        lesson7_ExceptionHandling();

        // Lesson 8 Testing & Debugging
        lesson8_TestingAndDebugging();

        // Lesson 9 Documentation & JavaDoc
        lesson9_DocumentationAndJavaDoc();
    }




    /* =================================================================
       📘 LESSON 1: Introduction to Object-Oriented Programming (OOP) 📘
       ================================================================= */
    // ✅ Focus: Big picture ideas (no heavy code yet)
    private static void lesson1_OOPOverview() {

        System.out.println("🧠 OOP = building programs using objects (real-world 'things' in code).");

        /*⭐ The 4 Core OOP Principles (Pillars):
          💖 Encapsulation  🧼 = Keep data safe + controlled (private fields + getters/setters)
          💖 Inheritance    👪 = Child class can reuse parent class code (extends)
          💖 Polymorphism   🎭 = Same method name, different behavior (overriding/overloading)
          💖 Abstraction    🫥 = Hide messy details, show only what matters (interfaces/abstract)

         💞 Why we care 💞
          ✅ Modularity     = break big programs into smaller pieces
          ✅ Reusability    = reuse classes instead of rewriting code
          ✅ Maintainability= easier to update/fix later

          🧠 Vocabulary 🧠
          ⭐ Class     = blueprint/template
          ⭐ Object    = the real created thing from the blueprint
          ⭐ Instance  = another word for an object created from a class*/
    }






    /* ======================================
       📙 LESSON 2: Classes and Objects 📙
       ====================================== */
    private void lesson2_ClassesAndObjects() {

        System.out.println("\n==============================");
        System.out.println("📙 LESSON 2: Classes & Objects");
        System.out.println("==============================\n");

        Student s1 = new Student("Mina", 1437);
        Student s2 = new Student("Hunter", 9999);

        /* 🧠 MEMORY RULE 🧠
           ✨ Objects are created in the constructor — output only happens when you print. ✨
           💎 Flow:
           🆕 new Student(...) → object created in memory
              ⚙️ constructor runs → fields assigned (name, courseId)
              🖨️ println → Java prepares to display the object
              🪄 toString() → automatically converts object to text
              📤 output → readable text appears in the console */

        // 🔹 Printing Student Object | When an object is printed, Java automatically calls its toString() method behind the scenes
        System.out.println("Student 1: " + s1);
        System.out.println("Student 2: " + s2);

        /* Output:
        Student 1: Name: Mina, Course ID: 1437
        Sample Output: Name: Hunter, Course ID: 9999
         */


        // 🔹 Calling Instance Method: introduce() This method belongs to each Student object. It uses that object's specific data.
        s1.introduce();
        s2.introduce();

        /* Output
        Sample Output: Hello, my name is Mina and my course ID is 1437.
        // Sample Output: Hello, my name is Hunter and my course ID is 9999.
         */

        // 🔹 Demonstrating Behavior Method: incrementCourseId() | Shows how object state changes.
        System.out.println("Before increment: " + s1);
        s1.incrementCourseId();  // increases courseId by 1
        System.out.println("After increment:  " + s1);

        System.out.println("\nBefore decrement: " + s2);
        s2.decrementCourseId(); // decreases courseId by 1
        System.out.println("After decrement:  " + s2);

         /* Output
         Before increment: Name: Mina, Course ID: 1437
         After increment:  Name: Mina, Course ID: 1438

        Before decrement: Name: Hunter, Course ID: 9999
        After decrement:  Name: Hunter, Course ID: 9998
         */
    }




    /* ==================================================
       🔒 LESSON 3: Encapsulation & Data Hiding (Java) 🔒
       ================================================== */
    private static void lesson3_EncapsulationAndDataHiding() {

        System.out.println("\n==============================");
        System.out.println("🔒 LESSON 3: Encapsulation");
        System.out.println("==============================\n");

        /*✅ What you'll learn:
          ⭐ Encapsulation (data + methods bundled together)
          ⭐ Data hiding with access modifiers (private/public/protected)
          ⭐ Getters & setters (controlled access)
          ⭐ Validation inside setters (protect object integrity)
          ⭐ Read-only vs write-only attributes
          ⭐ Immutability (objects that cannot change after creation)

          💡 Big Idea:
          📌 Encapsulation = “You don’t touch my insides directly.”
          📌 You interact through safe, controlled methods. */

        /* 🧠 Vocabulary (Know These!) 🧠
        ⭐ Encapsulation → bundling data + methods inside one class
        ⭐ Data Hiding   → restricting access using modifiers
        ⭐ Private       → only THIS class can access it
        ⭐ Public        → accessible from anywhere
        ⭐ Protected     → same package + subclasses
        ⭐ Getter        → reads private data (getX)
        ⭐ Setter        → updates private data (setX)
        ⭐ Validation    → prevents invalid data
        ⭐ Immutability  → object cannot change after creation
*/


        demoEncapsulationCar();
        demoReadOnly();
        demoWriteOnly();
    }


    /*=====================================================
     🚗 Demonstration 1: Encapsulation with Getters/Setters
    =====================================================*/
    // Shows how private fields are accessed safely through public setter and getter methods.
    private static void demoEncapsulationCar() {

        EncapsulatedCar car = new EncapsulatedCar(); // Create object

        // Using setters to assign values
        // (Direct field access would NOT be allowed if fields are private)
        car.setMake("Toyota");
        car.setYear(2022);

        // Using getters to retrieve values safely
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Year: " + car.getYear());

         /* Output
          Car Year: 2022 */
    }



    /* =====================================================
            🎓 Demonstration 2: Read-Only Object 🎓
     ===================================================== */
    // Object has a getter but NO setter. |  Value can be read but never modified
    private static void demoReadOnly() {

        ReadOnlyStudent student = new ReadOnlyStudent("Mina");  // Name is set through constructor only
        System.out.println("Read-only student name: " + student.getName());  // Can retrieve value
        System.out.println();

        /* Output
        Read-only student name: Mina
         */
    }




    /* =====================================================
            🔐 Demonstration 3: Write-Only Object 🔐
     ===================================================== */
    // Object has a setter but NO getter.
    // Value can be stored but never retrieved.
    private static void demoWriteOnly() {

        WriteOnlyVault vault = new WriteOnlyVault();

        // Can store the secret
        vault.setSecretCode("1234");

        // Cannot retrieve secret because no getter exists
        System.out.println("Secret stored in vault (cannot retrieve).");

        /* Sample Output:
        Secret stored in vault (cannot retrieve).*/


    }




    /* ===============================================
                 📦 LESSON 4: Static Members 📦
       ================================================== */
    private static void lesson4_StaticMembers() {

        System.out.println("\n==============================");
        System.out.println("📦 LESSON 4: Static Members");
        System.out.println("==============================\n");

        /* 🧠 What is static? 🧠
          📌 static = belongs to the CLASS, not the object.
          📌 Instance variable → each object gets its own copy.
          📌 Static variable   → shared by ALL objects.
          📌 Instance method → called using an object.
          📌 Static method   → called using the class name.*/


        /* ==================================================
           ✅ When to Use Static Members ✅
           ==================================================
           1) 📌 Constants + Fixed Values (static final)
              ✅ Example: MathConstants.PI

           2) 🔢 Shared Counters / Trackers
              ✅ Example: Book.bookCount (tracks ALL Book objects)

           3) 🧰 Utility / Helper Methods
              ✅ Example: MathUtils.add(), MathUtils.square()

           4) 👑 Singleton Pattern
              ✅ One shared instance (covered later in Module 8)

           5) 🌍 Data/Methods that DON’T rely on object state
              ✅ Example: Logger.log("msg")

           ⭐ Best Practices:
           ✅ Don’t make everything static
           ✅ Use static final for constants
           ✅ Be careful: static state is shared + lives for program lifetime
        */


        /* ==================================================
           📌 Static Methods (Utility Example) 📌
           ==================================================
           ✅ Static methods:
           ⭐ No object required
           ⭐ Called like: ClassName.method()

           ⚠️ Static methods cannot directly access instance fields/methods.
        */

        int addResult = MathUtils.add(5, 10);// Expected calculation: 5 + 10 = 15
        int squareResult = MathUtils.square(7);// Expected calculation: 7 * 7 = 49

        System.out.println("MathUtils.add(5, 10) = " + addResult);
        // Sample Output:
        // MathUtils.add(5, 10) = 15

        System.out.println("MathUtils.square(7)  = " + squareResult);
        // Sample Output:
        // MathUtils.square(7)  = 49
        System.out.println("MathConstants.PI     = " + MathConstants.PI);
        // Sample Output (example):
        // MathConstants.PI     = 3.14159


        /* ==================================================
           📌 The static Keyword & Its Implications 📌
           ==================================================
           ✅ static loads once when the class loads
           ✅ one shared copy in memory
           ✅ can be efficient (shared constants/utility)
           ⚠️ but shared state can create bugs if changed unexpectedly
        */

        StaticDemo a = new StaticDemo(); // constructor likely increments totalObjects
        StaticDemo b = new StaticDemo(); // constructor increments again

        // Accessing static variable directly using class name
        System.out.println("Total objects created: " + StaticDemo.totalObjects);
        // Sample Output:
        // Total objects created: 2

        StaticDemo.printTotalObjects();  // Calling static method (no object required)
        // Sample Output (example):
        // Total objects so far: 2
    }


    private static void demoStaticBookCounter() {

        // Creating three Book objects
        Book b1 = new Book(); // constructor increments bookCount
        Book b2 = new Book(); // increments again
        Book b3 = new Book(); // increments again

        // Accessing static method to retrieve shared count
        System.out.println("Total books created: " + Book.getBookCount());
        // Sample Output:
        // Total books created: 3
    }




    /* ==================================================
                📦 LESSON 5: Wrapper Classes 📦
       ================================================== */
    private static void lesson5_WrapperClasses() {

        System.out.println("\n==============================");
        System.out.println("📦 LESSON 5: Wrapper Classes");
        System.out.println("==============================\n");

        /* ==================================================
           🧠 Introduction to the Wrapper Class
           ==================================================
           Wrapper classes are object versions of primitives.

           Primitive  → Wrapper
           int        → Integer
           double     → Double
           boolean    → Boolean
           char       → Character

           ✅ Why wrappers matter:
           ⭐ Collections/Generics store OBJECTS, not primitives
           ⭐ Utility methods: parsing/converting/comparing
           ⭐ Nullable types: wrappers can be null, primitives cannot

           ==================================================
           🔁 Autoboxing and Unboxing
           ==================================================
           ✅ Autoboxing: primitive → wrapper automatically
           ✅ Unboxing: wrapper → primitive automatically
        */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // autoboxing: int -> Integer
        numbers.add(20);

        Integer numberObject = 5;   // autoboxing
        int result = numberObject + 10; // unboxing happens here

        /* ==================================================
           🧰 Commonly Used Wrapper Class Methods
           ==================================================
           ✅ Parsing (String -> primitive):
           ⭐ Integer.parseInt("123") → 123
           ⭐ Double.parseDouble("9.99") → 9.99
           ⭐ Boolean.parseBoolean("true") → true

           ✅ Type conversions:
           ⭐ intValue(), doubleValue(), floatValue(), longValue()
        */

        String str = "123";
        int num = Integer.parseInt(str);

        String price = "9.99";
        double value = Double.parseDouble(price);

        String isActive = "true";
        boolean activeStatus = Boolean.parseBoolean(isActive);

        Double wrapped = 19.99;
        int truncated = wrapped.intValue(); // 19

        /* ==================================================
           ⚠️ Performance Considerations
           ==================================================
           ✅ Wrappers cost more memory (objects + metadata)
           ✅ Wrappers can be slower (autoboxing/unboxing overhead)
           ✅ Best rule:
              - Use primitives for heavy math/loops
              - Use wrappers for collections, nulls, and object APIs
        */

        // Example (concept): wrappers in big loops can be slower due to boxing/unboxing
    }




    /* ==================================================
       🧠 LESSON 6: The Object Class 🧠
       ================================================== */
    private static void lesson6_ObjectClass() {

        System.out.println("\n==============================");
        System.out.println("🧠 LESSON 6: Object Class");
        System.out.println("==============================\n");

        /* ==================================================
           🧠 Introduction to the Object Class
           ==================================================
           Object is the ROOT of all Java classes.
           Every class extends Object (directly or indirectly).

           ✅ Why it matters:
           ⭐ Unified class hierarchy
           ⭐ Polymorphism: anything can be treated as Object
           ⭐ Default baseline methods for ALL objects

           ==================================================
           🔑 Most Important Object Methods
           ==================================================
           1) toString()
              - default prints className@memoryHash
              - override it to print meaningful info (like we did in Student)

           2) equals(Object obj)
              - default compares memory reference (same object?)
              - override to compare content/fields (logical equality)

           3) hashCode()
              - used by HashMap/HashSet
              - MUST match equals() logic (if equals true, hashCode should match)
        */
    }




    /* ==================================================
       ⚠️ LESSON 7: Exception Handling ⚠️
       ================================================== */
    private static void lesson7_ExceptionHandling() {

        System.out.println("\n==============================");
        System.out.println("⚠️ LESSON 7: Exception Handling");
        System.out.println("==============================\n");

        /* ==================================================
           ⚠️ What is an Exception?
           ==================================================
           An exception is an unexpected event that disrupts program flow.
           Example: divide by zero, null reference, file missing

           ==================================================
           🌳 Exception Hierarchy
           ==================================================
           Throwable
           ├── Error (serious, usually NOT handled)
           └── Exception (recoverable)
               ├── Checked Exceptions (compiler forces handling)
               └── Unchecked Exceptions (RuntimeException)

           ✅ Checked: IOException, SQLException, FileNotFoundException
           ✅ Unchecked: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException

           ==================================================
           ✅ Try-Catch
           ==================================================
           try { risky code } catch (ExceptionType e) { handle it }

           ==================================================
           🧹 Finally
           ==================================================
           finally runs no matter what (great for cleanup: closing files/resources)

           ⚠️ Note:
           finally still runs even if try/catch has a return statement.
        */

        // Demo: try-catch (simple)
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block: cleanup spot / always runs.");
        }
    }




    /* ==================================================
       🧪 LESSON 8: Testing & Debugging 🧪
       ================================================== */
    private static void lesson8_TestingAndDebugging() {

        System.out.println("\n==============================");
        System.out.println("🧪 LESSON 8: Testing & Debugging");
        System.out.println("==============================\n");

        /* ==================================================
           🧠 Testing vs Debugging
           ==================================================
           ✅ Testing: checking if code works as expected
           ✅ Debugging: finding + fixing what went wrong

           ==================================================
           ❌ Compilation Errors vs Runtime Exceptions
           ==================================================
           ✅ Compilation errors:
              - syntax/type problems (won’t run)
              - missing semicolons, type mismatch, missing imports

           ✅ Runtime exceptions:
              - happen while running
              - divide by zero, null pointer, bad array index

           ==================================================
           🖨️ Print Debugging
           ==================================================
           ✅ Use print statements to:
              - track variable values
              - confirm loop flow
              - confirm which branch ran

           Best practice:
           ⭐ print descriptive messages (not random numbers)
           ⭐ remove prints after fixing

           ==================================================
           🧰 IDE Debugging Tools (IntelliJ / Eclipse)
           ==================================================
           ✅ Breakpoints: pause execution on a line
           ✅ Step Into / Over / Out:
              - Into = go inside method
              - Over = run method without entering
              - Out  = finish method and return
           ✅ Watches/Variable inspection: see values live
           ✅ Call stack: see which methods led here
           ✅ Exception breakpoints: pause when exception is thrown
        */
    }




    /* ==================================================
       📝 LESSON 9: Documentation & JavaDoc 📝
       ================================================== */
    private static void lesson9_DocumentationAndJavaDoc() {

        System.out.println("\n==============================");
        System.out.println("📝 LESSON 9: Documentation & JavaDoc");
        System.out.println("==============================\n");

        /* ==================================================
           🧠 Why Documentation Matters
           ==================================================
           ✅ Improves readability
           ✅ Helps future-you (and teammates) maintain code
           ✅ Supports collaboration + reuse
           ✅ Helps debugging (you understand intent)
           ✅ Makes code look professional

           ==================================================
           📌 JavaDoc Basics
           ==================================================
           JavaDoc comments use:
           /**
            * Comment...
            *\/

           Common tags:
           ⭐ @param  describes parameters
           ⭐ @return describes return value
           ⭐ @throws describes exceptions thrown

           ==================================================
           🧾 JavaDoc for Classes
           ==================================================
           - Describe what the class represents
           - Give example usage if helpful

           ==================================================
           🧾 JavaDoc for Methods
           ==================================================
           - Describe what it does (purpose)
           - params, return, throws

           ==================================================
           🧾 JavaDoc for Fields
           ==================================================
           - short and clear: what it stores / constraints

           ==================================================
           🌐 Generating HTML JavaDoc
           ==================================================
           ✅ IntelliJ IDEA:
           Tools > Generate JavaDoc
           - choose output directory (ex: doc)
           - scope: file/project/module
           - optional args: -author, -version
           - open index.html to view docs

           ✅ Eclipse:
           Project > Generate Javadoc...
           - select packages/classes
           - set output directory
           - ensure javadoc.exe path (JDK)
           - open index.html
        */
    }




    /* ==========================================
       🚙 Supporting Class: EncapsulatedCar 🚙
       ========================================== */
    static class EncapsulatedCar {

        private String make;
        private int year;

        public EncapsulatedCar() {
            make = "Unknown";
            year = 0;
        }

        public String getMake() { return make; }
        public int getYear() { return year; }

        public void setMake(String make) { this.make = make; }

        public void setYear(int year) {
            if (year > 1900) {
                this.year = year;
            } else {
                System.out.println("⚠️ Invalid year. Value not updated.");
            }
        }
    }


    static class ReadOnlyStudent {

        private final String name;

        public ReadOnlyStudent(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }


    static class WriteOnlyVault {

        private String secretCode;

        public void setSecretCode(String code) {
            this.secretCode = code;
        }
    }


    static class Student {

        private String name;
        private int courseId;

        public Student(String name, int courseId) {
            this.name = name;
            this.courseId = courseId;
        }

        public void introduce() {
            System.out.println("Hello, my name is " + name +
                    " and my course ID is " + courseId + ".");
        }

        public void incrementCourseId() { courseId++; }
        public void decrementCourseId() { courseId--; }

        @Override
        public String toString() {
            return name + " courseId=" + courseId;
        }

        // (Optional example for Object class lesson)
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return courseId == student.courseId && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, courseId);
        }
    }


    static class StaticDemo {

        static int totalObjects = 0;

        public StaticDemo() {
            totalObjects++;
        }

        static void printTotalObjects() {
            System.out.println("Static method says total objects = " + totalObjects);
        }
    }


    static class Book {

        private static int bookCount = 0;

        public Book() {
            bookCount++;
        }

        public static int getBookCount() {
            return bookCount;
        }
    }


    static class MathUtils {

        public static int add(int a, int b) { return a + b; }
        public static int square(int number) { return number * number; }
    }


    static class MathConstants {
        public static final double PI = 3.14159;
    }
}




