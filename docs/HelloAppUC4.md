## UC4: Display "Hello" with Multiple Command-Line Arguments

### Description
Accepts multiple names as arguments and greets all of them in one line.
Defaults to "World" if no arguments are given.

### Disadvantages of UC3
UC3 only handles one name. Running the app multiple times to greet
multiple people is inefficient.

### Preconditions
- App is launched with zero or more command-line arguments

### Main Flow
1. User runs: `java HelloApp Alice Bob Charlie` or `java HelloApp`
2. App checks if `args.length > 0`
3. If yes → join all names with `", "` using `String.join()`
4. If no → default to `"World"`
5. App prints `Hello, <names>!`
6. App terminates

### Postconditions
- Single greeting shown with all names comma-separated, or "World"

### Example Output
| Input                          | Output                        |
|-------------------------------|-------------------------------|
| `java HelloApp Alice Bob Charlie` | `Hello, Alice, Bob, Charlie!` |
| `java HelloApp John`          | `Hello, John!`                |
| `java HelloApp`               | `Hello, World!`               |

### Key Code
String name = (args.length > 0) ? String.join(", ", args) : "World";

### Concepts Learned
- **Array handling** – process all elements of `args[]`
- **String.join()** – combines array elements with a delimiter
- **For loop** – iterate through args with index
- **StringBuilder** – efficiently build strings in a loop
- **Scaling input** – from single to multiple arguments