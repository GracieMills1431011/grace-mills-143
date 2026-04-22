package module3minibible;
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
import java.util.ArrayList; // ArrayList is a dynamic (resizable) list structure. Maintains order and allows duplicate values
                           // Common methods: add(element) → adds an item, get(index) → retrieves an item, remove(index) → removes an item, size() → returns number of elements
import java.util.List;  // List is an interface that represents an ordered collection of elements. | Using List instead of a specific class provides flexibility: List<String> names = new ArrayList<>();

import java.io.*;  // This allows the implementation to change later without changing the rest of the program| sed for reading and writing files, streams, and data.
                  // Common classes included in java.io: File → represents a file or directory, FileReader → reads text files, FileWriter → writes text files, BufferedReader → reads text efficiently line-by-line, BufferedWriter → writes text efficiently

/* ==========================================================
   Name: Gracie Mills
   Date: February 22, 2626
   Purpose:
   Module 3 Mini-Bible — structured, comment-heavy,
   professor-friendly study guide.

   Lessons (Correct Order):
   ✅ Lesson 1: Aggregation and Composition (PLUS Association + Copy Constructor)
   ✅ Lesson 2: Designing Complex Objects (composition + nested objects + interactions)
   ✅ Lesson 3: Input/Output (I/O) Streams (text + binary + buffering + exceptions)
   ✅ Lesson 4: Using JUnit for Unit Testing (basics + testing dependencies)
========================================================== */

public class Module3MiniBible {

    /* ==========================================================
          💻 MAIN METHOD — Program execution starts here 💻
       ========================================================== */
    static void main(String[] args) {

        // 📘 LESSON 1: RELATIONSHIPS
        lesson1_AggregationCompositionAssociation();
        demoAssociation();
        demoAggregation_TeamPlayers();
        demoAggregation_PersonAddress_CopyConstructor();
        demoCopyConstructor_Book();
        demoComposition_HouseRoom();
        demoComposition_ComputerCPU();
        demoComposition_CarEngine();

        // 📗 LESSON 2: COMPLEX OBJECTS
        lesson2_DesigningComplexObjects();
        demoNestedObjects_ComputerBootUp();
        demoComplexObject_CarSystem();

        // 📙 LESSON 3: I/O STREAMS
        lesson3_IOStreamsOverview();
        demoTextFileIO_FileReaderWriter();
        demoTextFileIO_BufferedReaderWriter();
        demoBinaryIO_FileInputOutputStream();
        demoIOExceptionHandling_TryWithResources();

        // 🧪 LESSON 4: JUNIT TESTING
        lesson4_JUnitOverview();
        demoJUnitTemplates_PrintOnly();
    }

    /* ==========================================================
       📘 LESSON 1: Aggregation + Composition (with Association) 📘
       ========================================================== */
    private static void lesson1_AggregationCompositionAssociation() {

        System.out.println("\n==============================");
        System.out.println("📘 LESSON 1: Class Relationships");
        System.out.println("==============================\n");

        /* ==========================================
            ⭐ Understanding Class Relationships ⭐
           ==========================================
          📌 Relationships determine how classes/objects work together to represent real-world interactions and dependencies.

          📌 The 3 primary relationship types:
          🤝 Association  → general interaction (flexible)
          🏫 Aggregation  → "has-a" (independent lifecycle)
          🧩 Composition  → "part-of" (dependent lifecycle) */

        /* =====================================
             🧠 Vocabulary (Know These!)  🧠
           =====================================
           ⭐ Association      → classes are aware of each other & interact
           ⭐ Aggregation      → "has-a" relationship with independence
           ⭐ Composition      → "part-of" relationship with strong ownership
           ⭐ Lifecycle        → when an object is created/destroyed
           ⭐ Dependency       → how strongly one class relies on another
           ⭐ Unidirectional   → one-way reference
           ⭐ Bidirectional    → two-way reference
           ⭐ One-to-One       → 1 object ↔ 1 object
           ⭐ One-to-Many      → 1 object ↔ many objects
           ⭐ Copy Constructor → creates a NEW object using another object
           ⭐ Deep Copy        → avoids shared references
           ⭐ Loose Coupling   → easier maintenance/testing (less dependency) */

        /* ====================================
            💖 Relationship Strength Scale 💖
           ====================================
           Weakest ------------------------------------ Strongest
             Association  →  Aggregation  →  Composition
           (talking)         (has-a)         (part-of)

           ✅ Association: "We interact"
           ✅ Aggregation: "I have you"
           ✅ Composition: "You are part of me"*/
    }



