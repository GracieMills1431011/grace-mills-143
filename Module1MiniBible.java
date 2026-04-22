package module1minibible;
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
import java.util.Arrays;  // Utility class for working with arrays | Includes sorting, searching, and printing arrays
import java.util.Scanner;// Scanner is used to read input from the user (keyboard input) | It allows the program to capture data such as numbers,words, or full lines typed into the console.
                        // Common methods: nextInt() → read an integer, nextDouble() → read a decimal number, next() → read a single word, nextLine() → read an entire line of text
                       // Always close the Scanner when finished: input.close();

/*
Name: Gracie Mills
Date: January 30, 2026
Course: Programming Fundamentals II (Java)

Module: Module 1 “Mini-Bible” Reference

Purpose:
An IntelliJ reference file that demonstrates the structure professors expect:
package → imports → class → main → examples (with outputs as comments)

📕 HOW TO USE 📕
1) Put this file here: src/module1minibible/ModuleMiniBible.java
2) Package line MUST match folder path: module
mini bible
3) Run it and compare console output to the expected output comments.
4) In main(), comment out calls to focus on one section at a time.

==============================================
💖 MODULE 1 — BIG IDEA (the “philosophy”) 💖
----------------------------------------------
⭐ Java is picky on purpose:⭐
- Types matter (byte vs int vs double): safer code
- Structure matters (package/import/class/main): organized code
- Conversions matter (casting): prevents silent data loss unless you explicitly allow it
*/

class module1minibible { // Public class that matches the file name: ModuleMiniBible.java | All methods and examples live inside this class


    private int instanceCount = 7; // Instance variable → belongs to an OBJECT (each object has its own copy)


    private static int staticCount = 42; // Static variable → belongs to the CLASS (shared by all objects)

    /*=======================================
      ✨ MAIN METHOD (Program starts here) ✨
      ---------------------------------------
      ⚡ The JVM runs main() first
      ⚡ We "call" each lesson like chapters
    =========================================*/
    public static void main(String[] args) {  // Program entry point: execution starts here


        /* ===================================================
         ✅ RUN SWITCHBOARD:
         ✅ Comment/uncomment what you want to practice today.
        ====================================================== */

        demoProgramSkeleton();

        demoPrimitiveTypes();
        demoTypeCastingWidening();
        demoTypeCastingNarrowing();
        demoCastingOverflowAndCharToInt();
        demoFinalKeyword();
        demoScopeAndLifetime();

        demoOperatorsAndExpressions();
        demoAssignmentOperatorsCheatSheet();

        lesson4_PrintVsPrintln();
        lesson4_EscapeSequences();

        // Scanner demos: These require you to type input in the console.
        // Tip: Run these ONE AT A TIME so you don’t feel rushed.
        // demoScannerMiniExample();
        // demoReadInteger();
        // demoReadDouble();
        // demoReadSingleWord();
        // demoReadFullLine();
        // demoNextLineBugAndFix();
        // demoInputValidation();
        // demoClosingScanner();

        // Control flow / loops
        demoWhileLoopCounting();
        demoDoWhileLoopCounting();
        demoForLoopArrayExample();
        demoBreakInLoop();
        demoBreakSearchExample();
        demoContinueExample();
        demoContinueSkipEvens();
        demoBreakAndContinueCombined();

        // Optional input-based loop demos
        // demoWhileUserInputExit();
        // demoDoWhileMenuExample();

        // Switch + common built-in utilities
        demoSwitchStatement();
        demoMathMethods();
        demoStringMethods();
        demoArraysMethods();

        // Methods (invocation, params, returns, void, overloading)
        demoMethodInvoke();
        demoMethodParameters();
        demoReturnType();
        demoVoidMethod();
        demoMultipleParameters();
        demoBooleanReturn();
        demoOverloading();

        // Scope extras
        demoLocalScope();
        demoParameterScope("Alice");
        demoInstanceScope();
        demoVariableShadowing();
        demoVariableLifetime();

    }


    /*======================================================
     💖 LESSON 1: Program Skeleton (what professors test) 💖
    =======================================================*/
    private static void demoProgramSkeleton() {  // Demonstrates the basic structure of a Java program
        System.out.println("Lesson 1: Program Skeleton"); // Prints a header
        System.out.println("Order: package → imports → class → main → code"); // Displays the required order of components in a Java program


    }


