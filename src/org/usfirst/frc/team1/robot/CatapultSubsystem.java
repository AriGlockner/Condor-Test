package org.usfirst.frc.team1.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CatapultSubsystem extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	public void launchHigh() {CatapultSolenoid.set(DoubleSolenoid.Value.kForward);
	Timer.delay(0.2);
	latch.set (DoubleSolenoid.Value.kForward);
	Timer.delay(0.5);}	
	public void launchLow() {latch.set(DoubleSolenoid.Value.kForward);
	Timer.delay(2.5);}
	public void retractHigh() {CatapultSolenoid.set(DoubleSolenoid.Value.kReverse);
	Timer.delay(2.0);
	latch.set(DoubleSolenoid.Value.kReverse);}
	public void retractLow() {CatapultSolenoid.set(DoubleSolenoid.Value.kReverse);
	Timer.delay(2.0);}
	private DoubleSolenoid CatapultSolenoid = RobotMap.CatapultSolenoid[0];
	private DoubleSolenoid latch = RobotMap.CatapultSolenoid[1];
}