package Calc;

class CalcExeptions extends Exception{
    public CalcExeptions() {
    }
    public CalcExeptions(String message) {
        super(message);
    }
    public CalcExeptions(String message, Throwable cause) {
        super(message, cause);
    }
    public CalcExeptions(Throwable cause) {
        super(cause);
    }
    public CalcExeptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
