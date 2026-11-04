# Java Iterator Example

This project demonstrates the difference between using a for-each loop and an Iterator to remove elements from an ArrayList in Java.

## Description
- **For-each loop:** Removing elements directly from the list during iteration can cause a ConcurrentModificationException.
- **Iterator:** Using iterator.remove() allows elements to be safely removed during iteration.

## Result
The program demonstrates why Iterator is a safer way to remove elements while iterating over a list.

## How to Run
Run the `IteratorRemoveDemo.java` file using Java.
