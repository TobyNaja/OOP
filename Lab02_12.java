/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TobyNaja
 */
import java.util.Scanner;
public class Lab02_12 {
    public static void main(String[] args) {
        int age,numDay1,numDay2;
        double weight,salary=0,sum=0;
        Scanner nc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = nc.nextLine();
        System.out.print("Please insert your age : ");
        age = nc.nextInt();
        System.out.print("Please insert number of working days : ");
        numDay1 = nc.nextInt();
        System.out.print("Please insert number of absent days : ");
        numDay2 = nc.nextInt();
        System.out.print("Please insert your body weight : ");
        weight = nc.nextDouble();
        System.out.println("Hi " + name);
        if (age >= 21 && age <= 30) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        }else if (age >= 31 && age <= 40) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        }else if (age >= 41 && age <= 50) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        }else if (age >= 51 && age <= 60) {
            salary = (numDay1 * 3000) ;
        }if (weight >= 10 && age <= 60) {
            sum = salary + 5000;
        }else if (weight >= 61 && weight <= 90){
            sum = salary + (5000 - ((weight - 60) * 10));
        }
        System.out.println("Your salary is " + salary + " Baht");
        System.out.println("Your salary and bonus is " + sum + " Baht");
    }
}