    /* ====================
       🤝 ASSOCIATION 🤝
       ==================== */
    private static void demoAssociation() {

        System.out.println("\n=================");
        System.out.println("🤝 ASSOCIATION");
        System.out.println("===================\n");

        /* ✅ What is Association?
           📌 Association is a broad relationship where classes are aware of each other and can communicate/interact as needed.
           📌 Flexible connection
           📌 No strict ownership
           📌 Lifecycles are NOT intertwined

           ✅ Types of Association
           1) Simple Association (Unidirectional)
           2) One-to-One Association
           3) One-to-Many Association
           4) Bidirectional Association*/


        /* =========================================================
          🤝 ASSOCIATION DEMOS – Different Relationship Types 🤝
          =========================================================
        Association = a relationship between two separate classes.
        These objects can exist independently of each other.*/

        /*The Conceptual Ladder:
         📌 Unidirectional → one class knows
         📌 One-to-one → limited relationship
         📌 One-to-many → collection relationship
         📌 Bidirectional → mutual awareness*/

        /*1️⃣ Simple (Unidirectional): Library knows Book (Book doesn't know Library)
        📌 One class knows about another.
        📌 Relationship goes ONE way only.
        📌 Library knows about Book.
        📌 Book does NOT know about Library */
        System.out.println("--- 1) Simple (Unidirectional) Association ---");

        AssocLibrary library = new AssocLibrary("Central Library"); // Create Library object
        AssocBook book = new AssocBook("Java Fundamentals"); // Create Book object
        library.addBook(book); // Library "has-a" Book (adds book to its collection)
        library.printBooks(); // Display books inside the library
        /*🖨️Sample Output:🖨️ Central Library contains: - Java Fundamentals*/


        /*2️⃣ One-to-One: Person has one Passport
        📌 One object is linked to exactly ONE other object.
        📌 A Person has ONE Passport.
        📌 Passport belongs to ONE Person*/
        System.out.println("\n--- 2) One-to-One Association ---");

        PersonPassport person = new PersonPassport("Mina"); // Create Person object
        Passport passport = new Passport("USA12345"); // Create Passport object
        person.assignPassport(passport); // Assign passport to person (establish relationship)
        person.printPassport(); // Print person's passport details
        /*🖨️Sample Output🖨️: Mina's Passport ID: USA12345*/


        /* 3️⃣ One-to-Many: Department has many Employees
        📌 One object relates to MANY objects.
        📌 Department has MANY Employees.
        📌 Each Employee works in ONE Department.*/
        System.out.println("\n--- 3) One-to-Many Association ---");

        Department department = new Department("Computer Science"); // Create Department object
        department.addEmployee(new Employee("Hunter")); // Add multiple Employee objects to the department
        department.addEmployee(new Employee("Luke")); // Add multiple Employee objects to the department
        department.printEmployees(); // Display all employees in the department
        /*🖨️Sample Output:🖨️ Computer Science Department Employees:
                              Hunter
                              Luke*/


        /* 4️⃣ Bidirectional: Professor knows Course AND Course knows Professor
        📌 BOTH objects know about each other.
        📌 Professor teaches Course.
        📌 Course knows which Professor teaches it.
        📌 Relationship goes BOTH directions.*/
        System.out.println("\n--- 4) Bidirectional Association ---");

        Professor professor = new Professor("Dr. Oak"); // Create Professor object
        Course course = new Course("OOP 1437"); // Create Course object
        professor.addCourse(course); // Link Professor → Course
        course.assignProfessor(professor);// Link Course → Professor

        professor.printCourses(); // Print courses taught by professor
        course.printProfessor(); // Print professor assigned to course
        /*🖨️Sample Output:🖨️  Dr. Oak teaches: - OOP 1437  OOP 1437 is taught by Dr. Oak*/

        /* 🧠 MEMORY RULE:
           Association = interaction, not ownership.
           If one object disappears, the other can still exist.*/

        /*⚠️ Bidirectional caution: Two-way references can create circular logic if unmanaged.*/
    }



