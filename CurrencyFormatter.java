import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale usLocale = Locale.US;
        Locale indLocale = new Locale("en","IN");
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;
        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indLocale);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);
        
        String us = usFormat.format(payment);   
        String india = indiaFormat.format(payment);   
        String china = chinaFormat.format(payment);   
        String france = franceFormat.format(payment);        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}