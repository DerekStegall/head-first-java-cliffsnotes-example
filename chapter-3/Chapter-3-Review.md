# Know Your Variables

## Declaring a Variable ?

**Variables** must have a type and name.

(Think of Variables as cups, A container that holds something)

For example:

```java
    int count;
```

- `int` -
  Being the type.
- `count` -
  Would be the name.

## What are Primitives ?

**Primitives** hold values like: int, boolean, floating points ...etc . They also have 4 special integer values.

The Four Integer Primitives:

- Long
- Int
- Short
- Byte

## Naming ? What can We Name It ?

When naming a variable, class or method there are a few rules to follow . The rules set in place are ones set to keep you safe.

- The naming must start with a letter, underscore(\_), or dollar sign(\$). It can not start with a number.
- Once you're pass the first character of the name, you are allowed to place numbers throughout it.
- The name can be whatever you want, while following these rules. Unless it's a **Java Keyword**.

### Java Keywords

Java Keywords(Reserved words) are certain words & things that the compiler recognizes. Some keywords we've discussed would be your primitive words.

## What are Reference Variables ?

**Reference Variables** hold bits that represent a way to access an object.

(Represents one and only one object)

Use the **(.)** dot operator to allow reference variables to use the methods in place for that object.

For Example:

```java
    myDog.bark();
```

When using the dot operator on reference variables, think of it as pressing a button on a remote to control that object.

## What's The Flow of Declaration, Creation and Assignment ?

This object has already been **declared**, **created** and **assigned**. Lets break it down.

```java

    Dog myDog = new Dog();

```

- `Dog myDog` - Is the point in time when the object was Declared

- `new Dog()` - This statement is where the Dog object was created

- `=` - Using one equal allowed **new Dog()** to be assigned to the variable **myDog**
