/*
 * File: VotingBox.java 
 * This code executes a program that moves through a ballot
 * to check and clean out any remaining chads in order to 
 * validate it.
 */

import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			move();
			if (beepersPresent()) {
				move();
			}
			else {
				validateAvenue();
				move();
			}
		}
	}
	

	/*
	 * validateAvenue: This method examines the avenues with no
	 * beeper in the middle to find and remove any remaining 
	 * beepers by moving up and down.
	 */
	
	private void validateAvenue() {
		turnRight();
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		
		turnAround();
		move();
		move();
		
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		turnLeft();
		
		
	}	
	
}
		
	
