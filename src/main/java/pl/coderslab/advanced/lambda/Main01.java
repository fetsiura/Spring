package pl.coderslab.advanced.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<String> strings = new ArrayList<>();

        System.out.println("write words quantity");
        int n = scanner.nextInt();

        while (n>0){
            strings.add(scanner.nextLine());
            --n;
        }

        strings.forEach(System.out::println);

        strings.sort( (s1,s2) -> s1.length() - s2.length());

        strings.forEach(System.out::println);

    }
}
