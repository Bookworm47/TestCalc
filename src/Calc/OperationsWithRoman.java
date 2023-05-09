package Calc;

public class OperationsWithRoman {


    public static boolean containsRoman(String[] getRoman, String[] hasRoman) {
        boolean x = false;
        for (String gr : getRoman) {
            for (String hr : hasRoman) {
                if (gr.equals(hr)) {
                    x = true;
                    break;
                }
            }
        }
        return x;
    }

    public static boolean containsArab(String[] getArab, int[] hasArab) {
        boolean x = false;
        for (String gr : getArab) {
            for (int hr : hasArab) {
                String hrS = Integer.toString(hr);
                if (gr.equals(hrS)) {
                    x = true;
                    break;
                }
            }
        }
        return x;
    }

    public static int indexRoman(String partExpresion, String[] expresion) {
        int indexRoman = 0;
        for (int i = 0; i < expresion.length; i++) {
            if (partExpresion.equals(expresion[i])) {
                indexRoman = i;
            }
        }
        return indexRoman;
    }

    public static int calculation(int[] getExpression, String getOperand){
        int x = 0;
        if (getOperand.contains("-")) {
            x = getExpression[0] - getExpression[1];
        } else if (getOperand.contains("+")) {
            x = getExpression[0] + getExpression[1];
        } else if (getOperand.contains("*")) {
            x = getExpression[0] * getExpression[1];
        } else if (getOperand.contains("/")) {
            x = getExpression[0] / getExpression[1];
        }
        return x;
    }

    public static int[] toIntArab(String[] stringExpression) {
        int[] intExpresson = new int[2];
        for (int i = 0; i < stringExpression.length; i++) {
            intExpresson[i] = Integer.parseInt(stringExpression[i]);
        }
        return intExpresson;
    }

    public static boolean numberBorders (String operands, String[] romanNumbers) {
        boolean check = true;
        for (String x : romanNumbers) {
            if (operands.equals(x)) {
                check = false;
            }
        }
        return check;
    }
}