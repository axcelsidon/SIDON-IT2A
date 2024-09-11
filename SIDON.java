package axcel;

import java.util.Scanner;

public class SIDON {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Applications: ");
        int numApplications = scanner.nextInt();

        LoanApplication[] applications = new LoanApplication[numApplications];

        for (int i = 0; i < numApplications; i++) {
            System.out.println("Enter details of application " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Monthly Income: ");
            double monthlyIncome = scanner.nextDouble();

            System.out.print("Credit Score: ");
            int creditScore = scanner.nextInt();

            System.out.print("Existing Loans: ");
            double existingLoans = scanner.nextDouble();

            applications[i] = new LoanApplication(id, name, monthlyIncome, creditScore, existingLoans);
        }

        System.out.println("Loan Application Details:");
        for (LoanApplication application : applications) {
            System.out.println("ID: " + application.id);
            System.out.println("Name: " + application.name);
            System.out.println("Monthly Income: $" + String.format("%.2f", application.monthlyIncome));
            System.out.println("Credit Score: " + application.creditScore);
            System.out.println("Existing Loans: $" + String.format("%.2f", application.existingLoans));
            System.out.println("Loan Status: " + (application.isApproved() ? "Approved" : "Denied"));
            System.out.println();
        }
    }
}