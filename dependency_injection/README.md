# Dependency Injection (DI)

**Dependency Injection (DI)** is a **design principle, a set of patterns, and a programming technique** that allows objects to receive their dependencies from an external source rather than creating them internally.  

In other words, **it is a way of giving objects what they need instead of making them create those things by themselves**. DI promotes **loose coupling, better testability, and maintainability**.

## Types of Dependency Injection

There are three types of DI:

1. **Constructor Injection** – Dependencies are passed via the class constructor. This is the most preferred and recommended approach.

2. **Field (Property) Injection** – Dependencies are injected directly into fields, usually using frameworks like Hilt or Spring.  
   _(Not ideal because the dependency might be null until it is injected.)_

3. **Method Injection** – Dependencies are passed as method parameters.

---

## Relationship Between DI and DIP

We should also recall that **Dependency Injection (DI) and Dependency Inversion (DIP) are closely related**.  

DIP is the last principle of **SOLID** and states that:  
✅ High-level modules should **not depend on low-level modules**; both should depend on **abstractions**.  
✅ **Abstractions should not depend on details**—details should depend on abstractions.  
✅ Instead of **lower-level modules dictating how higher-level modules behave**, we invert the dependency, allowing **high-level policies to dictate lower-level implementations**.

---

## Real-World Analogy: The USB Standard

A great real-world analogy for **Dependency Inversion** is the **USB standard**.

Initially, computers had multiple, non-universal ports, meaning that every new peripheral required redesigning or adding new ports.  
This **violated DIP**, as the **high-level system (computer) depended on many low-level details (specific ports).**

Then came **USB (Universal Serial Bus)**, introducing a **single abstraction**. Computers no longer needed to recognize specific devices (keyboard, printer, smartphone, etc.); they simply adhered to the **USB protocol**. Meanwhile, manufacturers could innovate freely as long as they followed the standard.

### **This mirrors how DIP works:**
- ✅ The **high-level module** (computer) depends on the **USB specification** (abstraction).  
- ✅ The **low-level modules** (devices) implement that specification (concrete classes).  
- ✅ Adding new devices **doesn't require changing the computer’s design**—it simply "talks USB."

---

## Dependency Injection Container (DIC) AKA: Service Locator

A **Dependency Injection Container (DIC)**, also known as **Service Locator**, is a **design pattern** that also improves decoupling of classes from concrete dependencies.  

We need to create a class known as the **service locator** that **creates and stores dependencies** and then provides those dependencies on demand.

### **Difference Between Service Locator and DI**
- With the **Service Locator pattern**, classes **have control** and ask for objects to be injected.  
- With **Dependency Injection**, the **app has control** and proactively injects the required objects.

---

By following **Dependency Injection (DI)** and **Dependency Inversion (DIP)**, we create **flexible, maintainable, and testable** software architectures.

