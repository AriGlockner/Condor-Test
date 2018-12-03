package org.usfirst.frc.team1.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeInOutSubsystem extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
public void intakeIn() {roller.set(1.0);}
public void intakeOut() {roller.set(-1.0);}
public void intakeStop() {roller.set(0.0);}
private WPI_TalonSRX roller = RobotMap.roller;
}