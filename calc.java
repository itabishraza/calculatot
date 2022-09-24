import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your 1st num");
		double input1=sc.nextDouble();
		
		System.out.println("enter your 2nd number");
		double input2=sc.nextDouble();
		
	    	System.out.println("press + for addition");
	    	System.out.println("press - for subtraction");
	    	System.out.println("press * for multiplication");
		System.out.println("press / for division");
		
		double addition= input1+input2;
		double subtraction= input1-input2;
		double multiplication= input1*input2;
		double division= input1/input2;
		
		
		char operator = sc.next().charAt(0);
		
		switch(operator)
		{
		    case '+':
		        System.out.println(input1+"+"+input2+"="+addition);
		        break;
		    case '-':
		        System.out.println(input1+"-"+input2+"="+ subtraction);
		        break;
		    case '*':
		        System.out.println(input1+"*"+input2+"="+ multiplication);
		        break;
		    case '/':
		        System.out.println(input1+"/"+input2+"="+ division);
		        break;
		   
		}
	}
}

