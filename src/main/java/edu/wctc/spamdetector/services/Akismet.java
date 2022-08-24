package edu.wctc.spamdetector.services;

public class Akismet {
    public static boolean isBlacklisted() {
        System.out.println("Akismet is checking the IP");
        return false;
    }
}
