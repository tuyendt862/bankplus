package com.viettel.bankplus.utils;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author : tuyendt
 * @PG_ID : StringUtils
 * @createDate : 28.07.2019
 */
public class StringUtils {
	
	/** Init random. */
	private static final Random random = new SecureRandom();
	private static final Logger LOGGER = Logger.getLogger(StringUtils.class);

	/**
	 * Convert object to json string
	 * 
	 * @param obj
	 *            is object
	 * @return string
	 */
	public static String convertObjToJson(Object obj) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			LOGGER.error("#JsonGenerationException: " + e);
		} catch (JsonMappingException e) {
			LOGGER.error("#JsonMappingException: " + e);
		} catch (IOException e) {
			LOGGER.error("#IOException: " + e);
		}

		return null;
	}

	/**
	 * get url context path
	 * 
	 * @param request
	 * @return string
	 */
	public static String getURLWithContextPath(HttpServletRequest request) {
		return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath();
	}

	public static String formatCurrency(Integer nunber) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(nunber) + " VNĐ";
	}

	/**
	 * ramdom password
	 * 
	 * @param length
	 * @return password
	 */
	public static String randomKey(int length) {
		return String.format("%" + length + "s", new BigInteger(length * 5, random).toString(32)).replace('\u0020',
				'0');
	}

	public static String convertDoubleToString(double amount) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(amount);
	}

	public static void main(String[] args) {
		System.out.println("Working dir:  " + System.getProperty("user.dir"));
	}

	public static String formatCurrencyUSD(Float number) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		return df.format(number) + " USD";
	}
	
	public static String convertFloatToString(Float number) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(number);
	}
}
