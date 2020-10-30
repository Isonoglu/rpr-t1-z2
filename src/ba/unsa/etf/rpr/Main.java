package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int broj){
        int suma = 0;
        while(broj != 0){
            suma = suma + broj%10;
            broj = broj / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int broj = ulaz.nextInt();
        for(int i = 1; i < broj; i++) {
            int sumaCifaraBroja = sumaCifara(i);
            if (i % sumaCifaraBroja == 0)
                System.out.println(i);

        }

    }
}
