# Java Data Structures and Algorithms
<p align="center">
  <a href="https://github.com/JvLisboa023Dev/java-data-structures-algorithms/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/JvLisboa023Dev/java-data-structures-algorithms?style=for-the-badge" alt="Licença">
  </a>
  <a href="#">
    <img src="https://img.shields.io/github/languages/top/JvLisboa023Dev/java-data-structures-algorithms?style=for-the-badge&color=orange" alt="Linguagem Principal">
  </a>
  <a href="#">
    <img src="https://img.shields.io/badge/Java-21 LTS-blue?style=for-the-badge&logo=java" alt="Java 21">
  </a>
  <a href="#">
    <img src="https://img.shields.io/badge/Build-Gradle-green?style=for-the-badge&logo=gradle" alt="Gradle">
  </a>
  <a href="https://github.com/JvLisboa023Dev/java-data-structures-algorithms/commits/main">
    <img src="https://img.shields.io/github/last-commit/JvLisboa023Dev/java-data-structures-algorithms?style=for-the-badge" alt="Último Commit">
  </a>
</p>

Java implementations of fundamental data structures and algorithms, built from scratch for the purpose of studying and demonstrating key computer science concepts.

## About the Project

This repository is dedicated to the study and practical implementation of classic data structures and algorithms using **Java**.
The project follows modern development practices, including:

- Clean, decoupled architecture
- Dependency management with **Gradle**
- Environment setup with **SDKMAN**

Each concept is implemented in its own module and demonstrated through a real-world use case via an interactive console program, making abstract theories tangible and easy to understand.

---

## Implemented Data Structures & Algorithms

Below is the complete list of implemented concepts, each with a practical use case to highlight their unique characteristics.

### Data Structures

| Structure            | Use Case Example          | Key Feature Demonstrated                                    |
| -------------------- | ------------------------- | ----------------------------------------------------------- |
| **Stack** | Undo History in a Text Editor | LIFO (Last-In, First-Out) data management                   |
| **Queue** | Print Job Management      | FIFO (First-In, First-Out) data processing                  |
| **Doubly Linked List** | Browser History Simulator   | Bidirectional navigation and efficient insertions/deletions |
| **HashMap** | Student Waiting List      | Fast key-value access and retrieval (Average <i>O(1)</i>)          |
| **LinkedHashMap** | E-commerce Shopping Cart  | Preservation of insertion order                             |
| **TreeMap** | Event Calendar            | Automatic sorting of entries based on natural key order     |

---

### Searching Algorithms

| Algorithm       | Use Case Example       | Key Feature Demonstrated                             |
| --------------- | ---------------------- | ---------------------------------------------------- |
| **Linear Search** | Product Stock Search   | Simplicity and effectiveness on unsorted data (<i>O(n)</i>) |
| **Binary Search** | Library Catalog Lookup | High efficiency on sorted data (<i>O(log n)</i>)         |

---

### Sorting Algorithms

| Algorithm        | Use Case Example            | Key Feature Demonstrated                                      |
| ---------------- | --------------------------- | ------------------------------------------------------------- |
| **Bubble Sort** | Simple Game Leaderboard     | Simplicity and visual demonstration of adjacent swaps         |
| **Selection Sort** | File Sorting by Size      | Finding minimum elements and minimizing swaps                 |
| **Insertion Sort** | Sorting a Hand of Cards   | Efficiency on small or nearly-sorted datasets                 |
| **Merge Sort** | Combining E-commerce Orders | "Divide and Conquer" with guaranteed <i>O(n log n)</i> performance |
| **Quick Sort** | Sorting Auction Items by Bids | High average-case performance (<i>O(n log n)</i>), in-place sorting |
---

## Tech Stack

-   **Language:** Java 21 (LTS)
-   **Build Tool:** Gradle 9.0
-   **Environment Manager:** SDKMAN (Recommended)
-   **Libraries:**
    -   Project Lombok
    -   JUnit 5 (for testing)

---

## Getting Started

### Prerequisites

It is highly recommended to use **SDKMAN** to manage your Java and Gradle versions.

1.  **Install Java 21:**
    ```bash
    sdk install java 21-tem
    ```

2.  **Install Gradle 9.0:**
    ```bash
    sdk install gradle 9.0
    ```

### Installation

1.  **Clone the repository:**
    ```bash
    git clone git@github.com:JvLisboa023Dev/java-data-structures-algorithms.git
    ```

2.  **Navigate to the project directory:**
    ```bash
    cd java-data-structures-algorithms
    ```

The project is now ready to be opened in your favorite IDE (like IntelliJ IDEA) or built from the command line.

---

## Usage / Running the Examples

Each algorithm and data structure has its own executable `main` class within its respective package (e.g., `org.algorithms.sorting.quicksort.QuickSortMain`).

The easiest way to run an example is to open the project in an IDE:

1.  Open the project in an IDE like **IntelliJ IDEA**.
2.  Navigate to the desired `main` class file.
3.  Click the **Run** button or use the corresponding keyboard shortcut.

---

## A Note on Git Workflow

This project intentionally employs a simple feature-branch workflow instead of a more structured model like Git Flow. This choice was made for the following reasons:

-   **Educational Focus**: The goal is clarity in implementing and refactoring planned concepts.
-   **Single Developer**: The overhead from `develop`, `release`, or `hotfix` branches is unnecessary for a solo project.
-   **Predefined Scope**: The project's scope was known from the beginning, minimizing the need for parallel development.

This approach demonstrates the importance of choosing the right tool for the job—in this case, a streamlined workflow for a project with a clear educational scope.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

---

## Author

**João Lisboa** - [JvLisboa023Dev](https://github.com/JvLisboa023Dev)