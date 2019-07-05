package com.stackroute.pe1;

import java.util.Scanner;

public class StringReverse {
    public String stringreverse(String str) {
        String reverse = "";
        int i;


        for (i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }
}