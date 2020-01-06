# A Trip to Objectville

## How can objects change your life ?

### OO(Object-Oriented) Programming

**OO Programming** provides less complexity when wanting a new feature. Changing code can cause bugs and difficulties which isn't something you want to deal with. Instead of changing old tested and running code, you can create a new class or method to help you achieve your desired goal.

- When touching old code you'll need to retest and recompile. A lot of code could be affected by these changes.

- Adding a new attribute that can bring you to your desired results is easier with Object-Oriented Programming. You wont touch the tested and working code and run no risk of breaking code.

### Inheritence ?

In Java you can create a **Superclass** and **Subclasses**. Instead of creating multiple classes with the same methods, you can create a superclass for each subclass to inherit from. The superclasss holds all the data the subclasses want.

- `Superclass` -
  The original class, all the rules(methods) laid out for this class.

- `Subclass` -
  The inheritance of the Superclass, this class inherits all rules(methods) of it's Superclass.

With inheritance there are special cases where a subclass may need more info or needs to do something different. **Overriding** an inherited method is possible.

- `Overriding` -
  The redifining of an inherited method.

## Purpose of a class ?

A class is not an object but it's used to construct them. The class is what tells how to make that object. (think of classes as blueprints)

When building the class that defines your object, the things found inside of that class type would be the things the object **knows** and the things the object **does**.

The things an object knows about itself would be it's **instance variables**(state). Methods are the things an object does.

```java

    class MyObject {

            String name; //Instance Variable(state) (What it knows)

            void dostuff(){ //Method (What it does)
                System.out.print("I did it.");
            }

    }

```

## How Objects Work ?

When creating objects, you'll need two classes. The class that defines that object and the one that tests it.

Inside of the tester class you place your main() method. Inside of the main() is where you will test, it's only job is to try out the method's and variables of the new object. When creating your tester class the title should be **'(yourClass)TestDrive'**.

- The main() method is also used to launch/start the application

For Example with the class MyObject, to test it we would:

```java


    class MyObjectTestDrive {

        public static void main(String[] args){

             MyObject test = new MyObject(); //Object

            test.name = 'Object'; //Instance Object

            test.dostuff();
        }

    }

```
