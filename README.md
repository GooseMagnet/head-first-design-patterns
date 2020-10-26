# Head First Design Patterns

## Design Principles
* Encapsulate what varies
* Program to an interface, not an implementation
* Favor composition over inheritance
* Strive for loosely coupled designs between objects that interact
* Classes should be open for extension, but closed for modification
* Depend upon abstractions. Do not depend upon concrete classes

## Design Patterns

### Strategy
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.  Strategy lets the algorithm vary independently from clients that use it.
### Observer
The Observer Pattern defines a one-to-many dependency between objects so that whne one object changes state, all its dependents are notified and updated automatically.
### Decorator
The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
### Factory Method
The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
### Abstract Factory
The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
### Singleton
The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.
### Command
The Command Pattern encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.