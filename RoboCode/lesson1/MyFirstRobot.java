/*******************************************************************************
 * Copyright (c) 2001-2014 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/epl-v10.html
 *******************************************************************************/
package sample;


import java.awt.*;
import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;


/**
 * MyFirstRobot - a sample robot by Mathew Nelson.
 * <p/>
 * Moves in a seesaw motion, and spins the gun around at each end.
 *
 * @author Mathew A. Nelson (original)
 */
public class MyFirstRobot extends Robot {

	/**
	 * MyFirstRobot's run method - Seesaw
	 */
	public void run() {

        setBodyColor(Color.black);
        setGunColor(Color.back);
        setRadarColor(Color.red);
        setBulletColor(Color.cyan);
        setScanColor(Color.cyan);

		// while (true) {
			ahead(100); // Move ahead 100
			turnGunRight(360); // Spin gun around
			back(100); // Move back 100
			turnGunRight(360); // Spin gun around
		// }
	}

	/**
	 * Fire when we see a robot
	 */
	// public void onScannedRobot(ScannedRobotEvent e) {
	//     fire(1);
	// }

	/**
	 * We were hit!  Turn perpendicular to the bullet,
	 * so our seesaw might avoid a future shot.
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		turnLeft(90 - e.getBearing());
	}
}												


