package org.usfirst.frc.team4001.robot.commands;

import org.usfirst.frc.team4001.robot.NumberConstants;
import org.usfirst.frc.team4001.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public class CurtainUp extends Command {

    public CurtainUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.curtain);
    	System.out.println("CurtainUp.CurtainUp(): constructor called");
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.curtain.curtainUp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Robot.curtain.getPotValue() <= NumberConstants.curtain_max;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.curtain.curtainStop();
    	System.out.println("CurtainUp.end(): CurtainUp stopped");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
