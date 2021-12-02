package pl.coderslab.advanced.designpatterns;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) throws IOException {

        // Singleton
        Runtime runtime = Runtime.getRuntime();

        // Metoda fabrykująca
        List<Integer> integers = List.of(1, 2, 3, 4);
        String joinedString = String.join(",", "1", "2", "3");
        Path somePath = Paths.get("abc", "cde", "efg");

        // Builder
        String s = new StringBuilder("abc")
                .append("a").append("b").toString();

        // Dekorator
        Scanner scanner = new Scanner(new FileReader(new File("abc.txt"), StandardCharsets.UTF_8));

        BufferedReader reader = new BufferedReader(new FileReader(new File("abc"), StandardCharsets.UTF_8));

        Files.walkFileTree(Paths.get("."), new FileVisitor<Path>() {

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                return null;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                return null;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return null;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                return null;
            }
        });

    }
}
