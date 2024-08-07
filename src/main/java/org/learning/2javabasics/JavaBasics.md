# Java Basics Overview

## What is Java?

- Platform Independent language
- supports OOPs
- Portability [WORA -> Write Once Run Anywhere]

## 3 Main Components of Java

- JDK -> JRE  -> JVM

## JVM: Java Virtual Machine

- It's just an abstract machine that doesn't exist physically.
- Java Program ->(compiler) -> Bytecode ->(JVM) -> MachineCode ->(CPU) -> Output

- **So, JVM is platform independent**

> So, we need to install JVM based on the platform i.e. MacOS, Linux or Windows. Input for JVM is bytecode and output is machine code.
Now Since bytecode can be run by any JVM, it makes a JAVA program platform independent.

> JVM has JIT(just in time) compiler which takes bytecode and convert it into machine code.

## JRE: Java Runtime Environment

- JRE contains JVM and class libraries i.e. the libraries which we've used in the code.
- JRE [ Class Libraries -> JVM ]
- So, if we have JRE, we can run any Java Program but we cannot code the program.

## JDK: Java Development Kit

- It has programs language information.
- It has compiler (javac)
- It has debugger

So, JDK = JRE + ( Program Language + compiler + debugger + other dev components)

JSE: Java Standard Edition
JEE: Java Enterprise Edition 
JME: Java Micro/Mobile Edition

JSE is the core Java
JEE = JSE + Servlets + JSP + Transaction API + Persistence API
JME = API for mobile applications


##### Reference

- [Notes Link](https://drive.google.com/file/d/1eR9kqGEc6LmRaIDE4TT9dXnaiRnD2LmJ/view)