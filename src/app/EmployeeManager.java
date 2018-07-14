/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author anhquan12
 */
public class EmployeeManager {

    private static Scanner s = new Scanner(System.in);
    private static ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee() {
        System.out.println("Enter information :");
        System.out.println("=====================");
        System.out.println("Enter name :");
        String name = s.nextLine();
        System.out.println("Enter gender :");
        String gender = s.nextLine();
        Employee employee = new Employee(1, name, gender);
        list.add(employee);
    }

    public void display() {

        for (int i = 0; i < list.size(); i++) {
            Employee emp = list.get(i);
            System.out.println("name :" + emp.getName() + "\tgender :" + emp.getGender());
        }

    }

    public void searchByGender() {
        System.out.println("Enter gender need search :");
        String gender = s.nextLine();
        for (int i = 0; i < list.size(); i++) {
            Employee emp = list.get(i);
            if (emp.getGender().equalsIgnoreCase(gender)) {
                System.out.println("name :" + emp.getName() + "\tgender :" + emp.getGender());

            }
        }
    }
    
    public void sortEmployee() {
        Collections.sort(list, new Employee());
        for (Employee temp : list) {
            System.out.println("name :"+temp.getName());
        }
    }
}
