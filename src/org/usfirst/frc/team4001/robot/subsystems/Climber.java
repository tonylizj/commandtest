package org.usfirst.frc.team4001.robot.subsystems;

import org.usfirst.frc.team4001.robot.ElectricalConstants;
import org.usfirst.frc.team4001.robot.NumberConstants;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Victor climbMotor;
	public int climbState = 0;
	
	public Climber() {
		climbMotor = new Victor(ElectricalConstants.CLIMBER_MOTOR);
		climbMotor.setInverted(true);
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void climbUp(){
    	//turns inward
    	climbMotor.set(NumberConstants.climber_upSpeed);
    	this.climbState = 1;   
    }
    
    public void stop() {
    	climbMotor.set(0);
    	this.climbState = 0;
    }
    
    public int getClimbState(){
    	return climbState;
    }
}

