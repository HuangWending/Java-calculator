# Java-calculator
Java计算器程序
import java.util.Scanner; - 导入 Scanner 类，它允许我们从控制台读取用户输入。
public class Calculator - 定义了一个名为 Calculator 的公共类。
public static void main(String[] args) - 程序的入口点，main 方法是Java程序执行的起点。
Scanner scanner = new Scanner(System.in); - 创建一个 Scanner 对象，用于从控制台读取用户输入。
System.out.print("请输入第一个数字: "); - 输出提示信息，要求用户输入第一个数字。
double num1 = scanner.nextDouble(); - 从控制台读取用户输入的第一个数字并将其存储在 num1 变量中。
System.out.print("请输入第二个数字: "); - 输出提示信息，要求用户输入第二个数字。
double num2 = scanner.nextDouble(); - 从控制台读取用户输入的第二个数字并将其存储在 num2 变量中。
System.out.print("请输入要执行的操作 (+, -, *, /): "); - 输出提示信息，要求用户输入要执行的操作符。
char operator = scanner.next().charAt(0); - 从控制台读取用户输入的操作符并将其存储在 operator 变量中。
double result; - 声明一个变量 result，用于存储计算结果。
switch (operator) - 使用 switch 语句根据操作符执行相应的操作。
case '+': - 如果操作符是 '+'，执行下面的代码块。
result = num1 + num2; - 将 num1 和 num2 相加并将结果存储在 result 中。
System.out.println("结果: " + result); - 输出计算结果。
break; - 结束 case '+' 的执行。
case '-': - 如果操作符是 '-'，执行下面的代码块，依此类推。
case '*':
case '/':
if (num2 != 0) { - 检查除数是否为零。
result = num1 / num2; - 如果除数不为零，将 num1 除以 num2 并将结果存储在 result 中。
System.out.println("结果: " + result); - 输出计算结果。
} else { - 如果除数为零，执行下面的代码块。
System.out.println("除数不能为零！"); - 输出除数不能为零的错误信息。
break; - 结束 case '/' 的执行。
default: - 如果操作符不是 '+', '-', '*', '/' 中的任何一个，执行下面的代码块。
System.out.println("无效的操作符！"); - 输出无效操作符的错误信息。
break; - 结束 default 的执行。
scanner.close(); - 关闭 Scanner 对象，释放资源。
这段代码通过读取用户输入的数字和操作符，根据操作符执行相应的数学运算，并将结果输出到控制台。如果操作符是除法且除数为零，则会输出错误信息。否则，会输出计算结果。
