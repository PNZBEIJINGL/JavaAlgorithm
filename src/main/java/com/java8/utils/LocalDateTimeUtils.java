package com.java8.utils;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeUtils {

    /**
     * 获取当天00:00:00
     *
     * @param localDate
     * @return
     */
    public static LocalDateTime getBeginOfDay(LocalDate localDate) {
        return LocalDateTime.of(localDate, LocalTime.MIN);
    }

    /**
     * 获取当天00:00:00
     *
     * @param localDate
     * @return
     */
    public static LocalDateTime getBeginOfDay(LocalDateTime localDate) {
        return LocalDateTime.of(localDate.toLocalDate(), LocalTime.MIN);
    }


    /**
     * 获取当天最后1天23:59:59
     *
     * @param localDate
     * @return
     */
    public static LocalDateTime getEndOfDay(LocalDate localDate) {
        return LocalDateTime.of(localDate, LocalTime.MAX);
    }

    /**
     * 获取本月第1天 00:00:00
     *
     * @param localDate
     * @return
     */
    public static LocalDateTime getBeginOfMonth(LocalDate localDate) {
        LocalDate lastDay = localDate.with(TemporalAdjusters.firstDayOfMonth());
        return LocalDateTime.of(lastDay, LocalTime.MIN);
    }


    /**
     * 获取本月最后1天23:59:59
     *
     * @param localDate
     * @return
     */
    public static LocalDateTime getEndOfMonth(LocalDate localDate) {
        LocalDate lastDay = localDate.with(TemporalAdjusters.lastDayOfMonth());
        return LocalDateTime.of(lastDay, LocalTime.MAX);
    }


    /**
     * 获取下月1日 00:00:00
     *
     * @param localDate
     * @return
     */
    public static LocalDateTime getBeginNextMonth1st(LocalDate localDate) {
        LocalDate lastDay = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
        return LocalDateTime.of(lastDay.plusDays(1), LocalTime.MIN);
    }


    /**
     * 获取下月1日 23:59:59
     *
     * @param localDate
     * @return
     */
    public static LocalDateTime getEndNextMonth1st(LocalDate localDate) {
        LocalDate lastDay = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
        return LocalDateTime.of(lastDay.plusDays(1), LocalTime.MAX);
    }

    /**
     * 获取本月N日
     *
     * @return
     */
    public static LocalDate getDayOfMonth(int dayOfMonth) {

        return LocalDate.now().withDayOfMonth(dayOfMonth);
    }

    /**
     * 相等的时候为空
     *
     * @param startDT
     * @param endDT
     * @return
     */
    public static long getDays(LocalDate startDT, LocalDate endDT) {
        Period period = Period.between(startDT, endDT);
        return period.getYears() * 12 + period.getMonths() * 30 + period.getDays();
    }

    public static long getDuration(LocalDateTime startDT, LocalDateTime endDT) {
        Duration duration = Duration.between(startDT, endDT);
        return duration.toDays();
    }

    public static void main(String[] args) {
        LocalDateTime startDT = LocalDateTime.of(2021, 1, 29,0,0,0);
        LocalDateTime endDT = LocalDateTime.of(2021, 4, 25,23,59,59);
        long durationDay=getDuration(startDT,endDT);
        System.out.println(durationDay);

        Period period = Period.between(startDT.toLocalDate(), endDT.toLocalDate());
        System.out.println(period.getYears() + " " + period.getMonths() + " " + period.getDays());

        System.out.println(startDT.toLocalDate().plusMonths(1));
        System.out.println(startDT.toLocalDate().plusMonths(2));


        System.out.println(System.currentTimeMillis());
        java.util.Random rand = new java.util.Random(System.currentTimeMillis());
        Integer iValue = Math.abs(rand.nextInt(Integer.MAX_VALUE));
        System.out.println(iValue);


    }
}