    /*=======================================
       🩷 LESSON 2: Primitive Data Types 🩷
    =========================================*/
    private static void demoPrimitiveTypes() { // Demonstrates Java primitive data types
        System.out.println("Lesson 2: Primitive Types"); // Prints header

        byte b = 100;                 // Range: -128 to 127
        short s = -20;                // Range: -32,768 to 32,767
        int i = 1500;                 // Common integer type
        long l = 7_800_000_000L;      // Use L for long literals
        float f = 3.14159f;           // Use f for float literals
        double d = 2.718281828459045; // Default for decimals
        char letter = 'A';            // Single character (Unicode)
        boolean isJavaFun = true;     // True/False

        System.out.println("byte b = " + b); // Output: 100
        System.out.println("short s = " + s); // Output: -20
        System.out.println("int i = " + i); // Output: 1500
        System.out.println("long l = " + l); // Output: 7800000000
        System.out.println("float f = " + f); // Output: 3.14159
        System.out.println("double d = " + d); // Output: 2.718281828459045
        System.out.println("char letter = " + letter); // Output: A
        System.out.println("boolean isJavaFun = " + isJavaFun); // Output: true

        /*💡 Common mistakes: long badLong = 7800000000; → ❌ ERROR: integer number too large (needs L) | float badFloat = 3.14; → ❌ ERROR: 3.14 is double unless you add f 💡*/
    }


    /*=============================================
      🩷 LESSON 2: Widening (Implicit Casting) 🩷
    ==============================================*/
    private static void demoTypeCastingWidening() { // Demonstrates implicit casting
        System.out.println("Lesson 2: Widening Cast (Implicit)—safe & automatic"); // Prints header

        int num = 100;          // Stores an integer value
        long bigNum = num;     // int → long (automatic)
        double decNum = num;  // int → double (automatic)

        System.out.println("int num = " + num); // int num → | Output: 100
        System.out.println("long bigNum = " + bigNum); // long bigNum → | Output: 100
        System.out.println("double decNum = " + decNum); // double decimalNum → Output: 100.0
        System.out.println("Widening order: byte → short → int → long → float → double"); // Output: Widening order often tested: byte → short -→ int → long → float → double

    }


    /*===============================================
      🩷 LESSON 2: Narrowing (Explicit Casting) 🩷
    ================================================*/
    private static void demoTypeCastingNarrowing() {// Demonstrates narrow casting
        System.out.println("Lesson 2: Narrowing Cast (Explicit)—you MUST cast (possible data loss)"); // Prints header

        double decimalNum = 9.99; // Stores a decimal (floating-point) value
        int wholeNum = (int) decimalNum; // Truncates (does NOT round)

        System.out.println("double decimalNum = " + decimalNum); // double decimalNum | Output: 9.99
        System.out.println("int wholeNum = (int) decimalNum -> " + wholeNum); // int wholeNum = (int) decimalNum | Output: 9

        /*💡Tip: (type) in front of a value/variable means explicit casting.💡*/
    }


    /*=======================================
      🩷 LESSON 2: Overflow + char → int 🩷
    =========================================*/
    private static void demoCastingOverflowAndCharToInt() {  // Demonstrates type casting, overflow behavior, and char → int conversion
        System.out.println("Lesson 2: Overflow + char → int"); // Prints header

        // Overflow example
        long bigValue = 2_147_483_648L;     // 1 more than Integer.MAX_VALUE
        int smallerValue = (int) bigValue; // overflow wraps around

        System.out.println("long bigValue = " + bigValue); // long bigValue | Output: 2147483648
        System.out.println("int smallerValue = (int) bigValue -> " + smallerValue); // int smallerValue = (int) bigValue | Output: -2147483648


        char letter = 'A'; // char stores a single Unicode character (16-bit)
        int unicodeValue = (int) letter; // Explicit cast: converts the char to its Unicode code point | For 'A', the value is 65

        System.out.println("char letter = " + letter); // Char letter | Output: A
        System.out.println("int unicodeValue = (int) letter -> " + unicodeValue); // int asciiValue = (int) letter | Output: 65

        /* ⚠️ Reminder: overflow is not “an error”, it’s a *wraparound*.⚠️ */
    }


    /*===============================
      🩷 LESSON 2: final keyword  🩷
    =================================*/
    private static void demoFinalKeyword() {  // Demonstrates the use of the final keyword in Java
        System.out.println("Lesson 2: final keyword: variables (constants), methods, classes"); // Prints header

        final int MAX_SPEED = 120; // final int cannot be changed
        System.out.println("final int MAX_SPEED = " + MAX_SPEED); // Output: 120

        /*❌ ERROR EXAMPLE: MAX_SPEED = 200; // cannot assign a value to final variable ❌*/
    }


