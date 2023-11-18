/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit4;

import com.entities.Employee;
import com.utils.Data;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author aissa
 */
public class MainProg {

    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

        System.out.println("************* Afficher une chaine de caractére qui contient tous les noms des employés *************");
        System.out.println(employees.stream()./* TO DO 1 */);

        System.out.println("************* Afficher une chaine de caractére qui contient tous les noms des employés en majuscule separés par # *************");
        System.out.println(employees.stream()./* TO DO 2 */);

        // Retourner une set d'employés
        Set<Employee> emps = employees.stream()./* TO DO 3 */;

        // Retourner une TreeSet d'employés (tri par nom)
        TreeSet<Employee> emps2 = employees.stream()./* TO DO 4 */;

        // Retourner une Map qui regroupe les employés par salaire
        Map<Integer, List<Employee>> map = employees.stream()./* TO DO 5 */;

        // Retourner une Map qui regroupe les nom des employés par salaire
        Map<Integer, String> map2 = employees.stream()./* TO DO 6 */;

        System.out.println("************* Afficher le  min, max, average, sum, count des salaires *************");
        System.out.println(employees.stream()./* TO DO 7 */;
    }
}
