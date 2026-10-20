
package controller;

import java.util.Scanner;
import model.Ladak;
import view.View;

public class Controller {

    private Ladak ladak;
    private View view;
    private Scanner scanner;

    public Controller(Ladak ladak, View view) {
        this.ladak = ladak;
        this.view = view;
        this.scanner = new Scanner(System.in);

        indit();
    }

    private void indit() {
        view.udvozloUzenet();
        view.kiir(ladak);

        int valasztas = bekeres();

        if (ladak.kincsAzAdottLadaban(valasztas)) {
            view.kiirElTalatad();
        } else {
            view.kiirNemTalatad();
        }
    }

    private int bekeres() {
        int valasztas;

        do {
            System.out.print("Melyik ládában van a kincs? (1-3): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Hibás adat! Egész számot adj meg.");
                scanner.next();
                System.out.print("Választás (1-3): ");
            }

            valasztas = scanner.nextInt();

            if (valasztas < 1 || valasztas > 3) {
                System.out.println("A számnak 1 és 3 között kell lennie.");
            }

        } while (valasztas < 1 || valasztas > 3);

        return valasztas;
    }
}