    /*===================================
     🩷 LESSON 2: Scope and Lifetime 🩷
    =====================================*/
    private static void demoScopeAndLifetime() {
        System.out.println("Lesson 2: Scope & Lifetime (local vs instance vs static)"); // Prints header

        int localResult = 10; // Local variable: exists only in this method

        System.out.println("Local variable localResult = " + localResult); // Local variable localResult = 10 | Output: 10
        System.out.println("Local = inside a method | Instance = belongs to an object | Static = belongs to the class"); // Prints out: Local = inside a method | Instance = belongs to an object | Static = belongs to the class

    }
    /*==========================================
         💗 ORDER OF OPERATIONS (PEMDAS) 💗

            P → Parentheses ()
            E → Exponents
            M → Multiply
            D → Divide
            A → Add
            S → Subtract

       💗 ARITHMETIC OPERATORS CHEAT SHEET 💗

           +  → Addition
           -  → Subtraction
           *  → Multiplication
           /  → Division
           %  → Modulus (remainder)

           💡 Example:
           a + b → sum
           a % b → remainder
           ⚠️ IMPORTANT:
           int / int = INT (no decimals!)
           Cast to double to fix → (double)a / b

   ============================================*/

    /*==========================================
      💗 OPERATOR PRECEDENCE TABLE 💗

        Highest → Lowest priority

         1.  ()  []  .
         2.  ++  -- (post)
         3.  ++  --  +  -  !
         4.  *  /  %
         5.  +  -
         6.  <<  >>  >>>
         7.  <  <=  >  >=  instanceof
         8.  ==  !=
         9.  &
         10. ^
         11. |
         12. &&
         13. ||
         14. ?:
         15. =  +=  -=  *=  /=  %=
    ============================================*/

    /*==========================================
      💗 ASSIGNMENT OPERATORS CHEAT SHEET 💗

         =    → assign
         +=   → add and assign
         -=   → subtract and assign
         *=   → multiply and assign
         /=   → divide and assign
         %=   → modulus and assign

        💡 Example:
        a += 5 → a = a + 5
    ============================================*/

    /*==========================================
     🩷 LESSON 3: Operators and Expressions 🩷
    ============================================*/

    private static void demoOperatorsAndExpressions() {
        System.out.println("Lesson 3: Operators & Expressions"); // Prints header

        int a = 10; // Example integer variable used for arithmetic operations
        int b = 4; // Second integer used to demonstrate math or comparisons

        System.out.println("a + b = " + (a + b)); // Addition | a + b | Output: 14
        System.out.println("a - b = " + (a - b)); // Subtraction | a - b | Output: 6
        System.out.println("a * b = " + (a * b)); // Multiplication | a * b | Output: 40
        System.out.println("a / b = " + (a / b)); // Int division! | a / b | Output: 2 | Fix int division with casting
        System.out.println("a % b = " + (a % b)); // Remainder | a % b | Output: 2
        System.out.println("((double)a) / b = " + ((double) a / b)); // ((double)a) / b | Output: 2.5


      /*==========================================
            💗 RELATIONAL OPERATORS 💗

                == → equal to
                != → not equal
                >  → greater than
                <  → less than
                >= → greater or equal
                <= → less or equal

           💡 ALWAYS returns TRUE or FALSE
    ============================================*/
        //🌹Relational + logical operators:🌹
        int x = 7;
        System.out.println("x > 5 = " + (x > 5)); // x > 5 |  Output: True
        System.out.println("x == 7 = " + (x == 7)); // x == 7 |  Output: True
        System.out.println("(x > 5 && x < 10) = " + (x > 5 && x < 10)); // (x > 5 && x < 10) | Output: True
        System.out.println("(x < 5 || x == 7) = " + (x < 5 || x == 7)); // (x < 5 || x == 7) |  Output: True
           /*==========================================
                    💗 LOGICAL OPERATORS 💗

                && → AND (both must be true)
                || → OR (one must be true)
                !  → NOT (flips value)

               💡 Example:
                (x > 5 && x < 10)
           ============================================*/


        //🌷Increment/decrement:🌷
        int count = 0; // Initializes the counter variable at 0
        count++; // Increments count by 1
        System.out.println("After count++: " + count); // After count++ | Output: 1
        count--;
        System.out.println("After count--: " + count); // After count-- | Output: 0

    }


    /*=====================================
      🩷 LESSON 3: Assignment Operators 🩷
    =======================================*/
    private static void demoAssignmentOperatorsCheatSheet() {
        System.out.println("Lesson 3: Assignment Operators"); // Prints header

        int a = 10; // Declares and initializes an integer variable

        a += 5; // a = a + 5
        System.out.println("After a += 5, a = " + a); // | After a += 5 | Output: a = 15

        a -= 2; // a = a - 2
        System.out.println("After a -= 2, a = " + a); // | After a -= 2 | Output: a = 13

        a *= 3; // a = a * 3
        System.out.println("After a *= 3, a = " + a); // | After a *= 3 | Output: a = 39

        a /= 4; // a = a / 4 (int division)
        System.out.println("After a /= 4, a = " + a); // | After a /= 4 | Output: a = 9

        a %= 4; // a = a % 4
        System.out.println("After a %= 4, a = " + a); // | After a %= 4 | Output: a = 1
    }


