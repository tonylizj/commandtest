package org.usfirst.frc.team4001.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4001.robot.commands.Climb;
import org.usfirst.frc.team4001.robot.commands.ExampleCommand;
import org.usfirst.frc.team4001.robot.commands.PusherCommand;
import org.usfirst.frc.team4001.robot.commands.ArcadeDrive;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(1);
	// Button button = new JoystickButton(stick, 2);
	
	public Joystick gamepad1;
	Button climbButton;
	Button pusherTrigger;
	Button drive;
	
	public OI(){
		gamepad1 = new Joystick(0);
		climbButton = new JoystickButton(gamepad1, 4);
		pusherTrigger = new JoystickButton(gamepad1, 6);
		drive = new JoystickButton(gamepad1, 1);
		climbButton.whileHeld(new Climb());
		pusherTrigger.whileHeld(new PusherCommand());
		drive.whileHeld(new ArcadeDrive());

	}
	public double getLeftAxis()
	{
		return gamepad1.getRawAxis(0);
	}
	
	public double getRightAxis()
	{
		return gamepad1.getRawAxis(5);
	}
	

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
