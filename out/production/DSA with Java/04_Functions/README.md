# 04 - Functions & Methods in Java ⚙️

Functions (called **methods** in Java) are reusable blocks of code that perform a specific task when called.

---

## 📌 Key Concepts

### 1. Function Syntax in Java
```java
public static return_type functionName(parameter1_type param1, parameter2_type param2) {
    // Function body
    return result;
}
```

- **`public`**: Access modifier (accessible everywhere).
- **`static`**: BELONGS to the class, can be invoked without creating an instance object.
- **`return_type`**: Data type of value returned (`void` if returning nothing).

---

### 2. Pass by Value in Java
Java is **strictly pass-by-value**.
- For primitive types (`int`, `double`, etc.), a copy of the actual value is passed. Modifying the parameter inside the function **does not** change the original variable in the caller.

---

### 3. Key Formulas Implemented

#### Binomial Coefficient (\(nCr\)):
\[
nCr = \frac{n!}{r! \times (n-r)!}
\]

#### Pythagorean Triplet:
\[
a^2 + b^2 = c^2 \quad \text{or} \quad b^2 + c^2 = a^2 \quad \text{or} \quad c^2 + a^2 = b^2
\]

#### Armstrong Number (3-digit):
A number is Armstrong if:
\[
abc = a^3 + b^3 + c^3 \quad (\text{e.g., } 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153)
\]

---

## 📁 Included Source Code
- [`FunctionBasics.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/04_Functions/FunctionBasics.java) - Addition, multiplication, average, sum of odds, sum of N natural numbers.
- [`MathFunctions.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/04_Functions/MathFunctions.java) - Factorial, Binomial Coefficient (\(nCr\)), Circle area & circumference, Pythagorean triplet check.
- [`PrimeAndPalindrome.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/04_Functions/PrimeAndPalindrome.java) - Prime check, Prime numbers in a range, Number/String Palindrome check, Armstrong number check.
