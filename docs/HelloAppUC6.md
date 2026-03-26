## UC6: Display "Hello" using substring to Remove Trailing Delimiter

### Description
Uses enhanced for loop with substring() to clean up trailing
delimiter after building the names string.

### Disadvantages of UC5
UC5 used a conditional check inside the loop to avoid trailing
commas. UC6 is cleaner — always append ", " after each name,
then remove the last two characters with substring().

### Preconditions
- App is launched with zero or more command-line arguments

### Main Flow
1. User runs: `java HelloApp Alice Bob Charlie` or `java HelloApp`
2. If `args.length == 0` → print `Hello, World!`
3. If args exist → iterate with enhanced for loop
4. Append each name followed by `", "` to StringBuilder
5. Use `substring(0, length - 2)` to remove trailing `", "`
6. Print `Hello, <names>!`
7. App terminates

### Postconditions
- Greeting shown with all names or defaults to "World"

### Example Output
| Input                             | Output                        |
|-----------------------------------|-------------------------------|
| `java HelloApp Alice Bob Charlie` | `Hello, Alice, Bob, Charlie!` |
| `java HelloApp Alice`             | `Hello, Alice!`               |
| `java HelloApp`                   | `Hello, World!`               |

### Key Code
nameBuilder.substring(0, nameBuilder.length() - 2)

### Concepts Learned
- **substring()** – extracts portion of string by start/end index
- **String immutability** – substring() returns new string, doesn't modify original
- **StringBuilder efficiency** – mutable, avoids multiple string objects
- **Delimiter handling** – append consistently, clean up after loop
- **Conditional cleanup** – always check length() > 0 before substring()