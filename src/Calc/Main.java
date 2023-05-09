package Calc;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) throws CalcExeptions, NullPointerException {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        String finalResult = CalcMethod.calc((expression));
        System.out.println(finalResult);
    }
}

