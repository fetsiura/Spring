package pl.coderslab.advanced.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        int n = new Random().nextInt(10);

        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            strings.add(line);
        }

        strings.sort((String o1, String o2) -> {
            return o1.length() - o2.length();
        });

        strings.sort((o1, o2) -> o1.length() - o2.length());

        strings.forEach(s -> System.out.println(s));
    }
}
