package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercise {
    public static void main(String[] args) {
        InputStream is = Exercise.class.getClassLoader().getResourceAsStream("lorem.txt");
        if (is == null) {
            System.out.println("Error al cargar el fichero.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
