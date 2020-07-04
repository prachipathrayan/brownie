import java.util.*;
import java.lang.String; 
  public class Main
  {
      public static void main(String[] args)
      {
           Scanner sc=new Scanner(System.in);
           String expression=sc.nextLine();
           String operator= expression.replaceAll("[A-Za-z0-9=]","");
           if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))
           {
               String[] numbers= expression.split("[^0-9]");
               System.out.println(calculateExpression(numbers));
           }
           else{
               System.out.println("Invalid Input");
           }
       }
       public static String calculateExpression(String[] numbers)
       {
           String returnStr="";
           if(Integer.valueOf(numbers[0])+Integer.valueOf(numbers[1])==Integer.valueOf(numbers[2]))
           {
               returnStr=returnStr+numbers[0]+"+"+numbers[1]+"="+numbers[2];
           }
           else if(Integer.valueOf(numbers[0])-Integer.valueOf(numbers[1])==Integer.valueOf(numbers[2]))
           {
               returnStr=returnStr+numbers[0]+"-"+numbers[1]+"="+numbers[2];
           }
           else if(Integer.valueOf(numbers[0])*Integer.valueOf(numbers[1])==Integer.valueOf(numbers[2]))
           {
               returnStr=returnStr+numbers[0]+"*"+numbers[1]+"="+numbers[2];
           }
           else
           {
               returnStr=returnStr+numbers[0]+"/"+numbers[1]+"="+numbers[2];
           }
           return returnStr;
       }
  }
