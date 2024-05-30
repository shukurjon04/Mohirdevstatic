public class MathFunction {
    public static double pi;
    public static double e;

    public MathFunction(double PI, double E) {
        pi = PI;
        e = E;
    }
    public static double daraja(double a){
        return Math.pow(e,a);
    }
    public static double yuza(double a, double b,double c){
        double x = (a+b+c)/2;
        return Math.sqrt(x*(x-a)*(x-b)*(x-c));
    }
}
