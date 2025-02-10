# NeoVector

NeoVector is a custom implementation of a dynamic array in Java, similar to `java.util.Vector`. It provides basic functionalities like adding, removing, retrieving elements, and handling capacity dynamically.

## Features
- Dynamic resizing when the array reaches its capacity.
- Basic operations: add, remove, get, clear, size, capacity.
- Supports generic types.
- Implements manual garbage collection handling.

## Installation
To use NeoVector, simply include the `NeoVector.java` file in your Java project.

## Usage

### Creating a NeoVector
```java
NeoVector<String> vector = new NeoVector<>();
```

### Adding Elements
```java
vector.add("A");
vector.add("B");
vector.add("C");
```

### Getting an Element
```java
System.out.println("First element: " + vector.get(0));
```

### Removing an Element
```java
vector.remove(1); // Removes the element at index 1
```

### Checking Size and Capacity
```java
System.out.println("Size: " + vector.size());
System.out.println("Capacity: " + vector.capacity());
```

### Clearing the Vector
```java
vector.clear();
```

### Checking if Vector is Empty
```java
System.out.println("Is empty: " + vector.isEmpty());
```

## Example Output
```
Size of the vector is : 3
Capacity of the vector is : 10
Size of the vector is : 18
Capacity of the vector is : 40
Is my vector empty: false
Original vector: [A , B , C , element :0 , ...]
First position element: A
After remove vector: [A , C , element :0 , ...]
```

## License
This project is open-source and available for modification and distribution.

## Author
Harsh Mahilang

