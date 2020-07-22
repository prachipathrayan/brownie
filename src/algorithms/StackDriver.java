package algorithms;
import java.util.*;
import java.lang.*;
class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
};
public class StackDriver{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of List: ");
        int n=sc.nextInt();
        if(n>0){
            Linkedlist b= new Linkedlist();
            b.createStack(n);
            System.out.println("Elements in stack");
             //b.stackReverse();
            b.displayStack();
            System.out.println("Elements in the stack after reversal");
            b.stackReverse();
            b.displayStack();
        }
        else{
            System.out.println("Invalid Length");
        }
    }

}
class Linkedlist{
    static Node head;
    public static int createStack(int n){
        if(n>0){
            Node new_node= new Node(n);
            new_node.next=head;
            head=new_node;
            return createStack(n-1);
        }
        else{
            return 0;
        }
    }
    public static void displayStack(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public static void stackReverse(){
        Node previousNode=null;
        Node nexNode;
        Node currentNode=head;
        while(currentNode!=null){
            nexNode=currentNode.next;
            currentNode.next=previousNode;
            previousNode=currentNode;
            currentNode=nexNode;
        }
        head=previousNode;
    }
}
