# Login Form Application

This JavaFX application provides a simple and secure login form that connects to a MySQL database to authenticate users. It is designed with a clean and modern UI, making it an ideal project for learning and demonstrating JavaFX and database integration.

## Features

1. **User Authentication**: Validates username and password against the records stored in a MySQL database.
2. **Error Handling**: Provides user feedback for invalid login attempts.
3. **UI Design**: Enhanced UI with a modern look and feel.

## Project Structure

```
- src
  - com
    - Login_GUI
      - Controller.java
      - UserModel.java
      - LoginForm.java
  - resources
    - hello-view.fxml
```

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/Salah1098/Login-GUI-javafx-with-database.git
    cd Login-GUI-javafx-with-database
    ```

2. **Set up the MySQL database**:
    ```sql
    DROP DATABASE IF EXISTS LOGIN;
    CREATE DATABASE LOGIN;

    USE LOGIN;

    CREATE TABLE users (
        id INT AUTO_INCREMENT PRIMARY KEY,
        username VARCHAR(50) NOT NULL UNIQUE,
        password VARCHAR(50) NOT NULL
    );
    ```

3. **Compile and run the application**:
    - If you are using an IDE like IntelliJ IDEA or Eclipse, open the project and run `LoginForm.java`.
    - If you prefer to use the command line, navigate to the `src` directory and run:
        ```bash
        javac com/Login_GUI/LoginForm.java
        java com.Login_GUI.LoginForm
        ```

## Usage

1. **Enter Credentials**:
    - Input your username and password into the corresponding fields.
2. **Login**:
    - Click the `Login` button to authenticate. If the credentials are correct, a success message will be displayed. Otherwise, an error message will appear.

## Dependencies

This project requires JavaFX and MySQL Connector/J. Ensure that you have both properly installed and configured in your development environment.

### JavaFX

- Add the JavaFX library to your project dependencies. If using Maven, add the following to your `pom.xml`:

    ```xml
    <dependency>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-controls</artifactId>
        <version>YOUR_JAVAFX_VERSION</version>
    </dependency>
    ```

### MySQL Connector/J

- Add the MySQL Connector/J library to your project dependencies. If using Maven, add the following to your `pom.xml`:

    ```xml
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>YOUR_CONNECTOR_VERSION</version>
    </dependency>
    ```

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request. Contributions, including bug fixes, feature additions, and documentation improvements, are welcome.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Acknowledgements

- [JavaFX](https://openjfx.io/) for the UI framework.
- [MySQL](https://www.mysql.com/) for the database.
- [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/) for the JDBC driver.


