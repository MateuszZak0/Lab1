package pl.lublin.wsei.java.cwiczenia.myLib;

import pl.lublin.wsei.java.cwiczenia.myLib.Account;
import static  org.apache.commons.lang3.StringUtils.capitalize;
public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("mateusz żak");
        System.out.println(acc.getName());
        System.out.println(acc.translit("Адам Нощак"));
        System.out.println(acc.translit("Ян КощалкиW"));
        System.out.println(acc.translit("Щитам Щ Полсце"));

    }


}