## Inventory Management System Documentation

### Overview

The Inventory Management System is a Java-based desktop application designed to help businesses efficiently manage their inventory, vendors, goods, bills, issued goods, and other related operations. The application provides a user-friendly interface for performing various inventory management tasks, making it easier for users to track and monitor their inventory.

### Table of Contents

1. [Introduction](#introduction)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Installation](#installation)
5. [Usage](#usage)
6. [Project Structure](#project-structure)
7. [Contributing](#contributing)
8. [Authors](#authors)
9. [License](#license)
10. [Contact](#contact)

### Introduction

The Inventory Management System is developed as a JavaFX application, providing a Graphical User Interface (GUI) for better user interaction. It allows users to manage inventory-related tasks efficiently, reducing manual efforts and increasing productivity.

### Features

1. **Vendor Management**: Add, edit, and delete vendors from the system.
2. **Goods Management**: Manage goods, including adding, editing, and removing them from the inventory.
3. **Bill Management**: Keep track of bills for goods purchased from vendors.
4. **Issued Goods Tracking**: Record the details of issued goods and their recipients.
5. **Goods Issuance**: Record the issuance of goods to recipients and update inventory accordingly.
6. **User-Friendly Interface**: The application provides an intuitive and easy-to-use interface for smooth navigation and data management.
7. **Search and Filter**: Users can search and filter inventory items, vendors, and other data for quick access and analysis.

### Technologies Used

- Java
- JavaFX
- Maven
- MySQL (for database)
- Git (version control)

### Installation

1. Clone the repository from GitHub using the following command:
   ```
   git clone https://github.com/your-github-username/inventory-system.git
   ```

2. Open the project in IntelliJ IDEA or any other suitable IDE.

3. Configure the JavaFX SDK and module dependencies as mentioned in the documentation.

4. Set up the MySQL database with the required tables and data (see database setup documentation).

5. Build the project using Maven.

### Usage

1. Launch the application from the main class `com.example.MainApp`.

2. The main window will open, showing the menu bar and the vendor view by default.

3. Use the menu bar to navigate to different views for managing vendors, goods, bills, issued goods, and issue goods.

4. Perform actions such as adding, editing, and deleting data using the buttons and forms provided.

### Project Structure

The project follows a standard Maven project structure:

- `src/main/java/com.example`: Contains the Java source code files.
- `src/main/resources`: Contains the FXML files for the GUI and other resources.
- `src/test/java`: Contains the test cases (if any).
- `pom.xml`: The Maven project configuration file.

### Contributing

We welcome contributions to this project. If you have any suggestions, bug reports, or feature requests, please open an issue on GitHub. To contribute code changes, please fork the repository, make your changes, and submit a pull request.

### Authors

- [Nana Obeng](https://github.com/denakwob)

### Note

This project is for an academic work

