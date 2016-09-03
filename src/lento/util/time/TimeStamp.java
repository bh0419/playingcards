/**
 * @author Ben Huang <bhuang0419@gmail.com>
 * 
 * TimeStamp.java
 */

package lento.util.time;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeStamp {
	/**
	 * Default format of the time stamp:
	 * 	MMMM dd, yyyy - hh.mm.ss
	 */
	String format = new String();
	
	/**
	 * Constructor
	 */
	public TimeStamp() {
		this.format = "MMMM dd, yyyy - hh:mm:ss";
	}
	
	/**
	 * Constructor receives:
	 * 
	 * @param timeStampFormat written in the time stamp values.
	 */
	public TimeStamp(String timeStampFormat) {
		this.format = timeStampFormat;
	}
	
	/**
	 * @return The format of the time stamp as a String.
	 */
	public String getFormat() {
		return this.format;
	}
	
	/**
	 * 
	 * @param timeStampFormat Receives a custom format for the time stamp.
	 */
	public void setFormat(String timeStampFormat) {
		this.format = timeStampFormat;
	}
	
	/**
	 * @return Time stamp as a String.
	 */
	public String toString() {
		return new SimpleDateFormat(this.format).format(new Date());
	}
}
