package pl.lublin.wsei.java.cwiczenia.zadanie7;

import static java.lang.Math.pow;

public class h {
    public static void main(String[] args) {
        int suma = 0;

        System.out.printf("arg\t\tlog2(arg)\t\tsum(arg)\n");
        for (int i = 0; i <= 15; i += 1)
            System.out.printf("%d\t\t%f\t\t%d\t\n", (int) pow(2, i),
                    (Math.log((int) pow(2, i)) / Math.log(2)), suma += (int) pow(2, i));
    }
}