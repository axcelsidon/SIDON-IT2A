
package axcel;

import java.util.Scanner;

public class Grades {
    public void getGrades(){
     Scanner sc = new Scanner(System.in);
        
     String name;
     int math, sci, eng, com,tot, marks;
     float ave;
        System.out.print("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter marks in: ");
        
        System.out.print("Math: ");
        math = sc.nextInt();
        System.out.print("Science: ");
        sci = sc.nextInt();
        System.out.print("English: ");
        eng = sc.nextInt();
        System.out.print("Computer: ");
        com = sc.nextInt();
        
        System.out.println("--------------------");
        System.out.println("Grade Detail");
        System.out.println("--------------------");
        
        tot = math + sci + eng + com;
        ave = tot / 4;
        
        System.out.println("Name: "+name);
        
        System.out.println("Total Marks: "+tot);
        
        System.out.println("Total Average: "+ave);
}

}