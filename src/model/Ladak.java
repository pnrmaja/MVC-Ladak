
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ladak {

    private List<Lada> ladak = new ArrayList<>();

    public Ladak() {
        ladakFeltoltese();
    }

    private void ladakFeltoltese() {
        ladak.add(new Lada(
                1,
                "Arany",
                "Én rejtem a kincset",
                false
        ));

        ladak.add(new Lada(
                2,
                "Ezüst",
                "Nem én rejtem a kincset",
                true
        ));

        ladak.add(new Lada(
                3,
                "Bronz",
                "Az arany hazudik",
                false
        ));
    }

    public List<Lada> getLadak() {
        return Collections.unmodifiableList(ladak);
    }

    public boolean kincsAzAdottLadaban(int sorszam) {
        for (Lada lada : ladak) {
            if (lada.getSorszam() == sorszam) {
                return lada.isKincsetRejt();
            }
        }

        return false;
    }
}