    /* ==========================================================================
      🩷 Lesson 3: Mini Scanner example (I/O structure) 🩷
     ==========================================================================*/
    private static void demoScannerMiniExample() {
        System.out.println("Scanner mini-example (input → process → output)"); // Prints header

        Scanner scanner = new Scanner(System.in); // Sets up Scanner so the program can receive user input

        System.out.print("Enter an integer: "); // Enter int: 5 | Output: 5
        int num = scanner.nextInt(); // Reads a whole number from the user | Invalid input (non-integer) will cause an InputMismatchException

        System.out.print("Enter another integer: "); // Enter another int: 7 | Output: 7
        int num2 = scanner.nextInt(); // Reads a whole number from the user | Invalid input (non-integer) will cause an InputMismatchException


        int sum = num + num2; // Adds num and num2 and stores the result in sum
        System.out.println("Sum = " + sum); // Sum + sum (5 + 7) | Output: 12

        /*⚠️ Note about scanner.close(): In big apps you close it at the end. Some course setups avoid closing System.in because it can break later input.⚠️*/
    }


    /*======================================
     💜 LESSON 4: print() vs println() 💜
    ========================================*/
    private static void lesson4_PrintVsPrintln() {
        System.out.println("Lesson 4: print() vs println()"); // Prints header

        // print(): stays on SAME LINE
        System.out.print("Hello, "); // print(): stays on the SAME LINE | Output: "Hello, World!"
        System.out.print("World!"); // print(): stays on the SAME LINE
        System.out.println(); // move to next line manually

        // println(): prints then moves to new line
        System.out.println("Hello,"); // println(): prints AND moves to a new line | Output: "Hello,"
        System.out.println("World!"); // println(): prints AND moves to a new line | Output: "World!"

    }


    /*===================================
      💜 LESSON 4: Escape Sequences  💜
    ====================================*/
    private static void lesson4_EscapeSequences() {
        System.out.println("Lesson 4: Escape Sequences"); // Prints a header introducing escape sequences

        System.out.println("Hello,\nWorld!"); // \n = newline | Output: Hello  | | Output: World! would print on a new line
        System.out.println("Item\tPrice"); // \t = tab spacing| -> | Output: Item    Price
        System.out.println("Path: C:\\Users\\Student"); // \\ = literal backslash -> | Output: Path C:\Users\Students
        System.out.println("\"Java Programming\""); // \" = double quote | Output: "Java Programming"


    }


    /* ===================================================
       💜 Lesson 4: Reading an Integer Input (nextInt) 💜
    ====================================================== */
    private static void demoReadInteger() {
        System.out.println("Lesson 4: Reading an int with nextInt()");// Prints a lesson header for the next() input example

        Scanner scanner = new Scanner(System.in); // Creates a Scanner to read keyboard input | Input: 21

        System.out.print("Enter your age: "); // Prompts the user to enter their age
        int age = scanner.nextInt(); // Reads an integer ONLY
        System.out.println("You entered age: " + age); // Confirm to the user that the input was valid | Output: 21

        /* ⚠️ Possible Error: InputMismatchException if the user types text instead of a number.⚠️ */
    }


    /*=======================================================
       💜 Lesson 4: Reading a Double Input (nextDouble)  💜
    ========================================================= */
    private static void demoReadDouble() {
        System.out.println("Lesson 4: Reading a double with nextDouble()");// Prints a lesson header for the next() input example

        Scanner scanner = new Scanner(System.in); // Creates a Scanner to read keyboard input | Input: 1.65

        System.out.print("Enter your height in meters: "); // Prompts the user to enter their height in meters
        double height = scanner.nextDouble(); // Double → reads decimal numbers
        System.out.println("Your height is: " + height + " meters"); // Confirm to the user that the input was valid | Output: 1.65 meters

        /*⚠️Possible Error:InputMismatchException if user types letters⚠️*/
    }


    /* ============================================
      💜 Lesson 4: Reading a Single Word (next) 💜
    ===============================================*/
    private static void demoReadSingleWord() {  // Lesson method: shows how Scanner.next() reads only ONE word | Input stops at whitespace (space, tab, or Enter)
        System.out.println("Lesson 4: Reading a single word with next()"); // Prints a lesson header for the next() input example

        Scanner scanner = new Scanner(System.in); // Creates a Scanner to read keyboard input | Input: Gracie

        System.out.print("Enter your first name: "); // Prompts the user to enter their first name
        String name = scanner.next(); // Stops reading at spaces
        System.out.println("Hello, " + name); // Confirm to the user that the input was valid | Output: "Hello, Gracie"

        /*️⚠️Important: If user types "Gracie Mills" → Only "Gracie" is stored⚠️*/
    }


