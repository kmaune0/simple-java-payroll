// PayrollProgramPart2.java
// Copyright (C) 2014 Kyle Maune


import java.util.Scanner;

public class PayrollProgramPart2
{

	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);

			String cleanInputBuffer;
			String employeeName;
			double hourlyRate;
			double hoursWorked;
			double sum;
			boolean end = false;

		System.out.println("Welcome to the Payroll Program!\n");

		while (end == false)
		{
			hourlyRate = -1;
			hoursWorked = -1;

			System.out.println("Enter Name of Employee(enter 'stop' to exit program): ");
				employeeName = input.nextLine();

			if ("stop".equals(employeeName))
				end = true;
			else
				System.out.println("Enter a positive hourly rate:");
					hourlyRate = input.nextDouble();

			while (hoursWorked < 0)
			{
				System.out.println("Enter a positive number of hours worked:");
					hoursWorked = input.nextDouble();
			}
			sum = hourlyRate * hoursWorked;

			System.out.printf("The employee %s was paid $ %.2f this week\n\n", employeeName, sum);

		cleanInputBuffer = input.nextLine();

		}

	}

}
