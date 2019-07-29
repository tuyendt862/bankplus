package com.viettel.bankplus.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;

import com.viettel.bankplus.constants.Constants;

/**
 * @author : tuyendt
 * @PG_ID : DateUtils
 * @createDate : 28.07.2019
 */
public class DateUtils {

	/** The Constant LOGGER. */
	public static final Logger LOGGER = Logger.getLogger(DateUtils.class);

	/**
	 * Get now time.
	 *
	 * @return the date
	 */
	public static Date now() {
		return Calendar.getInstance().getTime();
	}

	/**
	 * Format date to String.
	 *
	 * @param date   the date
	 * @param format the format
	 * @param locale the locale
	 * @return the string
	 */
	public static String format(Date date, String format, Locale locale) {

		if (date != null && format != null && locale != null) {
			return new SimpleDateFormat(format, Locale.ENGLISH).format(date);
		}
		return null;
	}

	/**
	 * Gets the time by format.
	 *
	 * @param date   the date
	 * @param format the format
	 * @return the time by format
	 */
	public static String getTimeByFormat(Date date, String format) {
		return format(date, format, Locale.ENGLISH);
	}

	/**
	 * Gets the date by format.
	 *
	 * @param date   the date
	 * @param format the format
	 * @return the date by format
	 */
	public static String getDateByFormat(Date date, String format) {
		return format(date, format, Locale.ENGLISH);
	}

	/**
	 * Gets the date effect register or forgot password.
	 * 
	 * @return the date have effect
	 */
	public static Date setEffectTime() {
		Date d = now();

		Calendar cl = Calendar.getInstance();
		cl.setTime(d);
		// test among 2 minute
		// cl.add(Calendar.MINUTE, 2);
		// effect in 12 hours
		cl.add(Calendar.HOUR, 12);
		return cl.getTime();
	}

	/**
	 * Compare effect time with now time
	 * 
	 * @return true if effect time false if don't effect time
	 */
	public static boolean checkEffectTimeWithNowTime(Date effectTime) {
		Date d = now();
		if (d.compareTo(effectTime) < 0 || d.compareTo(effectTime) == 0) {
			return true;
		}
		return false;
	}

	/**
	 * convert string to date
	 * 
	 * @param value
	 * @return date
	 */
	public static Date convertStringToDate(String value) {
		DateFormat df = new SimpleDateFormat(Constants.CONST_DATE_FORMAT);
		if (value != null && value.trim().length() != 0) {
			try {
				return df.parse(value);
			} catch (ParseException e) {
				LOGGER.error("convertStringToDate: " + e.getMessage());
			}
		}
		return null;
	}

	/**
	 * convert string to date
	 * 
	 * @param value
	 * @return date
	 */
	public static Date convertStringToDateTime(String value) {
		DateFormat df = new SimpleDateFormat(Constants.CONST_DATETIME_FORMAT);
		if (value != null && value.trim().length() != 0) {
			try {
				return df.parse(value);
			} catch (ParseException e) {
				LOGGER.error("convertStringToDateTime dd/MM/yyyy HH:mm" + e.getMessage());
			}
		}
		return null;
	}

	/**
	 * parse string to date
	 * 
	 * @param value
	 * @return date
	 */
	public static Date parseStringToDate(String value) {
		DateFormat df = new SimpleDateFormat("EEEE MMM dd HH:mm:ss Z yyyy");
		if (value != null && value.trim().length() != 0) {
			try {
				return df.parse(value);
			} catch (ParseException e) {
				LOGGER.error("parseStringToDate" + e.getMessage());
			}
		}
		return null;
	}
}
