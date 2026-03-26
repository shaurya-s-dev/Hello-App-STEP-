## UC5: Display "Hello" with Enhanced For Loop

### Description
Uses an enhanced for loop to iterate through multiple names.
Defaults to "Hello, World!" when no arguments are given.

### Disadvantages of UC4
UC4 used String.join() which hides the iteration logic.
UC5 makes the loop explicit using an enhanced for loop,
which is cleaner than a traditional indexed for loop.

### Preconditions
- App is launched with zero or more command-line arguments

### Main Flow
1. User runs: `java HelloApp Alice Bob Charlie` or `java HelloApp`
2. If `args.length == 0` → print `Hello, World!`
3. If args exist → iterate with enhanced for loop
4. Build comma-separated names using StringBuilder
5. Print `Hello, <names>!`
6. App terminates

### Postconditions
- Greeting shown with all names or defaults to "World"

### Example Output
| Input                             | Output                        |
|-----------------------------------|-------------------------------|
| `java HelloApp Alice Bob Charlie` | `Hello, Alice, Bob, Charlie!` |
| `java HelloApp Alice`             | `Hello, Alice!`               |
| `java HelloApp`                   | `Hello, World!`               |

### Concepts Learned
- **Enhanced for loop** – `for (String name : args)` cleaner iteration
- **StringBuilder** – efficient string building without multiple objects
- **Conditional delimiter** – avoids trailing commas
- **Default handling** – graceful behavior when no input given