package ba.unsa.etf.rpr.t1;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] arg){
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj=ulaz.nextInt();
        for(int i=1; i<broj; i++){
            if(djeljivSaSumomCifara(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean djeljivSaSumomCifara(int broj){
        int suma=sumaCifara(broj);
         return broj%suma==0;

    }
    public static int sumaCifara(int broj){
        int suma=0;
        while(broj!=0){
            suma+=(broj%10);
            broj=broj/10;
        }
        return suma;
    }

}
