package main;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(char direction) {
        switch (direction) {
            case 'N': y -= 1; break; // Déplacer vers le Nord : réduire y de 1
            case 'S': y += 1; break; // Déplacer vers le Sud : augmenter y de 1
            case 'E': x += 1; break; // Déplacer vers l'Est : augmenter x de 1
            case 'O': x -= 1; break; // Déplacer vers l'Ouest : réduire x de 1
        }
    }
}