    /* ==========================================================
                        🏫 AGGREGATION 🏫
       ========================================================== */
    private static void demoAggregation_TeamPlayers() {

        System.out.println("\n==============================");
        System.out.println("🏫 AGGREGATION: Team + Players");
        System.out.println("==============================\n");

        /* ✅ What is Aggregation?
            Aggregation is a "has-a" relationship where:
           ✔ One class holds references to other objects
           ✔ BUT does NOT control their lifecycle
           ✔ The contained objects can exist independently
           ✅ Advantages of Aggregation
           ⭐ Modularity + Reusability (swap/reuse parts easily)
           ⭐ Loose Coupling (objects aren’t chained to each other)
           ⭐ Easier Testing (parts can be tested independently)

           Example:
           Team "has" Players, but Players still exist without the Team. */
        /* ====================================================
        🏆 TEAM & PLAYER – One-to-Many Association Example 🏆
        =======================================================
        📌 A Team has MANY Players.
        📌 Each Player exists independently.
        📌 This is a "has-a" relationship.
        📌 Team knows about Player objects.
        📌 Player does NOT necessarily know about Team (unidirectional) */

        // Create individual Player objects
        // Each Player exists independently in memory.
        Player p1 = new Player("Mina");
        Player p2 = new Player("Hunter");

        Team team = new Team("Code Queens 👑"); // Create a Team object

        // Add Player objects to the Team
        // This establishes the association (Team → Players)
        team.addPlayer(p1);
        team.addPlayer(p2);

        // Display the Team and its Players
        // This should print the team name and list of players
        team.printTeam();

        /*🖨️Sample Output:🖨️
           Team: Code Queens 👑
           Players:
           - Mina
           - Hunter */

        /* This is a one-to-many association. The Team object likely contains something like: private ArrayList<Player> players;*/

    }



    private static void demoAggregation_PersonAddress_CopyConstructor() {

        System.out.println("\n==============================");
        System.out.println("🏫 AGGREGATION: Person + Address (Copy Constructor)");
        System.out.println("==============================\n");

        /* ======================================================
                    ✅ Implementing Aggregation in Java ✅
           ======================================================
           Person "has-an" Address, but Address exists independently.
           To avoid shared references, Person uses: this.address = new Address(address);

           That is a COPY CONSTRUCTOR → creates a new object copy.

             Aggregation = "has-a" relationship
            • Person HAS an Address
            • Address exists independently of Person
            • Lifecycle is NOT dependent
            • Objects are separate in memory */

         /* ===============================================
         ⭐ Key Concept: Avoid Shared Reference Problem ⭐
       ====================================================
         If we pass the SAME Address object into multiple Persons, they would normally share the SAME memory reference.
         That means:
       📌 If one person changes the address, it changes for BOTH people.
       📌 To prevent this, PersonWithAddress does: this.address = new Address(address);
       📌 That is a COPY CONSTRUCTOR. It creates a NEW Address object with the same values. */



        Address address = new Address("123 Main St", "Springfield", "IL", "62701"); // Create ONE Address object in memory

        // Create two Person objects using the SAME original Address
        // BUT internally, each Person makes a COPY of it
        PersonWithAddress person1 = new PersonWithAddress("John Doe", address);
        PersonWithAddress person2 = new PersonWithAddress("Jane Smith", address);
        /* Without the copy constructor, both person1 and person2
          would point to the same exact Address object in memory. Like this:
             person1.address ──┐
                                ├──> Address object
             person2.address ──┘

           With the copy constructor, it becomes:
           person1.address ──> Address object (copy #1)
           person2.address ──> Address object (copy #2)*/

        person1.printPersonDetails(); // Print details of first person
        System.out.println();
        person2.printPersonDetails(); // Print details of second person
        /*🖨️Sample Output:🖨️
           Name: John Doe
           Address: 123 Main St, Springfield, IL 62701

           Name: Jane Smith
           Address: 123 Main St, Springfield, IL 62701*/

       /*💡Why This Matters💡
       Even though both persons were given the same Address
       parameter, they DO NOT share the same Address object
       internally (because of the copy constructor).

       So if person1 changes their address later,
       person2's address remains unchanged.

       That is SAFE aggregation. */
    }




