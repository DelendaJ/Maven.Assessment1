package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        String str;
        int counter = input.length();
        for (int i = 0; i <input.length(); i++)
        {
            for (int j = i+2; j <= input.length(); j++)
            {
                str=input.substring(i,j);
                counter += count(str);
            }
        }
        return counter;
    }
    public static int count(String a)
    {
        for (int i = 0; i <a.length (); i++)
        {
            if(a.charAt(i)!=a.charAt(a.length()-1-i))
                return 0;
        }
        return 1;
    }
}
