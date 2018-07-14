/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author anhquan12
 */
public class MainThread {
        private static Scanner s = new Scanner(System.in);
    
        public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        int choice;
        do {
            System.out.println("Please choose :");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    manager.addEmployee();
                    break;
                case 2:
                    manager.display();
                    break;
                case 3: 
                    manager.searchByGender();
                    break;
                case 4 : 
                    manager.sortEmployee();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose 1 -- > 5 ");
                    break;
            }
        } while (choice != 0);
    }
}
