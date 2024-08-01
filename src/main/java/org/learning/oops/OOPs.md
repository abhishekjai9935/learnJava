
# OOPs Concepts In Java 

## OOPs Overview

* OOP means Object oriented Programming
* Here object means real world entity like Car, ATM, Bike etc.
  * Why Object? => Human always wanted to keep the programming writing style similar to real-world.
* What make OOPs different from Procedural Programming?
  * Program is divided into objects rather than functions
  * Object provides data hiding, gives importance to data
  * Overloading is possible
  * Inheritance is possible
  * Code Re-usability is present
  * e.g: Java, C#, Python, C++ etc
  
## Objects and Classes

* Objects has 2 things:
  * Properties or State
  * Behaviour or Function

    For example:
  * Dog is an object because:
    * Properties like: Age, colour, breed etc.
    * Behaviour like: Bark, sleep, eat etc.

* Class is a blueprint/skeleton of an object
  * To create an object, class is required
  * So, class provides the template or blueprint form which an object can be created.
  * From one class, we can create multiple objects.
  * To create a class, use key word class

    E.g:
```
public class Student {

 //These three are data variables
  int age;
  string name;
  string address;

  //These tow are data methods to access data
  updateAddress() {

  }
  
  getAge() {
  return age;
  }
```

Now lets create an  object of type student:

> Student enggStudent = new Student();


## Pillar of OOPs

### 1. Data Abstraction
* It hides the internal implementation and shows only essential functionality to the user
* It can be achieved through interface and abstract classes
* Examples:
  * Car: we only able to see the BRAKE pedal and if we press it Car speed will reduced But hwo? That is **ABSTRACTED** from us.
  * Cellphone: How call is made that is **ABSTRACTED** to us.
* Advantages of Abstraction:
  * It increases security and confidentiality
```
interface Car {
  public applyBrake();
  public incSpeed();
  public handBrake();
}

```
```
class CarImpl implements Car {

  public applyBrake() {
  
     //step1
     //step2
     //step3
  
  }

}
``` 
> So when user calls applyBrake(), internally it will invoke step1, step2 .. but all that is hidden from the user but ultimately car stops.

> So this improves security as user is not aware of the internal functionality and only knows about the result.

### 2. Data Encapsulation

* Encapsulation bundles the data and code working on that data in a single unit.
* This is also known as DATA-HIDING.
* Steps to achieve encapsulation
  * Declare variable of a class as private
  * Provide public getters and setters for modify and view the values of variables.
* Advantages of encapsulation:
  * Loosely coupled code
  * Better access control and security

DEMO:
```
class Dog {
  private String Dog;
  
  String getColour() {
    return this.color;
  }
  
  void setColour(String colour) {
    this.colour = colour;
  }
}  
```

> Dog lob = new Dog();
> lob.setColour("black");
> lob.getColour(); // will return black

> So, here we haven't given the access of the variable colour of class dog. Instead, we did it with the help of the getter and setter which in turn have the access of variable.


### 3. Inheritance

* Capability of a class to inherit properties from their parent class.
* It can inherit both functions and variables so that we don't have to write them again in child class.
* Can be achieved using extends keyword or through interface.
* Types of inheritance:
  * Single inheritance
  * Multilevel inheritance
  * Hierarchical inheritance
  * Multiple Inheritance
* Advantage of Inheritance
  * Code reusability
  * We can achieve polymorphism using inheritance


### 4. Polymorphism

* Poly means `many` and morphism means `form`
* A same method, behaves differently in different situation
* Example:
  * A person can be father, husband, employee etc
  * Water can be liquid, solid or gas
  
* Type of polymorphism
  * Compile Time / static polymorphism / method overloading
  * Runtime / Dynamic polymorphism / Method overriding


* Is-a relationship
  * Achieved through inheritance
  * Example: Dog is-a animal

* Has-a relationship
  * Whenever an object is used in other class,it's called Has-a relationship
  * Relationship could be one-to-one, one-to-many, many-to-many
  * Example:
    * School has students
    * Bike has engine
    * School has classes
* Association: relationship between 2 different objects
  * Aggregation: Both objects can survive individually, means ending of one object will not end another object
  * Composition: Ending of one object will end another object












##### Reference
* https://drive.google.com/file/d/1vJr_-CJ7xCrikk0HrJjA0TITHALzRqa-/view
* 