# SOLID PRINCIPLES
## (S) -> Single Responsibility Principle
* A Class should have only one reason to change.
* Focused **single Responsibility** addresses a specific concern.
* If you can’t describe what a class does in one clear sentence without using "and", it’s probably doing too much.
![Single Responsibility Principle](Design_Patterns/src/main/resources/images/srp.png)

## (O) -> Open Closed Principle
* A class, module, or function should be open for extension but closed for modification.
* **Open** for extension → You should be able to add new functionality.
* Closed for modification → You should NOT change the existing code whenever a new requirement comes.
![Open Closed Principle](Design_Patterns/src/main/resources/images/OCP.png)

## (L) -> Liskov Substitution Principle
* Objects of a superclass should be replaceable with objects of its subclasses without breaking the application.
* Subclass should extend the capability of the parent class but not narrow it down.
* ✅ Example: Bird bird = new Sparrow(); → works fine, since Sparrow behaves like a Bird.
* ❌ Violation: Bird bird = new Penguin(); → breaks, since Penguin can’t fly but the parent expects fly().
![Liskov Substitution Principle](Design_Patterns/src/main/resources/images/LSP.png)

## (I) -> Interface Segregation Principle
* Interface should be such that the client should not implement unneccessary functions they do not need.
* Don’t force someone to depend on methods they don’t use.
* Keep interfaces small and focused, so classes only worry about what they actually do. 

![Interface Segregation Principle](Design_Patterns/src/main/resources/images/ISP.png)

## (D) -> Dependency Inversion Principle
* High-level modules should not depend on low-level modules.
* Both should depend on abstractions.
* Abstractions should not depend on details.
* Details should depend on abstractions.

- In simple terms: 
If high-level logic directly depends on low-level implementations, changes in the low-level code can break the high-level logic.

- In more simple terms:
Class should depend on interface rather than concrete class.
![Dependency Inversion Principle](Design_Patterns/src/main/resources/images/DIP.png)


# Design-Patterns
## Creational Design Patterns
### 1. Factory Pattern
* Simple Factory : 
  A design pattern that delegates object creation to a single factory class, keeping your code clean and reducing coupling.
* Centralizes object creation
* Reduces repetitive new calls
* Keeps client code clean
* Perfect when you often switch between related object types

  ![Simple Factory](Design_Patterns/src/main/resources/images/creational-design-patterns/factory/simple-factory.png)

  ### 2. Factory Pattern
* Factory Method: 
  Defines an interface for creating an object.
* Lets subclasses decide which class to instantiate
* Decouples object creation from usage
* Keeps client code clean
* You order something, but you don’t know exactly which concrete object will be created.

  ![Factory Method](Design_Patterns/src/main/resources/images/creational-design-patterns/factory/Factory-Method.jpg)

   ### 2. Factory Pattern
* Abstract Factory is a creational design pattern
* It provides an interface to create families of related objects
* The client does not know or care about concrete implementations
* Object creation logic is fully encapsulated

  ![Abstract Factory](Design_Patterns/src/main/resources/images/creational-design-patterns/factory/Abstract-Factory.jpg)




