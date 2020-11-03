# Head First Design Patterns

## Design Principles
* Encapsulate what varies
* Program to an interface, not an implementation
* Favor composition over inheritance
* Strive for loosely coupled designs between objects that interact
* Classes should be open for extension, but closed for modification
* Depend upon abstractions. Do not depend upon concrete classes
* Principle of least knowledge: talk only to your immediate friends
* Don't call us. We'll call you (The Hollywood Principle)
* A class should have only one reason to change

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
### Adapter
The Adapter Pattern converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
### Facade
The Facade Pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
### Template Method
The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.
### Iterator
The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
### Composite
The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
### State
The State Pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
### Proxy
The Proxy Pattern provides a surrogate or placeholder for another object to control access to it.