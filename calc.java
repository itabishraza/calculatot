import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your 1st num");
		int input1=sc.nextInt();
		System.out.println("enter your 2nd number");
		int input2=sc.nextInt();
		System.out.println("press + for addition");
		System.out.println("press - for subtraction");
		System.out.println("press * for multiplication");
		System.out.println("press / for division");
		char operator = sc.next().charAt(0);
		
		switch(operator)
		{
		    case '+':
		        System.out.println(input1+"+"+input2+"="+ (input1+input2));
		        break;
		    case '-':
		        System.out.println(input1+"-"+input2+"="+ (input1-input2));
		        break;
		    case '*':
		        System.out.println(input1+"*"+input2+"="+ (input1*input2));
		        break;
		    case '/':
		        System.out.println(input1+"/"+input2+"="+ (input1/input2));
		        break;
		}
	}
}

