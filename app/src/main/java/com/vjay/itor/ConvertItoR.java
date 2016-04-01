package com.vjay.itor;

/**
 * Created by VinayJain on 1/4/16.
 */
public class ConvertItoR {


    public static String integerToRoman(int n){

        String roman="";
        int repeat;
        for(int x=0; n>0; x++){
            repeat=n/magnitude[x];
            for(int i=1; i<=repeat; i++){
                roman=roman + romanSymbol[x];
            }
            n=n%magnitude[x];
        }
        if(roman.length() == 0){
            roman = "ERROR";
        }
        return roman;

    }

    public static int magnitude[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static String romanSymbol[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
}
