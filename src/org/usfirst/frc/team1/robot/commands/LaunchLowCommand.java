package org.usfirst.frc.team1.robot.commands;

import org.usfirst.frc.team1.robot.CommandBase;

public class LaunchLowCommand extends CommandBase {
	public LaunchLowCommand() {
		requires(Catapult);}
	protected void execute() {Catapult.launchLow();}
	protected boolean isFinished() {return true;}
			protected void end() {Catapult.retractLow();}
}
