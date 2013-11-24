package com.jstcool.util;

import org.apache.log4j.Logger;

public class DevLog {
	public static void info(Object obj, String message) {
		Logger log = Logger.getLogger(obj.getClass());
		log.info(message);
	}
}
