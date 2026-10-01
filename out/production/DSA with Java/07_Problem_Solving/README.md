# 07 - Problem Solving & LeetCode Practice 🧩

This module contains structured problem-solving solutions covering Arrays, Matrix, and String algorithms.

---

## 📌 Problem Catalog & Approaches

### 1. String Problems ([`StringProblems.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/07_Problem_Solving/StringProblems.java))

| Problem | Description | Technique | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| **Valid Anagram** | Check if two strings contain identical character counts. | Frequency Map / Sorting | $\mathcal{O}(N \log N)$ / $\mathcal{O}(N)$ | $\mathcal{O}(1)$ |
| **Valid Palindrome** | Verify if string is palindrome ignoring non-alphanumeric chars. | Two Pointer | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ |

---

### 2. Array LeetCode Problems ([`ArrayLeetcode.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/07_Problem_Solving/ArrayLeetcode.java))

| LeetCode # | Problem Name | Approach / Concept | Time Complexity |
| :---: | :--- | :--- | :---: |
| **1920** | Build Array from Permutation | `ans[i] = nums[nums[i]]` | $\mathcal{O}(N)$ |
| **1929** | Concatenation of Array | `ans[i] = ans[i + N] = nums[i]` | $\mathcal{O}(N)$ |
| **1480** | Running Sum of 1D Array | Prefix sum accumulation | $\mathcal{O}(N)$ |
| **1672** | Richest Customer Wealth | Row-wise matrix summation | $\mathcal{O}(M \times N)$ |
| **1470** | Shuffle the Array | Interleave $X_i$ and $Y_i$ elements | $\mathcal{O}(N)$ |
| **1295** | Find Numbers with Even Digits | Digit extraction loop | $\mathcal{O}(N \log_{10} M)$ |
| **1431** | Kids With Greatest Candies | Compare `candies[i] + extra >= max` | $\mathcal{O}(N)$ |
| **1512** | Number of Good Pairs | Count matching pairs `nums[i] == nums[j]` (`i < j`) | $\mathcal{O}(N^2)$ |
| **832** | Flip and Invert Image | Reverse row + XOR with 1 | $\mathcal{O}(N \times M)$ |
| **Manual** | Array Element Insertion | Shift elements right from index `pos` | $\mathcal{O}(N)$ |

---

## 📁 Included Source Code
- [`StringProblems.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/07_Problem_Solving/StringProblems.java) - Anagram and Valid Palindrome implementations.
- [`ArrayLeetcode.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/07_Problem_Solving/ArrayLeetcode.java) - Solutions to 10+ standard LeetCode array problems with test runners.
