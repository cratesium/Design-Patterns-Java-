# 🏗️ Builder Design Pattern (Complete Guide)

---

## 📌 Definition
The **Builder Pattern** is a creational design pattern used to construct complex objects step by step.  
It separates the construction of an object from its final representation.

---

## 🧠 Problem (Why Builder?)

When a class has many parameters:

```java
User user = new User("John", 25, "john@email.com", "India", "123456");