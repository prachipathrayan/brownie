package algorithms;

import java.util.*;
import java.lang.*;

public class ListDriver{
    static int count=0;
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n=sc.nextInt();
        if(n>0){
            LinkedList<Integer> list= new LinkedList<Integer>();
            int m;
            for (int i=0;i<n ;i++ ){
                m=sc.nextInt();
                list.add(m);
            }
            System.out.println("Printing the list:");
            System.out.println(list.toString().replaceAll("\\[|,|\\]",""));
            System.out.println("Enter the key to find it's occurrence: ");
            int occurrence=sc.nextInt();
            System.out.println(occurrence+" occurs for "+occurs(list, occurrence)+" times.");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    public static int occurs(LinkedList list, int occurrence){
        int i=list.indexOf(occurrence);
        if(i!=-1){
            count++;
            list.remove(i);
            return occurs(list, occurrence);
        }
        else{
            return count;
        }
    }
}