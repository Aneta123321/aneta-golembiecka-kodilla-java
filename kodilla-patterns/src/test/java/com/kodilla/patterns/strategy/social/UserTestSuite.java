package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Tom");
        User yGeneration = new YGeneration("Greg");
        User zGeneration = new ZGeneration("Ana");

        //When
        String snapchat = millenials.sharePost();
        String twitter = yGeneration.sharePost();
        String facebook = zGeneration.sharePost();

        //Then
        Assertions.assertEquals("Snapchat", snapchat);
        Assertions.assertEquals("Twitter", twitter);
        Assertions.assertEquals("Facebook", facebook);
    }

@Test
        public void testIndividualSharingStrategy() {

    //Given
        User millenials = new Millenials("Tom");
        String publisherBeforeSet = millenials.sharePost();
        millenials.setSocialPublisher(new FacebookPublisher());
        String publisherAfterSet = millenials.sharePost();

        //Then
        Assertions.assertEquals("Snapchat", publisherBeforeSet);
        Assertions.assertEquals("Facebook", publisherAfterSet);


        }

    }

