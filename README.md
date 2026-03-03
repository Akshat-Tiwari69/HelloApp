# OOPS Banner Application

A progressive Java application demonstrating object-oriented programming principles through iterative refinement of a banner display system.

## Project Overview

This application showcases a series of user cases (UC1 through UC5) that progressively build from simple console output to a modular, well-structured banner display system using arrays and string manipulation.

## Branch Distribution Strategy

The project uses a **feature branch strategy** with the following hierarchy:

```
master (Base/Main branch - Documentation & Overview)
  │
  └─ dev (Development - Latest implementation with all features)
      │
      ├── feature/UC1 (Simple Output)
      ├── feature/UC2 (Banner with String Concatenation)
      ├── feature/UC3 (Banner with String.join())
      ├── feature/UC4 (Banner with Array & Loop)
      └── feature/UC5 (Banner with Inline Array Initialization)
```

### Branch Descriptions & Division

| Branch | Description | Version | Key Features |
|--------|-------------|---------|--------------|
| **master** | Documentation and project overview only | - | README with complete guide, no code |
| **dev** | Latest development version with all features | 5.0 | UC1-UC5 implementation combined |
| **feature/UC1** | Simple output - prints "OOPS" | 1.0 | Single print statement |
| **feature/UC2** | Banner with string concatenation | 2.0 | ASCII art using `+` operator |
| **feature/UC3** | Banner with String.join() | 3.0 | Efficient string assembly |
| **feature/UC4** | Banner with array and loop | 4.0 | Arrays for data, for-each loop |
| **feature/UC5** | Banner with inline array initialization | 5.0 | Concise array declaration syntax |

### Why This Distribution?

- **Master Branch**: Project hub with documentation and no implementation code
- **Dev Branch**: Always has the latest, most refined version with all UCs
- **Feature Branches**: Enable isolated development of each UC independently

---

## User Cases (UC) Progression

### UC1: Simple Output ✓
**Branch:** `feature/UC1` | **Version:** 1.0

Prints the string "OOPS" using a single `System.out.println()` call.

**Concepts:** Console I/O, System.out.println()

---

### UC2: Banner Output (String Concatenation) ✓
**Branch:** `feature/UC2` | **Version:** 2.0

Print the letters O, O, P, S as a 7-line ASCII-art banner using `+` operator for string concatenation.

**Concepts:** String concatenation, ASCII art

---

### UC3: Banner Output (String.join) ✓
**Branch:** `feature/UC3` | **Version:** 3.0

Refactors UC2 using `String.join(" ", ...)` instead of concatenation.

**Benefits:**
- Reduced memory footprint
- Improved code readability
- Eliminates intermediate string allocations

**Concepts:** String.join(), method invocation, string efficiency

---

### UC4: Banner Output (Array + Loop) ✓
**Branch:** `feature/UC4` | **Version:** 4.0

Stores all 7 banner lines in a `String[]` array and prints using a for-each loop.

**Benefits:**
- Eliminates code repetition
- Separates data from presentation logic
- Improved maintainability

**Concepts:** Arrays, array declaration, for-each loops

---

### UC5: Banner with Inline Array Initialization ✓
**Branch:** `feature/UC5` | **Version:** 5.0  

Combines array declaration and initialization using array literal syntax `{ ... }` instead of `new String[] { ... }`.

**Benefits:**
- Cleaner, more concise syntax
- Direct array literal initialization
- Maintains all modularity benefits of UC4

**Concepts:** Array literal syntax, inline initialization, Java syntax evolution

---

## How to Use

### Checkout a Specific UC
```bash
git checkout feature/UC1   # Simple output
git checkout feature/UC2   # String concatenation
git checkout feature/UC3   # String.join()
git checkout feature/UC4   # Array with loop
git checkout feature/UC5   # Inline array initialization (latest)
git checkout dev           # Latest version with all features
```

### Compile and Run
```bash
javac OOPSBannerApp.java
java OOPSBannerApp
```

### Compare Implementations
```bash
git diff feature/UC1 feature/UC2   # Compare UC1 to UC2
git diff feature/UC4 feature/UC5   # Compare UC4 to UC5
git diff feature/UC1 feature/UC5   # Compare first to latest
```

---

## Key Concepts by UC

| Concept | UC | Purpose |
|---------|-----|---------|
| Console I/O | 1 | Basic program output |
| String Concatenation | 2 | String assembly with `+` |
| String Methods | 3 | Efficient string assembly |
| Arrays | 4 | Data structure for storage |
| For-each Loops | 4 | Iteration over collections |
| Array Literals | 5 | Concise initialization |

## Author
Akshat Tiwari

## Version History
- **v5.0** - Inline array initialization (UC5)
- **v4.0** - Array with loop (UC4)
- **v3.0** - String.join refactor (UC3)
- **v2.0** - String concatenation (UC2)
- **v1.0** - Simple output (UC1)

---

**Note:** This project demonstrates OOPS principles and progressive code refinement through iterative feature implementation across separate branches.

## How to run
```bash
javac OOPSBannerApp.java
java OOPSBannerApp
```