package org.usfirst.frc.team1.robot;

import org.usfirst.frc.team1.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveBaseSubSystem extends Subsystem {

	@Override
	protected void initDefaultCommand() {
setDefaultCommand (new DriveCommand());
	}
public void drive(Joystick stickymcstickface) {
robotDrive.arcadeDrive(stickymcstickface.getY(), -stickymcstickface.getTwist()*0.8, true);}
private DifferentialDrive robotDrive = RobotMap.robotDrive;
}