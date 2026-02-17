# OOPS Banner App (Java)

This small Java program demonstrates building a console "banner" for the text `OOPS` while evolving the implementation:

- Step 1: simple `System.out.println("OOPS")` output
- Step 2: inline banner patterns using spaces and `*`
- Step 3: refactor into functions
- Step 4: encapsulate patterns in a `CharacterPattern` class
- Step 5: store patterns in a `Map` and print via a display function

Compile and run:

```bash
javac "f:/Code/STEP Classes/OopsBanner.java"
java -cp "f:/Code/STEP Classes" OopsBanner
```

On Windows you can also run from the directory containing the files:

```bash
cd "f:/Code/STEP Classes"
javac OopsBanner.java
java OopsBanner
```

The program prints stages showing the evolution from simple text to a modular banner renderer.
