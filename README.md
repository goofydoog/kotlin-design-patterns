# Kotlin Design Patterns Repository

## Overview
This repository provides Kotlin implementations of 10 popular design patterns, spanning creational, structural, and behavioral categories. The goal is to offer clear code examples and concise documentation to help you understand, learn, and apply these patterns in real-world projects. 

## Organization
The repository is structured into folders based on pattern categories:

- **Creational Patterns:**  
  Examples include Singleton, Factory Method, Abstract Factory, and Builder.
  
- **Structural Patterns:**  
  Examples include Adapter, Decorator, and Facade.
  
- **Behavioral Patterns:**  
  Examples include Observer, Strategy, and Command.

Each design pattern is implemented in its own file (or files, when necessary) with in-line comments explaining its purpose and usage. Additional documentation within each folder provides detailed descriptions and example scenarios.

## Table of Contents

1. **[Singleton](https://github.com/goofydoog/kotlin-design-patterns/tree/main/creational)**
   *Ensures a class has only one instance and provides a global point of access to it.*

3. **Factory Method**  
   *Defines an interface for creating an object, but lets subclasses decide which class to instantiate.*

4. **Abstract Factory**  
   *Provides an interface for creating families of related or dependent objects without specifying their concrete classes.*

5. **Builder**  
   *Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.*

6. **Adapter**  
   *Allows the interface of an existing class to be used as another interface that clients expect.*

7. **Decorator**  
   *Attaches additional responsibilities to an object dynamically, offering a flexible alternative to subclassing for extending functionality.*

8. **Observer**  
   *Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.*

9. **Strategy**  
   *Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to vary independently from clients that use it.*

10. **Command**  
   *Encapsulates a request as an object, allowing for parameterization of clients with different requests and the queuing or logging of requests.*

11. **Facade**  
    *Provides a simplified interface to a complex subsystem, making it easier to interact with.*


## Bonus

**Dependency Injection**

Although DI is not a design pattern, I've included it in this repository because many resources refer to it as one. Remember, DI is not a single pattern but rather a set of patterns and principles that work together.

Dependency Injection (DI) is a technique that decouples components by injecting their dependencies from the outside, instead of having the components create dependencies themselves. While DI isn't a traditional design pattern like Singleton or Observer, it is a key implementation of Inversion of Control (IoC) and plays an essential role in building modular, testable, and maintainable applications.

