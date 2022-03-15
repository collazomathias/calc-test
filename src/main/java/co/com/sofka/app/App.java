package co.com.sofka.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import co.com.sofka.app.calculator.BasicCalculator;

public class App {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in ));
        
        System.out.println("Enter the first number: ");
        String textNumber1 = bufferedReader.readLine();
        
        System.out.println("Enter the second number: ");
        String textNumber2 = bufferedReader.readLine();
        
        Long number1 = Long.valueOf(textNumber1);
        Long number2 = Long.valueOf(textNumber2);
        
        BasicCalculator calculator = new BasicCalculator();
        Long result = calculator.sumar(number1, number2);
        
        System.out.println(number1 + " + " + number2 + " = " + result);
    }
}
