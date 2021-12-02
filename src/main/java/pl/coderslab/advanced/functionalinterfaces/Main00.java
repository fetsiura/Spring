package pl.coderslab.advanced.functionalinterfaces;

import java.io.File;
import java.io.FileWriter;

public class Main00 {

    public static void main(String[] args) {
        Pair pairOfStringAndInteger = new Pair("abc", 13);

        String a = (String) pairOfStringAndInteger.getA();
        if (pairOfStringAndInteger.getA() instanceof File) {
            File b = (File) pairOfStringAndInteger.getA();
        }

        String z = getAAsString(pairOfStringAndInteger);

        GenericPair<String, Integer> genericPair = new GenericPair<>("abc", 13);
        String a2 = genericPair.getA();
        Integer b2 = genericPair.getB();

//        File z2 = (File) genericPair.getA();

        GenericPair<File, File> filePair = new GenericPair<>(new File("."), new File("/"));
        File fileA = filePair.getA();
        File fileB = filePair.getB();

//        File z = (File) "Abc";
    }

    private static String getAAsString(Pair pair) {
        if (pair.getA() instanceof String) {
            return (String) pair.getA();
        }
        else {
            throw new IllegalStateException("");
        }
    }
}
