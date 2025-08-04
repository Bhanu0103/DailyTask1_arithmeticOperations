package basic;
import java.util.Scanner;
public class Task1 {
	    public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter inputs here");
	      while(true)
	      {
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();
	        System.out.println("enter + for addition");
	        System.out.println("enter - for subtraction");
	        System.out.println("enter * for multiplication");
	        System.out.println("enter / for addition");
	        char ch = sc.next().charAt(0);
	        switch(ch)
	        {
	          case '+' : addition(num1,num2);
	          break;
	          case '-': subtraction(num1,num2);
	          break;
	          case '*' : multiplication(num1,num2);
	          break;
	          case '/' : division(num1,num2);
	          break;
	          default : System.out.println("you have entered wrong symbol");
	        }
	      }
	      
	  }
	  public static void addition(int a,int b)
	  {
	    System.out.println(a+b);
	    sample();
	  }
	  public static void subtraction(int a,int b)
	  {
	     System.out.println(a-b);
	     sample();
	  }
	  public static void multiplication(int a,int b)
	  {
	     System.out.println(a*b);
	     sample();
	  }
	  public static void division(int a,int b)
	  {
	     System.out.println(a/b);
	     sample();
	  }
	  public static void sample()
	  {
	    System.out.println("want to do arithmetic operation again ? then enter inputs otherwise leave :)");
	  }
	}

