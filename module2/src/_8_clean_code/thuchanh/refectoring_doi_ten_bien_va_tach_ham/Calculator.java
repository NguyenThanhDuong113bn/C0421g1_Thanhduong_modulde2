package _8_clean_code.thuchanh.refectoring_doi_ten_bien_va_tach_ham;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION='-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION= '/';
    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
    public static void main(String[] args) {
        int resultAddition = calculate(5, 3, '+');
        System.out.println(resultAddition);
        int resultSubtraction = calculate(5, 3, '-');
        System.out.println(resultSubtraction);
        int resultMultiplication = calculate(5, 3, '*');
        System.out.println(resultMultiplication);
        int resultDivision = calculate(3, 5, '/');
        System.out.println(resultDivision);
    }
}
