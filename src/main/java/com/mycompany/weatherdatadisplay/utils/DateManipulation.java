package com.mycompany.weatherdatadisplay.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulation {
    
    public static Date stringToDate(String dateString) throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
        return date;
    }
    
    public static String dateToString(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }
}
