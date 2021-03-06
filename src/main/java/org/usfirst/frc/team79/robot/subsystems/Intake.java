package org.usfirst.frc.team79.robot.subsystems;

import org.usfirst.frc.team79.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

//subsystem to control intake
public class Intake extends Subsystem {
	
	public TalonSRX leftMotor, rightMotor; //Declares talons that will control left and right intake
	public DoubleSolenoid grab;
	
	public Intake() {
		leftMotor = new TalonSRX(RobotMap.leftIntakeTalon); //Instantiates left talon
		rightMotor = new TalonSRX(RobotMap.rightIntakeTalon); //Instantiates right talon
		grab = new DoubleSolenoid(RobotMap.INTAKE_OPEN, RobotMap.INTAKE_CLOSE);
		
	}
	
	public void stopMotors() { 
		leftMotor.set(ControlMode.PercentOutput, 0); //sets motor speed to 0
		rightMotor.set(ControlMode.PercentOutput, 0);
	}

	public void solenoidExpand() {
		grab.set(DoubleSolenoid.Value.kForward);
	  }
	
	  public void solenoidRetract() {
		grab.set(DoubleSolenoid.Value.kReverse);
	  }
	
	  public void solenoidOff() {
		grab.set(DoubleSolenoid.Value.kOff);
	  }

	@Override
	protected void initDefaultCommand() {
		
	}
	


}
