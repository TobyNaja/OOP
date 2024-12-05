/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02_.deposit;

/**
 *
 * @author TobyNaja
 */
import java.util.Scanner;
public class Lab02_Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble() , ans = 0;
        char type = sc.next().charAt(0);
        if (type == 'A'){
            ans = money + (money*1.5/100);
        }else if (type == 'B'){
            ans = money + (money*2.0/100);
        }else if (type == 'C'){
            ans = money + (money*1.5/100);
        }else if (type == 'X'){
            ans = money + (money*5.0/100);
        }
        System.out.println(ans);
    }
    
}
