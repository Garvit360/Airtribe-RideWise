# RideWise

RideWise is a console-based Java ride-sharing system for the Airtribe LLD assignment. It is intentionally kept as a plain IntelliJ Java project, with no Gradle/Maven wrapper or build files.

## Project Type

- IDE: IntelliJ IDEA Java module
- Build tool: none
- Source root: `src`
- Main package: `com.airtribe.ridewise`
- Entry points:
  - `com.airtribe.ridewise.Main` - interactive console menu
  - `com.airtribe.ridewise.Demo` - automated feature walkthrough

## Run

From the project root:

```bash
javac -d out $(find src -name '*.java')
java -cp out com.airtribe.ridewise.Main
```

Automated demo:

```bash
java -cp out com.airtribe.ridewise.Demo
```

In IntelliJ, open this folder as a project and run `Main` or `Demo` from the gutter.

## Structure

```text
src/com/airtribe/ridewise/
├── Main.java
├── Demo.java
├── contract/
│   └── Searchable.java
├── exception/
├── model/
├── service/
├── strategy/
└── util/

docs/
├── Requirements.md
├── Class_Model.md
├── Object_Relationships.md
├── SOLID_Reflection.md
└── Remaining_And_Improvements.md
```

## Implemented

- Rider registration and listing
- Driver registration, availability tracking, and listing
- Ride request, assignment, completion, and cancellation
- Ride status lifecycle: `REQUESTED`, `ASSIGNED`, `COMPLETED`, `CANCELLED`
- Driver matching strategies: nearest driver and least active driver
- Fare calculation strategies: default fare and peak-hour fare
- Search across riders, drivers, and rides
- Fare receipt generation
- In-memory generic data store

## Notes

The original Gradle layout was migrated from `src/main/java/org/example` to `src/com/airtribe/ridewise`. Package names now match the assignment-style folder structure. The project compiles and runs directly with `javac`.
