package loops;

import java.util.Scanner;

public class cal {
	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);	
		int ch;
		do {
			System.out.println("Enter your choice");
			displaymenu();
			ch=Integer.parseInt(scr.next());
			switch(ch) {
			case 1:
				Addition();
				break;
			case 2:
				Subtraction();
				break;
			case 3:
				Multiplication();
				break;
			case 4:
				Divison();
				break;
			case 5:
				Modulo();
				break;	
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid operation");
				break;
			}
		}while(ch>=0);
		scr.close();
	}

	private static void Modulo() {
		Scanner a5=new Scanner(System.in);
		System.out.println("enter x value");
		int x=a5.nextInt();
		System.out.println("enter y value");
		int y=a5.nextInt();
		int sum = x%y;
		System.out.println("x%y="+sum);
		
	}

	private static void Divison() {
		Scanner a4=new Scanner(System.in);
		System.out.println("enter x value");
		int x=a4.nextInt();
		System.out.println("enter y value");
		int y=a4.nextInt();
		int sum = x/y;
		System.out.println("x/y="+sum);
		
	}

	private static void Multiplication() {
		Scanner a3=new Scanner(System.in);
		System.out.println("enter x value");
		int x=a3.nextInt();
		System.out.println("enter y value");
		int y=a3.nextInt();
		int sum = x*y;
		System.out.println("x*y="+sum);
		
	}

	private static void Subtraction() {
		Scanner a2=new Scanner(System.in);
		System.out.println("enter x value");
		int x=a2.nextInt();
		System.out.println("enter y value");
		int y=a2.nextInt();
		int sum = x-y;
		System.out.println("x-y="+sum);
		
	}

	private static void Addition() {
		Scanner a1=new Scanner(System.in);
		System.out.println("enter x value");
		int x=a1.nextInt();
		System.out.println("enter y value");
		int y=a1.nextInt();
		int sum = x+y;
		System.out.println("x+y="+sum);
		
	}

	private static void displaymenu() {
		System.out.println("\t1.Addition");
		System.out.println("\t2.Subtraction");
		System.out.println("\t3.Multiplication");
		System.out.println("\t4.Division");
		System.out.println("\t5.Modulo Division");
		System.out.println("\t6.Terminate");
	}

}
