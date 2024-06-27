package main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Carte carte = new Carte("src/resources/carte.txt");
            Personnage personnage = new Personnage(carte, "src/resources/deplacements.txt");
            Position positionFinale = personnage.getPosition();
            System.out.println("Position finale: (" + positionFinale.getX() + "," + positionFinale.getY() + ")");
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier: " + e.getMessage());
        }
    }
}
