# 03 - Pattern Printing Problems 🎨

Pattern printing is one of the best ways to build strong nested-loop logic and spatial reasoning.

---

## 💡 How to Solve Any Pattern Problem?

1. **Outer Loop (`i`)**: Controls the number of rows. Runs from `1` to `N` (or `N` down to `1`).
2. **Inner Loop 1 (Spaces)**: Prints spaces before stars/numbers when alignment is needed (e.g. `N - i` spaces).
3. **Inner Loop 2 (Content)**: Prints stars (`*`) or numbers based on row index `i` and column index `j`.
4. **New Line (`System.out.println()`)**: Placed after inner loops complete for each row.

---

## 🌟 Patterns Included

### 1. Star Patterns ([`StarPatterns.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/03_Patterns/StarPatterns.java))
- **Solid Square**: `N x N` grid of stars.
- **Hollow Square**: Stars only on outer boundary (`i==1 || i==N || j==1 || j==N`).
- **Right Half Pyramid**: Row `i` has `i` stars.
- **Reverse Right Half Pyramid**: Row `i` has `N - i + 1` stars.
- **Left Half Pyramid**: `N - i` spaces + `i` stars.
- **Reverse Left Half Pyramid**: `i` spaces + `N - i + 1` stars.
- **Rhombus Pattern**: Leading spaces + solid row of `N` stars.

### 2. Number Patterns ([`NumberPatterns.java`](file:///e:/DSA-with-JAVA-20250925T213249Z-1-001/DSA-with-JAVA/03_Patterns/NumberPatterns.java))
- **Numbered Right Triangle**: Row `i` prints `1 2 3 ... i`.
- **Inverted Numbered Triangle**: Row `i` prints `1 2 ... N-i+1`.
- **Floyd's Triangle**: Incremental counter `1, 2 3, 4 5 6 ...`.
- **0-1 Binary Triangle**: Alternating `1` and `0` based on `(i + j) % 2 == 0`.
