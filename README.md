# HelloApp

Hello App starts with Hello World, progresses to displaying a user name, then names from command-line args and standard input. It then manages names in a collection with list/remove options, refactors into methods and classes, adds persistence across runs, and finally displays names in banner format.

## Use Case Roadmap

| UC  | Description |
|-----|-------------|
| UC1 | Print a basic greeting in the console |
| UC2 | Accept one name via command-line input and greet that user |
| UC3 | Support optional argument handling with a default greeting path |
| UC4 | Handle multiple command-line names in one execution |
| UC5 | Read a single name from standard input |
| UC6 | Read and process multiple names from standard input |
| UC7 | Store entered names in memory and list them on request |
| UC8 | Add removal support for stored names |
| UC9 | Extract input-processing logic into dedicated methods |
| UC10 | Move name-management responsibilities into a separate class |
| UC11 | Persist names to storage and reload them across runs |
| UC12 | Render greeting text in banner-style output for enhanced display |

## How to Run

### Prerequisites
- Java JDK 11 or later
- Maven 3.6+

### Build
```bash
mvn clean install
```

### Run
```bash
mvn exec:java -Dexec.mainClass="HelloApp"
```

### Run Tests
```bash
mvn test
```

## Project Structure
```
HelloApp/
├── pom.xml
├── README.md
├── .gitignore
├── src/
│   ├── main/
│   │   └── java/
│   │       └── HelloApp.java
│   └── test/
│       └── java/
└── docs/
    └── HelloAppUC.md
```
