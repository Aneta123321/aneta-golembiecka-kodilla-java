package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book {

        final String title;
        final String author;
        final LocalDate publicationDate; // LocalDate importuje z biblioteki te klase LocalDate a w klasie sa metody, klasa ma tez pola, atrybuty

        public Book(final String title, final String author, final LocalDate publicationDate) {
            this.title = title;
            this.author = author;
            this.publicationDate = publicationDate;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public LocalDate getPublicationDate() {
            return publicationDate;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", publicationDate=" + publicationDate +
                    '}';
        }
}
