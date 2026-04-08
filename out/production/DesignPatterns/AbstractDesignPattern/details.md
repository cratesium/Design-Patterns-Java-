# Abstract Factory Design Pattern

The **Abstract Factory Design Pattern** is a **creational design pattern** that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

---

## 🔑 Core Idea

Instead of instantiating objects directly, define an interface for creating related objects and let subclasses decide which concrete implementations to use.

---

## 🧠 Real-World Analogy

Imagine a **furniture showroom**:

- Styles: Modern, Victorian, Minimalist
- Each style includes:
    - Chair
    - Sofa
    - Table

When you choose a style, you get a matching set of furniture.

---

## 🏗️ Structure

### 1. Abstract Products

```java
interface Chair {
    void sitOn();
}

interface Sofa {
    void lieOn();
}