    private static void demoCopyConstructor_Book() {

        System.out.println("\n==============================");
        System.out.println("🧠 COPY CONSTRUCTOR: Book Demo");
        System.out.println("==============================\n");

        /* ========================================
        💖 COPY CONSTRUCTOR (Concept + Example) 💖
       ============================================
       A special constructor that takes an object of the same class as a parameter and copies its field values.
        Why use it?
       ✅ Prevent shared reference bugs
       ✅ Create independent duplicates
       ✅ Support deep copy logic if needed*/

        /*⭐ General Pattern: ⭐  public ClassName(ClassName other) { copy fields }
       🩷 public ClassName(ClassName other) {
       💜this.field1 = other.field1;
       💜 this.field2 = other.field2;*/


        // Create the original Book object
        // This allocates memory for one CopyBook instance
        CopyBook original = new CopyBook("The Great Gatsby", "F. Scott Fitzgerald", 180);

        // Create a NEW Book using the copy constructor
        // This does NOT point to the same object.
        // It creates a separate Book with the same values.
        CopyBook copied = new CopyBook(original);
        /* Without copy constructor:  CopyBook copied = original;
         Both variables would point to the SAME object:
         original ──┐
                     ├──> Book object
         copied  ───┘

         With copy constructor:
         original ──> Book object #1
         copied  ───> Book object #2

          /*💡Why This Matters💡
          Right now, this is a shallow copy if your fields are primitives or immutable objects (like String). That’s fine here, because:
          int is primitive → copied by value
          String is immutable → safe to copy reference

          But if CopyBook had something like:
          private Author author;  // custom object

         Then you would need a deep copy, meaning inside the copy constructor:
         this.author = new Author(other.author);
         Otherwise both books would share the same Author object.*/



        // Print both objects
        // They look identical in value, but are separate in memory.
        System.out.println("Original Book: " + original);
        System.out.println("Copied Book:   " + copied);
        /*🖨️Sample Output:🖨️
           Original Book: Book[title=The Great Gatsby, author=F. Scott Fitzgerald, pages=180]
           Copied Book:   Book[title=The Great Gatsby, author=F. Scott Fitzgerald, pages=180] */



    }

    /* ==========================================================
       🧩 COMPOSITION
       ========================================================== */
    private static void demoComposition_HouseRoom() {

        System.out.println("\n==============================");
        System.out.println("🧩 COMPOSITION: House + Room");
        System.out.println("==============================\n");

        /* ======================================================
                        ✅ What is Composition? ✅
           ======================================================
           Composition is a strong "part-of" relationship where:
           ✔ Whole object OWNS the parts
           ✔ Whole controls lifecycle of parts
           ✔ If whole is destroyed, parts are destroyed too

           Example:
           House is composed of Rooms.
        */

        House house = new House("Dream House 🏡", "Bedroom");
        house.describeHouse();
    }

    private static void demoComposition_ComputerCPU() {

        System.out.println("\n==============================");
        System.out.println("🧩 COMPOSITION: Computer + CPU");
        System.out.println("==============================\n");

        Computer computer = new Computer("Apple", "Apple M3");
        computer.displayComputerInfo();
    }

    private static void demoComposition_CarEngine() {

        System.out.println("\n==============================");
        System.out.println("🧩 COMPOSITION: Car + Engine");
        System.out.println("==============================\n");

        Car myCar = new Car("Toyota", "Camry", "V6", 301);
        myCar.displayCarInfo();

        /* Sample Output:
           Car Make: Toyota, Model: Camry
           Engine Model: V6, Horsepower: 301
        */
    }

