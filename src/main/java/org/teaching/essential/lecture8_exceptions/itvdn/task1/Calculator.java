package org.teaching.essential.lecture8_exceptions.itvdn.task1;

/*
Создайте класс Calculator.
В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание,
mul – умножение, div – деление).
Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
исключение.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);
    private Scanner scan;

    public double add() {
        logger.info("Enter operandA:");
        double operandA = scan.nextDouble();

        logger.info("Enter operandB:");
        double operandB = scan.nextDouble();

        return operandA + operandB;
    }

    public double sub() {
        logger.info("Enter operandA:");
        double operandA = scan.nextDouble();

        logger.info("Enter operandB:");
        double operandB = scan.nextDouble();

        return operandA - operandB;
    }

    public double mul() {
        logger.info("Enter operandA:");
        double operandA = scan.nextDouble();

        logger.info("Enter operandB:");
        double operandB = scan.nextDouble();

        return operandA * operandB;
    }

    public double div() {
        logger.info("Enter operandA:");
        double operandA = scan.nextDouble();

        logger.info("Enter operandB:");
        double operandB = scan.nextDouble();

        if (operandB == 0) throw new ArithmeticException("Due you mustn't divided by zero!");

        return operandA / operandB;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
}
