package com.aurionpro.test;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
		int number1 = Integer.parseInt(args[0]);
		System.out.println("Statement 1");
		int number2 = Integer.parseInt(args[1]);
		System.out.println("Statement 2");
		int div = number1/number2;
		System.out.println("Division : "+div);
		}
		catch (ArithmeticException e) {
			System.out.println("Number can not be divided by Zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Access to invalid index position");
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid conversion to type Integer");
		}
		System.out.println("Outside try, catch, end of code!!");
	}

}
