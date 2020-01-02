# Breaking the Surface

## The Way It Works

Source -> Compiler -> Output -> Virtual Machines

- Source -
  The Source document is where all code is written.

- Compiler -
  The Source is compiled. The compiler checks for any errors and will not run until they've been fixed.

- Output -
  The output is the creation of a new document that is then codded into Java bytecode

- Virtual Machines -
  The machine that is running the Java code.

## Code structure in Java

Within the Source file:

- The Class is placed in the Source file

  ```java
  public class Dog{

  }
  ```

- Methods are placed in the Class

  ```java

  public class Dog{
      void bark(){

      }
  }

  ```

- Statements are placed in Methods

  ```java
  public class Dog{

    void bark(){

        statement1;
        statement2;

    }
  }
  ```

## Writing a class with a main

- Every Java application needs atleast 1 Class & 1 Main method.
  (one main() per application)

- In a Java program you will need a main method to run the code. The program starts running at the Class which holds the main() function.

- When running the program it's telling the JVM (Java Virtual Machine) to load the class and start executing the main() method, keep running "til all code in main is finished"

## Looping with Java

The three standard looping constructs in Java are While, Do-while and For.

- The conditional test of the loop must be a Boolean to work. Something has to be either True or False

- The thing you want to loop falls between the block {}.

- If the test runs as False, the loop block will not run.
