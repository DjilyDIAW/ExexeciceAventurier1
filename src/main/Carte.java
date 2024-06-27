package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Carte {
    private char[][] map;

    public Carte(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            map = reader.lines().map(String::toCharArray).toArray(char[][]::new);
        }
    }

    public boolean isAccessible(Position position) {
        int x = position.getX();
        int y = position.getY();
        return x >= 0 && y >= 0 && y < map.length && x < map[y].length && map[y][x] == ' ';
    }
}
