package Oct5;

public class Modulus {
    public double modulus(double a,double b){
        double c = a%b;
        return c;
    }
    public double modulus(double a,double b,double c){
        double d = (a%b)%c;
        return d;
    }
    public double modulus(double a,double b,double c,double d){
        double e = (a%b)%(c%d);
        return e;
    }
}
