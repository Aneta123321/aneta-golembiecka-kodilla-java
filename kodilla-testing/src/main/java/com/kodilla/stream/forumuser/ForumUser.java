package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userId;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int numberOfPosts;

    public ForumUser(int userId, String userName, char sex, LocalDate dateOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }
//teraz generuje metode toString za pomoca alt insert
    @Override
    public String toString() {
        return "userId=" + userId +
                ", userName='" + userName +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts;
    }
}
