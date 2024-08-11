# Methods in JAVA

## What is method?
- Method is used to perform a certain task.
- Collection of instruction that performs a specific task.
- It can be used to bring the code readability and re-usability. For e.g:

```
 public class Calculation {

    public int sum(int val1, int val2) {
        return val1 + val2;
    }
    
    public int getPriceOfPen(){
        int capPrice = 2;
        int penBodyPrice = 5;
        int totalPenPrice = sum(capPrice, penBodyPrice);
        return totalPenPrice;
    }
 }
```
## How to declare method?

```
<Access Specifier> <Return type> <Method Name> <Method Arguments>

public int sum (int a, int b) throws Exception {
  //method body
}
```

## Access Specifiers

- Defines accessibility of a method i.e. who can use the method.
- There are 4 types of access specifiers in Java methods:-
1. Public: can be access through any class in any package
2. Private: can be accessed by methods only int hte same class.
3. Protected: can be access by other classes in same package or other sub-classes in different package.
4. Default: It can only be accessed by classes in same package.
If we do not mention anything, then default access specifier is used by Java.


## Return Type
- It tells what type the method will return after computation. If the method don't return anything, void return type is used.
- Use class name or primitive data types as return type of the method.

## Method Name:

- It should be verb to define the action supposed by it.
- Camel Case convention.

## Method Parameters

- It's a list of variables that will be used in the method.
- Parameter list can be blank too.

## Method Body
- Method body get finished when you call 'return' in mid
- Get finished when reached to the end.
- We can also stop method by 'return' even for void return type

## Type of Methods

### System Defined Methods
- Methods which are already defined and ready to use in Java
  - e.g: Math.sqrt()

### User Defined Methods
- Methods which the programmer create based upon the program necessity

### Overloaded Method
- More than one method with same name is created in same class
- Overloaded Method only gets differentiated based on arguments so name should be same, arguments should be different and return type is not even considered.

### Overridden Method
- Subclass/child class has the same method as the parent class.

### Static Methods
- These methods are associated with the class
- Can be called just with class name
- Static methods can not access **Non static instances variables** and methods
- static methods **cannot be overridden**

So, when to declare method static:
- Methods which do not modify the state of the object 
- Utility method which do not use any instance variable and compute only on arguments.
- Example: factory design pattern

### Final Methods
- Final methods cannot be overridden in Java. It is so because final methods means its implementation cannot be changed. If child class cannot change its implementation then o use of overridden.

### Abstract Method
- It is defined only in abstract class.
- Only method declaration is done.
- Its implementation is done in child classes

### Variable Arguments (Varargs)

- Variable Number of inputs in the parameter
- Only one variable argument can be present in the method.
- It should be the last argument in the list.
- Used when we don't know the number of arguments
- For eg:
```
public class Calculation {
  static int carPrice = 40;
  
  public int sum(int a, int ...variable) {
    int output = 0;
    for(int var: variable) {
        output = output + var;
    }
    return output;
  }
}
```

# Constructors in Java

## What is constructor?
- It is used to create an instance/initialize the instance variable
- It's similar to method except:
  - Name: constructor name is same as class name
  - Return Type: Constructor do not have any return type
  - Constructor cannot be static or final or abstract, synchronized.
- New keyword tells Java for call constructor
- Why constructor name is same as of class name?
  - Constructor name is always same as class name because it is easy for identify and there is no return type because implicitly java adds class as return type.

- Why constructor do not have return type?
  - There can be methods with same name and even class as return type but they cannot be called constructors as they do not obey the rules of constructor i.e. same name without return type.

- Why constructors cannot be final?
  - Constructors are different from usual methods and cannot be inherited. So it doesn't make sense to make them final because final is used to prevent overriding and if constructors cannot be inherited then there is no requirement for final.

- Why constructor cannot be abstract?
  - Since for abstract method, the responsibility of implementation is of child class. But constructors can't even be inherited so no point of making them abstract.

- Why constructor cannot be static?
  - Since static methods can only access static variables and other static methods, so it won't be able to initialise teh instance variable. We also won't be able to use constructor chaining and call super()
- Can we define constructor in interface?
  - No, because we cannot create object so no point of constructor.

## Type of Constructors:

1. Default Constructor
   - When we do not define a constructor java internally provides a constructor which is known as default constructor. Default constructor also set default values for all the instance variables. it is added only we do not define a constructor.
2. No Argument Constructor
   - A constructor that does not take any argument. It is very similar to default constructor but we are defining instead of java.
3. Parameterized Constructors
   - It takes arguments and assign the instance variables with those parameters. We can initialize one or multiple instance variables using a parameterised constructor. For the variables where we don't provide any argument, they'll be instantiated with default values.
4. Constructor Overload
   - We can create multiple constructor with different parameters.
5. Private Constructor
   - We can create a private constructor and no one outside the class will be able to call the constructor. This is used usually in singleton design pattern. To create an object of a class having private constructor, we can create another static method for create the object and then call that method using class name.
   
## Constructor Chaining
- It means that we can call one constructor in other constructor. This is done using this() and super(). To chain a constructor withing the same class, this() is used.
  - For e.g:
```
public class Calculation {
  String name;
  int empID:
  
  Calculation() {
    this(10);
  }
  
  Calculation(int empId){
    this("sj", empId);
  }
  
  Calculation(String name, int empID) {
    this.name = name;
    this.empId = empId;
  }
}
```
```
Here, we called other constructor within a constructor using this()
```

- Using super()
  - The constructor of a child class always invokes the constructor of parent class first and then invokes its won constructor.
  - This is done using super(), so if we explicitly don't add super() in child constructor then Java adds it internally.

- If the parent class has a parameterised constructor, then we will have to mandatorily pass an argument to super() to call the parent class's parameterised constructor.
