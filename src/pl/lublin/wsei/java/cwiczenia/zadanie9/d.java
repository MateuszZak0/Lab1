package pl.lublin.wsei.java.cwiczenia.zadanie9;

import java.util.Scanner;

public class d {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int liczba1= 0 , liczba2 = 0;
        do{
            System.out.print("Podaj pierwsza lizbe: ");
            liczba1 = input.nextInt();
            if(liczba1 ==0)break;

                System.out.print("Podaj druga liczbe: ");
                liczba2 = input.nextInt();
                if(liczba2 ==0)break;

                System.out.printf("Wynik dzialania %d+ %d= %d%n",liczba1,liczba2,liczba1+liczba2);

        }while(true);
    }
}
