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
    }

    public void jatekInditasa() {
        view.udvozloUzenet();
        view.ladakMegjelenitese(ladak);

        int valasztas = bekeres();

        if (ladak.kincsAzAdottLadaban(valasztas)) {
            view.helyesValasz();
        } else {
            view.helytelenValasz();
        }
    }

    private int bekeres() {
        int valasztas;

        while (true) {
            view.valasztasKerese();

            if (!scanner.hasNextInt()) {
                scanner.next();
                view.hibasBemenet();
                continue;
            }

            valasztas = scanner.nextInt();

            if (valasztas >= 1 && valasztas <= 3) {
                return valasztas;
            }

            view.hibasBemenet();
        }
    }
}
