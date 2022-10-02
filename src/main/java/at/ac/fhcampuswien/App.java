package at.ac.fhcampuswien;

import org.graalvm.compiler.serviceprovider.IsolateUtil;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }
//test
    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char Buchstabe = 'Z';
        int Hexadezimalzahl = 0xface;
        int Octal = 012;
        long long_Variable = 80L;
        double exponential = 44e-1f;
        float zahl1 = 5.5f;
        double exponential2 = 8.88e1;
        double zahl2 = 99.9;
        int sum = 0;
        sum =  (int)Buchstabe + Hexadezimalzahl + (int) Octal + (int)long_Variable + (int)exponential + (int)exponential2 + (int)zahl1 + (int)zahl2;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //int sum = num1 + num2;
        System.out.println((num1+num2)+"");
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int num1 = scan.nextInt();
        System.out.print("y: ");
        int num2 = scan.nextInt();

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("After Swap:");
        System.out.println("x: " + num1);
        System.out.println("y: " + num2);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
        int num1 = scan.nextInt();
        System.out.print("n2: ");
        int num2 = scan.nextInt();
        if(num1 > num2){
            System.out.println("n1 > n2");
        }
        else if(num1 < num2){
            System.out.println("n2 > n1");
        }
        else{
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int Umsatz = scan.nextInt();
        if(Umsatz < 0 || Umsatz >= 100000){
            System.out.println("Invalid Revenue");
        }
        else if(0 <= Umsatz && Umsatz < 20000){
            System.out.println("Poor Sales Revenue");
        }
        else if(20000 <= Umsatz && Umsatz < 50000){
            System.out.println("Average Sales Revenue");
        }
        else if(50000 <= Umsatz && Umsatz < 80000){
            System.out.println("Good Sales Revenue");
        }
        else if(80000 <= Umsatz && Umsatz < 100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int ConmissionRate = scan.nextInt();
        switch (ConmissionRate){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scan.nextInt();
        if(year%4 == 0 && (year%100 != 0 || year%400 == 0)){
            System.out.println("Leapyear");
        }
        else{
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num1 = scan.nextInt();
        int Reversed = 0;
        while(num1 != 0){
            Reversed *= 10;
            Reversed += num1%10;
            num1 /= 10;
        }
        System.out.println(Reversed);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}