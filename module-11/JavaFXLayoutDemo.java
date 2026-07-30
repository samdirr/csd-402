/*
 * JavaFXLayoutDemo.java
 * Samuel Dirr
 * CSD 402
 * Date: July 29, 2026
 *
 * Purpose:
 * Demonstrates two JavaFX layout panes. GridPane organizes a small
 * registration form in rows and columns, while HBox arranges the form's
 * action buttons in one horizontal row.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Creates an executable JavaFX example that combines GridPane and HBox.
 *
 * <p>Compile and run with a configured JavaFX SDK. For example:</p>
 * <pre>
 * javac --module-path /path/to/javafx-sdk/lib \
 *       --add-modules javafx.controls JavaFXLayoutDemo.java
 * java --module-path /path/to/javafx-sdk/lib \
 *      --add-modules javafx.controls JavaFXLayoutDemo
 * </pre>
 *
 * @author Samuel Dirr
 * @version 1.0
 */
public class JavaFXLayoutDemo extends Application {

    /**
     * Builds the scene graph and displays the primary stage.
     *
     * @param primaryStage the main window supplied by the JavaFX runtime
     */
    @Override
    public void start(Stage primaryStage) {
        // GridPane is appropriate for the label-and-field row relationships.
        GridPane form = new GridPane();
        form.setAlignment(Pos.CENTER);
        form.setHgap(12);
        form.setVgap(12);
        form.setPadding(new Insets(20));

        // Allow the input column and its text fields to use extra width.
        ColumnConstraints labels = new ColumnConstraints();
        ColumnConstraints inputs = new ColumnConstraints();
        inputs.setHgrow(Priority.ALWAYS);
        form.getColumnConstraints().addAll(labels, inputs);

        Label heading = new Label("Workshop Registration");
        heading.setFont(Font.font("System", FontWeight.BOLD, 20));
        form.add(heading, 0, 0, 2, 1); // Span both grid columns.

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");
        nameField.setMaxWidth(Double.MAX_VALUE);
        form.add(nameLabel, 0, 1);
        form.add(nameField, 1, 1);

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        emailField.setPromptText("Enter your email");
        emailField.setMaxWidth(Double.MAX_VALUE);
        form.add(emailLabel, 0, 2);
        form.add(emailField, 1, 2);

        Label message = new Label("Complete both fields, then select Submit.");
        form.add(message, 0, 3, 2, 1);

        Button clearButton = new Button("Clear");
        Button submitButton = new Button("Submit");

        // HBox keeps the related action buttons in one right-aligned row.
        HBox actions = new HBox(10, clearButton, submitButton);
        actions.setAlignment(Pos.CENTER_RIGHT);
        form.add(actions, 0, 4, 2, 1);

        clearButton.setOnAction(event -> {
            nameField.clear();
            emailField.clear();
            message.setText("The form has been cleared.");
            nameField.requestFocus();
        });

        submitButton.setOnAction(event -> {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();

            if (name.isEmpty() || email.isEmpty()) {
                message.setText("Please enter both a name and an email address.");
            } else {
                message.setText("Submitted for " + name + " (" + email + ").");
            }
        });

        Scene scene = new Scene(form, 520, 300);
        primaryStage.setTitle("JavaFX HBox and GridPane Demo");
        primaryStage.setMinWidth(420);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Launches the JavaFX application.
     *
     * @param args optional command-line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
