/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class HostedRoute as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the HostedRouteBean Interface. The CIM class HostedRoute is described as follows:
 * 
 * HostedRoute describes the relationship between the route and the system in whose context it is defined.
 */
public class HostedRoute extends HostedDependency implements Serializable {

	/**
	 * This constructor creates a HostedRouteBeanImpl Class which implements the HostedRouteBean Interface, and encapsulates the CIM class HostedRoute
	 * in a Java Bean. The CIM class HostedRoute is described as follows:
	 * 
	 * HostedRoute describes the relationship between the route and the system in whose context it is defined.
	 */
	public HostedRoute() {
	};

	/**
	 * This method create an Association of the type HostedRoute between one System object and NextHopRoute object
	 */
	public static HostedRoute link(System antecedent, NextHopRoute
			dependent) {

		return (HostedRoute) Association.link(HostedRoute.class, antecedent, dependent);
	}// link

} // Class HostedRoute