    /* ==========================================================
            📗 LESSON 2: Designing Complex Objects 📗
       ========================================================== */
    private static void lesson2_DesigningComplexObjects() {

        System.out.println("\n==============================");
        System.out.println("📗 LESSON 2: Designing Complex Objects");
        System.out.println("==============================\n");

        /* ======================================================
           🧠 Big Idea
           ======================================================
           Real systems usually need MORE than one class.
           We build “complex objects” by combining multiple classes.

           Example:
           🚗 Car contains Engine, Wheels, Transmission.

           Why it’s useful:
           ✅ Modular
           ✅ Reusable
           ✅ Easier to maintain
        */

        /* ======================================================
                        ✅ Topics Covered ✅
           ======================================================
           1) Building Classes Using Other Classes (Composition)
              - Each class focuses on one responsibility

           2) Nested Objects and Their Interactions
              - Main object coordinates nested objects to provide
                higher-level functionality
        */

        /* ======================================================
                            🧠 Vocabulary 🧠
           ======================================================
           ⭐ Complex Object → object built from many component objects
           ⭐ Component      → nested object with one responsibility
           ⭐ Delegate       → main object calls component methods
           ⭐ Coordinate     → main object organizes the component actions
           ⭐ Separation of Concerns → each part has its own job
        */
    }

    private static void demoNestedObjects_ComputerBootUp() {

        System.out.println("\n--- 🖥️ Nested Objects Demo: Computer.bootUp() ---");

        BootComputer pc = new BootComputer();
        pc.bootUp();

        /* Sample Output:
           Processor initialized.
           Memory loaded.
           Storage read.
           Computer booted up successfully.
        */
    }

    private static void demoComplexObject_CarSystem() {

        System.out.println("\n--- 🚗 Complex Object Demo: Car System ---");

        ComplexCar car = new ComplexCar("Toyota", "Camry", "V6", 301, "Automatic", 4);
        car.startCar();
        car.driveForward();

        /* Sample Output:
           Car starting...
           Engine started: V6 (301 hp)
           Transmission engaged: Automatic
           Wheels rolling: 4 wheels
           Car is moving forward ✅
        */
    }

    /* ==========================================================
       📙 LESSON 3: Input/Output (I/O) Streams
       ========================================================== */
    private static void lesson3_IOStreamsOverview() {

        System.out.println("\n==============================");
        System.out.println("📙 LESSON 3: Input/Output (I/O) Streams");
        System.out.println("==============================\n");

        /* ======================================================
           🧠 What is a Stream?
           ======================================================
           A stream = a flow of data into or out of your program.

           2 Main Types:
           🔹 Byte Streams      (binary data) InputStream/OutputStream
           🔹 Character Streams (text data)   Reader/Writer

           Use BYTE streams for:
           🖼️ images, audio, video, binary files

           Use CHARACTER streams for:
           📝 text files, config files, readable text

           ⚠ Common exception:
           IOException (file missing, permission, disk issues)

           ✅ Best practice:
           try-with-resources auto closes streams.
        */
    }

    private static void demoTextFileIO_FileReaderWriter() {

        System.out.println("\n--- 📝 FileReader / FileWriter Demo ---");

        String filename = "example.txt";

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, world!");
            writer.close();

            FileReader reader = new FileReader(filename);
            int ch;
            System.out.print("Read: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

            System.out.println();

        } catch (IOException e) {
            System.out.println("⚠️ I/O error: " + e.getMessage());
        }
    }

    private static void demoTextFileIO_BufferedReaderWriter() {

        System.out.println("\n--- 🚀 BufferedReader / BufferedWriter Demo ---");

        String filename = "buffered_output.txt";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write("Line 1: Buffered I/O is efficient.");
            bw.newLine();
            bw.write("Line 2: Reading line-by-line is clean.");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            System.out.println("Reading lines:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("⚠️ I/O error: " + e.getMessage());
        }
    }

