package pl.lublin.wsei.java.cwiczenia.zadanie10;

import java.util.Scanner;
import static  java.lang.Integer.toBinaryString;
import static  java.lang.Integer.toHexString;
public class b {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
                int liczba1;
        do{
            System.out.print("\nPodaj liczbe do zamiany na binarny i heksadecymalny system: ");
            liczba1= input.nextInt();

            if(liczba1==0)break;
            System.out.printf("\nLiczba: %d to w postaci binarnej: %s ,a heksadecymalnej: %s ",liczba1,toBinaryString(liczba1),toHexString(liczba1));
        }while(true);
    }
}
