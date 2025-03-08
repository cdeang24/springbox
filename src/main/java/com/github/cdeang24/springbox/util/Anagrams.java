package com.github.cdeang24.springbox.util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 */
public class Anagrams {

    /**
     * @param s
     * @return string sorted by its chars
     */
    public static String sortString(String s) {
        return Stream.of(s.split(""))
                .sorted()
                .collect(Collectors.joining());
    }

    /**
     * 
     * @param word
     * @return List of anagrams
     * @throws URISyntaxException
     * @throws IOException
     */
    public static List<String> searchAnagrams(String word) throws URISyntaxException, IOException {

        String sortedWord = sortString(word);

        URI uri = new URI("https://raw.githubusercontent.com/dwyl/english-words/master/words_alpha.txt");
        try (Scanner scan = new Scanner(uri.toURL().openStream())) {
            return scan.tokens()
                    .parallel()
                    .filter(dw -> sortString(dw).equalsIgnoreCase(sortedWord))
                    .collect(Collectors.toList());
        }
    }
}
