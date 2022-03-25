package pl.lublin.wsei.java.cwiczenia.zadanie8;

import java.util.Scanner;
public class a {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Podaj pierwsza liczbe: ");
        num1 = input.nextInt();
        System.out.print("Podaj druga liczbe: ");
        num2 = input.nextInt();
        System.out.printf("Wynik dodawnia %d + %d = %d%n",num1,num2,num1+num2);
    }

}
