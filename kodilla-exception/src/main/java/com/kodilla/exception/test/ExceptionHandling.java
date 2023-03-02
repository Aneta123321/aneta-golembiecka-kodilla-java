package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "finish";
        try {
            result = secondChallenge.probablyIWillThrowException(3.5, 2.5);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(result);
        }
    }
} // try, catch, finally



