package pl.lublin.wsei.java.cwiczenia.zadanie10;

import java.io.PrintStream;
import java.util.Scanner;
import static  java.lang.Integer.toBinaryString;
import static  java.lang.Integer.toHexString;
public class f
{
    private static String lewyUzupelniacz(String aText, char aChar,int aWidth)
    {
        String res= aText;
        for(int i=0;i<aWidth-aText.length();i++)
            res= aChar + res;
        return res;
    }
    public static void main(String [] args)
    {
        Scanner input= new Scanner(System.in);
        int liczba1;
        do{
            System.out.print("\nPodaj liczbe do zamiany na binarny i heksadecymalny system: ");
            liczba1= input.nextInt();

            if(liczba1==0)break;
            System.out.printf("\nLiczba: %d to w postaci binarnej: %s ,a heksadecymalnej: %s ", liczba1, lewyUzupelniacz(toBinaryString(liczba1),
                    '0', 8), lewyUzupelniacz(toHexString(liczba1),'0',8));

        }while(true);
    }
}
