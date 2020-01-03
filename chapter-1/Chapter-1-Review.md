# Breaking the Surface

## How does it work ?

Java is written within a **Source** file. The source for us would be the file that holds the `.java` extension. All code is **compiled** before being ran. If there are any errors the compiling will stop. The **output** is the compiled code in a new document that has been codded into Java bytecode.

### What do you mean by "source"?

????

## What's the code structure in Java ?

The structuring of Java code starts with a Source file. Inside of the file falls a **class**. With each class, there's **methods** and within methods are **statements**. A class represent's a piece of the program, as for method's they are what give action/instructions. Each statement is what or how the method is made up. (what instructions are needed for this method?)

```java
public class Dog{// declaration of class

  void bark(){ //declaration of method

      System.out.println('BARK!') //method statement

  }
}
```

## What's the importance of a class & main() method ?

With Java every application needs atleast one class and one main() method. When running the program the JVM(Java Virtual Machine) is told to load the class and start executing the main() method, keep running "til all code in main is finished". If there is no main() the code can not be run.

```java

    public class MyFirstTimeUsingJava {
        //  the way a main() is structured
        public static void main (String[] args){
            System.out.println("You're Pretty Good");
            System.out.println("Greatest Of All!");
        }
    }

```

## How to loop with Java

Java has three standard looping constructs: while, do-while and for. When looping, the conditional test must be a Boolean (something has to be True or False). The thing you want to loop is found in the block {}. If the test runs False, the block will not be run.

```java
    int x = 4;

    while(x > 3){ //the loop's conditional

        //the block space for looping
        x = x - 1

    }
```

## Conditional Branching

An **if-statement's** conditional test follows the same as a while loop but instead of " while(True) " it'd be " if(True) ". You can add an **else** condition to provide more context.

```java

class ifTest {
    public static void main (String[] args){
        String red = red;
        String yellow = yellow;

        if (red == yellow){

            System.out.println('how did this happen ?');

        } else {
            System.out.println('Ya did it!');
        }
    }
}
```

## Side Notes

Lets break down the individual parts of this code.

````java
public class MyFirstTimeUsingJava {

    public static void main (String[] args){
        System.out.println("You're Pretty Good");
        System.out.println("Greatest Of All!");
    }
}
    ```
````

### Class

- `Public` -
  Everyone Can access it
- `Class` -
  Stating it's a class
- `MyFirstTimeUsingJava` -
  The title of the class

### Method

- `void` -
  the return type void means there's no return value
- `main` -
  the name of the method
- `(String[] args)` -
  arguments to the method, the method must be given an array of Strings and the title is args.

### Statement

- `System.out.println()` -
  the 'out' says to print the standard output (defaults to command-line) of the string inside of the parenthesis.
