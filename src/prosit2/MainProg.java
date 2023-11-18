/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit2;

import com.entities.Employee;
import com.utils.Data;
import java.util.List;

/**
 *
 * @author aissa
 */
public class MainProg {

    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

        System.out.println("************* Affichage des employés *************");
        employees.stream().forEach(/* TO DO 1 */);

        System.out.println("************* Affichage des employés dont le nom commence par la lettre n *************");
        employees.stream().filter(/* TO DO 2 */).forEach(/* TO DO 3 */);

        System.out.println("************* Affichage des employés dont le nom commence par la lettre n et le salaire > 1000 *************");
        employees.stream().filter(/* TO DO 4 */).filter(/* TO DO 5 */).forEach(/* TO DO 6 */);

        System.out.println("************* Affichage des employés dont le nom commence par la lettre s et triés par salaire *************");
        employees.stream().filter(/* TO DO 7 */).sorted(/* TO DO 8 */).forEach(/* TO DO 9 */);

        System.out.println("************* Affichage des noms employés dont le salaire > 600 de deux façons *************");
        System.out.println("************* Méthode 1 *************");
        employees.stream().filter(/* TO DO 10 */).forEach(/* TO DO 11 */);
        System.out.println("************* Méthode 2 *************");
        employees.stream().filter(/* TO DO 12 */).map(/* TO DO 13 */).forEach(/* TO DO 14 */);

        System.out.println("************* Ajouter 200DT pour les employés dont le nom commence avec m et les affichés ensuite *************");
        employees.stream().filter(/* TO DO 15 */).forEach(/* TO DO 16 */);
    }
}
