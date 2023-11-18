/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import com.entities.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aissa
 */
public class Data {

    public static List<Employee> employees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("mehdi", "blueWorker", 100));
        employees.add(new Employee("nader", "blueWorker", 100));
        employees.add(new Employee("karray", "blueWorker", 150));
        employees.add(new Employee("karim", "blueWorker", 150));
        employees.add(new Employee("houssem", "blueWorker", 100));
        employees.add(new Employee("sana", "teacher", 700));
        employees.add(new Employee("salma", "teacher", 900));
        employees.add(new Employee("wiem", "teacher", 900));
        employees.add(new Employee("mariem", "teacher", 900));
        employees.add(new Employee("ibrahim", "teacher", 900));
        employees.add(new Employee("bassem", "teacher", 1000));
        employees.add(new Employee("wael", "teacher", 900));
        employees.add(new Employee("imed", "teacher", 1000));
        employees.add(new Employee("nadhir", "responsable", 1100));
        employees.add(new Employee("hamza", "responsable", 1000));
        employees.add(new Employee("bassem", "responsable", 1000));
        employees.add(new Employee("marwa", "responsable", 900));
        employees.add(new Employee("maroua", "responsable", 900));
        employees.add(new Employee("zayen", "responsable", 1200));
        employees.add(new Employee("sofienne", "responsable", 1200));
        employees.add(new Employee("khalil", "Administrator", 2100));

        return employees;
    }
}
