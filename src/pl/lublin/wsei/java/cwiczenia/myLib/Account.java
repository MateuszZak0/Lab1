package pl.lublin.wsei.java.cwiczenia.myLib;


import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Account {
    private String name;
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

    public String getName()
    {
        return name;
    }
    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0;i<tokens.length;i++)
            tokens[i]= StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');

    }
    public static String translit(String arg)
    {
        arg=arg.toLowerCase();
        char[] tokens= arg.toCharArray();
        int EZ = 0;
        String UK= "";
        for (int i=0;i<tokens.length;i++)
        {
            EZ= ukrAlphabet.indexOf(tokens[i]);
            if(EZ>=0)
                UK+= translitRepl[EZ];
            else
                UK+=tokens[i];
        }
        return capitalize(UK);

    }
  public void setName(String name)
  {
      this.name=capitalize(name);
  }

}
