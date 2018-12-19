package org.usfirst.frc.team1.robot.commands;

import org.usfirst.frc.team1.robot.CommandBase;
import org.usfirst.frc.team1.robot.Robot;

public class DriveCommand extends CommandBase{
	public DriveCommand() {
		requires(driveBase);
	}
public void execute() {driveBase.drive(Robot.m_oi.stickymcstickface);}
@Override
protected boolean isFinished() {
	return true;
}

}
