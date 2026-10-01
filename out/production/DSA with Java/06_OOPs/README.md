# 06 - Object-Oriented Programming (OOP) 🧱

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of **objects**, which contain data (fields/attributes) and code (methods).

---

## 📌 Core Building Blocks

### 1. Class vs Object
- **Class**: A user-defined blueprint/template for creating objects. Does not occupy memory when defined.
- **Object**: A real-world instance of a class that holds state (data) and behavior (methods). Occupies memory in Heap.

```java
Student s1 = new Student(); // 's1' is object reference stored in Stack pointing to heap allocation
```

---

### 2. Constructors
Constructors are special methods invoked automatically when an object is instantiated using `new`.
- Same name as the Class.
- No return type.
- **Default Constructor**: No parameters. Initializes fields to default values.
- **Parameterized Constructor**: Accepts arguments to initialize custom instance state.

```java
public class Student {
    String name;
    int rollNo;

    // Parameterized constructor
    public Student(String name, int rollNo) {
        this.name = name;     // 'this' refers to current object instance
        this.rollNo = rollNo;
    }
}
```

---

### 3. Encapsulation 🔒
Encapsulation is the practice of wrapping data (variables) and code (methods) together as a single unit, keeping fields `private` and exposing public `getter` and `setter` methods.

**Benefits**:
- **Data Hiding**: Prevents unauthorized modification from external classes.
- **Validation**: Setters can validate incoming data before updating instance fields.

```java
public class Student {
    private String name; // Private field

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
}
```

---

## 📁 Included Source Code
- [`StudentDemo.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/06_OOPs/StudentDemo.java) - Demonstrates Classes, Objects, Default & Parameterized Constructors, `this` keyword.
- [`EncapsulationDemo.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/06_OOPs/EncapsulationDemo.java) - Demonstrates Private fields, Data hiding, Getters/Setters with validation logic.