    /* ================================================
      💜 Lesson 4: Reading a Full Line (nextLine) 💜
    ===================================================*/
    private static void demoReadFullLine() { // Lesson method: shows how Scanner.nextLine() reads ALL text up to Enter | Useful for input like addresses, names, or full sentences
        System.out.println("Lesson 4: Reading a full line with nextLine()"); // Section header for the nextLine() demonstration

        Scanner scanner = new Scanner(System.in); // Creates a Scanner to read keyboard input | Input: 123 Java Street Apt 4

        System.out.print("Enter your address: "); // Prompts the user to enter their address
        String address = scanner.nextLine();// Reads EVERYTHING until Enter
        System.out.println("Your address is: " + address); // Confirm to the user that the input was valid |Output: Your address is: 123 Java Street Apt 4
    }


    /* ==========================================================
       💜 Lesson 4: nextInt() + nextLine() Issue (IMPORTANT) 💜
    ============================================================= */
    private static void demoNextLineBugAndFix() {
        System.out.println("Lesson: nextInt() + nextLine() fix"); // Lesson focus: handling leftover newline issues in Scanner | nextInt() does NOT consume the newline character

        Scanner scanner = new Scanner(System.in); // Creates a Scanner to read keyboard input | Input: 5 | Input: I love Java

        System.out.print("Enter a number: "); // Prompts the user to enter a number
        int number = scanner.nextInt();  // Reads the integer input and stores it in 'number'

        scanner.nextLine(); // FIX: clears leftover newline

        System.out.print("Enter a sentence: "); // Output: "Enter a sentence:"
        String sentence = scanner.nextLine(); // Reads EVERYTHING until Enter


        System.out.println("Number: " + number); // Prints the value stored in the variable 'number
        System.out.println("Sentence: " + sentence); // Prints the text stored in the variable 'sentence'

        /*⚠️ Without scanner.nextLine(): Sentence would be EMPTY⚠️*/

    }


    /* ==============================================
      💜 Lesson 4: Input Validation (hasNextInt) 💜
    ================================================= */
    private static void demoInputValidation() {
        System.out.println("Lesson 4: Input validation with hasNextInt()");

        Scanner scanner = new Scanner(System.in); // Creates a Scanner to read keyboard input| Input: hello

        System.out.print("Enter a whole number: "); // Output: "Enter a whole number"
        if (scanner.hasNextInt()) { // Check whether the next user input is an integer before reading it
            int value = scanner.nextInt(); // Safely read the integer value from the scanner
            System.out.println("Valid input: " + value); // Confirm to the user that the input was valid
        } else { // Handles invalid input to keep the program from crashing | Friendly reminder: input must be a whole number
            System.out.println("❌ Error: That is not an integer!"); // Handle invalid input when the user does not enter an integer
        }

        /*📌✔ Prevents InputMismatchException📌*/
    }


    /* =====================================
       💜 Lesson 4: Closing the Scanner 💜
    ========================================*/
    private static void demoClosingScanner() {
        System.out.println("Lesson 4: Closing the Scanner"); // Prints a section header for the lesson | '\n' adds a blank line before the header for readability

        Scanner scanner = new Scanner(System.in); // Creates a Scanner object to read input from the keyboard (System.in)

        System.out.print("Enter any number: "); // Prompts the user for input without moving to a new line
        int num = scanner.nextInt(); // Reads an integer entered by the user and stores it in the variable 'num'
        System.out.println("You entered: " + num); // Displays the value the user entered using string concatenation

        scanner.close(); // Closes the Scanner and releases system resources | After closing, this Scanner can NO LONGER be used

        /* ⛔ IMPORTANT: Do NOT use scanner again after closing it.⛔ */
    }


    /* ====================================================
       💜 Lesson 4 Control Flow: while Loop (Counting) 💜
    ======================================================*/
    private static void demoWhileLoopCounting() {
        System.out.println("Control Flow: while loop counting"); // Section header: demonstrates a while loop | A while loop repeats as long as its condition remains true

        int count = 1; // Creates a counter variable that will control how many times the loop runs | Where you start counting (0 vs 1) changes everything—loop output, number of iterations, and off-by-one errors.

        while (count <= 5) { // Loop continues as long as count is less than or equal to 5
            System.out.println("Count: " + count); // Prints the current value of count
            count++;  // Increments count by 1
        }

        /*
        ✅ Output:
        Count: 1
        Count: 2
        Count: 3
        Count: 4
        Count: 5

        ⚠️ Common error: forget count++ → infinite loop ⚠️ */
    }


