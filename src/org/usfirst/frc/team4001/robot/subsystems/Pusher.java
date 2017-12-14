package org.usfirst.frc.team4001.robot.subsystems;

import org.usfirst.frc.team4001.robot.ElectricalConstants;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pusher extends Subsystem {

	private Solenoid soleIn;
	private Solenoid soleOut;
	private DigitalInput pusherSwitch;
	
    public Pusher(){
    	soleIn = new Solenoid(ElectricalConstants.GEARDROP_PUSHER_IN);
    	soleOut = new Solenoid(ElectricalConstants.GEARDROP_PUSHER_OUT);
    	pusherSwitch = new DigitalInput(ElectricalConstants.PUSHER_SWITCH);
    }
    
    public void pusherIn(){
    	soleIn.set(true);
    	soleOut.set(false);
    }
    
    public void pusherOut(){
    	soleIn.set(false);
    	soleOut.set(true);
    }
    
    public boolean pusherState(){
    	return pusherSwitch.get();
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

