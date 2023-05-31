import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 您定义的公共类的名称 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数字: ");
        double num1 = scanner.nextDouble();

        System.out.print("请输入第二个数字: ");
        double num2 = scanner.nextDouble();

        System.out.print("请输入要执行的操作 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("结果: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("结果: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("结果: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("结果: " + result);
                } else {
                    System.out.println("除数不能为零！");
                }
                break;
            default:
                System.out.println("无效的操作符！");
                break;
        }

        scanner.close();
    }
}
