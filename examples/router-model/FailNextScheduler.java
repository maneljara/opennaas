/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class FailNextScheduler as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the FailNextSchedulerBean Interface. The CIM class FailNextScheduler is described as
 * follows:
 * 
 * This association is a subclass of NextScheduler, and defines a predecessor-successor relationship between a NonWork ConservingSchedulingService and
 * another PacketScheduling Service. It indicates that the NonWorkConserving scheduler may pass up a scheduling opportunity (thereby behaving in a
 * non-work conserving manner), and make the resulting bandwidth available to the FollowingService scheduler.
 */
public class FailNextScheduler extends NextScheduler implements Serializable
{

	/**
	 * This constructor creates a FailNextSchedulerBeanImpl Class which implements the FailNextSchedulerBean Interface, and encapsulates the CIM class
	 * FailNextScheduler in a Java Bean. The CIM class FailNextScheduler is described as follows:
	 * 
	 * This association is a subclass of NextScheduler, and defines a predecessor-successor relationship between a NonWork ConservingSchedulingService
	 * and another PacketScheduling Service. It indicates that the NonWorkConserving scheduler may pass up a scheduling opportunity (thereby behaving
	 * in a non-work conserving manner), and make the resulting bandwidth available to the FollowingService scheduler.
	 */
	public FailNextScheduler() {
	};

	/**
	 * This method create an Association of the type FailNextScheduler between one NonWorkConservingSchedulingService object and
	 * PacketSchedulingService object
	 */
	public static FailNextScheduler link(NonWorkConservingSchedulingService
			precedingService, PacketSchedulingService followingService) {

		return (FailNextScheduler) Association.link(FailNextScheduler.class, precedingService, followingService);
	}// link

} // Class FailNextScheduler