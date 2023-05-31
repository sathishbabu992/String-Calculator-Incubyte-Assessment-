package Incubyte;

import java.util.Scanner;

public class Incubyte {
    public static int Add(String numbers) throws Exception {
        String [] result = numbers.split("[\n$&+,:;=?@#|'<>.^*()%!]+");
        int sum =0;
        int m = 1000000007;
        StringBuilder neg = new StringBuilder();
        for(String word: result) {
            if(!word.equals("") && word.matches("^-?\\d+$")){
                int a = Integer.parseInt(word);
                if(a>0){ 
                    sum+=a;
                    sum%=m;
                }
                else{
                    neg.append(a+",");
                }
            }
        }
        if(neg.length()>0){
            throw new Exception("negatives not allowed : "+ neg.substring(0, neg.length()-1).toString()+" and sum with positive numbers is :"+sum);
        } 
        return sum;
    }
    public static void main(String[] arg){
        Scanner scr = new Scanner(System.in);
        try{
        System.out.println(Add(scr.next()));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
