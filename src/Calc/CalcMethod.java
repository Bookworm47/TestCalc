package Calc;

import java.sql.SQLOutput;
import java.util.Arrays;
public class CalcMethod {
    static String finalResult;
    static int calculationResult = 0;
    public static String[] romanNumbers = {"N","I","II","III","IV","V","VI","VII","VIII","IX","X"};
    static int[] arabNumbers = {0,1,2,3,4,5,6,7,8,9,10};
    static String calc(String input) throws CalcExeptions, NullPointerException{
        input = input.replace(" ","");
        String[] operands = input.split("[+-/*]");
        if (operands.length > 2)
            throw new NullPointerException ("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+,-,/,*)");
        else if (operands.length == 1)
            throw new CalcExeptions ("Cтрока не является математической операцией");
        else if (OperationsWithRoman.containsRoman(operands, romanNumbers) && OperationsWithRoman.containsArab(operands,arabNumbers))
            throw new CalcExeptions("Используются одновременно разные системы счисления");
        else if (RomanNumbers.containsEnum(operands, RomanNumbers.values()) && (OperationsWithRoman.numberBorders(operands[0], romanNumbers) || OperationsWithRoman.numberBorders(operands[1], romanNumbers)))
            throw new CalcExeptions("Число должно быть больше или равно I и меньше или равно X");
        else if (OperationsWithRoman.containsRoman(operands, romanNumbers) && input.contains("-") &&(OperationsWithRoman.indexRoman(operands[0],romanNumbers) - OperationsWithRoman.indexRoman(operands[1], romanNumbers)) <= 0)
            throw new CalcExeptions("В римской системе нет отрицательных чисел и нуля");
        else if (OperationsWithRoman.containsArab(operands,arabNumbers) && (Integer.parseInt(operands[0]) < 0 || (Integer.parseInt(operands[0]) > 10) ||
                (Integer.parseInt(operands[1]) < 0) || (Integer.parseInt(operands[1]) > 10)))
            throw new CalcExeptions("Число не должно быть больше 10 и меньше 0");



        if (OperationsWithRoman.containsRoman(operands, romanNumbers)) {
            int[] newOperands = ArabToRoman.arabToRoman(operands);
            calculationResult = OperationsWithRoman.calculation(newOperands, input);
            RomanNumbers[] values = RomanNumbers.values();
            RomanNumbers answer = values[calculationResult];
            finalResult = String.valueOf(answer);
        } else {
            calculationResult = OperationsWithRoman.calculation(OperationsWithRoman.toIntArab(operands), input);
            finalResult = Integer.toString(calculationResult);
        }

        return finalResult;
    }


}
