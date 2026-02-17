# OOPSBannerApp — UC1 & UC2

This repository demonstrates two small user stories for displaying the text "OOPS" in the console.

## UC1 — Simple Output
- Behavior: Print the literal string `OOPS` using a single `System.out.println()` call.
- Purpose: Introduces basic console output and application entry point.

## UC2 — Banner Output (ASCII Art)
- Behavior: Print the letters `O O P S` as a 7-line tall ASCII-art banner made from asterisks (`*`) and spaces.
- Implementation notes:
  - Each character is represented using 7 rows and a width of 9 characters.
  - Each banner row is printed with an individual `System.out.println()` call.
  - The Java source uses string concatenation (`+`) to assemble the printed lines.

## Files
- `OOPSBannerApp.java` — Main application. Contains both UC1 description (in header) and the UC2 banner implementation.

## How to run
From the `Code` directory run:

```bash
javac OOPSBannerApp.java
java OOPSBannerApp
```

This will compile and run the program and print the 7-line ASCII banner for `OOPS`.
