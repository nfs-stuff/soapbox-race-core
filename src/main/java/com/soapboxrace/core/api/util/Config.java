package com.soapboxrace.core.api.util;

public class Config {

	public static String getOpenFireToken() {
		return System.getProperty("openFireToken");
	}

	public static String getOpenFireAddress() {
		return System.getProperty("openFireAddress");
	}

	public static String getXmppIp() {
		return System.getProperty("xmppIp");
	}

	public static int getXmppPort() {
		return Integer.valueOf(System.getProperty("xmppPort"));
	}

	public static String getUdpRaceIp() {
		return System.getProperty("udpRaceIp");
	}

	public static int getUdpRacePort() {
		return Integer.valueOf(System.getProperty("udpRacePort"));
	}

	public static String getTicketToken() {
		return System.getProperty("ticketToken");
	}

}
