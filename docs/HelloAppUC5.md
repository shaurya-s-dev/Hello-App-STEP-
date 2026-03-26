## UC3: Display "Hello" with Command-Line Argument or Default Message

### Description
The app greets with a provided name or defaults to "World" if none is given.

### Disadvantages of UC2
UC2 crashes with ArrayIndexOutOfBoundsException if no argument is supplied.
UC3 fixes this with defensive default handling.

### Preconditions
- App is launched with or without a command-line argument

### Main Flow
1. User runs: `java HelloApp John` or `java HelloApp`
2. App checks if `args.length > 0`
3. If yes → use `args[0]` as name; if no → use `"World"`
4. App prints `Hello, <name>!`
5. App terminates

### Postconditions
- Greeting shown with provided name or default "World"

### Example Output
| Input                 | Output           |
|-----------------------|------------------|
| `java HelloApp Alice` | `Hello, Alice!`  |
| `java HelloApp`       | `Hello, World!`  |

### Key Code
String name = (args.length > 0) ? args[0] : "World";

### Concepts Learned
- **Ternary operator** – `condition ? valueIfTrue : valueIfFalse`
- **Default values** – fallback when input is missing
- **Array length checking** – validate before accessing elements
- **Defensive programming** – anticipate and handle edge cases
- **Operator overloading** – `+` concatenates strings, adds numbers
- **Program flexibility** – works with or without user input