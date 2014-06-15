// PayrollProgramPart3.java
// Copyright (C) 2014 Kyle Maune


import java.util.Scanner;

public class PayrollProgramPart3
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


class Employee
{
		private String name;
		private double hourlyRate;
		private double hoursWorked;

		public Employee ()
		{
				//implicit call to object constructor occurs here
				name = "";
				hourlyRate = 0.0;
				hoursWorked = 0.0;
		}

		// Three argument initialization constructor
		public Employee(String employeenameIn, double hourlyRateInDollarsIn, double hoursWorkedInWeekIn) {
				//implicit call to object constructor occurs here
				name = employeenameIn;
				hourlyRate = hourlyRateInDollarsIn;
				hoursWorked = hoursWorkedInWeekIn;
	} // end three argument intialization constructor

		public void setName (String name) {
				this.name = name;
	}

		public String getName () {
				return name;
	}

		public void setpayRate (double payRate) {
				this.hourlyRate = payRate;
	}

		public double getpayRate () {
				return hourlyRate;
	}

		public void sethoursWorked (double hours) {
				this.hoursWorked = hours;
	}

		public double gethoursWorked () {
				return hoursWorked;
	}

		public double getearnedPay () {
				return hourlyRate * hoursWorked;
	}

} // end class Employee
