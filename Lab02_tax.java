/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

/**
 *
 * @author TobyNaja
 */
import java.util.*;
public class Lab02_tax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble() , ans;
        if (salary > 50000){
            ans = salary + (salary*10/100);
            System.out.println(ans);
    }else {
        ans = salary + (salary*5/100);
        System.out.println(ans);
    }
    }
    
}
