
package view;

import model.Lada;
import model.Ladak;

public class View {

    public void udvozloUzenet() {
        System.out.println("Kincskereső játék");
        System.out.println("Három láda közül kell megtalálnod a kincset.");
        System.out.println("Figyeld a feliratokat: pontosan egy állítás igaz!");
        System.out.println();
    }

    public void ladakMegjelenitese(Ladak ladak) {
        System.out.println("A ládák feliratai:");

        for (Lada lada : ladak.getLadak()) {
            System.out.printf(
                    "%d. %s láda: \"%s\"%n",
                    lada.getSorszam(),
                    lada.getSzin(),
                    lada.getFelirat()
            );
        }

        System.out.println();
    }

    public void valasztasKerese() {
        System.out.print("Melyik ládában van a kincs? (1-3): ");
    }

    public void helyesValasz() {
        System.out.println("Gratulálok, megtaláltad a kincset!");
    }

    public void helytelenValasz() {
        System.out.println("Sajnos ebben a ládában nincs kincs.");
    }

    public void hibasBemenet() {
        System.out.println("Érvénytelen választás! 1, 2 vagy 3 számot adj meg.");
    }
}
