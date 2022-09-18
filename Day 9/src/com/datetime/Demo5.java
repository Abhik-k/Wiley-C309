package com.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Demo5 {
public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	DayOfWeek dayOfWeek=today.getDayOfWeek();
	System.out.println("Day of week: "+dayOfWeek);
	System.out.println("Day of week: "+dayOfWeek.getValue());
	System.out.println("Day of week: "+dayOfWeek.getDisplayName(TextStyle.FULL,Locale.CANADA));
	System.out.println("Day of week: "+dayOfWeek.getDisplayName(TextStyle.FULL,Locale.getDefault()));
	System.out.println("Day of week: "+dayOfWeek.getDisplayName(TextStyle.FULL,Locale.ITALY));
}
}
