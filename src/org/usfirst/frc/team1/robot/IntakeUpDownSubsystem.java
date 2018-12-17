package org.usfirst.frc.team1.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeUpDownSubsystem extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
public void intakeUp() {upDown.set(DoubleSolenoid.Value.kForward);}
public void intakeDown() {upDown.set(DoubleSolenoid.Value.kReverse);}
private DoubleSolenoid upDown = RobotMap.upDown[0];
}
