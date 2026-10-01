# 02 - Conditionals & Loops 🔄

Control flow statements allow you to control the execution path of your Java programs.

---

## 📌 Concepts Covered

### 1. Conditional Statements (`if-else`, `else-if ladder`, `switch`)
Conditionals make decisions based on boolean expressions (`true` / `false`).

- **`if-else`**:
```java
if (num % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

- **`switch-case`**: Useful when comparing a variable against multiple discrete values.

```java
switch (monthNumber) {
    case 1 -> System.out.println("January");
    case 2 -> System.out.println("February");
    default -> System.out.println("Invalid month");
}
```

---

### 2. Iterative Statements (Loops)

| Loop Type | Best Used When... | Syntax Example |
| :--- | :--- | :--- |
| **`for` loop** | The exact number of iterations is known in advance. | `for (int i = 0; i < n; i++)` |
| **`while` loop** | The number of iterations depends on a condition dynamically. | `while (n != 0)` |
| **`do-while` loop** | Code must execute **at least once** before checking condition. | `do { ... } while (cond);` |

---

## 📁 Included Source Code
- [`ConditionalsDemo.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/02_Conditionals_And_Loops/ConditionalsDemo.java) - Even/Odd, Voting Eligibility, Switch Month, Max of Numbers & Grading System.
- [`LoopsDemo.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/02_Conditionals_And_Loops/LoopsDemo.java) - Sum of numbers till 0, Max input till 0, Reverse a number, Fibonacci series.
- [`GeometryCalculations.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/02_Conditionals_And_Loops/GeometryCalculations.java) - Areas of Circle, Triangle, Rectangle, Rhombus.
