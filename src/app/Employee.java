/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Comparator;

/**
 *
 * @author anhquan12
 */
public class Employee implements Comparator<Employee> {

    private static int currentId = 1;
    private int id;
    private String name;
    private String gender;

    public Employee() {
    }

    public int getId() {
        return currentId++;
    }

    public Employee(int id, String name, String gender) {
        this.id = currentId++;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }

}
