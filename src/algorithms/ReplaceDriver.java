package algorithms;

import java.util.*;
import java.lang.*;
public class ReplaceDriver{
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String s=sc.nextLine();
    System.out.println("Enter the character to be replaced");
    char from=sc.nextLine().charAt(0);
    System.out.println("Enter the character to be replaced with");
    char to=sc.nextLine().charAt(0);
    System.out.println("The modified string is "+replace(s, from, to));
    //System.out.println(s.replace(from,to));
}
public static String replace(String str, char from, char to){
    //StringBuilder string= new StringBuilder(str);
    int i =str.indexOf(from);
    if(i!=-1){
        str=str.substring(0,i)+to+str.substring(i+1);
        return replace(str, from, to);
    }
    else{
        return str;}

}
}

