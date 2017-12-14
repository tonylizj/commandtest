package org.usfirst.frc.team4001.robot.commands;

import org.usfirst.frc.team4001.robot.NumberConstants;
import org.usfirst.frc.team4001.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public class CurtainDown extends Command {

    public CurtainDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.curtain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.curtain.curtainDown();
    	System.out.println("Going down");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//System.out.println(Robot.curtain.getPotValue());
        return Robot.curtain.getPotValue() >= NumberConstants.curtain_min;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.curtain.curtainStop();
    	System.out.println("CurtainDown.end(): CurtainDown stopped");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
}
