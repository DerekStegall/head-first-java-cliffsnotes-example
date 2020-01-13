# How Objects Behave

## Method Behaviour ?

Methods behave differently based on the values of the variables set in place. A method uses parameters and a caller `()` passes arguments. If the method uses a parameter you must pass it something of the appropiate type. Let's discuss more.

In the code snippet below, an argument was given to the method call of reference object `d`.

```java
    Dog d = new Dog();
    d.bark(3)
```

- `d.bark(3)` - In this line, the `bark` method was called and the bit representing the int value 3 would be the argument passed into the caller `()`.

In the example below, you'll see how a parameter is set up.

```java

    void bark(int numOfBarks){
        while(numOfBarks > 0){
            System.out.println('ruff');
            numOfBarks = numOfBarks - 1;
        }
    }

```

- `void bark(int numOfBarks)` - This line shows the parameter `numOfBarks` of type `int` . Your argument passed in must follow the appropriate type.

Method's can also return a value. Instead of making it `void`. Ex:

```java
    int giveSecret{
        return 68
    }
```

The return value must be of the appropiate type as well. In the snippet above you see the method `giveSecret` returns the value `68` which is the return value of the type `int`.

- A method with 2 parameters needs 2 arguments. The given arguments fall in the same order as the parameters.`(String param1, Int param2)` --> `(arg1, arg2)`

## Java pass-by-value ?

To pass-by-value is to pass-by-**copy**.

The value passed in from arguments are copies of the original. Meaning that changing the parameter value inside the method will not affect the original value.

## Getters and Setters ?

**Getters** & **Setters** can be also known as Accessors & Mutators.

- `Getters` -
  Gets a specific value & returns it
  ```java
    String getBrand(){
        return brand;
    }
  ```
- `Setters` - Takes an argrument value and sets it as the value of the instance variable.

  ```java
      void setBrand(String aBrand){
          brand = aBrand;
      }
  ```

## What is Encapsulation ?

Encapsulation is what keeps your data private or hidden. Properly encapsulating is to mark instance variables `private` but _getters_ & _setters_ `public`.

```java
    private int size;

    public int getSize(){
        return size
    }
```

## Objects within an array ?

Creating an array object is easy but using each item within the array as an object takes another step.

When an array object is created, to use each array item as an object you'll need to index. Using indexing you can then assign each item as a new object.

```java
    Dog [] pets; // Dog Array Object
    pets = new Dog[7]; //Array Object of length 7

    pets[0] = new Dog(); //Declaring item one of array pets a Dog object
    pets[1] = new Dog();
```
