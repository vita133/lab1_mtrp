# Quadratic Equation Solver

## Description

This is a Kotlin program that solves quadratic equations. It can be used in both interactive and non-interactive modes.

In the interactive mode, the program prompts the user to enter the coefficients of a quadratic equation and displays the resulting equation along with its roots.

In the non-interactive mode, the program takes the coefficients as command line arguments and displays the roots.

## Installation

- Install Java if necessary [_here_](https://www.java.com/en/download/manual.jsp?locale=en)

- Download the file kotlin compiler from the Kotlin download page and save it to your desktop. [_here_](https://github.com/JetBrains/kotlin/releases/download/v1.8.10/kotlin-compiler-1.8.10.zip)

- Extract the zip file and add the kotlinc\bin directory to your command line path

- Restart your terminal program, and check that you can start Kotlin by saying kotlinc.

```cmd
kotlinc
```

- Clone the project on your computer.

```cmd
git clone https://github.com/vita133/lab1_mtrp.git
cd ./lab1_mtrp
```

- Open the command prompt (CMD) and run the following command:

```cmd
kotlinc *.kt -include-runtime -d quadratic-equation-solver-cli.jar
```

## Run non-interactive mode

```cmd
java -jar Main.kt test_valid.txt
```

## Run interactive mode

```cmd
java -jar Main.kt test_valid.txt
```

## File format

In non-interactive mode, the program accepts one argument - the path to a file with equation coefficients. The file contains 3 numbers: a, b, c separated by a single space. The decimal symbol expected is a dot. After the last coefficient (c), there should be a new line character (\n), and the file ends there.

## [Link on Revert Commit](https://github.com/vita133/lab1_mtrp/commit/1d480e264541189bca77d8fdac19f45b513c7e28)
