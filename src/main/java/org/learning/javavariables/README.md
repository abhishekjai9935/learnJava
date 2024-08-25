# Java Variables (Primitive)

## What is a variable?

- It is a container which can hold a value.
- How can we declare it?
  - \<DataType\>&nbsp; \<variableName\>  = \<value> 
  - e.g: boolean xyz = true

- Java is **static typed** language i.e it is mandatory to define the dataype of a variable.
- Java is a **strongly typed** language i.e there is a restriction on what value can be assigned to a variable.


## Variable Naming Convention

- Variable name is case-sensitive
- Variable name can be any legal identifier means can contain unicode letters and digits.
- Variable name can start with $, _ and letter.
- Variable name cannot be Java reserved keyword like "new", "class", "while"
- Variable should be in camelCase
- For constant, variable name should be defined in capital letters

## Types of Variables

### 1. Primitive Type
> 1. char
> 2. byte
> 3. short
> 4. int
> 5. long
> 6. float
> 7. double
> 8. boolean
### 2. Non-Primitive Type
> - class
> - interface
> - array
> - string
> - enum

### 1. char

- 2 bytes i.e 16 bits
- character representation of ASCII values
- Range: 0 to 2<sup>35</sup> - 1 (= 65535)  i.e. '\u0000' to '\uffff'
- Default value is '\u0000' i.e null

### 2. byte

- 1 byte i.e. 8 bits
- Signed 2s complement
- Range: -128 to 127
- default value is 0

> The first bit defines the sign of the number

> `1 0 1 1 0 0 1 0`


### 3. short

- 2 bytes i.e 16 bits
- signed 2s complement
- Range: -32768 to 32767
- default value is 0


### 4. int
- 4 bytes i.e. 32 bits
- Range: -2<sup>31</sup> to 2<sup>31</sup> - 1



### 5. long
- 8 bytes i.e. 64 bits
- signed 2s complement
- Range -2<sup>63</sup> to 2<sup>63</sup> - 1
- default value is 0
   
### 6. boolean
- 1 bit
- value : true or false
- default value is false

## Types of conversion:

### 1. Widening | Automatic conversion

- Automatic conversion when we go from lower data type to higher dataType
```mermaid
graph TD;
    byte-->short;
    short-->int;
    int-->long;
    


```

> e.g: 
> 
> `int var = 10;`
> 
> `long varLong = var;` // Automatically int will be converted to long


### 2. Narrowing/Downcasting/Explicit Conversion
- It is opposite of widening i.e. going from higher datatype to lower datatype
- In this case downcasting doesn't happen automatically. So we have to manually do it.
> e.g:
> int integerVariable = 10
> byte byteVariable = (byte) integerVariable;

> If we are downcasting beyond rang ethen it'll again reset to -128 and it goes on.
> So if integerVariable value is 128 then byteVariable's value will be -128 (Next after 127 is -128 for byte range)
> If it's 148 then byteVariable's value will be -108


!["downcastingCompileTimeError"](screenshots/downcastingCompileTimeError.png)

### 3. Promoting during expression
- This happens internally during expression
- byte and short promotes to int
- e.g: 
```
byte a = 1;
byte b = 127;
byte sum = a + b; //won't work since the value will be converted to int by default 
This is known as implicit casting.

But we can do like this:
byte sum = (byte) (a+b);
This is known as explicit casting.

```

### Kind of Variables

#### Member / Instance Variable
- These are the variables which are associated to instance of an object.
- Whenever an object is created for that class these set of variables get initiated and each object has it's own copy.

#### Local Variable
- These variables are the variables that are defined inside a method.
- If the method finishes , it gets destroyed.

#### Static / Class variable
- These variables are associated with class directly.
- They are only created once for the class and are shared among all objects.


#### Method Parameters
- These are the variables that are passed for a method.

#### Constructor Parameters
- These are teh variables that are passed for a constructor.


### Fractional Types

```mermaid
flowchart LR
    A[1bit \n stores sign] --- B[8bit \n stores exponent] --- C[23bits \nstores mantissa]

```

Example:
```
4.125f
Step 1: Convert to binary
 4 -> 100
 .125 = .125 * 2 = 0.25 | 0
        .25  * 2 = 0.5  | 0
        .5   * 2 = 1    | 1
        
So, 0.125 = 001

100.001
1.00001 * 2^2

Bias is 127 so E = 127 + 2 = 129
So binary of 129 will be stored in exponent part (8 bits)
10000001
Mantissa will be part after decimal = 00001

```




