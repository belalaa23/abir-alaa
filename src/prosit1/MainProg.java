/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit1;

import com.entities.Personne;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author aissa
 */

 // hello Abir & alaa
public class MainProg {

    public static void main(String[] args) {
        List<Personne> personnes = new ArrayList<>();

        personnes.add(new Personne(24, "Oussema"));
        personnes.add(new Personne(22, "Ahmed"));
        personnes.add(new Personne(21, "Moetaz"));
        personnes.add(new Personne(19, "Saif"));

        System.out.println("************* Liste de personnes dont age > 20 *************");
        personneDisplayPredicate(/* TO DO 1 */);

        System.out.println("************* Affichage Personnes *************");
        personneDisplayConsumer(/* TO DO 2 */);

        System.out.println("************* Affichage liste personnes dont age > 20 *************");
        personneDisplayPredicateConsumer(/* TO DO 3 */);

        System.out.println("************* Liste des noms *************");
        System.out.println(personneNameDisplay(/* TO DO 4 */));

        System.out.println("************* Tri ascendant de deux personnes avec le nom *************");
        personneNameTriAscendant(/* TO DO 5 */);

        System.out.println("************* créer une personne *************");
        System.out.println(creePersonne(/* TO DO 6 */));
    }

    public static void personneDisplayPredicate(List<Personne> persons, Predicate<Personne> predicate) {
        for (Personne p : persons) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }
    }

    public static void personneDisplayConsumer(List<Personne> persons, Consumer<Personne> consumer) {
        for (Personne p : persons) {
            consumer.accept(p);
        }
    }

    public static void personneDisplayPredicateConsumer(List<Personne> persons, Predicate<Personne> predicate, Consumer<Personne> consumer) {
        for (Personne p : persons) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }

    public static String personneNameDisplay(List<Personne> persons, Function<Personne, String> function) {
        String names = "";
        for (Personne p : persons) {
            names += function.apply(p) + " ";
        }
        return names;
    }

    public static void personneNameTriAscendant(Personne p1, Personne p2, Comparator<Personne> comparator) {
        if (comparator.compare(p1, p2) > 0) {
            System.out.println(p2.getNom() + " < " + p1.getNom());
        } else if (comparator.compare(p1, p2) < 0) {
            System.out.println(p1.getNom() + " < " + p2.getNom());
        } else {
            System.out.println(p1.getNom() + " = " + p2.getNom());
        }

    }

    public static Personne creePersonne(Supplier<Personne> supplier) {
        return supplier.get();
    }
}
