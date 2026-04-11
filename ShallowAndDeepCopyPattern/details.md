# 🧠 Shallow vs Deep Copy

## 📌 Difference

| Feature | Shallow Copy | Deep Copy |
|--------|-------------|----------|
| Copy | Reference copy | Full data copy |
| Inner objects | Shared | Independent |
| Changes affect | Both objects | Only copied object |

---

## 🔹 Shallow Copy

- Copies object **but shares references**
- Done using `super.clone()`

```java
User u2 = (User) u1.clone(); // shallow copy