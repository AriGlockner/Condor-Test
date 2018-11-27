package org.usfirst.frc.team1.robot;

public class DriveCommand extends CommandBase{
public void execute() {driveBase.drive(Robot.m_oi.stickymcstickface);}
@Override
protected boolean isFinished() {
	return true;
}

}
