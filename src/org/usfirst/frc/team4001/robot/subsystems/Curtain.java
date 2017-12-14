package org.usfirst.frc.team4001.robot.subsystems;

import org.usfirst.frc.team4001.robot.ElectricalConstants;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class Curtain extends Subsystem {

	private Spark curtainMotor;
	private Potentiometer pot;
	
	public Curtain(){	
		curtainMotor = new Spark(ElectricalConstants.CURTAIN_MOTOR);
		pot = new AnalogPotentiometer(ElectricalConstants.CURTAIN_POT, 360, 0);
	}
	
	public void curtainUp(){
		curtainMotor.set(1);
	}
	
	public void curtainDown(){
		curtainMotor.set(-1);	
	}
	
	public void curtainStop(){
		curtainMotor.set(0);
	}
	
	public double getPotValue(){
		System.out.println("Curtain.getPotValue(): value:"+pot.get());
		return pot.get();
	}
	
	
	
	
	
	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