    /* ======================================================
       💜 Lesson 4 Control Flow: do-while Loop (Counting) 💜
     =======================================================*/
    private static void demoDoWhileLoopCounting() {
        System.out.println("Control Flow: do-while loop counting"); // Prints header

        int count = 1; // Initializes the counter variable starting at 1

        do {
            System.out.println("Count: " + count); // Prints the current value of count
            count++; // Increments the counter by 1 after each iteration
        } while (count <= 5); // Condition is checked AFTER the loop runs | This guarantees the loop executes at least once





        /* ===============================================================
       💜 Lesson 4 Control Flow: do-while with FALSE initial condition 💜
      ===================================================================*/
        System.out.println("Control Flow: do-while false initial condition");

        count = 6; // Starting value already exceeds the condition

        do {
            System.out.println("Count: " + count);  // Prints the current value of count
        } while (count <= 5); // Condition is checked AFTER the loop runs | Even though the condition is false, the loop executes once

        /*💡 Tip: do-while is great for menus. 💡*/
    }


    /* ======================================================
       💜 Lesson 4 Control Flow: for Loop (Array Example) 💜
    ========================================================= */
    private static void demoForLoopArrayExample() {
        System.out.println("Control Flow: for loop array example"); // Creates a header

        int[] numbers = {10, 20, 30, 40, 50}; // Declares and initializes an array of integers | An array stores multiple values of the SAME type under one variable name

        for (int i = 0; i < numbers.length; i++) {  // Accesses the current element using the index i | numbers[i] means: "the element at position i in the array"
            System.out.println("Number: " + numbers[i]);
        }
        /*🚨for-loop structure breakdown🚨:
         --------------------------------
     📌int i = 0; → initialization (start at index 0)
     📌i < numbers.length; → condition (run while i is a valid index)
     📌i++ → update (move to the next index)

     🧠Vocabulary help🧠:
     ⭐index: the position of an element in an array (starts at 0 in Java)
     ⭐length: total number of elements in the array*/

        /* ⚠️ Common error: i <= numbers.length  → ArrayIndexOutOfBoundsException⚠️*/
    }


    /* =====================================================
       💜 Lesson 4 Control Flow: break (Exit loop early) 💜
    ====================================================== */
    private static void demoBreakInLoop() {
        System.out.println("Control Flow: break inside a loop");   // Identifies this demo in the console output

        for (int i = 1; i <= 10; i++) {
            /*
         Conditional check:
         - When i reaches 5, the break statement executes
         - break immediately exits the ENTIRE loop
         - No further iterations occur
        */
            if (i == 5) break; // 🚨 Emergency exit: loop stops instantly
            System.out.println("Iteration: " + i); // This line runs ONLY if break is NOT triggered
        }
         /*
     Execution timeline:            Output:
     -------------------       -------------------
     i = 1 → prints 1              Iteration: 1
     i = 2 → prints 2              Iteration: 2
     i = 3 → prints 3              Iteration: 3
     i = 4 → prints 4              Iteration: 4
     i = 5 → break → loop ends → control jumps AFTER the loop

     🧠Vocabulary help🧠:
     ----------------
     ⭐break:
     📌Immediately exits the nearest enclosing loop or switch
     📌Skips the remaining loop body
     📌Skips all future iterations

     ⚠️ Common confusion: ⚠️
     -break does NOT stop the program
     -break does NOT exit a method
     -break ONLY exits the loop or switch it’s inside
    */

    }


    /* =====================================================
       💜  Lesson 4 Control Flow: break (Search Example) 💜
    ========================================================*/
    private static void demoBreakSearchExample() {
        System.out.println("Control Flow: break search example");  // Identifies this demo in the console

        int[] numbers = {1, 3, 5, 7, 9, 11}; // Array to search through | for-each loops are ideal when you don't need index positions
        int target = 7;
        /*⭐for-each loop structure breakdown⭐:
          ----------------------------------
          📌 for (int number : numbers)

         Read as: "For each number inside the numbers array…"

        🧠Vocabulary help🧠:
        ⭐number → the current element (one value at a time)
        ⭐numbers → the array being traversed

        Notes:
       📌Automatically starts at the first element
       📌Automatically stops at the last element
       📌No index variable needed*/

        for (int number : numbers) {
         /*⭐Comparison check:⭐
        📌Compares the current element to the target value
        📌If a match is found, we print a success message
        📌 break stops the loop immediately (no extra searching)*/
            if (number == target) {
                System.out.println("Found the target: " + target);
                break; // 🛑 Target found → stop searching
            }
            /*Execution timeline:
             -------------------
            number = 1  → no match
            number = 3  → no match
            number = 5  → no match
            number = 7  → MATCH → print → break → loop ends

            Output: Found the target: 7*/

        }

    }


