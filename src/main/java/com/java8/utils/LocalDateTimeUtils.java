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
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("NOW:"+localDateTime.plusDays(1L));

        LocalDateTime start = LocalDateTime.of(2021, 3, 30, 0, 0, 0);

        System.out.println(start.plusMonths(1L).minusSeconds(1L));
        LocalDateTime end = start.plusMonths(1L).minusSeconds(1L);

        Period P2=Period.between(start.toLocalDate(),end.plusDays(1L).toLocalDate());
        System.out.println(P2.getYears()+" "+P2.getMonths()+" "+P2.getDays());


      // System.out.println(getRefundMoney());
       //testPlusMonths();
    }

    public static void testPlusMonths(){
        LocalDate now = LocalDate.of(2021,01,29);
        //两次
        System.out.println(now.plusMonths(1).plusMonths(1L));
        //1次2个月
        System.out.println(now.plusMonths(2));
    }

    protected static double getRefundMoney() {
        LocalDateTime start = LocalDateTime.of(2021, 2, 1,0,0,0);
        LocalDateTime end = LocalDateTime.of(2021, 2, 28,23,59,59);
        LocalDateTime refund = LocalDateTime.of(2021, 2, 4,0,0,0);

        double daysOfMonth = 30L;
        long betweenDays = Duration.between(refund, end).toDays() + 1;

        double monthFee = getMonthFeeByItem();
        double dailyFee = monthFee / daysOfMonth;

        System.out.println( monthFee * Math.floor(betweenDays / daysOfMonth));

        System.out.println(dailyFee);
        System.out.println(betweenDays);
        System.out.println(daysOfMonth);
        System.out.println("betweenDays % daysOfMonth="+(betweenDays % daysOfMonth));

        //费用=整月费+残月费
        return monthFee * Math.floor(betweenDays / daysOfMonth) + dailyFee * (betweenDays % daysOfMonth);
    }


    protected static  double getMonthFeeByItem() {
        double factFee =30D;
        LocalDateTime start = LocalDateTime.of(2021, 2, 1,0,0,0);
        LocalDateTime end = LocalDateTime.of(2021, 2, 28,23,59,59);
        LocalDate plus1MonthsTime = start.toLocalDate().plusMonths(1);
        System.out.println("plus1MonthsTime: "+plus1MonthsTime);

        Period period = Period.between(start.toLocalDate(),end.toLocalDate());
        if (end.toLocalDate().isAfter(plus1MonthsTime)) {
            int months = period.getYears() * 12 + period.getMonths() + (period.getDays() == 0 ? 0 : 1);
            System.out.println("factFee/ months ="+(factFee/ months));
            return factFee/ months;
        } else {
            int days = period.getDays();
            System.out.println("factFee/ days * 30="+(factFee/ days * 30));
            return factFee/ days * 30;
        }

    }
}
