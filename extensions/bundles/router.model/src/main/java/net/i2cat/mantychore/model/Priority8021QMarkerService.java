/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class Priority8021QMarkerService as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the Priority8021QMarkerServiceBean Interface. The CIM class
 * Priority8021QMarkerService is described as follows:
 * 
 * Priority8021QMarkerService marks the Priority field in an 802.1Q- compliant frame, with a specified value. Frames are marked in order to control
 * the conditioning that they will subsequently receive. Following common practice, the value to be written into the field is represented as an
 * unsigned 8-bit integer.
 */
public class Priority8021QMarkerService extends MarkerService implements
		Serializable {

	/**
	 * This constructor creates a Priority8021QMarkerServiceBeanImpl Class which implements the Priority8021QMarkerServiceBean Interface, and
	 * encapsulates the CIM class Priority8021QMarkerService in a Java Bean. The CIM class Priority8021QMarkerService is described as follows:
	 * 
	 * Priority8021QMarkerService marks the Priority field in an 802.1Q- compliant frame, with a specified value. Frames are marked in order to
	 * control the conditioning that they will subsequently receive. Following common practice, the value to be written into the field is represented
	 * as an unsigned 8-bit integer.
	 */
	public Priority8021QMarkerService() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property priorityValue.
	 */
	private short	priorityValue;

	/**
	 * This method returns the Priority8021QMarkerService.priorityValue property value. This property is described as follows:
	 * 
	 * This property is an unsigned 8-bit integer, representing a value to be used for marking the Priority field in the 802.1Q header. Since the
	 * Priority field consists of 3 bits, the values for this property are limited to the range 0..7. When the Priority field is marked, the remaining
	 * two bits in the octet are left unchanged.
	 * 
	 * @return short current priorityValue property value
	 * @exception Exception
	 */
	public short getPriorityValue() {

		return this.priorityValue;
	} // getPriorityValue

	/**
	 * This method sets the Priority8021QMarkerService.priorityValue property value. This property is described as follows:
	 * 
	 * This property is an unsigned 8-bit integer, representing a value to be used for marking the Priority field in the 802.1Q header. Since the
	 * Priority field consists of 3 bits, the values for this property are limited to the range 0..7. When the Priority field is marked, the remaining
	 * two bits in the octet are left unchanged.
	 * 
	 * @param short new priorityValue property value
	 * @exception Exception
	 */
	public void setPriorityValue(short priorityValue) {

		this.priorityValue = priorityValue;
	} // setPriorityValue

} // Class Priority8021QMarkerService