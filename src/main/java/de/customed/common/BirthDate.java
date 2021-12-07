package de.customed.common;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Saves birth date as string in format yyyy-MM-dd
 *
 * @author David Weisgerber
 *         Date: 11/28/13
 *         Time: 10:55 AM
 */
public class BirthDate implements Serializable {
	private String date;

	public BirthDate(String date) {
		this.date = date;
	}

	public BirthDate() {
	}

	public BirthDate(String value, String dateFormat) {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat otherFormat = new SimpleDateFormat(dateFormat);

		try {
			this.date = myFormat.format(otherFormat.parse(value));
		} catch (ParseException e) {
			System.err.println("Date could not be parsed");
			System.err.println(e);
		}
	}

	public BirthDate(Date time) {
		if (time == null) {
			time = new Date();
		}

		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		this.date = myFormat.format(time);
	}

	public boolean isEmpty() {
		if (date == null || date.isEmpty()) {
			return true;
		}

		return false;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAge()	{
		return getAgeAtTimePoint(new Date());
	}

	public int getAgeAtTimePoint(Date timepoint) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date javaDate = format.parse(this.date);
			Calendar calendarBirthDate = Calendar.getInstance();
			Calendar calendarTimePoint = Calendar.getInstance();
			calendarBirthDate.setTime(javaDate);
			calendarTimePoint.setTime(timepoint);

			int diff = calendarTimePoint.get(Calendar.YEAR) - calendarBirthDate.get(Calendar.YEAR);
			if (calendarBirthDate.get(Calendar.MONTH) > calendarTimePoint.get(Calendar.MONTH) ||
					(calendarBirthDate.get(Calendar.MONTH) == calendarTimePoint.get(Calendar.MONTH) && calendarBirthDate.get(Calendar.DATE) > calendarTimePoint.get(Calendar.DATE))) {
				diff--;
			}
			return diff;
		} catch (ParseException e) {
			System.err.println("Date could not be parsed");
			System.err.println(e);
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (obj instanceof BirthDate) {
			BirthDate birthDate = (BirthDate)obj;
			if (birthDate.date == null) {
				return this.date == null;
			}

			return (((BirthDate)(obj)).date.equals(this.date));
		}

		return false;
	}

	public Date toDate() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return format.parse(this.date);
		} catch (ParseException e) {
			return null;
		}
	}

	public String getAgeString() {
		return getAge() + "y";
	}

	public String toFormat(String format) {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat otherFormat = new SimpleDateFormat(format);

		try {
			return otherFormat.format(myFormat.parse(this.date));
		} catch (ParseException e) {
			System.err.println("Date could not be parsed");
			System.err.println(e);
			return "";
		}
	}

	@Override
	public String toString() {
		return this.date;
	}
}
