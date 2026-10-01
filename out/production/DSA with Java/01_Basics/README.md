# 01 - Java Basics & Fundamentals 🚀

Welcome to the **Java Basics** module! Here you'll learn the core building blocks of Java programming.

---

## 📌 Concepts Covered

### 1. Variables & Data Types
In Java, variables are containers for storing data values. Java is a **strongly typed** language, meaning every variable must be declared with a specific data type.

- **Primitive Data Types**: `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`.
- **Non-Primitive Data Types**: `String`, `Array`, `Class`, etc.

---

## 🔄 Type Conversion & Casting

### 1. Implicit Conversion (Widening Casting)
- Converts a smaller data type to a larger data type automatically.
- **Condition**: Types must be compatible, and Destination Type Size > Source Type Size.
- Example: `byte` -> `short` -> `int` -> `long` -> `float` -> `double`.

```java
int num = 25;
double doubleNum = num; // Automatic casting: int to double
```

### 2. Explicit Conversion (Narrowing Casting)
- Converts a larger data type to a smaller data type manually using `(target_type)`.
- Data loss can occur if the value exceeds target type range.

```java
double price = 99.99;
int roundedPrice = (int) price; // Manual casting: double to int (result: 99)
```

---

## ⚡ Type Promotion in Expressions
When evaluating mathematical expressions, Java automatically promotes operand data types:
1. `byte`, `short`, and `char` values are promoted to `int`.
2. If any operand is `long`, `float`, or `double`, the entire expression is promoted to `long`, `float`, or `double` respectively.

```java
byte a = 20;
byte b = 30;
// (a * b) is evaluated as int, not byte!
int result = a * b; 
```

---

## 📥 User Input (Scanner Class)
Java uses `java.util.Scanner` to take input from the console.

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
String name = sc.next();       // Reads single word
String fullName = sc.nextLine(); // Reads full line
```

---

## 📁 Included Source Code
- [`BasicsDemo.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/01_Basics/BasicsDemo.java) - Type casting, type promotion & user input demonstration.
- [`SimpleCalculator.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/01_Basics/SimpleCalculator.java) - Simple interest, currency conversion (INR to USD) & basic calculations.
