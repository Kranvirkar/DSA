# DSA-1

DSA-1 is a Java 17 and Spring Boot 3.1 Maven project used for practicing data structures, algorithms, and interview-style problems.

The code is organized by topic so each package focuses on a specific pattern or problem set. Most classes are small standalone implementations that can be run, tested, or reused while studying a topic.

## Project Setup

- Language: Java 17
- Build tool: Maven
- Framework: Spring Boot 3.1
- Test framework: Spring Boot Test

## Topics Covered

- Arrays and array utilities
- Prefix sums and prefix subarray problems
- Two pointer techniques
- Searching and sorting
- Hashing and frequency-based problems
- Recursion
- Stack, queue, and linked list practice
- Trees and binary search trees
- Bitwise operations
- Strings and Roman numeral problems
- Threading and concurrency examples
- Design pattern examples
- Miscellaneous practice classes and contest problems

## Package Structure

- com.scaler.dsa1.array - array operations and subarray-style problems
- com.scaler.dsa1.prefixsum - prefix sum and range query practice
- com.scaler.dsa1.prefixSubarray - prefix and suffix based utilities
- com.scaler.dsa1.twoPointer - two pointer patterns
- com.scaler.dsa1.hashing - hashing and frequency problems
- com.scaler.dsa1.tree - binary tree traversal and tree utilities
- com.scaler.dsa1.binarysearchtree - binary search tree practice
- com.scaler.dsa1.searching - searching algorithms
- com.scaler.dsa1.sort - sorting algorithms
- com.scaler.dsa1.stack - stack problems
- com.scaler.dsa1.Queue - queue-related examples
- com.scaler.dsa1.string - string algorithms
- com.scaler.dsa1.recursion - recursion exercises
- com.scaler.dsa1.bitwise - bit manipulation practice
- com.scaler.dsa1.thread - concurrency examples
- com.scaler.dsa1.designpattern - design pattern samples

## How To Run

1. Build the project with mvnw.cmd clean test
2. Run the application with mvnw.cmd spring-boot:run
3. If you are on Linux or macOS, use ./mvnw instead of mvnw.cmd

## Notes

- The main application entry point is src/main/java/com/scaler/dsa1/Dsa1Application.java.
- The repository currently contains many independent practice classes rather than a single production app.
- You can add new problems by placing them in the most relevant topic package.

## Example Problem Areas

- Array rotation and reversal
- Missing and duplicate element detection
- Maximum subarray and longest subarray problems
- Common elements and distinct count problems
- Tree traversal and height calculation
- Two sum and three sum style problems

## Testing

The project includes a default Spring Boot test class at src/test/java/com/scaler/dsa1/Dsa1ApplicationTests.java.

## Contributing

If you add a new algorithm, keep the class name descriptive and place it in the most relevant package so the practice topics stay easy to browse.


