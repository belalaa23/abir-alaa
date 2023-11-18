/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit3;

import com.entities.Employee;
import com.utils.Data;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author aissa
 */
public class MainProg {

    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

        System.out.println("************* Afficher le nombre des employés dont le nom commence avec n *************");
        System.out.println(employees.stream()./* TO DO 1 */);

        System.out.println("************* Afficher la somme des salaires de tous les employés (indice : mapToInt) *************");
        System.out.println(employees.stream()./* TO DO 2 */);

        System.out.println("************* Afficher la moyenne des salaires des employés dont le nom commence avec s *************");
        System.out.println(employees.stream()./* TO DO 3 */);

        // Retourner la liste de tous les employés
        List<Employee> emps = employees.stream()./* TO DO 4 */;

        // Retourner la liste des employés dont le nom commence par s
        List<Employee> emps2 = employees.stream()./* TO DO 5 */;

        System.out.println("************* Afficher true si il y a au min un employés dont le salaire > 1000, false si non *************");
        System.out.println(employees.stream()./* TO DO 6 */);

        System.out.println("************* Afficher le premier employé dont le nom commence avec s avec deux maniéres différentes *************");
        System.out.println("************* Méthode 1 *************");
        employees.stream()./* TO DO 7 */;
        System.out.println("************* Méthode 2 *************");
        employees.stream()./* TO DO 7 */;

        System.out.println("************* Afficher le second employé dont le nom commence avec s *************");
        employees.stream()./* TO DO 8 */;
    }
}
