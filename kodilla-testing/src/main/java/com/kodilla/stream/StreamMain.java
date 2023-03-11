package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 – Stream");

        System.out.println("\n7.1. Upiększacz tekstów");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Za oknem pada snieg!", text -> text.toLowerCase());
        poemBeautifier.beautify("Za oknem pada snieg!", text -> text.toUpperCase());
        poemBeautifier.beautify("Za oknem pada snieg!", text -> "*** ".concat(text).concat(" ***"));

        System.out.println("\n7.3. Poznanie funkcji stream(), filter(), map() i collect()");
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1).collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        forumUserMap.entrySet().stream()
                .map(userMap -> userMap.getKey() + ": " + userMap.getValue()).forEach(System.out::println);

    }
}
