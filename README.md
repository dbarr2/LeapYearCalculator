# Leap Year Calculator in Java

The Leap Year Calculator is a Java application designed to determine whether a specific year is a leap year. A leap year is defined as a year that is divisible by 4 but not by 100, except for years that are divisible by 400, which are also considered leap years. This program utilizes a single method to return true if the input year meets these criteria, making it an excellent tool for understanding conditional logic and modular arithmetic in Java.

## Overview

Leap years add a day to February to keep our calendar in alignment with the Earth's revolutions around the Sun. It takes the Earth approximately 365.25 days to complete its orbit around the Sun, hence the need for an extra day every four years. This program applies the rules for identifying leap years, showcasing basic Java programming concepts such as methods, conditionals, and boolean logic.

## Features

- **Leap Year Determination**: Efficiently checks and identifies leap years.
- **Simple and Precise Logic**: Implements the leap year rules using straightforward conditional statements.
- **Boolean Return Value**: The method returns `true` if the year is a leap year, and `false` otherwise.

## Implementation Details

The leap year calculation method adheres to the following logic:
- A year is a leap year if it is divisible by 4.
- However, if the year is also divisible by 100, it is not a leap year, unless...
- The year is also divisible by 400, in which case it is a leap year.