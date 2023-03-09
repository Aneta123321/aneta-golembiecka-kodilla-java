package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.immutable.ForumUser;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Za oknem pada snieg!", text -> text.toLowerCase());
        poemBeautifier.beautify("Za oknem pada snieg!", text -> text.toUpperCase());
        poemBeautifier.beautify("Za oknem pada snieg!", text -> "*** ".concat(text).concat(" ***"));

    }
}
