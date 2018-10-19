package ba.unsa.etf.rpr.predavanje03;

import java.util.*;

public class Main{

    public static int sumaCifara(int n){
        int suma = 0;
        while(n!=0){
            suma=suma+n%10;
            n=n/10;
        }
        return suma;
    }

    public static void main(String[] args){
        Scanner ulaz=new Scanner(System.in);
        int n;
        do{
            System.out.print("Unesite broj n: ");
            n = ulaz.nextInt();
            if(n<1)
                System.out.println("Broj mora biti veci od 0");
        }while(n<1);
        System.out.print("Brojevi izmedju 1 i n koji su djeljivi sa sumom svojih cifara su: ");
        for(int i=1;i<=n;i++) {
            if (i % sumaCifara(i) == 0)
                System.out.print(i + " ");
        }
    }

}
