package br.com.newfeature.java9.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        verbosidadeAtual();

        menosVerbosidade();

    }

    public static void verbosidadeAtual(){

        // Atualmente e muito verboso criar uma simples lista imutavel.
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set = Collections.unmodifiableSet(set);

        System.out.println("Forma atual 1 .. ");
        set.forEach(System.out::println);


        System.out.println("Forma atual 2 .. ");
        Set<String> set1 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("a", "b", "c")));
        set1.forEach(System.out::println);

        System.out.println("Forma atual 3 .. ");
        Set<String> set2 = Collections.unmodifiableSet(Stream.of("a", "b", "c").collect(Collectors.toSet()));
        set2.forEach(System.out::println);

    }

    public static void menosVerbosidade(){

        System.out.println("Forma nova menos verboso .. ");

        Set<String> set = Set.of("a", "b", "c");
        set.forEach(System.out::println);
    }
}
