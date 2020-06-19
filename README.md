# java-prime-calculator
Bruteforce Prime Number calculator in Java

## Setup
This was build on OpenJDK 11.

Run the following on bash or the batch on Windows, this will build the application, run tests and run the application
```bash
./gradlew run
```

There will be some output along these lines:
```bash
USAGE
min max [all]

REQUIRED ARGUMENTS
min - Lower bounds value to test
max - Upper bounds value to test

OPTIONAL ARGUMENTS
all - display all results once calculation completed
```

To run the application using gradle, using `./gradlew run --args="2 5 all"` will get determine all prime numbers between
2 and 5, and display whether each number is. Omitting the third argument will only display the output for the prime
numbers.
