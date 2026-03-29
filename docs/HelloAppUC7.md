## UC7: Display "Hello" using String.join() Method

### Description
Uses String.join() to efficiently concatenate multiple names
with a delimiter. Defaults to "Hello, World!" when no args given.

### Disadvantages of UC6
UC6 required multiple steps: loop + append + substring cleanup.
UC7 eliminates all of that with one built-in method call.

### Preconditions
- App is launched with zero or more command-line arguments

### Main Flow
1. User runs: `java HelloApp Alice Bob Charlie` or `java HelloApp`
2. If `args.length == 0` → print `Hello, World!`
3. If args exist → use `String.join(", ", args)`
4. Print `Hello, <names>!`
5. App terminates

### Postconditions
- Greeting shown with all names or defaults to "World"

### Example Output
| Input                             | Output                        |
|-----------------------------------|-------------------------------|
| `java HelloApp Alice Bob Charlie` | `Hello, Alice, Bob, Charlie!` |
| `java HelloApp Alice`             | `Hello, Alice!`               |
| `java HelloApp`                   | `Hello, World!`               |

### Key Code
String names = String.join(", ", args);

### Concepts Learned
- **String.join()** – static method, joins strings with delimiter
- **Static utility methods** – called on class, no object needed
- **Method overloading** – works with arrays and collections
- **No trailing delimiter** – String.join() handles placement
- **Readability** – intent is clear in one line vs loop + cleanup