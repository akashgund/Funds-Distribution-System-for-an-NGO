/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author akash
 */
public class Employee {
    private String name;
    private int employeeId;
    private static int count = 1;

    public Employee() {
        employeeId = count;
        count++;
    }

    public int getId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    

    
}
