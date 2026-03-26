## UC1: Display "Hello World"

### Description
The app displays "Hello World" on the console when executed.

### Preconditions
- App is launched

### Main Flow
1. User runs the application
2. App executes the main method
3. App prints "Hello World" to the console
4. App terminates

### Postconditions
- Message is displayed to user

### Example Output
```
Hello World
```

### Concepts Learned
- **Class Declaration** – `HelloApp` is a public class; name must match filename
- **Main Method** – `public static void main(String[] args)` is the JVM entry point
- **public** – accessible by JVM from anywhere
- **static** – no object creation needed to call it
- **void** – returns nothing
- **String[] args** – holds command-line arguments
- **System.out.println()** – prints text + newline to the console