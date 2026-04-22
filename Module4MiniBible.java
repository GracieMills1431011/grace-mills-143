package module4minibible;
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
import java.util.Arrays; // Utility class for working with arrays | Includes sorting, searching, and printing arrays
import java.util.ArrayList; // Dynamic array (resizable list) | Unlike normal arrays, ArrayList can grow and shrink
import java.util.HashMap; // Key-value data structure (Map implementation) | Stores data in pairs: key -> value
import java.util.Map;  // Interface for key-value collections | HashMap, TreeMap, LinkedHashMap all implement Map
import java.util.Iterator; // Object used to loop through collections safely | Prevents errors when removing elements during iteration
import java.util.Collections; // Utility class for collection operations | Includes sorting, reversing, shuffling, etc.
import java.util.Comparator;  // Interface used to define custom sorting rules | Example: sorting objects by name or age
import java.util.NoSuchElementException; // Exception thrown when trying to access an element that does not exist | Often occurs with Iterators or empty collections

/*
Name: Gracie Mills
Date: March 11, 2026
Course: Programming Fundamentals II (Java)

Module: Module 4 “Mini-Bible” Reference

Purpose:
An IntelliJ reference file that demonstrates Module 4 Data Structures,
starting with Lesson 1 Arrays. This file follows the structure:
package → imports → class → main → examples (with outputs as comments)

📕 HOW TO USE 📕
1) Put this file here: src/module4minibible/Module4MiniBible.java
2) Package line MUST match folder path: module4minibible
3) Run it and compare console output to the expected output comments.
4) In main(), comment out calls to focus on one section at a time.

==========================================================
💖 MODULE 4 — BIG IDEA (the “philosophy”) 💖
----------------------------------------------------------
⭐ Data structures help organize, store, and manage data.
⭐ They make code more efficient, reusable, and easier to read.
⭐ Instead of creating many separate variables, we group values together.
⭐ Arrays are the first core data structure in Java.
⭐ Later structures like ArrayList, HashMap, and Generics build on this idea.
*/

/* =======================================================
📘 MODULE 4 MINI-BIBLE — Data Structures (Java)
📦 Package: module4minibible
📄 File: Module4MiniBible.java
==========================================================
                    🧠 BIG IDEA 🧠
----------------------------------------------------------
Data Structures = “containers” that store + organize data so you can:
✅ access it fast
✅ change it safely
✅ keep code clean + reusable
✅ stop your program from turning into spaghetti 🍝

This module covers:
📌 Arrays
📌 ArrayLists
📌 HashMaps
📌 Generics
📌 Iteration (loops + Iterator)
📌 Sorting + Searching
📌 Exceptions + Defensive Programming
📌 Testing + Debugging for data structures

==========================================================
                       🧭 PURPOSE 🧭
==========================================================
Use data structures when you have:
💗 multiple values (not just one)
💗 repeated operations (traverse, add, remove, search)
💗 real-world data (students, items, scores, orders, etc.)

They help answer questions like:
💖 “What’s the 5th item?”
💖 “Do we have this name?”
💖 “What’s the score for this student id?”
💖 “Add a new item without rebuilding everything.”

==========================================================
            🧾 VOCABULARY (Quick Scan)🧾
==========================================================
⭐ Array            → fixed-size list of same-type values
⭐ Index            → position in a list (starts at 0)
⭐ Traversal        → visiting each element (looping through)
⭐ 2D Array         → array of arrays (rows/columns)
⭐ ArrayList        → resizable list (dynamic size)
⭐ Wrapper Class    → object version of primitives (Integer, Double)
⭐ HashMap          → key-value storage (dictionary)
⭐ Key / Value      → key identifies, value stores the data
⭐ Generic <T>      → type parameter for safety + flexibility
⭐ Iterator         → object that walks through a collection
⭐ Linear Search    → check each item one-by-one
⭐ Binary Search    → fast search in sorted data
⭐ Sorting          → ordering data (ascending/descending)
⭐ Defensive Coding → validate inputs to avoid crashes
⭐ Exception        → runtime error event (like index out of bounds)
⭐ Assertion        → test check (expects something to be true)

==========================================================
    🏗 PROGRAMMING STRUCTURE (What goes with what) 🏗
==========================================================
🚀 Program starts
└── main()
    ├── 1) Create structure (array / ArrayList / HashMap)
    ├── 2) Add/initialize data
    ├── 3) Traverse (loop)
    ├── 4) Apply operations (search, sort, update, remove)
    ├── 5) Validate + handle exceptions
    └── 6) Output + test behavior

==========================================================
                 💡 MINI-BIBLE NOTE 💡
==========================================================
This file is your “master map” + demo lab.
✅ Notes live in big comment sections
✅ Real code lives in small demo methods
✅ main() calls demos in a clean order
========================================================== */

/* ========================================================
        📚 LESSON 1 — ARRAYS & DATA STRUCTURES 📚
==========================================================
This section introduces the first core data structure
in Java: ARRAYS.

Topics Covered in Lesson 1:
✨ What data structures are
✨ Why arrays are useful
✨ Declaring arrays
✨ Initializing arrays
✨ Accessing elements
✨ Modifying elements
✨ Traversing arrays with loops
✨ Common array operations
✨ Sorting arrays
✨ Searching arrays
✨ Multidimensional arrays

By the end of this lesson you should understand how
arrays store and organize data in memory.
========================================================= */

public class Module4MiniBible {
    /* ==========================================================
       PROGRAM EXECUTION FLOW
       ----------------------------------------------------------
       main()
         ↓
       lesson runner methods
         ↓
       small demo methods
         ↓
       console output + examples
       ========================================================== */

    /*=======================================
      ✨ MAIN METHOD (Program starts here) ✨
      ---------------------------------------
      ⚡ The JVM runs main() first
      ⚡ We "call" each lesson like chapters
    =========================================*/
    public static void main(String[] args) {

        /* ===================================================
         ✅ RUN SWITCHBOARD:
         ✅ Comment/uncomment what you want to practice today.
        ====================================================== */

        demoUnderstandingArrayListClass();
        demoAdvantagesOfArrayList();
        demoDisadvantagesOfArrayList();
        demoCommonArrayListMethodsOverview();
        demoArrayListAddMethod();
        demoArrayListRemoveMethod();
        demoArrayListGetMethod();
        demoArrayListSetMethod();
        demoArrayListSizeMethod();
        demoArrayListExample();
    }

    /* ========================================================
                   🧠 DATA STRUCTURES OVERVIEW 🧠
     ==========================================================
     📌 A data structure organizes data so programs can store,
        access, and modify information efficiently.
     📌 Instead of making many separate variables, we group values
        together in one organized structure.

     🛑 Example: 🛑
     int score1 = 90;
     int score2 = 85;
     int score3 = 100;

     🚨 Better approach: 🚨
     int[] scores = {90, 85, 100};

     ✨ In this module we study: ✨
     📦 Arrays
     📦 ArrayLists
     📦 HashMaps
     📦 Generics
     📦 Iterators
     📦 Sorting and Searching
     📦 Exceptions and Testing

     Think of data structures like storage systems:
     🧺 Basket → simple collection
     📚 Bookshelf → ordered storage
     🗂 Filing cabinet → key/value lookup

     Each structure solves a different problem.
     ========================================================== */

    /* ========================================================
                       🧠 DATA STRUCTURES OVERVIEW 🧠
     ==========================================================
         Purpose:
         Introduces the concept of data structures and why they  are important for organizing data efficiently.
         Program Flow:
         1. Print section title
         2. Explain what data structures do
         3. Show inefficient variable example
         4. Show better array example
         5. List topics covered in Module */
        private static void demoDataStructuresOverview() {
            System.out.println("🧠 DATA STRUCTURES OVERVIEW");
            System.out.println("Data structures organize data efficiently.");
            System.out.println("Example separate variables: score1, score2, score3");
            System.out.println("Better approach: int[] scores = {90, 85, 100};");
            System.out.println("Module 4 covers Arrays, ArrayLists, HashMaps, Generics, Iterators, Sorting, Searching, Exceptions, and Testing.");
            System.out.println();
        }

        /* ========================================================
                    🎯 MODULE 4 LEARNING OBJECTIVES 🎯
         ==========================================================
         By the end of this module you should be able to:
         ✨ Declare, initialize, and manipulate arrays
         ✨ Traverse arrays using loops
         ✨ Use ArrayList for dynamic collections
         ✨ Work with HashMaps using key/value pairs
         ✨ Apply generics for type-safe collections
         ✨ Sort and search data
         ✨ Handle exceptions with collections
         ✨ Test and debug data structure behavior

         In short:
         🧠 Organize data
         ⚙️ Manipulate data
         🔍 Search data
         📊 Process data efficiently
         ========================================================== */
    private static void demoModule4LearningObjectives() {
        System.out.println("🎯 MODULE 4 LEARNING OBJECTIVES");
        System.out.println("Declare, initialize, and manipulate arrays.");
        System.out.println("Traverse arrays using loops.");
        System.out.println("Use ArrayList for dynamic collections.");
        System.out.println("Work with HashMaps using key/value pairs.");
        System.out.println("Apply generics for type-safe collections.");
        System.out.println("Sort and search data.");
        System.out.println("Handle exceptions with collections.");
        System.out.println("Test and debug data structure behavior.");
        System.out.println();
    }

    /* =========================================================
                        🌟 ARRAYS OVERVIEW 🌟
     ==========================================================
     📌 An array stores multiple elements of the SAME type inside
        a single structure.

     🚨 Key characteristics: 🚨
     📌 Ordered → elements stay in a fixed order
     📌 Fixed size → length cannot change after creation
     📌 Fast access → elements are retrieved using an index

     Example:
     int[] numbers = {10, 20, 30, 40};

     Memory visualization:

     Index  →   0   1   2   3
             ----------------
     Value  →  10  20  30  40
 ========================================================== */
    private static void demoArraysOverview() {
        System.out.println("🌟 ARRAYS OVERVIEW"); // Print a title so the console output clearly shows the section being demonstrated

        // Create and initialize an integer array using an array literal
        // The array contains 4 elements stored in order
        int[] numbers = {10, 20, 30, 40};

        System.out.println("numbers = " + Arrays.toString(numbers)); // Arrays.toString() converts the array into a readable string format | Without this method, Java would print the memory address instead
        System.out.println("numbers[0] = " + numbers[0]); // Access the first element of the array | Arrays use zero-based indexing (the first position is index 0)
        System.out.println("numbers[2] = " + numbers[2]); // Access the third element of the array | Index 2 corresponds to the third position
        System.out.println("Arrays are ordered, fixed-size, and fast for index access."); // Print a short explanation of key array characteristics
        System.out.println();  // Print a blank line to visually separate this demo from the next one
    }


    /* ==========================================================
                        🏗 DECLARING ARRAYS 🏗
     ==========================================================
     🧠 What it is 🧠
     Declaring an array tells Java that we want a variable capable
     of storing multiple values of the same type.

     💻 Syntax Pattern 💻:
     dataType[] arrayName;

     Examples:
     int[] numbers;
     String[] names;
     double[] prices;

     ⚙️ Important Idea ⚙️
     This step only creates a REFERENCE variable.
     Memory for the actual array is NOT created yet.
     ========================================================== */
    private static void demoDeclaringArrays() {
        System.out.println("🏗 DECLARING ARRAYS");

        int[] numbers;
        String[] names;
        double[] prices;

        System.out.println("Declared: int[] numbers;");
        System.out.println("Declared: String[] names;");
        System.out.println("Declared: double[] prices;");
        System.out.println("Memory is not allocated until initialization.");
        System.out.println();
    }

