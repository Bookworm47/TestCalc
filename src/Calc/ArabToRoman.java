package Calc;
public class ArabToRoman {
    static int[] translated = new int[2];
    public static int[] arabToRoman(String[] arabToRoman){
        int countArabToRoman = 0;
        for (int r = 0; r < arabToRoman.length; r++){
            for (int i = 0; i < CalcMethod.romanNumbers.length; i++) {
                if (arabToRoman[r].equals(CalcMethod.romanNumbers[i])){
                    translated[r] = CalcMethod.arabNumbers[i];
                }
            }
        }
        return translated;
    }
}

