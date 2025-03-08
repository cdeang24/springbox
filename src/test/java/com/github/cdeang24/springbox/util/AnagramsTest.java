package com.github.cdeang24.springbox.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.github.cdeang24.springbox.util.Anagrams;

public class AnagramsTest {

    @Test
    public void sortString() {
        assertEquals("eht", Anagrams.sortString("the"));
    }

    @Test
    public void searchAngagrams() throws URISyntaxException, IOException{
        List<String> anagrams = Anagrams.searchAnagrams("there");
        assertTrue(anagrams.contains("three"));
    }
    
}
