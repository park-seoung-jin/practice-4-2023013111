import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num1,num2,num3;

    System.out.println("계산기 입니다 : ");

    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = sc.nextInt();

    String cal = sc.next();

    System.out.println(num1 + " + " + num2 + " + " + num3 + " = " +(num1 + num2 + num3) );
    System.out.println(num1 + " - " + num2 + " - " + num3 + " = " +(num1 + num2 + num3) );
    System.out.println(num1 + " * " + num2 + " * " + num3 + " = " +(num1 + num2 + num3) );
    System.out.println(num1 + " / " + num2 + " / " + num3 + " = " +(num1 + num2 + num3) );

    }
}