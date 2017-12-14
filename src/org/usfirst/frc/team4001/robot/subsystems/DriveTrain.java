package org.usfirst.frc.team4001.robot.subsystems;

import org.usfirst.frc.team4001.robot.ElectricalConstants;
import org.usfirst.frc.team4001.robot.commands.ArcadeDrive;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    private final CANTalon frontLeftMotor;
    private final CANTalon frontRightMotor;
    private final CANTalon rearLeftMotor;
    private final CANTalon rearRightMotor;
    
    private RobotDrive drive;
    
    private ADXRS450_Gyro gyro;
    
    private Encoder encoderLeft;
    private Encoder encoderRight;
      
    
    public DriveTrain()
    {
    	frontLeftMotor = new CANTalon(ElectricalConstants.DRIVETRAIN_FRONT_LEFT);
    	frontRightMotor = new CANTalon(ElectricalConstants.DRIVETRAIN_FRONT_RIGHT);
    	rearLeftMotor = new CANTalon(ElectricalConstants.DRIVETRAIN_REAR_LEFT);
    	rearRightMotor = new CANTalon(ElectricalConstants.DRIVETRAIN_REAR_RIGHT);
    	drive = new RobotDrive(frontLeftMotor, frontRightMotor, rearLeftMotor, rearRightMotor);
    }
    
    public void arcadeDrive(double speed, double turn)
    {
    	drive.arcadeDrive(speed, turn);
    } 
    
    public void stop()
    {
    	drive.arcadeDrive(0, 0);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ArcadeDrive());
    }
}

