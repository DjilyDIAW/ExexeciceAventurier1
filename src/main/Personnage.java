package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Personnage {
    private Position position;
    private Carte carte;

    public Personnage(Carte carte, String filePath) throws IOException {
        this.carte = carte;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String[] initialPosition = reader.readLine().split(",");
            int x = Integer.parseInt(initialPosition[0]);
            int y = Integer.parseInt(initialPosition[1]);
            this.position = new Position(x, y);

            String mouvements = reader.readLine();
            for (char mouvement : mouvements.toCharArray()) {
                Position newPosition = new Position(position.getX(), position.getY());
                newPosition.move(mouvement);
                if (carte.isAccessible(newPosition)) {
                    this.position = newPosition;
                }
            }
        }
    }

    public Position getPosition() {
        return position;
    }
}
