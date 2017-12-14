package org.usfirst.frc.team4001.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4001.robot.Robot;

/**
 *
 */
public class ArcadeDrive extends Command {
    
	public ArcadeDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrain.initDefaultCommand();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	// Get values of speed and turning from controller
    	double speed = Robot.oi.getLeftAxis();
    	double turn = Robot.oi.getRightAxis();
    	// Call arcadeDrive method with values
    	Robot.drivetrain.arcadeDrive(speed, turn);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
