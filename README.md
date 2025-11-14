# Differences Between Arrays and ArrayLists

The differences between arrays and ArrayLists are apparent when examining how they are created in Java.

## Initialization and Access

**Arrays** are initialized similarly to variables of primitive data types; no extra steps are needed. Elements can be accessed directly in arrays using an index, and there are no methods; only the `.length` property is available.

**ArrayLists** require the `java.util` package to be imported; they are not an organic part of Java and were added after the fact. When initializing a list, you are creating an object, and then adding/removing/changing elements with methods rather than accessing them directly.

Methods can also be used with arrays; however, this requires the `Arrays` class, which is also part of the `java.util` package.

## Data Types

The same data types can be used with both arrays and ArrayLists; however, extra steps are required when using primitives with ArrayLists. Primitives require a wrapper class to convert them into objects for storage in an ArrayList, but arrays can store primitives directly.

## Size and Performance

The most significant difference is that arrays have a fixed size; however, ArrayLists can grow or shrink. Since arrays are of fixed size, they are stored in a contiguous block of memory, allowing for quick referencing. This, coupled with the ability to access elements directly, allows for increased performance.

ArrayLists are not fixed size, require a cushion for additional elements, have metadata, and store primitives as objects, increasing memory usage. This, coupled with needing methods to access, causes a performance drop.

## Memory Usage Testing

I did a test in my code below using the `Runtime` class and found that a 5-element ArrayList is about twice the size of an Array. While not a significant difference with a smaller data object, it could become significant with larger lists.

---

**Reference:** [daniel-t-johnston/Differences-Arrays-ArrayLists: Week 3 Discussion Post](https://github.com/daniel-t-johnston/Differences-Arrays-ArrayLists)
