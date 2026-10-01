# 05 - Data Structures: Arrays (1D & 2D) 📊

An **Array** is a contiguous block of memory used to store multiple elements of the **same data type** under a single variable name.

---

## 📌 Memory Allocation & Properties

1. **Fixed Size**: Array size is defined at creation time and cannot be resized dynamically.
2. **0-Based Indexing**: First element is stored at index `0`, last element at index `length - 1`.
3. **Contiguous Memory**: Array elements are stored in contiguous memory slots.
4. **Time Complexities**:
   - Access by Index: $\mathcal{O}(1)$
   - Search (Linear): $\mathcal{O}(N)$
   - Insertion / Deletion: $\mathcal{O}(N)$

---

## 🔄 Two-Pointer Technique
The **Two-Pointer** pattern uses two index markers (e.g. `start = 0`, `end = arr.length - 1`) moving towards each other to process or reverse an array in $\mathcal{O}(N)$ time and $\mathcal{O}(1)$ extra space.

```java
int i = 0, j = arr.length - 1;
while (i < j) {
    swap(arr, i, j);
    i++;
    j--;
}
```

---

## 🔲 2D Arrays (Matrix)
A 2D array in Java is an **Array of Arrays**.

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Iterating through a 2D array:
- `matrix.length` gives total rows.
- `matrix[i].length` gives total columns in row `i`.

---

## 📁 Included Source Code
- [`ArrayBasics.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/05_Arrays/ArrayBasics.java) - Array initialization, input/output, linear search, max/min, second max, count greater than X, marks filter.
- [`ArrayOperations.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/05_Arrays/ArrayOperations.java) - Array reversing (Two Pointer), rotation by K steps, swapping elements.
- [`TwoDArrays.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/05_Arrays/TwoDArrays.java) - 2D Array creation, traversal via nested loops, enhanced loops, and `Arrays.toString()`.
