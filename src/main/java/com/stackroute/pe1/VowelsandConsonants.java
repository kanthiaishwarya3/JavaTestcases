package com.stackroute.pe1;

import java.util.Scanner;
public class VowelsandConsonants {
    String s="";
    int len;
    public String check(String s)
    {
        len=s.length();

        for(int i=0;i<len;i++)
        {
            char input=s.charAt(i);  // Individual character is taken by charAt()

            if((input>='a' && input<='z') || (input>='A' && input<='Z'))
            {
                if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u')
                {
                    s="Vowel";
                }
                else
                {
                    s="Consonant";
                }
            }
            else
            {
                s="Input is not a letter";
            }
        }
        return s;
    }
}
