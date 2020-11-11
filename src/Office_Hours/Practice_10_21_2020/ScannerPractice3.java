package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender: ");
        String gender = scan.next();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter the name of your Country:");
        String country = scan.nextLine();

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine();

        System.out.println("Your gender is: "+gender+", Your age is: "+age+
                ", Your full name: "+fullName+", Zip code is "+zipCode+
                ", Country name: "+companyName+", Your salary is :"+salary+
                ", Company name is: "+companyName);


    }
}
/*
    1. Ask gender ( next() )
    2. ask age ( nextInt() )
    3. ask full name ( nextLine() )
    4. ask zipCode ( nextInt() )
    5. ask country name ( nextLine() )
    6. ask salary ( nextDouble() )
    7. ask company name ( nextLine() )
 */