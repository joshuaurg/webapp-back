package com.dcx.poz.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 日期工具类
 * 
 * @author DiWu
 *
 */
public class DateUtil {
	
	/**
	 * 日期转换模式 年-月-日
	 */
	public static final String DATE_PATTERN = "yyyy-MM-dd";
	
	/**
	 * 日期转换模式 年-月-日 时:分:秒
	 */
	public static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 将日期字符串转换为日期类型
	 * @param value		日期字符串
	 * @param pattern   日期转换模式
	 * @return
	 */
	public static Date parse(String value, String pattern){
		DateFormat format = new SimpleDateFormat(pattern);
		try {
			return format.parse(value);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 将日期格式转字符串
	 * @param date
	 * @param datePattern
	 * @return
	 */
	public static String date2Str(Date date,String datePattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		return sdf.format(date);
	}
	
	/**
	 * 将字符串格式的日期格式化
	 * @param date
	 * @param datePattern
	 * @return
	 */
	public static String date2Str(String dateStr,String datePattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		return sdf.format(parse(dateStr, datePattern));
	}
	
}
