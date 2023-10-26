import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int a=ulaz.nextInt();
        System.out.println("Unesite drugi broj: ");
        int b=ulaz.nextInt();
        System.out.printf("Prvi broj je %d, a drugi broj je %d.", a, b);
    }
}
