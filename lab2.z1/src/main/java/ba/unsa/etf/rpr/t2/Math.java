package ba.unsa.etf.rpr.t2;

public class Math {

    public final static double PI=3.14159265358979323846;

    public static double sin(double input){
        double sum=0;
        for(int i=0; i<=5; i++){
            sum+=power(-1,i)*(power(input, 2*i+1))/faktoriel(2*i+1);
        }
        return sum;
    }

    public static int faktoriel(int input){
        int fakt=1;
        for(int i=2; i<=input; i++){
            fakt=fakt*i;
        }
        return fakt;
    }

    public static double power(double input, int pow){
        double product=1;
        for(int i=0; i<=pow; i++){
            product*=input;
        }
        return product;
    }

    public static void main(String[] args){
        double broj=Double.parseDouble(args[0]);
        double sinus=sin(broj);
        System.out.println("Sinus broja "+ broj +" je "+ sinus);
        int br2=(int) broj;
        long faktorijel=faktoriel(br2);
        System.out.println("Faktorijel broja "+ br2 +" je "+ faktorijel);
    }

}
