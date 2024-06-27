package test;

import main.Carte;
import main.Personnage;
import main.Position;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class PersonnageTest {

    @Test
    public void testDeplacement() throws IOException {
        Carte carte = new Carte("src/resources/carte.txt");
        Personnage personnage = new Personnage(carte, "src/resources/deplacements.txt");
        Position positionFinale = personnage.getPosition();
        assertEquals(9, positionFinale.getX());
        assertEquals(2, positionFinale.getY());
    }

    @Test
    public void testDeplacement2() throws IOException {
        Carte carte = new Carte("src/resources/carte.txt");
        Personnage personnage = new Personnage(carte, "src/resources/deplacements2.txt");
        Position positionFinale = personnage.getPosition();
        assertEquals(7, positionFinale.getX());
        assertEquals(5, positionFinale.getY());
    }
}