    /* ==========================================================
       💜  Lesson 4 Control Flow: continue (Skip current loop) 💜
    ============================================================= */
    private static void demoContinueExample() {
        System.out.println("Control Flow: continue example"); // Identifies this demo in the console output

            /*🚨for-loop structure breakdown:🚨
          --------------------------------
       📌int i = 1; → initialization (starting value)
       📌i <= 5; → condition (loop runs while true)
       📌i++ → update (increments i after each iteration)*/

        for (int i = 1; i <= 5; i++) {
            /*⭐Conditional check:⭐
         📌When i equals 3, continue is triggered
         📌continue SKIPS the rest of the loop body
         📌The loop then moves directly to the next iteration*/
            if (i == 3) continue; // ⏭ Skip this iteration, keep looping
            System.out.println("Iteration: " + i);  // This line runs for every value EXCEPT i == 3
        }
         /*
     Execution timeline:                    Output
     -------------------
     i = 1 → prints 1                     Iteration: 1
     i = 2 → prints 2                     Iteration: 2
     i = 3 → continue → print skipped
     i = 4 → prints 4                     Iteration: 4
     i = 5 → prints 5                     Iteration: 5 */

    /*🧠Vocabulary help:🧠
      ------------------
      ⭐continue:
      ⭐Skips the CURRENT iteration only
      ⭐Does NOT exit the loop
      ⭐Control jumps to the loop update step (i++)


     ⚠️ Common confusion: ⚠️
     - continue ≠ break
     - continue does NOT stop the loop
     - break exits the loop entirely
    */


    }

