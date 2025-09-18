# java-data-structures-algorithms
Java implementations of fundamental data structures including Stack, Linked Lists, Queue, and their variations. 
Built from scratch for learning purposes.



# About the Project

This repository is dedicated to the study and practical implementation of classic data structures and algorithms using Java. 
The project follows modern development practices, including a clean, decoupled architecture, dependency management with Gradle, 
and environment setup with SDKMAN.

Each data structure is implemented as a self-contained module, 
demonstrating its real-world application through an interactive console program.

* **Clean Architecture:** Implementations follow a decoupled pattern using `Model`, `Service` (Interface), and `Service Implementation` layers.
* **Doubly Linked List:** A generic implementation demonstrating bidirectional navigation, using a Browser History simulator as a practical example.
* **Stack:** Multiple implementations to showcase different underlying structures:
    * Stack using a Singly Linked List (classic, efficient implementation).
    * Stack using a Doubly Linked List (academic exercise).
* **Queue:** Multiple implementations to compare performance trade-offs:
    * Queue using a custom Linked List (intuitive and efficient).
    * Queue using an `ArrayList`
* **Modern Tooling:** The project is built and managed using Gradle 9.0 and Project Lombok to reduce boilerplate code.

* **Language:** Java 21 (LTS)
* **Build Tool:** Gradle 9.0
* **Environment Manager:** SDKMAN (Recommended)
* **Libraries:**
    * Project Lombok
    * JUnit 5 (for testing)

To get a local copy up and running, follow these simple steps.

### Prerequisites

It is highly recommended to use [SDKMAN](https://sdkman.io/) to manage your Java and Gradle versions, ensuring you are using the same environment this project was built with.

1.  **Install Java 21:**
    ```sh
    sdk install java 21-tem
    sdk default java 21-tem
    ```
2.  **Install Gradle 9.0:**
    ```sh
    sdk install gradle 9.0
    sdk default gradle 9.0
    ```

### Installation

1.  Clone the repository:
    ```sh
    git clone git@github.com:JvLisboa023Dev/java-data-structures-algorithms.git
    ```
2.  Navigate to the project directory:
    ```sh
    cd java-data-structures-algorithms
    ```
3.  The project is ready to be opened in IntelliJ IDEA or built from the command line.

## Usage / Running the Examples

This project contains multiple executable `main` classes, each demonstrating a specific data structure.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Author

* **João Lisboa** - [JvLisboa023Dev](https://github.com/JvLisboa023Dev)

