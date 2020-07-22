package algorithms;
import java.util.*;
import java.lang.*;

public class BinarySearch{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Teams:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the score:");
        for (int i=0;i<n ;i++ ){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the score to be searched:");
        int score=sc.nextInt();
        int pos=binarySearch(a,n,score);
        if(pos>0){
            System.out.println(score+" is the score of Team "+pos);}
        else{
            System.out.println("Score not found");
        }
    }
    public static int binarySearch(int[] ar, int size, int key){
        int mid;
        int first=0;
        int last=size-1;
        int pos=0;
        while(first<=last){
            mid=(first+last)/2;
            if(ar[mid]==key){
                pos=mid+1;
                break;
            }
            else if(ar[mid]>key)
            {
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        if(first>last){
            pos= 0;
        }
        return pos;
    }
}