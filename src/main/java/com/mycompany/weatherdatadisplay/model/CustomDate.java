package com.mycompany.weatherdatadisplay.model;

import com.mycompany.weatherdatadisplay.utils.DateUtil;
import java.util.Date;

public class CustomDate {

    private Date date;
    private int dayOfYear;
    private int weekOfYear;
    private int monthOfYear;
    private int year;

    public CustomDate() {
    }

    public CustomDate(Date date) {
        this.date = date;
        setDataDate();
    }

    public void setDate(Date date) {
        this.date = date;
        setDataDate();
    }

    private void setDataDate() {
        dayOfYear = DateUtil.getDayOfYear(date);
        weekOfYear = DateUtil.getWeekOfYear(date);
        monthOfYear = DateUtil.getMonthOfYear(date);
        year = DateUtil.getYear(date);
    }

    public Date getDate() {
        return date;
    }

    public int getDayOfYear() {
        return dayOfYear;
    }

    public int getWeekOfYear() {
        return weekOfYear;
    }

    public int getMonthOfYear() {
        return monthOfYear;
    }

    public int getYear() {
        return year;
    }

}
