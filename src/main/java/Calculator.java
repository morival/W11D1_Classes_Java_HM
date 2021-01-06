public class Calculator {
    private int int1;
    private int int2;
    private double doub1;
    private double doub2;

    public Calculator(int int1, int int2, double dbl1, double dbl2) {
        this.int1 = int1;
        this.int2 = int2;
        this.doub1 = dbl1;
        this.doub2 = dbl2;
    }

    public int sum() {
        return int1 + int2;
    }

    public int sub() {
        return int1 - int2;
    }

    public int mul() {
        return int1 * int2;
    }

    public double div() {
        return doub1 / doub2;
    }
}
