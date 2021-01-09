package com.tistory.bbubbush.dateapi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class AppRunner {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime xmas = LocalDateTime.of(2021, Month.DECEMBER, 25, 00, 00);

        // Use Period
        Period betweenPeriod = Period.between(today.toLocalDate(), xmas.toLocalDate());
        int months = betweenPeriod.getMonths();
        int days = betweenPeriod.getDays();
        System.out.println("Period :: There are " + months + " months, " + days + " days left until Christmas.");

        // Use Duration
        Duration betweenDuration = Duration.between(today, xmas);
        System.out.println("Duration :: There are " + betweenDuration.toDays() + " days left until Christmas.");
    }
}