    /* ==========================================================
                    ⚙️ INITIALIZING ARRAYS ⚙️
     ==========================================================
     Arrays must be initialized before use so memory can be allocated.

     🌟 Method 1 — Using new 🌟
     Default values:
     int     → 0
     double  → 0.0
     boolean → false
     objects → null
     ========================================================== */
    private static void demoMethod1UsingNew() {

        // Create an integer array with space for 5 elements
        // Default value for int elements is 0
        int[] numbers = new int[5];

        // Create a String array with space for 3 elements
        // Default value for object references like String is null
        String[] names = new String[3];

        // Print explanation of the initialization method being demonstrated
        System.out.println("Method 1 — Using new");

        // Show the code syntax for creating arrays with 'new'
        System.out.println("int[] numbers = new int[5];");
        System.out.println("String[] names = new String[3];");

        // Loop through the numbers array from index 0 to numbers.length - 1
        // numbers.length tells us how many elements the array contains
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]); // Print each element and its index
                                                                     // Since the array was just created, all values are still 0
        }

        for (int i = 0; i < names.length; i++) { // Loop through the names array
            System.out.println("names[" + i + "] = " + names[i]); // Print each element and its index
                                                                 // Since no Strings were assigned yet, values are null
        }

        /* 🖨️ OUTPUT 🖨️:
           numbers[0] = 0
           numbers[1] = 0
           numbers[2] = 0
           numbers[3] = 0
           numbers[4] = 0
           names[0] = null
           names[1] = null
           names[2] = null */

        System.out.println();
    }

    /* ==========================================================
                    🌟 METHOD 2 — ARRAY LITERAL 🌟
     ==========================================================
     This creates the array and fills it immediately.
     ========================================================== */
    private static void demoMethod2ArrayLiteral() {

        // Create and initialize an integer array using an array literal
        // All values are assigned at the moment the array is created
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};  // Create and initialize a String array using an array literal

        System.out.println("Method 2 — Array Literal");  // Print a title explaining which initialization method is being demonstrated

        // Print the code syntax so the output acts like a learning reference
        System.out.println("int[] numbers = {1, 2, 3, 4, 5};");
        System.out.println("String[] names = {\"Alice\", \"Bob\", \"Charlie\"};");

        // Loop through the numbers array
        // The loop starts at index 0 and continues until the last element
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]); // Print the index position and the value stored in that position
        }

        // Loop through the names array using the same index pattern
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] = " + names[i]); // Print each name along with its index
        }

        /* 🖨️ OUTPUT 🖨️:
           numbers[0] = 1
           numbers[1] = 2
           numbers[2] = 3
           numbers[3] = 4
           numbers[4] = 5
           names[0] = Alice
           names[1] = Bob
           names[2] = Charlie */

        System.out.println();
    }

    /* ==========================================================
                   🌟 METHOD 3 — LOOP INITIALIZATION 🌟
     ==========================================================
      Instead of manually assigning values, a loop fills the array.
      This is useful when values follow a pattern or formula.
      If you need a pattern, you can initialize with a loop.


     Example:
     numbers[i] = i * 2;
     ========================================================== */
    private static void demoMethod3LoopInitialization() {

        // Create an integer array with space for 5 elements
        // Default values are initially all 0
        int[] numbers = new int[5];

        // Loop through each index of the array
        // numbers.length gives the total number of elements
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2; // Assign a value to each position in the array
                               // Here we use a formula: index * 2
                              // This produces the sequence: 0, 2, 4, 6, 8
        }

        System.out.println("Method 3 — Loop Initialization"); // Print a label describing the demonstration

        for (int i = 0; i < numbers.length; i++) { // Loop again to display each element in the array
            System.out.println("numbers[" + i + "] = " + numbers[i]); // Print both the index and the stored value
        }

        /* 🖨️ OUTPUT 🖨️:
           numbers[0] = 0
           numbers[1] = 2
           numbers[2] = 4
           numbers[3] = 6
           numbers[4] = 8 */

        System.out.println();
    }

    /* ==========================================================
                    🖨️ ARRAY PRINT EXAMPLE 🖨️
     ============================================================
     Demonstrates how to loop through an array and display each element in a readable format.
     This follows the book example:
     declare + initialize + loop through scores.
     ========================================================== */
    private static void demoArrayPrintExample() {
        int[] scores = {85, 90, 75, 100, 95}; // Create and initialize an array of student scores

        System.out.println("Scores:"); // Print a title so the console output is easier to read

        // Loop through each index of the array
        // The loop runs from 0 up to scores.length - 1
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]); // Print the score number and its value | (i + 1) is used so the display starts at Score 1 instead of Score 0
        }

        /* 🖨️ OUTPUT 🖨️:
           Scores:
           Score 1: 85
           Score 2: 90
           Score 3: 75
           Score 4: 100
           Score 5: 95 */

        System.out.println();
    }

    /* =========================================================
                    📍 ACCESSING ARRAY ELEMENTS 📍
      ==========================================================
     Demonstrates how to retrieve values from specific positions (indexes) inside an array
     Access array elements with:
     arrayName[index]
     ========================================================== */
    private static void demoAccessingArrayElements() {
        int[] numbers = {10, 20, 30, 40, 50}; // Create and initialize an integer array with five elements

        System.out.println("📍 ACCESSING ARRAY ELEMENTS"); // Print a section title so the console output is organized

        // Access and print the first element in the array
        // Arrays use zero-based indexing, so index 0 is the first element
        System.out.println(numbers[0]);

        // Access and print the fourth element in the array
        // Index 3 corresponds to the fourth position
        System.out.println(numbers[3]);

        /* 🖨️ OUTPUT 🖨️:
           10
           40 */

        System.out.println();
    }

    /* ==========================================================
                     ✏️ MODIFYING ARRAY ELEMENTS ✏️
      ----------------------------------------------------------
      Elements inside an array can be changed using the index.

      Syntax:
      arrayName[index] = newValue;
      ========================================================== */
    private static void demoModifyingArrayElements() {
        int[] numbers = {10, 20, 30, 40, 50}; // Create an array with initial values

        // Modify the value at index 1 (second element)
        numbers[1] = 25;

        // Modify the value at index 4 (fifth element)
        numbers[4] = 55;

        System.out.println("✏️ MODIFYING ARRAY ELEMENTS");

        // Print the updated elements
        System.out.println(numbers[1]);
        System.out.println(numbers[4]);

    /* 🖨️ OUTPUT 🖨️:
       25
       55 */

        System.out.println();
    }

    /* ==========================================================
              🔁 ACCESSING AND MODIFYING WITH A LOOP 🔁
     ============================================================
     A loop allows us to process every element in the array.
     ============================================================*/
    private static void demoAccessingAndModifyingWithLoop() {
        int[] scores = {85, 90, 75, 100, 95}; // Create array of student scores

        System.out.println("Original scores:");
        for (int i = 0; i < scores.length; i++) { // Loop through the array and display original values
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }

         /* MODIFY ARRAY VALUES
       Each score is increased by 5 points */
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 5; // equivalent to scores[i] = scores[i] + 5
        }

        System.out.println("\nUpdated scores:");

        // Print the modified values
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }

        System.out.println();
    }

    /* ==========================================================
                    ⚠️ COMMON ARRAY ERROR ⚠️
     ============================================================
     ArrayIndexOutOfBoundsException occurs when the index
     is outside the valid range.

     Valid index range:
     0 → array.length - 1
     ========================================================== */
    private static void demoArrayBoundsExample() {
        int[] numbers = {10, 20, 30};

        System.out.println("⚠️ ARRAY BOUNDS EXAMPLE");
        System.out.println("Valid indexes: 0, 1, 2");  // Valid indexes for this array
        System.out.println("numbers.length = " + numbers.length);  // length property returns total number of elements
        System.out.println("Trying numbers[3] would cause ArrayIndexOutOfBoundsException."); // Accessing numbers[3] would crash the program
        System.out.println();
    }

    /* ==========================================================
                    📏 FINDING ARRAY LENGTH 📏
     ============================================================
        The length property returns the number of elements
        stored in the array.
     ========================================================== */

    private static void demoArrayLength() {
        int[] numbers = {10, 20, 30, 40, 50}; // Create an array with 5 elements

        System.out.println("📏 ARRAY LENGTH"); // Print a section header so the console output is clear
        System.out.println("Array length: " + numbers.length); // The .length property returns the total number of elements in the array

        /* 🖨️ OUTPUT 🖨️:
           Array length: 5 */

        System.out.println();
    }

    /* ==========================================================
              🔁 TRAVERSING ARRAY — STANDARD FOR LOOP 🔁
      ==========================================================
      A standard for loop uses an index to move through
      each position of the array.
     ========================================================== */
    private static void demoTraversingStandardForLoop() {
        int[] numbers = {10, 20, 30, 40, 50}; // Create an array of numbers

        System.out.println("🔁 STANDARD FOR LOOP"); // Print section title

        /* LOOP STRUCTURE
        i = index position
        loop continues while i < numbers.length
        i++ moves to the next index each iteration */
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);  // Access element using its index
        }

        System.out.println();
    }

    /* ==========================================================
              🔁 TRAVERSING ARRAY — ENHANCED FOR LOOP 🔁
      ==========================================================
       Also called a "for-each loop".

      It automatically moves through each element of the array
      without needing an index variable.
     ========================================================== */
    private static void demoTraversingEnhancedForLoop() {
        int[] numbers = {10, 20, 30, 40, 50};  // Create an array of numbers

        System.out.println("🔁 ENHANCED FOR LOOP"); // Print section title
        for (int number : numbers) {  // 'number' represents each element in the array one at a time
            System.out.println("Element: " + number);  // 'number' represents each element in the array one at a time
        }

        System.out.println();
    }

    /* ==========================================================
                📋 COPYING ARRAY — USING LOOP 📋
     ========================================================== */
    private static void demoCopyArrayUsingLoop() {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];
        /* COPY ARRAY USING LOOP
        Step 1 → start at index 0
        Step 2 → copy value from original[i]
        Step 3 → store it in copy[i]
        Step 4 → repeat until the entire array is copied */

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i]; }  // copy each element from original into new array


        System.out.println("📋 COPY USING LOOP");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
        System.out.println();
    }

    /* ==========================================================
            📋 COPYING ARRAY — USING System.arraycopy 📋
     ========================================================== */
    private static void demoCopyArrayUsingSystemArraycopy() {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];

        System.arraycopy(original, 0, copy, 0, original.length);

        System.out.println("📋 COPY USING System.arraycopy");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
        System.out.println();
    }

    /* ==========================================================
            📋 COPYING ARRAY — USING Arrays.copyOf 📋
     ========================================================== */
    private static void demoCopyArrayUsingArraysCopyOf() {
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println("📋 COPY USING Arrays.copyOf");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
        System.out.println();
    }

    /* ==========================================================
                🔍 SEARCHING ARRAY — USING LOOP 🔍
     ========================================================== */
    private static void demoSearchArrayUsingLoop() {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;

        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        System.out.println("🔍 SEARCH USING LOOP");
        System.out.println("Number found: " + found);
        System.out.println();
    }

    /* ==========================================================
        🔍 SEARCHING ARRAY — USING Arrays.binarySearch 🔍
     ========================================================== */
    private static void demoSearchArrayUsingBinarySearch() {
        int[] numbers = {10, 20, 30, 40, 50};
        int index = Arrays.binarySearch(numbers, 30);

        System.out.println("🔍 SEARCH USING Arrays.binarySearch");
        System.out.println("Element found at index: " + index);
        System.out.println();
    }

    /* ==========================================================
                    🔃 SORTING AN ARRAY 🔃
     ========================================================== */
    private static void demoSortArray() {
        int[] numbers = {50, 20, 30, 10, 40};

        Arrays.sort(numbers);

        System.out.println("🔃 SORT ARRAY");
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println();
    }

    /* ==========================================================
                ➕ SUMMING ARRAY ELEMENTS ➕
     ========================================================== */
    private static void demoSumArrayElements() {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("➕ SUM ARRAY ELEMENTS");
        System.out.println("Sum of array elements: " + sum);
        System.out.println();
    }

    /* ==========================================================
                ⬆️⬇️ FINDING MAXIMUM AND MINIMUM ⬆️⬇️
     ========================================================== */
    private static void demoFindMaxAndMin() {
        int[] numbers = {10, 20, 5, 40, 15};
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("⬆️⬇️ MAX AND MIN");
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println();
    }

    /* ==========================================================
                🌟 MULTIDIMENSIONAL ARRAYS 🌟
     ==========================================================
     A multidimensional array is an array of arrays.
     Useful for rows and columns.
     ========================================================== */
    private static void demoDeclareAndInitialize2DArray() {
        int[][] matrix;
        matrix = new int[3][3];

        int[][] filledMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("🌟 DECLARE AND INITIALIZE 2D ARRAY");
        System.out.println("matrix created with new int[3][3]:");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }

        System.out.println("filledMatrix with values:");
        for (int row = 0; row < filledMatrix.length; row++) {
            System.out.println(Arrays.toString(filledMatrix[row]));
        }

        System.out.println();
    }

    /* ==========================================================
                📍 ACCESSING 2D ARRAY ELEMENT  📍
     ========================================================== */
    private static void demoAccess2DElement() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int value = matrix[1][2];

        System.out.println("📍 ACCESS 2D ELEMENT");
        System.out.println("matrix[1][2] = " + value);

        /* 🖨️ OUTPUT 🖨️:
           matrix[1][2] = 6 */

        System.out.println();
    }

    /* ==========================================================
     ✏️ MODIFYING 2D ARRAY ELEMENT
     ========================================================== */
    private static void demoModify2DElement() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        matrix[2][0] = 10;

        System.out.println("✏️ MODIFY 2D ELEMENT");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }

        System.out.println();
    }

    /* ==========================================================
     🔁 TRAVERSE 2D ARRAY — NESTED FOR LOOPS
     ========================================================== */
    private static void demoTraverse2DArrayNestedLoops() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("🔁 2D ARRAY — NESTED FOR LOOPS");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    /* ==========================================================
     🔁 TRAVERSE 2D ARRAY — ENHANCED FOR LOOPS
     ========================================================== */
    private static void demoTraverse2DArrayEnhancedFor() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("🔁 2D ARRAY — ENHANCED FOR LOOPS");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    /* ==========================================================
     🪜 JAGGED ARRAY
     ========================================================== */
    private static void demoJaggedArray() {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[1];

        System.out.println("🪜 JAGGED ARRAY");
        System.out.println("Row 0 length: " + jaggedArray[0].length);
        System.out.println("Row 1 length: " + jaggedArray[1].length);
        System.out.println("Row 2 length: " + jaggedArray[2].length);
        System.out.println();
    }

    /* ==========================================================
     ➕ SUM ALL ELEMENTS IN 2D ARRAY
     ========================================================== */
    private static void demoSum2DArray() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }

        System.out.println("➕ SUM 2D ARRAY");
        System.out.println("Sum of elements: " + sum);
        System.out.println();
    }

    /* ==========================================================
     ⬆️⬇️ FIND MAXIMUM AND MINIMUM IN 2D ARRAY
     ========================================================== */
    private static void demoFindMaxAndMin2DArray() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int max = matrix[0][0];
        int min = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
                if (element < min) {
                    min = element;
                }
            }
        }

        System.out.println("⬆️⬇️ MAX/MIN IN 2D ARRAY");
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println();
    }

    /* ==========================================================
     ✖️ MULTIPLICATION TABLE USING 2D ARRAY
     ========================================================== */
    private static void demoMultiplicationTable2D() {
        int[][] table = new int[10][10];

        System.out.println("✖️ MULTIPLICATION TABLE");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
    }
    /* ==========================================================
              📚 LESSON 2 — INTRODUCTION TO ARRAYLISTS 📚
     ==========================================================
     The ArrayList class in Java provides a flexible and powerful
     alternative to traditional arrays.

     Unlike fixed-size arrays, ArrayLists can dynamically adjust
     their size as elements are added or removed.

     Topics covered in this section:
     ✨ Understanding the ArrayList class
     ✨ Advantages of ArrayList over arrays
     ✨ Common ArrayList methods
     ✨ Adding elements
     ✨ Removing elements
     ✨ Accessing elements
     ✨ Updating elements
     ✨ Checking the size

     By the end of this section, you should be able to use
     ArrayLists effectively for managing collections of data.
     ========================================================== */

    /* ==========================================================
                 🧠 UNDERSTANDING THE ARRAYLIST CLASS 🧠
     ==========================================================
     The ArrayList class is part of java.util and provides a
     resizable array.

     Unlike traditional arrays:
     📌 arrays have fixed length
     📌 ArrayLists grow and shrink dynamically

     Key Features of ArrayList:
     ⭐ Dynamic Sizing
     ⭐ Zero-Based Indexing
     ⭐ Homogeneous Data
     ⭐ Type Safety with Generics

     Creating an ArrayList:
     ArrayList<String> names = new ArrayList<>();

     This creates an ArrayList that stores String values.

     Default Capacity and Growth:
     When an ArrayList is created, it starts with an internal
     capacity and grows automatically as more elements are added.

     Comparison to Arrays:
     Arrays = fixed size
     ArrayList = flexible size + built-in methods
     ========================================================== */
    private static void demoUnderstandingArrayListClass() {
        System.out.println("🧠 UNDERSTANDING THE ARRAYLIST CLASS");

        ArrayList<String> names = new ArrayList<>();

        System.out.println("Created: ArrayList<String> names = new ArrayList<>();");
        System.out.println("Initial list: " + names);
        System.out.println("ArrayLists use zero-based indexing just like arrays.");
        System.out.println("ArrayLists resize automatically as elements are added.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Created: ArrayList<String> names = new ArrayList<>();
           Initial list: []
           ArrayLists use zero-based indexing just like arrays.
           ArrayLists resize automatically as elements are added. */
    }

    /* ==========================================================
              ⚡ ADVANTAGES OF ARRAYLIST OVER ARRAYS ⚡
     ==========================================================
     ArrayLists offer several important advantages:

     ✅ Dynamic sizing
     ✅ Built-in methods like add(), remove(), get(), set(), size()
     ✅ Easier element management
     ✅ Type safety with generics
     ✅ Works with Java Collections Framework

     Example:
     ArrayList<String> names = new ArrayList<>();
     names.add("Alice");
     names.add("Bob");

     No need to define a maximum size ahead of time.
     ========================================================== */
    private static void demoAdvantagesOfArrayList() {
        System.out.println("⚡ ADVANTAGES OF ARRAYLIST OVER ARRAYS");

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        System.out.println("After adding elements: " + names);
        System.out.println("Dynamic size: no fixed length required.");
        System.out.println("Built-in methods make insert, remove, and update easier.");
        System.out.println("Generics provide type safety: ArrayList<String> only stores Strings.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           After adding elements: [Alice, Bob]
           Dynamic size: no fixed length required.
           Built-in methods make insert, remove, and update easier.
           Generics provide type safety: ArrayList<String> only stores Strings. */
    }

    /* ==========================================================
            ⚠️ DISADVANTAGES OF ARRAYLIST COMPARED TO ARRAYS ⚠️
     ==========================================================
     While ArrayLists are flexible, they also have drawbacks:

     ❌ Performance overhead from resizing
     ❌ More memory usage than arrays
     ❌ Cannot store primitive types directly
     ❌ Slightly slower than arrays for fixed-size collections

     Primitive types must use wrapper classes:
     int    → Integer
     double → Double
     char   → Character
     ========================================================== */
    private static void demoDisadvantagesOfArrayList() {
        System.out.println("⚠️ DISADVANTAGES OF ARRAYLIST");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("Example wrapper class list: " + numbers);
        System.out.println("Primitive int cannot be stored directly in ArrayList<int>.");
        System.out.println("Instead, Java uses wrapper classes like Integer.");
        System.out.println("ArrayLists may use more memory and have resizing overhead.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Example wrapper class list: [10, 20]
           Primitive int cannot be stored directly in ArrayList<int>.
           Instead, Java uses wrapper classes like Integer.
           ArrayLists may use more memory and have resizing overhead. */
    }

    /* ==========================================================
                🔧 COMMON METHODS OF ARRAYLIST CLASS 🔧
     ==========================================================
     Common methods:
     add(element)           → adds an element
     add(index, element)    → adds at a specific position
     remove(index)          → removes by index
     remove(element)        → removes by value
     get(index)             → gets an element
     set(index, element)    → updates an element
     size()                 → returns number of elements

     These methods make ArrayList easier to manage than arrays.
     ========================================================== */
    private static void demoCommonArrayListMethodsOverview() {
        System.out.println("🔧 COMMON ARRAYLIST METHODS OVERVIEW");
        System.out.println("add(element)        -> adds an element");
        System.out.println("add(index, element) -> adds at a specific position");
        System.out.println("remove(index)       -> removes by index");
        System.out.println("remove(element)     -> removes by value");
        System.out.println("get(index)          -> retrieves an element");
        System.out.println("set(index, element) -> updates an element");
        System.out.println("size()              -> returns the number of elements");
        System.out.println();
    }

    /* ==========================================================
                     ➕ add() METHOD
     ==========================================================
     The add() method inserts elements into an ArrayList.

     Syntax:
     arrayList.add(element);

     Alternative syntax:
     arrayList.add(index, element);
     ========================================================== */
    private static void demoArrayListAddMethod() {
        System.out.println("➕ add() METHOD");

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add(1, "Eve");

        System.out.println("After add(\"Alice\"): " + names);
        System.out.println("List contains dynamic elements in order.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           After add("Alice"): [Alice, Eve, Bob]
           List contains dynamic elements in order. */
    }

    /* ==========================================================
                     ➖ remove() METHOD
     ==========================================================
     The remove() method deletes elements from an ArrayList.

     Syntax:
     remove(index)
     remove(element)
     ========================================================== */
    private static void demoArrayListRemoveMethod() {
        System.out.println("➖ remove() METHOD");

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Eve");
        names.add("Bob");

        names.remove(1); // removes Eve
        names.remove("Alice");

        System.out.println("After removing index 1 and \"Alice\": " + names);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           After removing index 1 and "Alice": [Bob] */
    }

    /* ==========================================================
                      🔎 get() METHOD
     ==========================================================
     The get() method retrieves an element at a specific index.

     Syntax:
     arrayList.get(index);
     ========================================================== */
    private static void demoArrayListGetMethod() {
        System.out.println("🔎 get() METHOD");

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Fred");
        names.add("Sally");

        String firstName = names.get(0);

        System.out.println("First element: " + firstName);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           First element: Kevin */
    }

    /* ==========================================================
                      ✏️ set() METHOD
     ==========================================================
     The set() method updates the element at a specific index.

     Syntax:
     arrayList.set(index, element);
     ========================================================== */
    private static void demoArrayListSetMethod() {
        System.out.println("✏️ set() METHOD");

        ArrayList<String> names = new ArrayList<>();
        names.add("Bob");

        names.set(0, "Charlie");

        System.out.println("After updating first element: " + names);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           After updating first element: [Charlie] */
    }

    /* ==========================================================
                      📏 size() METHOD
     ==========================================================
     The size() method returns the number of elements currently
     stored in the ArrayList.

     Syntax:
     arrayList.size();
     ========================================================== */
    private static void demoArrayListSizeMethod() {
        System.out.println("📏 size() METHOD");

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Fred");

        int count = names.size();

        System.out.println("Size of the ArrayList: " + count);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Size of the ArrayList: 2 */
    }

    /* ==========================================================
                    🧪 SIMPLE ARRAYLIST DEMO
     ==========================================================
     This method demonstrates the most common ArrayList methods
     together in one workflow:

     ✔ add()
     ✔ remove()
     ✔ get()
     ✔ set()
     ✔ size()
     ========================================================== */
    private static void demoArrayListExample() {
        ArrayList<String> names = new ArrayList<>();

        System.out.println("🧪 SIMPLE ARRAYLIST DEMO");

        // Adding elements
        names.add("Kevin");
        names.add("Fred");
        names.add("Sally");
        System.out.println("After adding elements: " + names);

        // Removing an element
        names.remove("Sally");
        System.out.println("After removing 'Sally': " + names);

        // Accessing an element
        String firstName = names.get(0);
        System.out.println("First element: " + firstName);

        // Updating an element
        names.set(0, "Charlie");
        System.out.println("After updating first element: " + names);

        // Checking the size
        int size = names.size();
        System.out.println("Size of the ArrayList: " + size);

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           After adding elements: [Kevin, Fred, Sally]
           After removing 'Sally': [Kevin, Fred]
           First element: Kevin
           After updating first element: [Charlie, Fred]
           Size of the ArrayList: 2 */
    }

        /* ==========================================================
               📚 LESSON 3 — HASHMAPS DATA STRUCTURE 📚
     ==========================================================
     The HashMap class in Java is a powerful data structure
     for storing key-value pairs.

     Unlike arrays or lists:
     📌 HashMap stores data as key → value pairs
     📌 Keys must be unique
     📌 HashMap does not maintain insertion order
     📌 HashMap is designed for fast lookups

     In this section, you will cover:
     ✨ Introduction to HashMap and basic operations
     ✨ Adding, updating, and accessing data
     ✨ Iterating through a HashMap
     ✨ Common uses and performance considerations

     By the end of this section, you should be able to use
     HashMap for fast lookups, counting, and organizing
     key-value data.
     ========================================================== */

    /* ==========================================================
             🧠 HASHMAP AND BASIC OPERATIONS OVERVIEW 🧠
     ==========================================================
     A HashMap is part of Java’s collection framework and stores
     key-value pairs.

     Example:
     HashMap<String, Integer> scores = new HashMap<>();

     In this example:
     ⭐ Key   = String
     ⭐ Value = Integer

     Basic operations:
     ✔ put()           → add or update a key-value pair
     ✔ get()           → access a value by key
     ✔ remove()        → remove an entry
     ✔ containsKey()   → check whether a key exists
     ✔ containsValue() → check whether a value exists

     Important:
     📌 Each key must be unique
     📌 Duplicate keys overwrite old values
     📌 HashMap does not guarantee order
     ========================================================== */
    private static void demoHashMapOverview() {
        System.out.println("🧠 HASHMAP OVERVIEW");

        HashMap<String, Integer> scores = new HashMap<>();

        System.out.println("Created: HashMap<String, Integer> scores = new HashMap<>();");
        System.out.println("Initial map: " + scores);
        System.out.println("HashMap stores key-value pairs.");
        System.out.println("Keys must be unique.");
        System.out.println("HashMap does not maintain insertion order.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Created: HashMap<String, Integer> scores = new HashMap<>();
           Initial map: {}
           HashMap stores key-value pairs.
           Keys must be unique.
           HashMap does not maintain insertion order. */
    }

    /* ==========================================================
                     ➕ CREATING AND ADDING DATA
     ==========================================================
     Use put(key, value) to add entries.

     Example:
     scores.put("Sam", 95);
     scores.put("Bob", 87);
     scores.put("Sally", 78);

     If a key already exists, put() overwrites the old value.
     ========================================================== */
    private static void demoHashMapPutMethod() {
        System.out.println("➕ HASHMAP put() METHOD");

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Sam", 95);
        scores.put("Bob", 87);
        scores.put("Sally", 78);

        System.out.println("Scores map: " + scores);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Scores map: {Sam=95, Bob=87, Sally=78}

           ⚠️ Order may appear different when printed because
           HashMap does not guarantee order. */
    }

    /* ==========================================================
                     🔎 ACCESSING DATA WITH get()
     ==========================================================
     Use get(key) to retrieve a value.

     Example:
     int samScore = scores.get("Sam");

     If the key does not exist, get() returns null.
     ========================================================== */
    private static void demoHashMapGetMethod() {
        System.out.println("🔎 HASHMAP get() METHOD");

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Sam", 95);
        scores.put("Bob", 87);
        scores.put("Sally", 78);

        int samScore = scores.get("Sam");

        System.out.println("Sam's score: " + samScore);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Sam's score: 95 */
    }

    /* ==========================================================
                     ➖ REMOVING DATA WITH remove()
     ==========================================================
     Use remove(key) to delete an entry from the HashMap.
     ========================================================== */
    private static void demoHashMapRemoveMethod() {
        System.out.println("➖ HASHMAP remove() METHOD");

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Sam", 95);
        scores.put("Bob", 87);
        scores.put("Sally", 78);

        scores.remove("Bob");

        System.out.println("After removing Bob: " + scores);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           After removing Bob: {Sam=95, Sally=78}

           ⚠️ Order may vary. */
    }

    /* ==========================================================
               ✅ CHECKING KEYS AND VALUES
     ==========================================================
     containsKey(key)     → checks whether a key exists
     containsValue(value) → checks whether a value exists
     ========================================================== */
    private static void demoHashMapContainsMethods() {
        System.out.println("✅ HASHMAP containsKey() / containsValue()");

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Sam", 95);
        scores.put("Bob", 87);
        scores.put("Sally", 78);

        boolean hasBob = scores.containsKey("Bob");
        boolean hasScore95 = scores.containsValue(95);

        System.out.println("Contains 'Bob'? " + hasBob);
        System.out.println("Contains score 95? " + hasScore95);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Contains 'Bob'? true
           Contains score 95? true */
    }

    /* ==========================================================
          ✏️ ADDING, UPDATING, AND ACCESSING DATA IN HASHMAP
     ==========================================================
     put()         → adds new data or updates existing data
     putIfAbsent() → adds only if the key is not already present
     get()         → retrieves data by key
     getOrDefault()→ retrieves data safely with a fallback value
     ========================================================== */
    private static void demoAddingUpdatingAccessingHashMapData() {
        System.out.println("✏️ ADDING, UPDATING, AND ACCESSING DATA");

        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("USA", "Washington, D.C.");
        capitals.put("Canada", "Ottawa");
        capitals.put("Germany", "Berlin");

        System.out.println("Initial capitals: " + capitals);

        capitals.put("Germany", "Berlin City");
        System.out.println("Updated capitals: " + capitals);

        capitals.putIfAbsent("France", "Paris");
        capitals.putIfAbsent("USA", "New York");
        System.out.println("Capitals after putIfAbsent: " + capitals);

        String capitalOfCanada = capitals.get("Canada");
        System.out.println("Capital of Canada: " + capitalOfCanada);

        String capitalOfSpain = capitals.get("Spain");
        System.out.println("Capital of Spain: " + (capitalOfSpain != null ? capitalOfSpain : "Not found"));

        String safeCapital = capitals.getOrDefault("Spain", "Unknown");
        System.out.println("Capital of Spain with getOrDefault: " + safeCapital);

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Initial capitals: {USA=Washington, D.C., Canada=Ottawa, Germany=Berlin}
           Updated capitals: {USA=Washington, D.C., Canada=Ottawa, Germany=Berlin City}
           Capitals after putIfAbsent: {USA=Washington, D.C., Canada=Ottawa, Germany=Berlin City, France=Paris}
           Capital of Canada: Ottawa
           Capital of Spain: Not found
           Capital of Spain with getOrDefault: Unknown

           ⚠️ Order may vary. */
    }

    /* ==========================================================
                🔁 ITERATING THROUGH A HASHMAP
     ==========================================================
     Common ways to iterate:
     ✔ entrySet() → both keys and values
     ✔ keySet()   → keys only
     ✔ values()   → values only
     ✔ forEach()  → lambda version
     ========================================================== */
    private static void demoHashMapIterationOverview() {
        System.out.println("🔁 HASHMAP ITERATION OVERVIEW");
        System.out.println("entrySet() -> iterate through key-value pairs");
        System.out.println("keySet()   -> iterate through keys only");
        System.out.println("values()   -> iterate through values only");
        System.out.println("forEach()  -> iterate using lambda");
        System.out.println();
    }

    /* ==========================================================
            🔁 ITERATING OVER KEY-VALUE PAIRS WITH entrySet()
     ==========================================================
     entrySet() returns all key-value pairs as Map.Entry objects.
     This is the best choice when you need both the key and value.
     ========================================================== */
    private static void demoIterateHashMapEntrySet() {
        System.out.println("🔁 ITERATE HASHMAP WITH entrySet()");

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("Canada", "Ottawa");
        capitals.put("Germany", "Berlin");

        System.out.println("Country-Capital Pairs:");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

        System.out.println();
    }

    /* ==========================================================
                🔁 ITERATING OVER KEYS WITH keySet()
     ==========================================================
     keySet() returns all keys in the HashMap.
     ========================================================== */
    private static void demoIterateHashMapKeySet() {
        System.out.println("🔁 ITERATE HASHMAP WITH keySet()");

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("Canada", "Ottawa");
        capitals.put("Germany", "Berlin");

        System.out.println("Countries:");
        for (String country : capitals.keySet()) {
            System.out.println("Country: " + country);
        }

        System.out.println();
    }

    /* ==========================================================
               🔁 ITERATING OVER VALUES WITH values()
     ==========================================================
     values() returns all values in the HashMap.
     ========================================================== */
    private static void demoIterateHashMapValues() {
        System.out.println("🔁 ITERATE HASHMAP WITH values()");

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("Canada", "Ottawa");
        capitals.put("Germany", "Berlin");

        System.out.println("Capitals:");
        for (String capital : capitals.values()) {
            System.out.println("Capital: " + capital);
        }

        System.out.println();
    }

    /* ==========================================================
             🔁 ITERATING WITH forEach() AND LAMBDA
     ==========================================================
     forEach() with lambda provides a concise way to process
     each key-value pair.
     ========================================================== */
    private static void demoIterateHashMapForEachLambda() {
        System.out.println("🔁 ITERATE HASHMAP WITH forEach() LAMBDA");

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("Canada", "Ottawa");
        capitals.put("Germany", "Berlin");

        System.out.println("Country-Capital Pairs (Lambda):");
        capitals.forEach((country, capital) ->
                System.out.println("Country: " + country + ", Capital: " + capital));

        System.out.println();
    }

    /* ==========================================================
          🌍 COMMON USES AND PERFORMANCE CONSIDERATIONS
     ==========================================================
     Common Uses:
     ✔ Caching data
     ✔ Counting frequencies
     ✔ Associating data with unique keys
     ✔ Fast lookup tables

     Performance:
     ✔ put() and get() are usually O(1)
     ⚠️ resizing can be expensive
     ⚠️ Hash collisions can slow performance
     ⚠️ HashMap uses extra memory

     Important:
     entrySet() is usually the most efficient way to iterate
     when you need both keys and values.
     ========================================================== */
    private static void demoHashMapCommonUsesAndPerformance() {
        System.out.println("🌍 HASHMAP COMMON USES AND PERFORMANCE");

        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.put("java", 3);
        wordCount.put("array", 2);
        wordCount.put("hashmap", 4);

        HashMap<String, Double> taxRates = new HashMap<>();
        taxRates.put("standard", 0.10);
        taxRates.put("reduced", 0.05);

        System.out.println("Word count example: " + wordCount);
        System.out.println("Tax rate lookup example: " + taxRates);
        System.out.println("HashMap is great for fast lookups and counting.");
        System.out.println("put() and get() are usually very fast: O(1).");
        System.out.println("Too many collisions can reduce performance.");
        System.out.println("HashMap uses more memory than simpler structures.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Word count example: {java=3, array=2, hashmap=4}
           Tax rate lookup example: {standard=0.1, reduced=0.05}
           HashMap is great for fast lookups and counting.
           put() and get() are usually very fast: O(1).
           Too many collisions can reduce performance.
           HashMap uses more memory than simpler structures.

           ⚠️ Order may vary. */
    }

    /* ==========================================================
                  🧪 SIMPLE HASHMAP DEMO
     ==========================================================
     This method combines the most common HashMap operations
     in one workflow:

     ✔ create a HashMap
     ✔ add data with put()
     ✔ access data with get()
     ✔ update data with put()
     ✔ remove data with remove()
     ✔ check keys and values
     ✔ iterate through entries
     ========================================================== */
    private static void demoHashMapExample() {
        System.out.println("🧪 SIMPLE HASHMAP DEMO");

        HashMap<String, Integer> scores = new HashMap<>();

        // Add data
        scores.put("Sam", 95);
        scores.put("Bob", 87);
        scores.put("Sally", 78);
        System.out.println("Initial scores: " + scores);

        // Access data
        int samScore = scores.get("Sam");
        System.out.println("Sam's score: " + samScore);

        // Update data
        scores.put("Sam", 99);
        System.out.println("After updating Sam: " + scores);

        // Remove data
        scores.remove("Bob");
        System.out.println("After removing Bob: " + scores);

        // Check existence
        System.out.println("Contains 'Sally'? " + scores.containsKey("Sally"));
        System.out.println("Contains score 78? " + scores.containsValue(78));

        // Iterate
        System.out.println("Score entries:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Initial scores: {Sam=95, Bob=87, Sally=78}
           Sam's score: 95
           After updating Sam: {Sam=99, Bob=87, Sally=78}
           After removing Bob: {Sam=99, Sally=78}
           Contains 'Sally'? true
           Contains score 78? true
           Score entries:
           Sam -> 99
           Sally -> 78

           ⚠️ Order may vary. */
    }
    /* ==========================================================
                📚 LESSON 4 — INTRODUCTION TO GENERICS 📚
     ==========================================================
     Generics in Java let you write flexible, reusable, and
     type-safe code.

     Instead of writing separate classes or methods for each
     data type, generics let you use a placeholder type.

     In this section, we will cover:
     ✨ What generics are
     ✨ Why generics are useful
     ✨ Type safety
     ✨ Code reusability
     ✨ Generic class syntax
     ✨ Generic method syntax
     ✨ Bounded types
     ✨ Instantiating generic classes

     Generics are especially useful in collections such as:
     📦 ArrayList
     📦 HashMap
     📦 LinkedList

     They help prevent type errors at compile-time instead of
     runtime, which makes your code safer and easier to read.
     ========================================================== */

    /* ==========================================================
                    🧠 WHAT ARE GENERICS? 🧠
     ==========================================================
     Generics allow you to define classes, interfaces, and
     methods with a placeholder type.

     That placeholder is often written as:
     T → Type
     E → Element
     K → Key
     V → Value

     Example:
     ArrayList<String> names = new ArrayList<>();

     In this example:
     ⭐ String is the specified type
     ⭐ Only String values can be added
     ⭐ The compiler catches wrong types early

     Why use generics?
     ✅ Type Safety
     ✅ Code Reusability
     ✅ Code Readability
     ========================================================== */
    private static void demoWhatAreGenerics() {
        System.out.println("🧠 WHAT ARE GENERICS?");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("numbers = " + numbers);
        System.out.println("ArrayList<Integer> only accepts Integer values.");
        System.out.println("Trying to add a String like \"hello\" would cause a compile-time error.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           numbers = [10, 20]
           ArrayList<Integer> only accepts Integer values.
           Trying to add a String like "hello" would cause a compile-time error. */
    }

    /* ==========================================================
                     ✅ TYPE SAFETY WITH GENERICS
     ==========================================================
     Type safety means Java checks the type at compile-time.

     Example:
     ArrayList<Integer> numbers = new ArrayList<>();
     numbers.add(10);
     numbers.add(20);
     numbers.add("hello"); ❌ compile-time error

     This prevents bad data from entering the collection.
     ========================================================== */
    private static void demoGenericTypeSafety() {
        System.out.println("✅ TYPE SAFETY WITH GENERICS");

        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Generics");

        System.out.println("words = " + words);
        System.out.println("This list only accepts String values.");
        System.out.println("No manual casting is needed when retrieving data.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           words = [Java, Generics]
           This list only accepts String values.
           No manual casting is needed when retrieving data. */
    }

    /* ==========================================================
                    ♻️ CODE REUSABILITY WITH GENERICS
     ==========================================================
     Generics let you write one class or method that works
     with many types.

     Instead of:
     BoxForStrings
     BoxForIntegers
     BoxForDoubles

     You can write:
     Box<T>

     Then reuse the same class for different types.
     ========================================================== */
    private static void demoGenericCodeReusability() {
        System.out.println("♻️ CODE REUSABILITY WITH GENERICS");

        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(123);

        System.out.println("stringBox contains: " + stringBox.getItem());
        System.out.println("intBox contains: " + intBox.getItem());
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           stringBox contains: Hello
           intBox contains: 123 */
    }

    /* ==========================================================
                    👀 CODE READABILITY WITH GENERICS
     ==========================================================
     Generics make the intended type clear.

     Example:
     ArrayList<String> names

     This immediately tells the reader:
     📌 this list stores String values
     📌 no guessing needed
     📌 no manual casting needed
     ========================================================== */
    private static void demoGenericReadability() {
        System.out.println("👀 CODE READABILITY WITH GENERICS");

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        String firstName = names.get(0);

        System.out.println("names = " + names);
        System.out.println("First name = " + firstName);
        System.out.println("The type is clear and explicit in ArrayList<String>.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           names = [Alice, Bob]
           First name = Alice
           The type is clear and explicit in ArrayList<String>. */
    }

    /* ==========================================================
                   📦 GENERIC CLASS SYNTAX
     ==========================================================
     To define a generic class, use angle brackets <> with
     a type parameter.

     Example:
     public class Box<T> {
         private T item;

         public Box(T item) {
             this.item = item;
         }

         public T getItem() {
             return item;
         }

         public void setItem(T item) {
             this.item = item;
         }
     }

     T acts as a placeholder for the actual type.
     ========================================================== */
    private static void demoGenericClassSyntax() {
        System.out.println("📦 GENERIC CLASS SYNTAX");

        Box<String> stringBox = new Box<>("Hello, World!");
        Box<Integer> intBox = new Box<>(123);

        System.out.println("stringBox.getItem() = " + stringBox.getItem());
        System.out.println("intBox.getItem() = " + intBox.getItem());

        stringBox.setItem("Updated text");
        intBox.setItem(456);

        System.out.println("Updated stringBox = " + stringBox.getItem());
        System.out.println("Updated intBox = " + intBox.getItem());
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           stringBox.getItem() = Hello, World!
           intBox.getItem() = 123
           Updated stringBox = Updated text
           Updated intBox = 456 */
    }

    /* ==========================================================
                   🖨️ GENERIC METHOD SYNTAX
     ==========================================================
     Generic methods can be created inside a regular class.

     Syntax:
     public static <T> void printArray(T[] array)

     The type parameter <T> appears before the return type.
     This method can work with String[], Integer[], Double[],
     and many other types.
     ========================================================== */
    private static void demoGenericMethodSyntax() {
        System.out.println("🖨️ GENERIC METHOD SYNTAX");

        String[] words = {"Java", "is", "fun"};
        Integer[] numbers = {10, 20, 30};

        System.out.println("Printing String array:");
        Utility.printArray(words);

        System.out.println("Printing Integer array:");
        Utility.printArray(numbers);

        System.out.println();
    }

    /* ==========================================================
                     🔒 BOUNDED TYPES
     ==========================================================
     Sometimes you want to restrict the type that can be used.

     Example:
     public class NumberBox<T extends Number>

     This means T can only be:
     Integer
     Double
     Float
     Long
     etc.

     This is useful when you want access to methods available
     in the Number class, such as doubleValue().
     ========================================================== */
    private static void demoBoundedTypes() {
        System.out.println("🔒 BOUNDED TYPES");

        NumberBox<Integer> intBox = new NumberBox<>(25);
        NumberBox<Double> doubleBox = new NumberBox<>(9.5);

        System.out.println("Integer box doubleValue(): " + intBox.doubleValue());
        System.out.println("Double box doubleValue(): " + doubleBox.doubleValue());
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Integer box doubleValue(): 25.0
           Double box doubleValue(): 9.5 */
    }

    /* ==========================================================
                 🏗️ INSTANTIATING GENERIC CLASSES
     ==========================================================
     When creating objects of a generic class, specify the type
     in angle brackets.

     Example:
     Box<String> stringBox = new Box<>("Hello");
     Box<Integer> intBox = new Box<>(123);

     Java replaces T with the actual type you provide.
     ========================================================== */
    private static void demoInstantiatingGenerics() {
        System.out.println("🏗️ INSTANTIATING GENERIC CLASSES");

        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(123);

        System.out.println("stringBox contains: " + stringBox.getItem());
        System.out.println("intBox contains: " + intBox.getItem());
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           stringBox contains: Hello
           intBox contains: 123 */
    }

    /* ==========================================================
                  🧪 SIMPLE GENERICS DEMO
     ==========================================================
     This method shows a mini workflow using:
     ✔ generic classes
     ✔ generic methods
     ✔ bounded types

     This ties the lesson together in one place.
     ========================================================== */
    private static void demoGenericsExample() {
        System.out.println("🧪 SIMPLE GENERICS DEMO");

        Box<String> messageBox = new Box<>("Hello Generics!");
        Box<Integer> numberBox = new Box<>(999);

        System.out.println("messageBox: " + messageBox.getItem());
        System.out.println("numberBox: " + numberBox.getItem());

        messageBox.setItem("Updated Hello");
        numberBox.setItem(2026);

        System.out.println("Updated messageBox: " + messageBox.getItem());
        System.out.println("Updated numberBox: " + numberBox.getItem());

        String[] messages = {"A", "B", "C"};
        System.out.println("Printing generic array:");
        Utility.printArray(messages);

        NumberBox<Double> priceBox = new NumberBox<>(19.99);
        System.out.println("priceBox doubleValue(): " + priceBox.doubleValue());

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           messageBox: Hello Generics!
           numberBox: 999
           Updated messageBox: Updated Hello
           Updated numberBox: 2026
           Printing generic array:
           A
           B
           C
           priceBox doubleValue(): 19.99 */
    }

    /* ==========================================================
                    📦 GENERIC CLASS: Box<T>
     ==========================================================
     This generic class stores one item of type T.
     T is a placeholder for the actual type.
     ========================================================== */
    private static class Box<T> {
        private T item;

        public Box(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }
    }

    /* ==========================================================
                 🛠️ GENERIC METHOD CLASS: Utility
     ==========================================================
     This class contains a generic method that prints arrays
     of any type.
     ========================================================== */
    private static class Utility {
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }
    }

    /* ==========================================================
                🔢 BOUNDED GENERIC CLASS: NumberBox<T>
     ==========================================================
     T extends Number means T must be a subclass of Number.
     This lets us safely use methods like doubleValue().
     ========================================================== */
    private static class NumberBox<T extends Number> {
        private T number;

        public NumberBox(T number) {
            this.number = number;
        }

        public double doubleValue() {
            return number.doubleValue();
        }
    }

        /* ==========================================================
            📚 LESSON 5 — THE ITERATOR INTERFACE OVERVIEW 📚
     ==========================================================
     The Iterator interface in Java is a standard tool for
     traversing collections such as ArrayList and HashMap.

     Iterator lets you move through a collection one element
     at a time in an organized way.

     Key Features of Iterator:
     ✅ Uniform traversal across collections
     ✅ Read access to each element
     ✅ Safe removal of elements during iteration
     ✅ Supported by many collections

     Iterator is useful because it gives a consistent way to
     loop through different data structures without needing
     collection-specific loop logic every time.
     ========================================================== */

    /* ==========================================================
                 🧠 KEY FEATURES OF ITERATOR 🧠
     ==========================================================
     1) Uniform Traversal
        Iterator works across many collections in a standard way.

     2) Read and Remove Access
        Iterator can read elements and often remove them safely
        while iterating.

     3) Supported by Many Collections
        ArrayList → iterator goes element by element in order
        HashMap   → iterator can traverse keys, values, or entries

     Iterator helps avoid messy loop logic when working with
     collections.
     ========================================================== */
    private static void demoIteratorOverview() {
        System.out.println("🧠 ITERATOR OVERVIEW");

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Sam");
        names.add("Cecilia");

        Iterator<String> iterator = names.iterator();

        System.out.println("Created Iterator<String> for ArrayList.");
        System.out.println("Iterator provides a standard way to traverse collections.");
        System.out.println("Example collection: " + names);
        System.out.println("Has next? " + iterator.hasNext());
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Created Iterator<String> for ArrayList.
           Iterator provides a standard way to traverse collections.
           Example collection: [Kevin, Sam, Cecilia]
           Has next? true */
    }

    /* ==========================================================
                  🔧 BASIC ITERATOR METHODS 🔧
     ==========================================================
     The Iterator interface provides three main methods:

     hasNext() → checks whether another element exists
     next()    → retrieves the next element and moves forward
     remove()  → removes the last element returned by next()

     Important:
     ⚠️ next() with no more elements throws NoSuchElementException
     ⚠️ remove() can only be called once per next()
     ⚠️ repeated remove() causes IllegalStateException
     ========================================================== */
    private static void demoIteratorMethodsOverview() {
        System.out.println("🔧 ITERATOR METHODS OVERVIEW");
        System.out.println("hasNext() -> checks if another element exists");
        System.out.println("next()    -> gets the next element");
        System.out.println("remove()  -> removes the last returned element");
        System.out.println();
    }

    /* ==========================================================
                     ✅ hasNext() METHOD
     ==========================================================
     hasNext() returns true if another element exists in the
     collection, and false otherwise.
     ========================================================== */
    private static void demoIteratorHasNext() {
        System.out.println("✅ ITERATOR hasNext()");

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Sam");

        Iterator<String> iterator = names.iterator();

        System.out.println("First hasNext(): " + iterator.hasNext());
        iterator.next();
        System.out.println("Second hasNext(): " + iterator.hasNext());
        iterator.next();
        System.out.println("Third hasNext(): " + iterator.hasNext());
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           First hasNext(): true
           Second hasNext(): true
           Third hasNext(): false */
    }

    /* ==========================================================
                      ➡️ next() METHOD
     ==========================================================
     next() returns the next element in the collection and
     advances the iterator forward.
     ========================================================== */
    private static void demoIteratorNext() {
        System.out.println("➡️ ITERATOR next()");

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Sam");
        names.add("Cecilia");

        Iterator<String> iterator = names.iterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Kevin
           Sam
           Cecilia */
    }

    /* ==========================================================
                     🗑️ remove() METHOD
     ==========================================================
     remove() removes the last element returned by next() from
     the underlying collection.

     This is the safe way to remove items while iterating.
     ========================================================== */
    private static void demoIteratorRemove() {
        System.out.println("🗑️ ITERATOR remove()");

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Sam");
        names.add("Cecilia");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.equals("Sam")) {
                iterator.remove();
            }
        }

        System.out.println("After removing 'Sam': " + names);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           After removing 'Sam': [Kevin, Cecilia] */
    }

    /* ==========================================================
               🔁 ITERATOR WITH ARRAYLIST
     ==========================================================
     ArrayList supports Iterator directly with:
     list.iterator()

     Iterator visits elements in order.
     ========================================================== */
    private static void demoIteratorWithArrayList() {
        System.out.println("🔁 ITERATOR WITH ARRAYLIST");

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Sam");
        names.add("Cecilia");

        Iterator<String> nameIterator = names.iterator();

        System.out.println("ArrayList elements:");
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           ArrayList elements:
           Kevin
           Sam
           Cecilia */
    }

    /* ==========================================================
               🔁 ITERATOR WITH HASHMAP entrySet()
     ==========================================================
     For HashMap, Iterator is often used with:
     entrySet().iterator()

     This allows access to both key and value.
     ========================================================== */
    private static void demoIteratorWithHashMapEntrySet() {
        System.out.println("🔁 ITERATOR WITH HASHMAP entrySet()");

        HashMap<Integer, String> idNameMap = new HashMap<>();
        idNameMap.put(1, "Fred");
        idNameMap.put(2, "Barny");
        idNameMap.put(3, "Wilma");

        Iterator<Map.Entry<Integer, String>> mapIterator = idNameMap.entrySet().iterator();

        System.out.println("HashMap entries:");
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, String> entry = mapIterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           HashMap entries:
           Key: 1, Value: Fred
           Key: 2, Value: Barny
           Key: 3, Value: Wilma

           ⚠️ HashMap order may vary. */
    }

    /* ==========================================================
               🔑 ITERATOR WITH HASHMAP keySet()
     ==========================================================
     You can iterate over keys only by creating an iterator
     from keySet().
     ========================================================== */
    private static void demoIteratorWithHashMapKeySet() {
        System.out.println("🔑 ITERATOR WITH HASHMAP keySet()");

        HashMap<Integer, String> idNameMap = new HashMap<>();
        idNameMap.put(1, "Fred");
        idNameMap.put(2, "Barny");
        idNameMap.put(3, "Wilma");

        Iterator<Integer> keyIterator = idNameMap.keySet().iterator();

        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println("Key: " + key);
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Key: 1
           Key: 2
           Key: 3

           ⚠️ HashMap order may vary. */
    }

    /* ==========================================================
              💎 ITERATOR WITH HASHMAP values()
     ==========================================================
     You can iterate over values only by creating an iterator
     from values().
     ========================================================== */
    private static void demoIteratorWithHashMapValues() {
        System.out.println("💎 ITERATOR WITH HASHMAP values()");

        HashMap<Integer, String> idNameMap = new HashMap<>();
        idNameMap.put(1, "Fred");
        idNameMap.put(2, "Barny");
        idNameMap.put(3, "Wilma");

        Iterator<String> valueIterator = idNameMap.values().iterator();

        while (valueIterator.hasNext()) {
            String value = valueIterator.next();
            System.out.println("Value: " + value);
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Value: Fred
           Value: Barny
           Value: Wilma

           ⚠️ HashMap order may vary. */
    }

    /* ==========================================================
                ⚠️ SAFE REMOVAL DURING ITERATION
     ==========================================================
     Iterator is especially helpful when removing items while
     looping through a collection.

     Using a normal for-each loop and removing directly can
     cause ConcurrentModificationException.

     Iterator.remove() avoids that problem.
     ========================================================== */
    private static void demoIteratorSafeRemovalExplanation() {
        System.out.println("⚠️ SAFE REMOVAL DURING ITERATION");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();

            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("After removing even numbers: " + numbers);
        System.out.println("Iterator.remove() safely modifies the collection during traversal.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           After removing even numbers: [15, 25]
           Iterator.remove() safely modifies the collection during traversal. */
    }

    /* ==========================================================
                  🧪 SIMPLE ITERATOR DEMO
     ==========================================================
     This combines the core Iterator ideas in one workflow:

     ✔ Iterator with ArrayList
     ✔ hasNext()
     ✔ next()
     ✔ remove()
     ✔ Iterator with HashMap

     This ties the whole lesson together.
     ========================================================== */
    private static void demoIteratorExample() {
        System.out.println("🧪 SIMPLE ITERATOR DEMO");

        // Example with ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Sam");
        names.add("Cecilia");

        Iterator<String> nameIterator = names.iterator();
        System.out.println("ArrayList elements:");
        while (nameIterator.hasNext()) {
            String name = nameIterator.next();
            System.out.println(name);

            if (name.equals("Sam")) {
                nameIterator.remove();
            }
        }

        System.out.println("ArrayList after removing Sam: " + names);

        // Example with HashMap
        HashMap<Integer, String> idNameMap = new HashMap<>();
        idNameMap.put(1, "Fred");
        idNameMap.put(2, "Barny");
        idNameMap.put(3, "Wilma");

        Iterator<Map.Entry<Integer, String>> mapIterator = idNameMap.entrySet().iterator();
        System.out.println("\nHashMap entries:");
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, String> entry = mapIterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           ArrayList elements:
           Kevin
           Sam
           Cecilia
           ArrayList after removing Sam: [Kevin, Cecilia]

           HashMap entries:
           Key: 1, Value: Fred
           Key: 2, Value: Barny
           Key: 3, Value: Wilma

           ⚠️ HashMap order may vary. */
    }

    /* ==========================================================
         📚 LESSON 6 — SORTING AND SEARCHING IN JAVA 📚
     ==========================================================
     Sorting and searching are fundamental techniques for
     organizing and locating data efficiently.

     Java provides built-in tools for sorting arrays and
     collections, and it also supports custom comparison logic
     and manual search methods.

     Topics Covered:
     ✨ Using Arrays.sort()
     ✨ Using Collections.sort()
     ✨ Sorting in descending order
     ✨ Implementing custom comparators
     ✨ Searching techniques
     ✨ Linear search
     ✨ Binary search

     These skills are important for improving program
     efficiency, readability, and data management.
     ========================================================== */

    /* ==========================================================
              🔃 USING Arrays.sort() AND Collections.sort() 🔃
     ==========================================================
     Java provides built-in sorting tools:

     Arrays.sort()      → sorts arrays
     Collections.sort() → sorts lists

     Default sorting order:
     ✅ ascending order

     Descending order:
     ✅ use Collections.reverseOrder()
     ✅ or a custom comparator

     These built-in methods are optimized and commonly used
     in real Java programs.
     ========================================================== */
    private static void demoSortingOverview() {
        System.out.println("🔃 SORTING OVERVIEW");
        System.out.println("Arrays.sort() sorts arrays.");
        System.out.println("Collections.sort() sorts lists.");
        System.out.println("Default sorting order is ascending.");
        System.out.println("Descending order can be done with reverseOrder() or a custom comparator.");
        System.out.println();
    }

    /* ==========================================================
                   🔃 SORTING ARRAYS WITH Arrays.sort()
     ==========================================================
     Arrays.sort() sorts primitive arrays and object arrays
     into ascending order by default.
     ========================================================== */
    private static void demoArraysSort() {
        System.out.println("🔃 Arrays.sort()");

        int[] numbers = {5, 2, 8, 1, 9};

        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Sorted array: [1, 2, 5, 8, 9] */
    }

    /* ==========================================================
               🔃 SORTING COLLECTIONS WITH Collections.sort()
     ==========================================================
     Collections.sort() sorts lists that implement List,
     such as ArrayList.

     Default sorting order:
     ✅ ascending order
     ========================================================== */
    private static void demoCollectionsSort() {
        System.out.println("🔃 Collections.sort()");

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Alice");
        names.add("Charlie");

        Collections.sort(names);

        System.out.println("Sorted list: " + names);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Sorted list: [Alice, Charlie, Kevin] */
    }

    /* ==========================================================
                    ⬇️ SORTING IN DESCENDING ORDER
     ==========================================================
     To sort in descending order, Java provides:
     Collections.reverseOrder()

     This is commonly used with Collections.sort() and with
     object arrays.
     ========================================================== */
    private static void demoDescendingSort() {
        System.out.println("⬇️ DESCENDING SORT");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Sorted list in descending order: " + numbers);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Sorted list in descending order: [8, 5, 2] */
    }

    /* ==========================================================
                 🧠 IMPLEMENTING CUSTOM COMPARATORS 🧠
     ==========================================================
     A Comparator defines custom sorting logic.

     The compare() method returns:
     positive number → first object comes after second
     negative number → first object comes before second
     zero            → objects are considered equal

     Custom comparators are useful for sorting objects with
     multiple attributes.
     ========================================================== */
    private static void demoCustomComparatorOverview() {
        System.out.println("🧠 CUSTOM COMPARATOR OVERVIEW");
        System.out.println("Comparator lets you define custom sorting rules.");
        System.out.println("Useful for sorting objects by multiple fields.");
        System.out.println("Example: sort students by GPA descending, then by name ascending.");
        System.out.println();
    }

    /* ==========================================================
           🧑‍🎓 SORTING OBJECTS WITH A CUSTOM COMPARATOR
     ==========================================================
     This example sorts Student objects by:
     1) GPA in descending order
     2) Name in ascending order if GPAs are equal
     ========================================================== */
    private static void demoCustomComparatorClass() {
        System.out.println("🧑‍🎓 CUSTOM COMPARATOR CLASS");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.9));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Charlie", 3.9));
        students.add(new Student("David", 3.5));

        Collections.sort(students, new StudentComparator());

        System.out.println("Students sorted by GPA (descending) and name:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
    }

    /* ==========================================================
              ⚡ INLINE COMPARATOR WITH LAMBDA EXPRESSIONS
     ==========================================================
     Java lets you write comparator logic inline using lambdas.

     This avoids creating a separate comparator class when the
     sorting logic is only needed once.
     ========================================================== */
    private static void demoCustomComparatorLambda() {
        System.out.println("⚡ INLINE COMPARATOR WITH LAMBDA");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.9));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Charlie", 3.9));
        students.add(new Student("David", 3.5));

        Collections.sort(students, (s1, s2) -> {
            int gpaComparison = Double.compare(s2.getGpa(), s1.getGpa());

            if (gpaComparison != 0) {
                return gpaComparison;
            }

            return s1.getName().compareTo(s2.getName());
        });

        System.out.println("Students sorted with lambda comparator:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
    }

    /* ==========================================================
                    🔍 SEARCHING TECHNIQUES OVERVIEW
     ==========================================================
     Two common search techniques:

     1) Linear Search
        ✔ works on unsorted or sorted data
        ✔ checks each element one by one
        ✔ time complexity: O(n)

     2) Binary Search
        ✔ requires sorted data
        ✔ repeatedly cuts the search space in half
        ✔ time complexity: O(log n)

     Choosing the right search method can greatly improve
     program efficiency.
     ========================================================== */
    private static void demoSearchingOverview() {
        System.out.println("🔍 SEARCHING OVERVIEW");
        System.out.println("Linear search checks elements one by one.");
        System.out.println("Binary search is faster but requires sorted data.");
        System.out.println("Linear search time complexity: O(n)");
        System.out.println("Binary search time complexity: O(log n)");
        System.out.println();
    }

    /* ==========================================================
                        🔎 LINEAR SEARCH
     ==========================================================
     Linear search checks each element until it finds the
     target or reaches the end of the array.

     Best use:
     ✅ unsorted arrays
     ✅ small datasets
     ========================================================== */
    private static void demoLinearSearch() {
        System.out.println("🔎 LINEAR SEARCH");

        int[] numbers = {5, 3, 8, 4, 2};
        int target = 4;

        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Element found at index: 3 */
    }

    /* ==========================================================
                        ⚡ BINARY SEARCH
     ==========================================================
     Binary search works only on sorted arrays or lists.

     It repeatedly checks the middle element and eliminates
     half of the search space each time.

     Best use:
     ✅ sorted datasets
     ✅ larger datasets
     ========================================================== */
    private static void demoBinarySearchManual() {
        System.out.println("⚡ BINARY SEARCH (MANUAL)");

        int[] numbers = {2, 3, 4, 5, 8};
        int target = 4;

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Element found at index: 2 */
    }

    /* ==========================================================
                 ⚡ BINARY SEARCH WITH Arrays.binarySearch()
     ==========================================================
     Java also provides a built-in binary search method:
     Arrays.binarySearch(array, target)

     Important:
     ⚠️ the array must already be sorted
     ========================================================== */
    private static void demoBinarySearchBuiltIn() {
        System.out.println("⚡ Arrays.binarySearch()");

        int[] numbers = {2, 3, 4, 5, 8};
        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("Element found at index: " + index);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Element found at index: 2 */
    }

    /* ==========================================================
                    🧪 SIMPLE SORTING AND SEARCHING DEMO
     ==========================================================
     This method combines:
     ✔ Arrays.sort()
     ✔ Collections.sort()
     ✔ custom comparator
     ✔ linear search
     ✔ binary search

     This ties the lesson together in one workflow.
     ========================================================== */
    private static void demoSortingAndSearchingExample() {
        System.out.println("🧪 SIMPLE SORTING AND SEARCHING DEMO");

        int[] arrayNumbers = {5, 2, 8, 1, 9};
        System.out.println("Original array: " + Arrays.toString(arrayNumbers));

        Arrays.sort(arrayNumbers);
        System.out.println("Sorted array: " + Arrays.toString(arrayNumbers));

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Alice");
        names.add("Charlie");

        Collections.sort(names);
        System.out.println("Sorted names list: " + names);

        int linearIndex = linearSearch(new int[]{5, 3, 8, 4, 2}, 4);
        System.out.println("Linear search result for 4: " + linearIndex);

        int binaryIndex = binarySearch(new int[]{2, 3, 4, 5, 8}, 4);
        System.out.println("Binary search result for 4: " + binaryIndex);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.9));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Charlie", 3.9));

        Collections.sort(students, new StudentComparator());

        System.out.println("Sorted students:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Original array: [5, 2, 8, 1, 9]
           Sorted array: [1, 2, 5, 8, 9]
           Sorted names list: [Alice, Charlie, Kevin]
           Linear search result for 4: 3
           Binary search result for 4: 2
           Sorted students:
           Student Name: Alice, GPA: 3.9
           Student Name: Charlie, GPA: 3.9
           Student Name: Bob, GPA: 3.7 */
    }

    /* ==========================================================
                    🛠️ HELPER METHOD — LINEAR SEARCH
     ==========================================================
     Returns:
     index of target if found
     -1 if target is not found
     ========================================================== */
    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /* ==========================================================
                    🛠️ HELPER METHOD — BINARY SEARCH
     ==========================================================
     Returns:
     index of target if found
     -1 if target is not found

     Important:
     ⚠️ array must be sorted first
     ========================================================== */
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    /* ==========================================================
                      🧑‍🎓 HELPER CLASS — Student
     ==========================================================
     This class is used for custom comparator sorting examples.
     ========================================================== */
    private static class Student {
        private String name;
        private double gpa;

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return "Student Name: " + name + ", GPA: " + gpa;
        }
    }

    /* ==========================================================
                🧑‍🏫 HELPER CLASS — StudentComparator
     ==========================================================
     Sorts students by:
     1) GPA descending
     2) Name ascending if GPAs are equal
     ========================================================== */
    private static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            int gpaComparison = Double.compare(s2.getGpa(), s1.getGpa());

            if (gpaComparison == 0) {
                return s1.getName().compareTo(s2.getName());
            }

            return gpaComparison;
        }
    }

        /* ==========================================================
      📚 LESSON 7 — EXCEPTION HANDLING WITH DATA STRUCTURES 📚
     ==========================================================
     When working with data structures such as arrays, lists,
     maps, and iterators, unexpected problems can happen if we
     try to access data that does not exist or perform invalid
     operations.

     Java’s exception handling helps us:
     ✅ prevent program crashes
     ✅ diagnose problems more clearly
     ✅ write safer and more reliable code

     Topics Covered:
     ✨ Handling common exceptions
     ✨ Validating inputs and states
     ✨ Defensive programming practices

     Common goals:
     📌 check bounds before accessing indexes
     📌 check if collections are empty
     📌 check iterator state before calling next()
     📌 validate input before processing
     ========================================================== */

    /* ==========================================================
              ⚠️ HANDLING COMMON EXCEPTIONS OVERVIEW ⚠️
     ==========================================================
     Two common exceptions when working with data structures:

     1) IndexOutOfBoundsException
        Happens when an index is outside the valid range.

     2) NoSuchElementException
        Happens when trying to access an element that does not
        exist, often with Iterator.next() after iteration ends.

     These are runtime exceptions, so defensive checks are
     important to avoid crashes.
     ========================================================== */
    private static void demoExceptionHandlingOverview() {
        System.out.println("⚠️ EXCEPTION HANDLING OVERVIEW");
        System.out.println("Common data structure exceptions include:");
        System.out.println("1) IndexOutOfBoundsException");
        System.out.println("2) NoSuchElementException");
        System.out.println("Defensive checks help prevent runtime crashes.");
        System.out.println();
    }

    /* ==========================================================
                🚨 IndexOutOfBoundsException EXAMPLE
     ==========================================================
     This happens when code tries to access an index outside
     the valid range of a list or array.
     ========================================================== */
    private static void demoIndexOutOfBoundsExceptionHandling() {
        System.out.println("🚨 IndexOutOfBoundsException EXAMPLE");

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Sam");

        try {
            String name = names.get(5);
            System.out.println(name);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an index outside the bounds of the list.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Error: Tried to access an index outside the bounds of the list. */
    }

    /* ==========================================================
                🚨 NoSuchElementException EXAMPLE
     ==========================================================
     This often happens with iterators when next() is called
     after there are no more elements left.
     ========================================================== */
    private static void demoNoSuchElementExceptionHandling() {
        System.out.println("🚨 NoSuchElementException EXAMPLE");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");

        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        try {
            System.out.println(iterator.next());
        } catch (NoSuchElementException e) {
            System.out.println("Error: Tried to access a non-existent element.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Red
           Blue
           Error: Tried to access a non-existent element. */
    }

    /* ==========================================================
                 ✅ VALIDATING INPUTS AND STATES OVERVIEW
     ==========================================================
     Before accessing or modifying data structures, check that
     the operation is valid.

     Good defensive checks include:
     ✔ bounds checking
     ✔ empty collection checking
     ✔ null / empty input checking
     ✔ checking if an element exists before removing it

     These checks prevent many runtime errors before they happen.
     ========================================================== */
    private static void demoValidatingInputsAndStatesOverview() {
        System.out.println("✅ VALIDATING INPUTS AND STATES OVERVIEW");
        System.out.println("Always check indexes, collection size, and input validity before operating.");
        System.out.println("Validation prevents many common runtime errors.");
        System.out.println();
    }

    /* ==========================================================
                       📏 BOUNDS CHECKING
     ==========================================================
     Always check that an index is within the valid range before
     accessing a list or array element.

     Valid range:
     index >= 0 && index < list.size()
     ========================================================== */
    private static void demoBoundsChecking() {
        System.out.println("📏 BOUNDS CHECKING");

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        int index = 1;

        if (index >= 0 && index < list.size()) {
            System.out.println(list.get(index));
        } else {
            System.out.println("Index out of bounds!");
        }

        index = 5;

        if (index >= 0 && index < list.size()) {
            System.out.println(list.get(index));
        } else {
            System.out.println("Index out of bounds!");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Banana
           Index out of bounds! */
    }

    /* ==========================================================
                  📭 CHECKING FOR EMPTY COLLECTIONS
     ==========================================================
     Before retrieving or removing elements from a collection,
     check whether it is empty.

     This is safer than assuming data is always present.
     ========================================================== */
    private static void demoCheckingForEmptyCollections() {
        System.out.println("📭 CHECKING FOR EMPTY COLLECTIONS");

        ArrayList<String> list = new ArrayList<>();

        if (!list.isEmpty()) {
            System.out.println("First element: " + list.get(0));
        } else {
            System.out.println("List is empty.");
        }

        list.add("Hello");

        if (!list.isEmpty()) {
            System.out.println("First element: " + list.get(0));
        } else {
            System.out.println("List is empty.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           List is empty.
           First element: Hello */
    }

    /* ==========================================================
                       📝 INPUT VALIDATION
     ==========================================================
     Validate strings or other external input before using them.

     Common checks:
     ✔ input != null
     ✔ !input.isEmpty()
     ========================================================== */
    private static void demoInputValidationForStrings() {
        System.out.println("📝 INPUT VALIDATION");

        String input = "Java";

        if (input != null && !input.isEmpty()) {
            System.out.println("Valid input: " + input);
        } else {
            System.out.println("Invalid input.");
        }

        input = "";

        if (input != null && !input.isEmpty()) {
            System.out.println("Valid input: " + input);
        } else {
            System.out.println("Invalid input.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Valid input: Java
           Invalid input. */
    }

    /* ==========================================================
                🧯 CHECKING BEFORE REMOVING ELEMENTS
     ==========================================================
     Before removing an item from a collection, check whether
     it actually exists.

     This is a small defensive step that prevents bad logic
     and improves program clarity.
     ========================================================== */
    private static void demoCheckBeforeRemoving() {
        System.out.println("🧯 CHECK BEFORE REMOVING");

        ArrayList<String> list = new ArrayList<>();
        list.add("example");
        list.add("test");

        if (list.contains("example")) {
            list.remove("example");
            System.out.println("Removed: example");
        } else {
            System.out.println("Element not found.");
        }

        if (list.contains("missing")) {
            list.remove("missing");
            System.out.println("Removed: missing");
        } else {
            System.out.println("Element not found.");
        }

        System.out.println("Current list: " + list);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Removed: example
           Element not found.
           Current list: [test] */
    }

    /* ==========================================================
              🛡️ DEFENSIVE PROGRAMMING PRACTICES OVERVIEW
     ==========================================================
     Defensive programming means writing code that anticipates
     problems before they happen.

     Key principles:
     ✅ anticipate edge cases
     ✅ validate data
     ✅ add safety checks
     ✅ handle errors gracefully
     ✅ protect class state with encapsulation

     This leads to more reliable and maintainable code.
     ========================================================== */
    private static void demoDefensiveProgrammingOverview() {
        System.out.println("🛡️ DEFENSIVE PROGRAMMING OVERVIEW");
        System.out.println("Defensive programming means anticipating problems before they happen.");
        System.out.println("It improves reliability, maintainability, and user experience.");
        System.out.println();
    }

    /* ==========================================================
                    🌌 ANTICIPATING EDGE CASES
     ==========================================================
     Edge cases include:
     ✔ empty lists
     ✔ null values
     ✔ out-of-range indexes
     ✔ missing keys in maps

     Checking for these cases prevents fragile code.
     ========================================================== */
    private static void demoAnticipateEdgeCases() {
        System.out.println("🌌 ANTICIPATING EDGE CASES");

        ArrayList<String> list = new ArrayList<>();

        if (!list.isEmpty()) {
            System.out.println(list.get(0));
        } else {
            System.out.println("List is empty, cannot access elements.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           List is empty, cannot access elements. */
    }

    /* ==========================================================
                         🔍 DATA VALIDATION
     ==========================================================
     Validate method parameters before storing or processing them.

     This example checks an age value before assigning it.
     ========================================================== */
    private static void demoDataValidation() {
        System.out.println("🔍 DATA VALIDATION");

        SafePerson person = new SafePerson();

        person.setAge(25);
        System.out.println("Stored age: " + person.getAge());

        person.setAge(-5);
        System.out.println("Stored age after invalid input: " + person.getAge());

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Stored age: 25
           Invalid age value.
           Stored age after invalid input: 25 */
    }

    /* ==========================================================
                       🧱 ADD SAFETY CHECKS
     ==========================================================
     Safety checks protect the program before risky operations.

     Example:
     Check whether a denominator is zero before dividing.
     Check whether a list has enough items before reading.
     ========================================================== */
    private static void demoSafetyChecks() {
        System.out.println("🧱 ADD SAFETY CHECKS");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);

        if (numbers.size() >= 2 && numbers.get(1) != 0) {
            int result = numbers.get(0) / numbers.get(1);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Unsafe operation prevented.");
        }

        numbers.set(1, 0);

        if (numbers.size() >= 2 && numbers.get(1) != 0) {
            int result = numbers.get(0) / numbers.get(1);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Unsafe operation prevented.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Result: 5
           Unsafe operation prevented. */
    }

    /* ==========================================================
                   🤝 GRACEFUL ERROR HANDLING
     ==========================================================
     Try-catch lets the program recover from errors instead of
     crashing completely.

     This is especially helpful for user-facing programs.
     ========================================================== */
    private static void demoGracefulErrorHandling() {
        System.out.println("🤝 GRACEFUL ERROR HANDLING");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(0);

        try {
            int result = numbers.get(0) / numbers.get(1);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error occurred.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Division by zero error occurred. */
    }

    /* ==========================================================
                🔒 ENCAPSULATION AND CONTROLLED ACCESS
     ==========================================================
     Encapsulation helps protect object state by controlling how
     fields are modified.

     This is part of defensive programming because it prevents
     invalid data from being stored directly.
     ========================================================== */
    private static void demoEncapsulationControlledAccess() {
        System.out.println("🔒 ENCAPSULATION AND CONTROLLED ACCESS");

        SafePerson person = new SafePerson();
        person.setAge(30);
        System.out.println("Age after valid update: " + person.getAge());

        person.setAge(150);
        System.out.println("Age after invalid update attempt: " + person.getAge());

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Age after valid update: 30
           Invalid age value.
           Age after invalid update attempt: 30 */
    }

    /* ==========================================================
             🧪 SIMPLE EXCEPTION HANDLING DEMO
     ==========================================================
     This combines the lesson ideas in one place:

     ✔ catch common exceptions
     ✔ validate index access
     ✔ check empty collections
     ✔ check iterator state
     ✔ use defensive programming practices
     ========================================================== */
    private static void demoExceptionHandlingWithDataStructuresExample() {
        System.out.println("🧪 SIMPLE EXCEPTION HANDLING DEMO");

        ArrayList<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Sam");

        int index = 1;
        if (index >= 0 && index < names.size()) {
            System.out.println("Valid access: " + names.get(index));
        } else {
            System.out.println("Index out of bounds!");
        }

        try {
            System.out.println(names.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException safely.");
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator value: " + iterator.next());
        }

        try {
            System.out.println(iterator.next());
        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException safely.");
        }

        ArrayList<String> emptyList = new ArrayList<>();
        if (!emptyList.isEmpty()) {
            System.out.println(emptyList.get(0));
        } else {
            System.out.println("Empty list check prevented an error.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Valid access: Sam
           Caught IndexOutOfBoundsException safely.
           Iterator value: Kevin
           Iterator value: Sam
           Caught NoSuchElementException safely.
           Empty list check prevented an error. */
    }

    /* ==========================================================
                  👤 HELPER CLASS — SafePerson
     ==========================================================
     This small helper class shows defensive validation inside
     a setter method.
     ========================================================== */
    private static class SafePerson {
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0 && age <= 120) {
                this.age = age;
            } else {
                System.out.println("Invalid age value.");
            }
        }
    }

        /* ==========================================================
      📚 LESSON 8 — TESTING AND DEBUGGING DATA STRUCTURES 📚
     ==========================================================
     Testing and debugging are essential when working with data
     structures such as arrays, lists, maps, and sets.

     Even small mistakes in data handling can cause:
     ❌ wrong output
     ❌ crashes
     ❌ performance problems
     ❌ hard-to-find bugs

     This lesson focuses on:
     ✨ Writing test cases for collections and arrays
     ✨ Debugging common data structure issues
     ✨ Handling empty and full states
     ✨ Using assertions to validate data integrity

     The goal is to make your programs more reliable,
     predictable, and easier to maintain.
     ========================================================== */

    /* ==========================================================
              🧠 TESTING AND DEBUGGING OVERVIEW 🧠
     ==========================================================
     When testing data structures, we want to check:

     ✅ normal behavior
     ✅ edge cases
     ✅ boundary values
     ✅ invalid operations
     ✅ large data sets
     ✅ consistency after modifications

     Debugging means tracking down what went wrong and why.
     ========================================================== */
    private static void demoTestingDebuggingOverview() {
        System.out.println("🧠 TESTING AND DEBUGGING OVERVIEW");
        System.out.println("Testing checks whether data structures behave correctly.");
        System.out.println("Debugging helps find and fix mistakes.");
        System.out.println("Important cases include boundaries, empty states, invalid access, and large data sets.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           🧠 TESTING AND DEBUGGING OVERVIEW
           Testing checks whether data structures behave correctly.
           Debugging helps find and fix mistakes.
           Important cases include boundaries, empty states, invalid access, and large data sets. */
    }

    /* ==========================================================
           🧪 WRITING TEST CASES FOR COLLECTIONS AND ARRAYS
     ==========================================================
     Good test cases should include:

     ✔ Boundary value testing
     ✔ Empty state testing
     ✔ Valid and invalid data testing
     ✔ Stress testing
     ✔ Consistency after modifications
     ✔ Null and duplicate value testing

     These tests help prove that the structure behaves correctly
     in both typical and unusual situations.
     ========================================================== */
    private static void demoWritingTestCasesOverview() {
        System.out.println("🧪 WRITING TEST CASES OVERVIEW");
        System.out.println("Test boundaries, empty states, valid/invalid data, stress cases, consistency, nulls, and duplicates.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           🧪 WRITING TEST CASES OVERVIEW
           Test boundaries, empty states, valid/invalid data, stress cases, consistency, nulls, and duplicates. */
    }

    /* ==========================================================
                     📏 BOUNDARY VALUE TESTING
     ==========================================================
     Boundary testing checks the first and last valid positions,
     plus invalid positions beyond the range.

     For a list:
     first index = 0
     last index = size - 1
     invalid index = negative or >= size
     ========================================================== */
    private static void demoBoundaryValueTesting() {
        System.out.println("📏 BOUNDARY VALUE TESTING");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("First element: " + numbers.get(0));
        System.out.println("Last element: " + numbers.get(numbers.size() - 1));

        try {
            System.out.println(numbers.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Boundary test passed: out-of-bounds access correctly caused IndexOutOfBoundsException.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           First element: 10
           Last element: 20
           Boundary test passed: out-of-bounds access correctly caused IndexOutOfBoundsException. */
    }

    /* ==========================================================
                     📭 EMPTY STATE TESTING
     ==========================================================
     Data structures often need special handling when empty.

     Example checks:
     ✔ isEmpty()
     ✔ avoid retrieving from empty lists
     ✔ avoid removing from empty lists unless handled
     ========================================================== */
    private static void demoEmptyStateTesting() {
        System.out.println("📭 EMPTY STATE TESTING");

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("List is empty? " + numbers.isEmpty());

        try {
            numbers.remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Empty state test passed: removing from empty list caused IndexOutOfBoundsException.");
        }

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           List is empty? true
           Empty state test passed: removing from empty list caused IndexOutOfBoundsException. */
    }

    /* ==========================================================
                ✅ VALID AND INVALID DATA TESTING
     ==========================================================
     Test that valid data works and invalid or unusual data
     is handled correctly.

     Some collections allow null values.
     Others may reject them depending on design.
     ========================================================== */
    private static void demoValidAndInvalidDataTesting() {
        System.out.println("✅ VALID AND INVALID DATA TESTING");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        System.out.println("Added valid integer: " + numbers.get(0));

        numbers.add(null);
        System.out.println("Added null value: " + numbers.get(1));

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Added valid integer: 15
           Added null value: null */
    }

    /* ==========================================================
                    💪 STRESS TESTING LARGE DATA SETS
     ==========================================================
     Stress testing checks how a structure behaves with many
     elements.

     This can help reveal:
     ✔ performance issues
     ✔ memory issues
     ✔ logic problems under heavy load

     Here we keep the size smaller than the textbook example so
     it remains classroom-friendly.
     ========================================================== */
    private static void demoStressTestingLargeDataSet() {
        System.out.println("💪 STRESS TESTING LARGE DATA SETS");

        ArrayList<Integer> numbers = new ArrayList<>();
        int largeDataSize = 10000;

        for (int i = 0; i < largeDataSize; i++) {
            numbers.add(i);
        }

        System.out.println("List size after stress test: " + numbers.size());
        System.out.println("First element: " + numbers.get(0));
        System.out.println("Last element: " + numbers.get(numbers.size() - 1));
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           List size after stress test: 10000
           First element: 0
           Last element: 9999 */
    }

    /* ==========================================================
             🔄 CONSISTENCY AFTER MODIFICATION TESTING
     ==========================================================
     After adding, removing, or changing data, verify that the
     structure still contains the expected values in the expected
     positions.
     ========================================================== */
    private static void demoConsistencyAfterModificationTesting() {
        System.out.println("🔄 CONSISTENCY AFTER MODIFICATION TESTING");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        System.out.println("Before removal: " + numbers);

        numbers.remove(1);

        System.out.println("After removal: " + numbers);
        System.out.println("First element should be 5: " + numbers.get(0));
        System.out.println("Second element should be 15: " + numbers.get(1));
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Before removal: [5, 10, 15]
           After removal: [5, 15]
           First element should be 5: 5
           Second element should be 15: 15 */
    }

    /* ==========================================================
                 👯 DUPLICATE VALUE TESTING
     ==========================================================
     Some data structures allow duplicates, like ArrayList.
     Testing duplicates confirms that all occurrences behave as
     expected during access and removal.
     ========================================================== */
    private static void demoDuplicateValueTesting() {
        System.out.println("👯 DUPLICATE VALUE TESTING");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(25);
        numbers.add(30);

        System.out.println("Original list: " + numbers);

        numbers.remove(Integer.valueOf(25));

        System.out.println("After removing one duplicate 25: " + numbers);
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Original list: [25, 25, 30]
           After removing one duplicate 25: [25, 30] */
    }

    /* ==========================================================
              🐞 DEBUGGING COMMON DATA STRUCTURE ISSUES
     ==========================================================
     Common issues include:
     ❌ null values
     ❌ wrong indexes
     ❌ empty collections
     ❌ removing while iterating incorrectly
     ❌ assuming a key exists in a map
     ❌ forgetting that some structures allow duplicates

     Debugging strategy:
     ✔ print state before and after operations
     ✔ check size()
     ✔ check isEmpty()
     ✔ inspect indexes carefully
     ✔ verify expected values step by step
     ========================================================== */
    private static void demoDebuggingCommonIssuesOverview() {
        System.out.println("🐞 DEBUGGING COMMON ISSUES OVERVIEW");
        System.out.println("Check size, indexes, emptiness, duplicates, nulls, and state before/after operations.");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           🐞 DEBUGGING COMMON ISSUES OVERVIEW
           Check size, indexes, emptiness, duplicates, nulls, and state before/after operations. */
    }

    /* ==========================================================
                    📭 HANDLING EMPTY STATES
     ==========================================================
     Before retrieving or removing data, check whether the
     structure is empty.

     This prevents errors and improves reliability.
     ========================================================== */
    private static void demoHandlingEmptyStates() {
        System.out.println("📭 HANDLING EMPTY STATES");

        ArrayList<Integer> dynamicList = new ArrayList<>();

        if (dynamicList.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("First element: " + dynamicList.get(0));
        }

        dynamicList.add(10);
        dynamicList.add(20);
        System.out.println("After adding elements, ArrayList: " + dynamicList);

        dynamicList.clear();
        System.out.println("After clearing, is the ArrayList empty? " + dynamicList.isEmpty());
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           The ArrayList is empty.
           After adding elements, ArrayList: [10, 20]
           After clearing, is the ArrayList empty? true */
    }

    /* ==========================================================
                     📦 HANDLING FULL STATES
     ==========================================================
     Dynamic structures like ArrayList grow automatically.

     Fixed-size arrays do NOT grow automatically, so we must
     manually check capacity before adding elements.
     ========================================================== */
    private static void demoHandlingFullStates() {
        System.out.println("📦 HANDLING FULL STATES");

        int[] fixedArray = new int[3];
        int itemCount = 0;

        try {
            for (int i = 0; i < 5; i++) {
                if (itemCount < fixedArray.length) {
                    fixedArray[itemCount] = i * 10;
                    System.out.println("Added " + fixedArray[itemCount] + " at index " + itemCount);
                    itemCount++;
                } else {
                    throw new ArrayIndexOutOfBoundsException("Fixed array capacity reached.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("Contents of fixed array: ");
        for (int i = 0; i < itemCount; i++) {
            System.out.print(fixedArray[i] + " ");
        }
        System.out.println();
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Added 0 at index 0
           Added 10 at index 1
           Added 20 at index 2
           Error: Fixed array capacity reached.
           Contents of fixed array: 0 10 20 */
    }

    /* ==========================================================
          ✅ USING ASSERTIONS TO VALIDATE DATA INTEGRITY
     ==========================================================
     Assertions check whether a condition is true.

     Syntax:
     assert condition : "Error message";

     If the condition is false:
     ❌ AssertionError is thrown

     Assertions are useful for:
     ✔ pre-conditions
     ✔ post-conditions
     ✔ invariants

     Important:
     Assertions are disabled by default unless enabled with:
     java -ea YourProgram
     ========================================================== */
    private static void demoAssertionsOverview() {
        System.out.println("✅ ASSERTIONS OVERVIEW");
        System.out.println("Assertions validate expected conditions during execution.");
        System.out.println("They are useful for pre-conditions, post-conditions, and invariants.");
        System.out.println("Enable them with: java -ea YourProgram");
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           ✅ ASSERTIONS OVERVIEW
           Assertions validate expected conditions during execution.
           They are useful for pre-conditions, post-conditions, and invariants.
           Enable them with: java -ea YourProgram */
    }

    /* ==========================================================
              🎓 STUDENT MANAGER ASSERTION DEMO
     ==========================================================
     This helper object demonstrates assertions used to protect
     collection integrity.

     Assertions check:
     ✔ non-null / non-empty student names
     ✔ valid indexes
     ✔ safe removal conditions
     ========================================================== */
    private static void demoAssertionStudentManager() {
        System.out.println("🎓 ASSERTION STUDENT MANAGER DEMO");

        StudentManager manager = new StudentManager();

        manager.addStudent("Kevin");
        manager.addStudent("Sam");

        manager.displayStudents();

        System.out.println("Student at index 0: " + manager.getStudent(0));

        System.out.println("Removing student Kevin.");
        manager.removeStudent("Kevin");

        manager.displayStudents();
        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           Current students:
           - Kevin
           - Sam
           Student at index 0: Kevin
           Removing student Kevin.
           Current students:
           - Sam */
    }

    /* ==========================================================
              🧪 SIMPLE TESTING AND DEBUGGING DEMO
     ==========================================================
     This combines:
     ✔ boundary checks
     ✔ empty state checks
     ✔ duplicate testing
     ✔ consistency checks
     ✔ assertion-based integrity checks

     This ties the lesson together in one workflow.
     ========================================================== */
    private static void demoTestingAndDebuggingExample() {
        System.out.println("🧪 SIMPLE TESTING AND DEBUGGING DEMO");

        ArrayList<Integer> numbers = new ArrayList<>();

        // Empty state
        System.out.println("List starts empty? " + numbers.isEmpty());

        // Add values
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);

        System.out.println("After adding values: " + numbers);

        // Boundary checks
        System.out.println("First element: " + numbers.get(0));
        System.out.println("Last element: " + numbers.get(numbers.size() - 1));

        // Duplicate behavior
        numbers.remove(Integer.valueOf(20));
        System.out.println("After removing one 20: " + numbers);

        // Consistency check
        System.out.println("Current size: " + numbers.size());

        // Safe invalid access test
        try {
            System.out.println(numbers.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException safely.");
        }

        // Assertion helper class demo
        StudentManager manager = new StudentManager();
        manager.addStudent("Alice");
        manager.addStudent("Bob");
        manager.displayStudents();

        System.out.println();

        /* 🖨️ OUTPUT 🖨️:
           List starts empty? true
           After adding values: [10, 20, 20]
           First element: 10
           Last element: 20
           After removing one 20: [10, 20]
           Current size: 2
           Caught IndexOutOfBoundsException safely.
           Current students:
           - Alice
           - Bob */
    }

    /* ==========================================================
                  👤 HELPER CLASS — StudentManager
     ==========================================================
     This class demonstrates assertions that validate data
     integrity while working with a collection of student names.
     ========================================================== */
    private static class StudentManager {
        private ArrayList<String> students;

        public StudentManager() {
            students = new ArrayList<>();
        }

        public void addStudent(String name) {
            assert name != null && !name.trim().isEmpty() : "Student name cannot be null or empty";
            students.add(name);
        }

        public String getStudent(int index) {
            assert index >= 0 && index < students.size() : "Index out of bounds";
            return students.get(index);
        }

        public void removeStudent(String name) {
            assert !students.isEmpty() : "Cannot remove from an empty list";
            assert students.contains(name) : "Student not found in the list";
            students.remove(name);
        }

        public void displayStudents() {
            System.out.println("Current students:");
            for (String student : students) {
                System.out.println("- " + student);
            }
        }
    }



}

