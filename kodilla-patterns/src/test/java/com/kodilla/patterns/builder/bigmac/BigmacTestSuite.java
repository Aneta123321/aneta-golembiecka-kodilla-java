package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

        @Test
        void testBigmacnew() {
            //Given
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .bun("bun with sesame")
                    .burgers(1)
                    .sauce("Spicy")
                    .ingredients("Ham")
                    .ingredients("Mushrooms")
                    .ingredients("Tomato")
                    .build();
            System.out.println(bigmac);
            //When
            int howManyIngredients = bigmac.getIngredients().size();
            //Then
            assertEquals("bun with sesame", bigmac.getBun());
            assertEquals(1, bigmac.getBurgers());
            assertEquals("Spicy", bigmac.getSauce());
            assertEquals(3, howManyIngredients);

        }
    }