    /* ===========================================================
       💜 Lesson 4 Control Flow: continue (Skip Even Numbers) 💜
     ============================================================= */
    private static void demoContinueSkipEvens() {
        System.out.println("Control Flow: continue skip evens");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println("Odd number: " + i);
        }
    }


    /* =========================================================
       💜 Lesson 4 Control Flow: Combining break + continue 💜
    ===========================================================*/
    private static void demoBreakAndContinueCombined() {
        System.out.println("Control Flow: break + continue combined");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            if (i % 2 == 0) continue;
            System.out.println("Odd number before 5: " + i);
        }

        /*🚨 Memorize:🚨
        📌break = leaves loop entirely
        📌continue = skips this iteration only*/
    }


    /* ==========================================================
       💜 Lesson 4 OPTIONAL: while loop with user input (exit) 💜
     ============================================================ */
    private static void demoWhileUserInputExit() {
        System.out.println("OPTIONAL: while user input exit");

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number != 5) {
            System.out.print("Enter a number (5 to exit): ");
            number = scanner.nextInt();
        }

        System.out.println("You entered 5. Exiting...");
        scanner.close();
    }

    /* ============================================================
        💜 Lesson 4 OPTIONAL: do-while menu example (exit on 3) 💜
     ============================================================== */
    private static void demoDoWhileMenuExample() {
        System.out.println("OPTIONAL: do-while menu example");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Start Game");
            System.out.println("2. Load Game");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("Exiting the menu...");
        scanner.close();
    }

    /*====================================
       💜  Lesson 4 Switch statement  💜
    =====================================*/
    private static void demoSwitchStatement() {
        System.out.println("switch statement");

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Unknown day");
        }

        /*
        ✅ Output:
        Wednesday

        ⚠️ Tip: forgetting break causes “fall-through”.⚠️*/
    }


    /* ===================================
      💗 Lesson 5 Math class methods 💗
    ====================================== */
    private static void demoMathMethods() {
        System.out.println("Math methods");

        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("2 to the power of 3: " + Math.pow(2, 3));
        System.out.println("Absolute value of -10: " + Math.abs(-10));
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));
        System.out.println("Random number (0–1): " + Math.random());

        /*
        💡 Tip:
        Math methods are STATIC → use Math.sqrt(25)
        NOT new Math().sqrt(25)
        */
    }

    /* ==============================
     💗 Lesson 5 String methods 💗
    ================================= */
    private static void demoStringMethods() {
        System.out.println("String methods");

        String message = "Hello, World";

        System.out.println("Length: " + message.length());
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());
        System.out.println("Substring (7, 12): " + message.substring(7, 12));
        System.out.println("Equals 'Hello, World': " + message.equals("Hello, World"));

        /* ⚠️ Tip: Use .equals(), NOT ==, to compare strings */
    }

    /* ======================================
       💗 Lesson 5 Arrays utility methods 💗
    ========================================= */
    private static void demoArraysMethods() {
        System.out.println("Arrays methods");

        int[] numbers = {5, 3, 8, 1, 9};

        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);

        /*
        ⚠️ Tip:
        binarySearch ONLY works correctly on a sorted array.
        */
    }

    /* ==========================================
       💗 Lesson 5 Methods: Invoking a Method 💗
    ============================================= */
    private static void demoMethodInvoke() {
        System.out.println("Methods: invoking (calling) a method");
        printMessage();

        /*
        ❌ Not a method call:
        printMessage;   // this would be invalid in Java
        */
    }

    private static void printMessage() {
        System.out.println("Hello from the method!");
    }

    /* ===================================
      💗 Lesson 5 Methods: Parameters 💗
    ======================================*/
    private static void demoMethodParameters() {
        System.out.println("Methods: parameters");
        greet("Alice");
        greet("Bestie");

        /*
        ❌ ERROR EXAMPLE:
        greet(5);  // 5 is not a String
        */
    }

    private static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    /* =====================================
       💗 Lesson 5 Methods: Return types 💗
    ========================================*/
    private static void demoReturnType() {
        System.out.println("Methods: return types");
        int result = add(5, 10);
        System.out.println("Sum: " + result);

        /*
        ❌ ERROR EXAMPLE:
        public static int add(int a, int b) {
            a + b; // missing return
        }
        */
    }

    private static int add(int a, int b) {
        return a + b;
    }

    /* ============================
      💗 Lesson 5 Methods: Void 💗
    =============================== */
    private static void demoVoidMethod() {
        System.out.println("Methods: void");
        sayHi();

        /*
        ❌ ERROR:
        int x = sayHi();  // void returns nothing
        */
    }

    private static void sayHi() {
        System.out.println("Hi there!");
    }

    /* ===========================================
      💗 Lesson 5 Methods: Multiple parameters 💗
    ============================================== */
    private static void demoMultipleParameters() {
        System.out.println("Methods: multiple parameters");
        double avg = average(10, 20, 30);
        System.out.println("Average: " + avg);

        /*
        ❌ ERROR:
        average(10, 20); // missing parameter
        */
    }

    private static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    /* ======================================
      💗 Lesson 5 Methods: boolean return 💗
    ========================================= */
    private static void demoBooleanReturn() {
        System.out.println("Methods: boolean return");
        boolean result = isEven(10);
        System.out.println("Is 10 even? " + result);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /* ====================================
       💗 Lesson 5 Methods: Overloading 💗
    ======================================= */
    private static void demoOverloading() {
        System.out.println("Methods: overloading");

        System.out.println(addOverload(5, 10));        // 15
        System.out.println(addOverload(1, 2, 3));      // 6
        System.out.println(addOverload(2.5, 3.5));     // 6.0

        /*
        ⚠️ Overloading rule:
        Method signature must differ (params count/type/order).
        Return type alone cannot be the only difference.
        */
    }

    private static int addOverload(int a, int b) {
        return a + b;
    }

    private static int addOverload(int a, int b, int c) {
        return a + b + c;
    }

    private static double addOverload(double a, double b) {
        return a + b;
    }

    /* ===========================================
       💗 Lesson 5 Scope: Local Variable Scope 💗
    ============================================== */
    private static void demoLocalScope() {
        System.out.println("Scope: local variable scope");

        String message = "Hello from inside the method";
        System.out.println(message);

        /*
        ⚠️ If you try to use 'message' outside this method → compile error.
        */
    }

    /* =======================================
      💗 Lesson 5 Scope: Parameter scope 💗
    ========================================== */
    private static void demoParameterScope(String name) {
        System.out.println("Scope: parameter scope");
        System.out.println("Hello, " + name);
    }

    /* ======================================================
      💗  Lesson 5 Scope: Instance/static variable example 💗
    ========================================================= */
    private static String storedName;                 // static class-level variable
    private static String shadowMessage = "Hello from CLASS variable";

    private static void demoInstanceScope() {
        System.out.println("Scope: class-level (static) variable scope");

        storedName = "John";
        System.out.println("Stored name is: " + storedName);
    }

    /*  ========================================
       💗 Lesson 5 Scope: Variable shadowing 💗
    ============================================ */
    private static void demoVariableShadowing() {
        System.out.println("Scope: variable shadowing");

        String shadowMessage = "Hello from LOCAL variable"; // shadows class variable
        System.out.println(shadowMessage);

        /*
        ✅ Output:
        Hello from LOCAL variable
        */
    }

    /* =======================================
      💗 Lesson 5 Scope: Variable lifetime 💗
    ========================================== */
    private static void demoVariableLifetime() {
        System.out.println("Scope: variable lifetime");

        int temporary = 10;
        System.out.println("Temporary value: " + temporary);

        /*
        Local variables die when the method ends.
        */
    }
}



