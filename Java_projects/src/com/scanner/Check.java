package com.scanner;

import java.util.Scanner;

public class Check {

		public static void main(String[] args) {
			
			Scanner ref= new Scanner(System.in);
//			System.out.println("Just check");
			
			
//			String education_grade = ref.next();//next() can read the input only till the space.
			
			System.out.println("Name of the person" );
			String name = ref.nextLine();//nextLine() reads input including space between the words (that is, it reads till the end of line \n)
			System.out.println(name );
			
			System.out.println("person Age" );
			int age = ref.nextInt();
			System.out.println(age );
			
			System.out.println("Salary");
			float salary = ref.nextFloat();
			System.out.println(salary );
			
			System.out.println("Email Address");
			String email_address = ref.nextLine();
			System.out.println(email_address);
			
			System.out.println("percentage of marks" );
			float marks_percentage = ref.nextFloat();
			System.out.println(marks_percentage);
			
	
}

}





