# OOPSBannerApp — UC1, UC2, UC3 & UC4

This repository demonstrates four user stories for displaying the text "OOPS" in the console.

## UC1 — Simple Output
- Behavior: Print the literal string `OOPS` using a single `System.out.println()` call.

## UC2 — Banner Output (ASCII Art)
- Behavior: Print the letters `O O P S` as a 7-line tall ASCII-art banner made from asterisks (`*`) and spaces.
- Implementation notes:
  - Each character is represented using 7 rows and a width of 9 characters.
  - Each banner row is printed with an individual `System.out.println()` call.
  - UC2 used the `+` operator to concatenate string segments when building each printed line.

## UC3 — Banner Output (String.join)
- Behavior: Same visual output as UC2, but each printed line is assembled with `String.join(" ", ...)`.
- Benefits: Reduces intermediate String allocations, improves readability, and demonstrates a small refactor for efficiency.

## UC4 — Banner Output (Array + Loop)
- Behavior: Same visual output as UC3, but the banner lines are stored in a `String[]` and printed using a loop.
- Benefits: Improves modularity and reduces repetition of `System.out.println()` calls.

## Files
- `OOPSBannerApp.java` — Main application. Contains UC1 simple print, UC2 concatenation prints (preserved), UC3 `String.join()` prints, and UC4 array+loop prints.
- `README.md` — This document.

## How to run
From the `Code` directory run:

```bash
javac OOPSBannerApp.java
java OOPSBannerApp
```

This will compile and run the program and print the simple `OOPS` line followed by the 7-line ASCII banner printed three ways (UC2, UC3, UC4).
