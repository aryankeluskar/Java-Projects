import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class GUI_Arculator extends Application {
    static double power(double a, double b) {
        double p = 1;
        for (int i = 0; i < (Math.ceil(b)); i++)
            p *= a;
        return p;
    }

    private TextField num1;
    private TextField num2;
    private Label result;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button mod;
    private Button exp;
    private Button sqrt;
    private Button cbrt;
    private Button linear;
    private Button quadratic;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        num1 = new TextField();
        num2 = new TextField();
        result = new Label();

        add = new Button("Addition");
        add.setOnAction(event -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Answer: " + (a + b));
        });
        sub = new Button("Subtraction");
        sub.setOnAction(event -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Answer: " + (a - b));
        });
        mul = new Button("Multiplication");
        mul.setOnAction(event -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Answer: " + (a * b));
        });
        div = new Button("Division");
        div.setOnAction(event -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Answer: " + (a / b));
        });
        mod = new Button("Remainder");
        mod.setOnAction(event -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Answer: " + (a % b));
        });
        exp = new Button("Exponential");
        exp.setOnAction(event -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Answer: " + power(a, b));
        });
        sqrt = new Button("Square Root");
        sqrt.setOnAction(event -> {
        double a = Double.parseDouble(num1.getText());
        result.setText("Answer: " + Math.sqrt(a));
        });
        cbrt = new Button("Cube Root");
        cbrt.setOnAction(event -> {
        double a = Double.parseDouble(num1.getText());
        result.setText("Answer: " + Math.cbrt(a));
        });
        linear = new Button("Linear equation");
        linear.setOnAction(event -> {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        result.setText("Answer: " + (-b/a));
        });
        quadratic = new Button("Quadratic equation");
        quadratic.setOnAction(event -> {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double c = Double.parseDouble(num3.getText());
        double x1, x2;
        double d = (bb) - (4ac);
        if(d > 0)
        {
        x1 = (-b + Math.sqrt(d)) / (2a);
        x2 = (-b - Math.sqrt(d)) / (2a);
        result.setText("Answer: x1 = " + x1 + " and x2 = " + x2);
        }
        else if(d == 0)
        {
        x1 = x2 = -b / (2a);
        result.setText("Answer: x1 = x2 = " + x1);
        }
        else
        result.setText("Answer: no real roots");
        });
        
        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Number 1: "), 0, 0);
        gridPane.add(num1, 1, 0);
        gridPane.add(new Label("Number 2: "), 0, 1);
        gridPane.add(num2, 1, 1);
        gridPane.add(add, 0, 2);
        gridPane.add(sub, 1, 2);
        gridPane.add(mul, 0, 3);
        gridPane.add(div, 1, 3);
        gridPane.add(mod, 0, 4);
        gridPane.add(exp, 1, 4);
        gridPane.add(sqrt, 0, 5);
        gridPane.add(cbrt, 1, 5);
        gridPane.add(linear, 0, 6);
        gridPane.add(quadratic, 1, 6);
        gridPane.add(result, 0, 8, 2, 1);
    
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Arculator");
        primaryStage.show();
    }

}
