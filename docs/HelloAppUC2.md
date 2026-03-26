## UC2: Display "Hello" with Command-Line Argument

### Description
The app accepts a name as a command-line argument and displays a personalized greeting.

### Disadvantages of UC1
UC1 only displays a static message — it cannot personalize output based on user input.

### Preconditions
- App is launched with a command-line argument containing a name

### Main Flow
1. User runs: `java HelloApp John`
2. App reads the name from `args[0]`
3. App prints `Hello, John!` to the console
4. App terminates

### Postconditions
- Personalized greeting is displayed

### Example Output
| Input                | Output           |
|----------------------|------------------|
| `java HelloApp Alice`| `Hello, Alice!`  |
| `java HelloApp`      | `Hello, World!`  |

### Concepts Learned
- **Command-line arguments** – passed via `String[] args` in main method
- **Array length** – `args.length` checks how many args were passed
- **Array indexing** – zero-indexed; first arg is `args[0]`
- **String concatenation** – `+` operator joins strings
- **Conditional logic** – `if-else` handles presence/absence of args
- **Default values** – fallback to `Hello, World!` when no arg given
- **Error prevention** – always check `args.length` before `args[0]`