    private static void demoBinaryIO_FileInputOutputStream() {

        System.out.println("\n--- 🧱 FileInputStream / FileOutputStream Demo ---");

        String filename = "output.dat";

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            fos.write(new byte[]{65, 66, 67}); // A B C
            fos.close();

            FileInputStream fis = new FileInputStream(filename);
            int b;

            System.out.print("Bytes read: ");
            while ((b = fis.read()) != -1) {
                System.out.print(b + " ");
            }
            fis.close();

            System.out.println();

        } catch (IOException e) {
            System.out.println("⚠️ I/O error: " + e.getMessage());
        }
    }

    private static void demoIOExceptionHandling_TryWithResources() {

        System.out.println("\n--- 🧯 try-with-resources Demo ---");

        String filename = "try_with_resources.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("This file was written using try-with-resources.");
            writer.newLine();
            writer.write("No manual close() needed ✅");
        } catch (IOException e) {
            System.out.println("⚠️ I/O error while writing: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Reading file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("⚠️ I/O error while reading: " + e.getMessage());
        }
    }

    /* ==========================================================
       🧪 LESSON 4: Using JUnit for Unit Testing
       ========================================================== */
    private static void lesson4_JUnitOverview() {

        System.out.println("\n==============================");
        System.out.println("🧪 LESSON 4: Using JUnit for Unit Testing");
        System.out.println("==============================\n");

        /* ======================================================
           🧠 What is JUnit?
           ======================================================
           JUnit is a Java testing framework used to write and run
           tests for code (unit testing).

           ✅ Unit = usually a method
           ✅ Goal = verify output/behavior is correct

           Why JUnit matters:
           ⭐ Catch bugs early
           ⭐ Prevent regressions
           ⭐ Confident refactoring
        */

        /* ======================================================
           ✅ Setting Up JUnit (General)
           ======================================================
           - Add JUnit dependency (JUnit 5 is common)
           - OR add JUnit JAR to classpath (manual method)
           - Create test classes in the test folder

           Common JUnit 5 imports:
           import org.junit.jupiter.api.Test;
           import static org.junit.jupiter.api.Assertions.*;
        */

        /* ======================================================
           ✅ Core JUnit Tools
           ======================================================
           ⭐ @Test → marks a test method

           Assertions:
           ⭐ assertEquals(expected, actual)
           ⭐ assertTrue(condition)
           ⭐ assertFalse(condition)
           ⭐ assertNotNull(object)
           ⭐ assertNull(object)
        */

        /* ======================================================
           ✅ Testing Classes with Dependencies
           ======================================================
           When classes depend on others (aggregation/composition),
           tests should verify:
           ✅ relationship behavior
           ✅ state changes across objects
           ✅ edge cases (null/empty)
           ✅ lifecycle rules (especially composition)
        */
    }

    private static void demoJUnitTemplates_PrintOnly() {

        System.out.println("📌 JUnit code templates are included in comments below.");
        System.out.println("📌 JUnit tests run in a separate test class (not in main).");

        /* ======================================================
           ✅ Sample JUnit 5 Test Class (Basics)
           ======================================================

           import org.junit.jupiter.api.Test;
           import static org.junit.jupiter.api.Assertions.*;

           public class SampleTest {

               @Test
               public void testAddition() {
                   int result = add(2, 3);
                   assertEquals(5, result, "2 + 3 should equal 5");
               }

               public int add(int a, int b) {
                   return a + b;
               }
           }

           ======================================================
           ✅ Testing Aggregation Example (Library + Book)
           ======================================================

           @Test
           public void testLibraryAndBookAggregation() {
               Book book = new Book("Java Programming");
               Library library = new Library();
               library.addBook(book);

               assertTrue(library.containsBook(book));

               library.removeBook(book);
               assertFalse(library.containsBook(book));

               assertNotNull(book); // book exists independently
           }

           ======================================================
           ✅ Edge Cases
           ======================================================

           @Test
           public void testLibraryWithNoBooks() {
               Library library = new Library();
               assertTrue(library.getBooks().isEmpty());
           }

           @Test
           public void testCarWithNullEngine() {
               Car car = new Car(null); // example pattern
               assertNull(car.getEngine());
           }

           ======================================================
           ✅ Object Interactions (Borrowing)
           ======================================================

           @Test
           public void testLibraryMemberBorrowsBook() {
               Library library = new Library();
               Book book = new Book("Effective Java");
               LibraryMember member = new LibraryMember("Alice");

               library.addBook(book);
               member.borrowBook(book);

               assertTrue(member.hasBorrowed(book));
               assertFalse(library.containsBook(book));
           }

           ======================================================
           ✅ Lifecycle Tests in Composition
           ======================================================
           Java GC makes "object destroyed" testing tricky.
           Instead, test BEHAVIOR:

           ✅ Composite creates/owns parts internally
           ✅ Parts are not set externally (or are validated)
           ✅ Composite guarantees part existence when required
        */
    }

    /* ==========================================================
       ✅ LESSON 1 SUPPORTING CLASSES (Association)
       ========================================================== */

    static class AssocLibrary {
        private final String name;
        private final List<AssocBook> books = new ArrayList<>();

        public AssocLibrary(String name) { this.name = name; }

        public void addBook(AssocBook book) { books.add(book); }

        public void printBooks() {
            System.out.println(name + " contains:");
            for (AssocBook b : books) {
                System.out.println("- " + b.getTitle());
            }
        }
    }

    static class AssocBook {
        private final String title;
        public AssocBook(String title) { this.title = title; }
        public String getTitle() { return title; }
    }

    static class PersonPassport {
        private final String name;
        private Passport passport;

        public PersonPassport(String name) { this.name = name; }

        public void assignPassport(Passport passport) { this.passport = passport; }

        public void printPassport() {
            System.out.println(name + "'s Passport ID: " + passport.getId());
        }
    }

    static class Passport {
        private final String id;
        public Passport(String id) { this.id = id; }
        public String getId() { return id; }
    }

    static class Department {
        private final String name;
        private final List<Employee> employees = new ArrayList<>();

        public Department(String name) { this.name = name; }

        public void addEmployee(Employee employee) { employees.add(employee); }

        public void printEmployees() {
            System.out.println(name + " Department Employees:");
            for (Employee e : employees) {
                System.out.println("- " + e.getName());
            }
        }
    }

    static class Employee {
        private final String name;
        public Employee(String name) { this.name = name; }
        public String getName() { return name; }
    }

    static class Professor {
        private final String name;
        private final List<Course> courses = new ArrayList<>();

        public Professor(String name) { this.name = name; }

        public void addCourse(Course course) { courses.add(course); }

        public void printCourses() {
            System.out.println(name + " teaches:");
            for (Course c : courses) {
                System.out.println("- " + c.getTitle());
            }
        }
    }

    static class Course {
        private final String title;
        private Professor professor;

        public Course(String title) { this.title = title; }

        public void assignProfessor(Professor professor) { this.professor = professor; }

        public void printProfessor() {
            System.out.println(title + " is taught by " + professor.name);
        }

        public String getTitle() { return title; }
    }

    /* ==========================================================
       ✅ LESSON 1 SUPPORTING CLASSES (Aggregation + Copy Constructor)
       ========================================================== */

    static class Team {
        private final String teamName;
        private final List<Player> players = new ArrayList<>();

        public Team(String teamName) { this.teamName = teamName; }

        public void addPlayer(Player player) { players.add(player); }

        public void printTeam() {
            System.out.println("Team: " + teamName);
            System.out.println("Players:");
            for (Player p : players) {
                System.out.println("- " + p.getName());
            }
        }
    }

    static class Player {
        private final String name;
        public Player(String name) { this.name = name; }
        public String getName() { return name; }
    }

    static class Address {
        private final String street;
        private final String city;
        private final String state;
        private final String zipCode;

        public Address(String street, String city, String state, String zipCode) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

        // Copy constructor
        public Address(Address other) {
            this.street = other.street;
            this.city = other.city;
            this.state = other.state;
            this.zipCode = other.zipCode;
        }

        public void printAddressDetails() {
            System.out.println(street + ", " + city + ", " + state + " " + zipCode);
        }
    }

    static class PersonWithAddress {
        private final String name;
        private final Address address; // aggregation: has-an Address

        public PersonWithAddress(String name, Address address) {
            this.name = name;
            this.address = new Address(address); // independent copy
        }

        public void printPersonDetails() {
            System.out.println("Name: " + name);
            System.out.print("Address: ");
            address.printAddressDetails();
        }
    }

    static class CopyBook {
        private final String title;
        private final String author;
        private final int pages;

        public CopyBook(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        public CopyBook(CopyBook other) {
            this.title = other.title;
            this.author = other.author;
            this.pages = other.pages;
        }

        @Override
        public String toString() {
            return "Book[title=" + title + ", author=" + author + ", pages=" + pages + "]";
        }
    }

    /* ==========================================================
       ✅ LESSON 1 SUPPORTING CLASSES (Composition)
       ========================================================== */

    static class House {
        private final String name;
        private final Room room;

        public House(String name, String roomType) {
            this.name = name;
            this.room = new Room(roomType); // created internally → composition
        }

        public void describeHouse() {
            System.out.println("House: " + name);
            System.out.println("Contains Room: " + room.getType());
        }
    }

    static class Room {
        private final String type;
        public Room(String type) { this.type = type; }
        public String getType() { return type; }
    }

    static class CPU {
        private final String model;
        public CPU(String model) { this.model = model; }
        public void displayCPUInfo() { System.out.println("CPU Model: " + model); }
    }

    static class Computer {
        private final String brand;
        private final CPU cpu; // composition: Computer owns CPU

        public Computer(String brand, String cpuModel) {
            this.brand = brand;
            this.cpu = new CPU(cpuModel); // created internally
        }

        public void displayComputerInfo() {
            System.out.println("Computer Brand: " + brand);
            cpu.displayCPUInfo();
        }
    }

    public static class Engine {
        private final String model;
        private final int horsepower;

        public Engine(String model, int horsepower) {
            this.model = model;
            this.horsepower = horsepower;
        }

        public void displayEngineInfo() {
            System.out.println("Engine Model: " + model + ", Horsepower: " + horsepower);
        }
    }

    static class Car {
        private final String make;
        private final String model;
        private final Engine engine; // composition: Car owns Engine

        public Car(String make, String model, String engineModel, int horsepower) {
            this.make = make;
            this.model = model;
            this.engine = new Engine(engineModel, horsepower); // created internally
        }

        public void displayCarInfo() {
            System.out.println("Car Make: " + make + ", Model: " + model);
            engine.displayEngineInfo();
        }
    }

    /* ==========================================================
       ✅ LESSON 2 SUPPORTING CLASSES (Nested Objects)
       ========================================================== */

    static class Processor {
        public void initialize() { System.out.println("Processor initialized."); }
    }

    static class Memory {
        public void load() { System.out.println("Memory loaded."); }
    }

    static class Storage {
        public void read() { System.out.println("Storage read."); }
    }

    static class BootComputer {
        private final Processor processor;
        private final Memory memory;
        private final Storage storage;

        public BootComputer() {
            this.processor = new Processor();
            this.memory = new Memory();
            this.storage = new Storage();
        }

        public void bootUp() {
            processor.initialize();
            memory.load();
            storage.read();
            System.out.println("Computer booted up successfully.");
        }
    }

    static class ComplexCar {
        private final CarEngine engine;
        private final Transmission transmission;
        private final WheelSystem wheels;

        public ComplexCar(String make, String model, String engineModel, int horsepower,
                          String transmissionType, int wheelCount) {
            this.engine = new CarEngine(engineModel, horsepower);
            this.transmission = new Transmission(transmissionType);
            this.wheels = new WheelSystem(wheelCount);
        }

        public void startCar() {
            System.out.println("Car starting...");
            engine.start();
            transmission.engage();
            wheels.roll();
        }

        public void driveForward() {
            System.out.println("Car is moving forward ✅");
        }
    }

    static class CarEngine {
        private final String model;
        private final int horsepower;

        public CarEngine(String model, int horsepower) {
            this.model = model;
            this.horsepower = horsepower;
        }

        public void start() {
            System.out.println("Engine started: " + model + " (" + horsepower + " hp)");
        }
    }

    static class Transmission {
        private final String type;
        public Transmission(String type) { this.type = type; }
        public void engage() { System.out.println("Transmission engaged: " + type); }
    }

    static class WheelSystem {
        private final int count;
        public WheelSystem(int count) { this.count = count; }
        public void roll() { System.out.println("Wheels rolling: " + count + " wheels"); }
    }
}